

/**
 * Implementa teste da árvore binária
 * 
 * Dada uma árvore binária, determinar se ele está a uma altura equilibrada.
 * Para este problema, uma árvore binária equilibrada em altura é
 * uma árvore binária em que a profundidade das duas sub-árvores de cada nó não diferem por mais de 1.
 */
public class VerificaAlturaEquilibrada<T extends Comparable<T>> extends Arvore<T> {
  
  /**
   *  retorna se a árvore está balanceada ou não
   */
  public boolean verificaBalanceada() {
    No<T> raiz = getRaiz();
    
    if (raiz == null) return true;
    
    if (altura(raiz) == -1) return false;
    
    return true;
  }

  public int altura(No<T> raiz) {
    if (raiz == null) return 0;
    
    // obtem as alturas usando recursividade
    int esq = altura(raiz.esq);
    int dir = altura(raiz.dir);
    
    if (esq == -1 || dir == -1) return -1;
    
    if (Math.abs(esq - dir) > 1) return -1;    
    
    return Math.max(esq, dir) + 1;    
  }  
  
}