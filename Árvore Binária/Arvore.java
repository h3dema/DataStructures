import java.util.List;
import java.util.ArrayList;


public class Arvore <T extends Comparable<T>> {
  
  private No<T> raiz;
  
  /**
   * cria arvore SEM uma raiz ==> vazia
   */
  Arvore() { raiz = null; }
  
  /**
   * cria arvore COM uma raiz ==> o nó raiz
   */
  Arvore(T valor) { this.raiz = new No<T>(valor); }
  
  public No<T> getRaiz() { return raiz; }
  
  /***
    * insere um no na arvore
    * @param valor : é o valor do nó que está sendo inserido
    * @return o nó que foi inserido
    */
  public No<T> inserir(T valor) {
    No<T> no = new No<>(valor);
    
    if (null == raiz) {
      // arvore vazia --> insere a raiz
      raiz = no;
      return no;
    } else {
      // arvore não vazia --> deve inserir o no a partir da posicao correta
      return inserir(no, raiz); // 
    }
  }
  
  /**
   * utilizamos este procedimento para localizar a posição que deverá ser inserido o no
   * vamos usar recursividade para achar o local
   * basta portanto considerar as subarvores
   */
  private No<T> inserir(No<T> no, No<T> raizSubArvore) {
    if (raizSubArvore.compareTo(no.getValor()) >= 0) {
      // é menor que a raiz --> inserir a esquerda
      No<T> esquerda = raizSubArvore.getEsq();
      if (null == esquerda) {
        raizSubArvore.setEsq(no);
        no.setPai(raizSubArvore);
      } else {
        return inserir(no, esquerda); // continua verificando para a esquerda
      }
    } else {
      // é maior que a raiz --> inserir a direita
      No<T> direita = raizSubArvore.getDir();
      if (null == direita) {
        raizSubArvore.setDir(no);
        no.setPai(raizSubArvore);
      } else {
        return inserir(no, direita); // continua verificando para a direita
      }    
    }
    return no; // nó que foi inserido
  }
  
  /**
   * vamos permitir a pesquisa pelo valor do no
   */
  public No<T> pesquisar(T valor) {
    if (null == raiz) {
      // nao achou ou arvore vazia
      return null;
    } else {
      return pesquisar(valor, raiz); // pesquisamos recursivamente a partir da raiz da árvore
    }
  }
  
  private No<T> pesquisar(T valor, No<T> raizSubArvore) {
    // usamos compareTo para ver se achamos, ou se está a direita (maior) ou a esquerda (menor)
    int compara = raizSubArvore.compareTo(valor);
    if (0 == compara) {
      // ACHOU !!!
      return raizSubArvore;
    } else if (compara > 0) {
      // está a esquerda (se existir), pois raizSubArvore é maior
      return pesquisar(valor, raizSubArvore.getEsq());
    } else {
      // é maior, se existir, está a direita
      return pesquisar(valor, raizSubArvore.getDir());
    }
  }
  
  /**
   * vamos implementar um balanceamento para nossa árvore
   */
  public void balancear() {
    if (null == raiz) return; // nada a fazer
    // vamos desmontar a arvore gerando uma lista dos valores
    // para depois recompor a arvore de forma balanceada
    ArrayList<T> lista = retornaLista(raiz);
    raiz = null; // acabou com a arvore
    balancear(lista); // usar a lista para gerar nova árvore    
  }
  
  /**
   * precisamos transformar a arvore em lista
   */
  private ArrayList<T> retornaLista(No<T> no) {
    if (null == no) {
      return new ArrayList<T>(); // lista vazia
    } else {
      // geramos uma lista tipo uma "busca binaria"
      // 1. geramos uma sublista com a parte da esquerda - recursivamente
      // 2. acrescentamos o elemento do meio
      // 3. gerar a sublista da direita
      ArrayList<T> lista = retornaLista(no.getEsq());
      lista.add(no.getValor());
      lista.addAll(retornaLista(no.getDir()));
      return lista;
    }
  }
  
  /**
   * geramos o balanceamento recursivamente
   */
  private void balancear(List<T> lista) {
    /**
     * usaremos de recursividade para gerar a nova arvore a partir da lista
     * com cada sublista fazemos a inserção na árvore
     */
    if (lista.size() == 0) return; // nada a fazer , lista vazia
    // precisamos achar o elemento no meio da lista
    // temos que lembrar que a indexação da lista em Java começa de zero, portanto:
    // temos que lembrar que a lista pode vir com somente um elemento
    int meio = 0;
    if (lista.size() > 1) meio = lista.size() / 2 - 1;
    // devemos verificar se a lista tem mais de um elemento,
    // se tem somente 1 --> meio = 0
    // se tem mais de um --> podemos usar a conta
    
    // inserimos o elemento encontrado
    inserir(lista.get(meio));
    if (meio > 0) balancear(lista.subList(0, meio));
    if (meio < lista.size()) balancear(lista.subList(meio+1, lista.size()));    
  }
  
  public String toString() {
    ArrayList<T> lista = retornaLista(raiz);
    String saida = "";
    for(T item : lista) saida += item + "-";
    return saida.substring(0, saida.length()-1);
  }
  
  /**
   * vamos verificar a altura da árvore binária
   */
  public int altura() {
    return altura(raiz);
  }
 
  private int altura(No<T> raiz) {
    if (null == raiz) return 0; // não achou
    // obtem as alturas dos ramos recursivamente
    int e = altura(raiz.getEsq());
    int d = altura(raiz.getDir());
    // ou seja, somamos a maior altura dos subramos + 1 (o próprio no)
    return Math.max(e, d) + 1;
  }

  /** pesquisa em ordem / ordem simétrica */
  public ArrayList<No<T>> emOrdem() {
    return emOrdem(raiz);
  }
  
  private ArrayList<No<T>> emOrdem(No<T> raiz) {
    if (null == raiz) return new ArrayList<No<T>>();
    ArrayList<No<T>> lista = emOrdem(raiz.getEsq());
    lista.add(raiz);
    lista.addAll(emOrdem(raiz.getDir()));
    return lista;
  }
  
  public ArrayList<No<T>> preOrdem() {
    return preOrdem(raiz);
  }
  
  private ArrayList<No<T>> preOrdem(No<T> raiz) {
    ArrayList<No<T>> lista = new ArrayList<No<T>>();
    if (null == raiz) return lista;
    lista.add(raiz);
    lista.addAll(emOrdem(raiz.getEsq()));
    lista.addAll(emOrdem(raiz.getDir()));
    return lista;  
  }
  
  public ArrayList<No<T>> posOrdem() {
    return preOrdem(raiz);
  }
  
  private ArrayList<No<T>> posOrdem(No<T> raiz) {
    ArrayList<No<T>> lista = new ArrayList<No<T>>();
    if (null == raiz) return lista;
    lista.addAll(emOrdem(raiz.getEsq()));
    lista.addAll(emOrdem(raiz.getDir()));
    lista.add(raiz);
    return lista;  
  }
  
  /** número de nós na árvore */
  public int size() {
    return size(raiz);
  }
  
  private int size(No<T> raiz) {
    return 1 + size(raiz.getEsq())+size(raiz.getDir());
  }
  
  public No<T> maiorElemento(No<T> raiz) {
    if (null == raiz) {
      return null;
    } else {
      No<T> e = maiorElemento(raiz.getEsq());
      No<T> d = maiorElemento(raiz.getDir());
      No<T> maior = raiz;
      if (maior.compareTo(e.getValor()) < 0) maior = e;
      if (maior.compareTo(d.getValor()) < 0) maior = d;
      return maior;
    }
  }
  
  public No<T> menorElemento(No<T> raiz) {
    if (null == raiz) {
      return null;
    } else {
      No<T> e = menorElemento(raiz.getEsq());
      No<T> d = menorElemento(raiz.getDir());
      No<T> menor = raiz;
      if (menor.compareTo(e.getValor()) > 0) menor = e;
      if (menor.compareTo(d.getValor()) > 0) menor = d;
      return menor;
    }
  }
}