

/**
 * Implementa teste da �rvore bin�ria
 * 
 * Dada uma �rvore bin�ria, determinar se ele est� a uma altura equilibrada.
 * Para este problema, uma �rvore bin�ria equilibrada em altura �
 * uma �rvore bin�ria em que a profundidade das duas sub-�rvores de cada n� n�o diferem por mais de 1.
 */
public class VerificaAlturaEquilibrada<T extends Comparable<T>> extends Arvore<T> {
  
  /**
   *  retorna se a �rvore est� balanceada ou n�o
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