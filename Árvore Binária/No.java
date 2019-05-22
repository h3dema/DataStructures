/**
 * classe auxiliar para implementação dos nós da árvore binária
 */
class No<T extends Comparable<T>> implements  Comparable<T> {

  T valor; // armazena o valor do nó
  No<T> esq; // aponta para o nó da esquerda
  No<T> dir; // da direita
  No<T> pai; // para o pai --> assim conseguimos varrer a arvore de baixo para cima
  
  /**
   * constroi a classe, colocando o valor
   * devemos indicar o pai, manualmente
   */
  No(T valor) {
    this.valor = valor;
    esq = null;
    dir = null;
    pai = null;
  }

  No(T valor, No<T> pai) {   
    this.valor = valor;
    esq = null;
    dir = null;
    this.pai = pai;
  }
  
  /** getters e setters */
  public No<T> getEsq() { return esq; }
  public void  setEsq(No<T> no) { esq = no; }
  
  public No<T> getDir() { return dir; }
  public void  setDir(No<T> no) { dir = no; }
  
  public No<T> getPai() { return pai; }
  public void  setPai(No<T> no) { pai = no; }
  
  public T getValor() { return valor; }
  
  @Override
  public int compareTo(T o) {
    if (null == o) {
      return 1;
    } else return valor.compareTo(o);
  }  
  
}

