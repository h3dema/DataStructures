// CONSTRUCTION: with no initializer
//
// ******************PUBLIC OPERATIONS*********************
// void inserir( x )     --> insere x
// void remove( x )      --> Remove x (unimplemented)
// Comparable find( x )  --> Return item that matches x
// Comparable findMin()  --> Return smallest item
// Comparable findMax()  --> Return largest item
// boolean estaVazio()   --> Return true if empty; else false
// void makeEmpty()      --> Remove todos os itens
// void mostra()         --> mostra a árvore ordenada

package com.blogspot.h3dema;

/**
 * 
 * Implementa uma árvore AVL
 * mais informações em http://en.wikipedia.org/wiki/AVL_tree
 * 
 * @param <T>
 */
public class AvlTree<T extends Comparable<T>> {
  
  /**
   * a raiz da árvore AVL
   */
  private AvlNode<T> raiz;
  
  /**
   * construtor da árvore
   */
  public AvlTree() {
    raiz = null;
  }
  
  /**
   * Inserir um nó na árvore
   * nós duplicados são ignorados
   * @param no nó a ser inserido.
   */
  public void inserir( T no ) {
    raiz = inserir( no, raiz );
  }
  
  /**
   * remove um nó da árvore
   * nada � feito se o nó solicitado, nóo for encontrado
   * @param no nó a ser removido.
   */
  public void remove( Comparable<T> no ) {
    Comparable<T> x = find( no );
      
    // falta remover
      
  }
  
  /**
   * Find the smallest item in the tree.
   * @return smallest item or null if empty.
   */
  public Comparable<T> findMin()
  {
    return elementAt( findMin( raiz ) );
  }
  
  /**
   * Find the largest item in the tree.
   * @return the largest item of null if empty.
   */
  public Comparable<T> findMax() {
    return elementAt( findMax( raiz ) );
  }
  
  /**
   * Find an item in the tree.
   * @param x the item to search for.
   * @return the matching item or null if not found.
   */
  public Comparable<T> find( Comparable<T> x ) {
    return elementAt( find( x, raiz ) );
  }
  
  /**
   * Make the tree logically empty.
   */
  public void makeEmpty()
  {
    raiz = null;
  }
  
  /**
   * Test if the tree is logically empty.
   * @return true if empty, false otherwise.
   */
  public boolean estaVazio() {
    return raiz == null;
  }
  
  /**
   * imprime a árvore ordenada
   */
  public void mostra()
  {
    if( estaVazio() )
      System.out.println( "árvore vazia" );
    else
      mostra( raiz );
  }
  
  /**
   * Internal method to get dados field.
   * @param no the node.
   * @return the dados field or null if t is null.
   */
  private T elementAt( AvlNode<T> no )
  {
    return no == null ? null : no.get_dados();
  }
  
  /**
   * Internal method to insert into a subtree.
   * @param x the item to insert.
   * @param no the node that roots the tree.
   * @return the new raiz.
   */
  private AvlNode<T> inserir( T x, AvlNode<T> no )
  {
    if( no == null ) {
      // cria o nó
      no = new AvlNode( x );
    } else if( x.compareTo( no.get_dados()) < 0 ) {
      no.set_esquerda( inserir( x, no.get_esquerda() ));
      if( height( no.get_esquerda() ) - height( no.get_direita() ) == 2 )
        if( x.compareTo( no.get_esquerda().get_dados() ) < 0 )
        no = rotateWithLeftChild( no );
      else
        no = doubleWithLeftChild( no );
    } else if( no.compareTo(x) > 0 ) {
      no.set_direita( inserir( x, no.get_direita() ));
      if( height( no.get_direita() ) - height( no.get_esquerda() ) == 2 )
        if( x.compareTo( no.get_direita().get_dados() ) > 0 )
        no = rotateWithRightChild( no );
      else
        no = doubleWithRightChild( no );
    } else {
      // não faz nada
    }
    no.set_altura( Math.max( height( no.get_esquerda() ), height( no.get_direita() ) ) + 1);
    return no;
  }
  
  /**
   * Internal method to find the smallest item in a subtree.
   * @param t the node that roots the tree.
   * @return node containing the smallest item.
   */
  private AvlNode<T> findMin( AvlNode<T> t )
  {
    if( t == null )
      return t;
    
    while( t.get_esquerda() != null )
      t = t.get_esquerda();
    return t;
  }
  
  /**
   * Internal method to find the largest item in a subtree.
   * @param t the node that roots the tree.
   * @return node containing the largest item.
   */
  private AvlNode<T> findMax( AvlNode t )
  {
    if( t == null )
      return t;
    
    while( t.get_direita() != null )
      t = t.get_direita();
    return t;
  }
  
  /**
   * Internal method to find an item in a subtree.
   * @param x is item to search for.
   * @param t the node that roots the tree.
   * @return node containing the matched item.
   */
  private AvlNode<T> find( Comparable x, AvlNode<T> t )
  {
    while( t != null )
      if( x.compareTo( t.get_dados() ) < 0 )
      t = t.get_esquerda();
    else if( x.compareTo( t.get_dados() ) > 0 )
      t = t.get_direita();
    else
      return t;    // Match
    
    return null;   // No match
  }
  
  /**
   * Internal method to print a subtree in sorted order.
   * @param t the node that roots the tree.
   */
  private void mostra( AvlNode<T> t )
  {
    if( t != null )
    {
      mostra( t.get_esquerda() );
      System.out.println( t.get_dados() );
      mostra( t.get_direita() );
    }
  }
  
  /**
   * Return the height of node t, or -1, if null.
   */
  private int height( AvlNode<T> t ) {
    return t == null ? -1 : t.get_altura();
  }
  
  /**
   * Rotate binary tree node with get_esquerda() child.
   * For AVL trees, this is a single rotation for case 1.
   * Update heights, then return new raiz.
   */
  private AvlNode<T> rotateWithLeftChild( AvlNode<T> k2 )
  {
    AvlNode<T> k1 = k2.get_esquerda();
    k2.set_esquerda( k1.get_direita() );
    k1.set_direita( k2 );
    k2.set_altura( Math.max( height( k2.get_esquerda() ), height( k2.get_direita() ) ) + 1 );
    k1.set_altura( Math.max( height( k1.get_esquerda() ), k2.get_altura() ) + 1 );
    return k1;
  }
  
  /**
   * Rotate binary tree node with get_direita() child.
   * For AVL trees, this is a single rotation for case 4.
   * Update heights, then return new raiz.
   */
  private AvlNode<T> rotateWithRightChild( AvlNode<T> k1 ) {
    AvlNode<T> k2 = k1.get_direita();
    k1.set_direita( k2.get_esquerda() );
    k2.set_esquerda( k1 );
    k1.set_altura( Math.max( height( k1.get_esquerda() ), height( k1.get_direita() ) ) + 1 );
    k2.set_altura( Math.max( height( k2.get_direita() ), k1.get_altura() ) + 1 );
    return k2;
  }
  
  /**
   * Double rotate binary tree node: first get_esquerda() child
   * with its get_direita() child; then node k3 with new get_esquerda() child.
   * For AVL trees, this is a double rotation for case 2.
   * Update heights, then return new raiz.
   */
  private AvlNode<T> doubleWithLeftChild( AvlNode<T> k3 ) {
    k3.set_esquerda( rotateWithRightChild( k3.get_esquerda() ));
    return rotateWithLeftChild( k3 );
  }
  
  /**
   * Double rotate binary tree node: first get_direita() child
   * with its get_esquerda() child; then node k1 with new get_direita() child.
   * For AVL trees, this is a double rotation for case 3.
   * Update heights, then return new raiz.
   */
  private AvlNode<T> doubleWithRightChild( AvlNode<T> k1 ) {
    k1.set_direita( rotateWithLeftChild( k1.get_direita() ));
    return rotateWithRightChild( k1 );
  }
  
  
  /**
   * procedimento utilizado para teste da árvore
   */
  public static void main( String [ ] args ) {
    AvlTree t = new AvlTree();
    final int NUMS = 4000;
    final int GAP  =   37;
    
    System.out.println( "Checking... (no more output means success)" );
    
    for( int i = GAP; i != 0; i = ( i + GAP ) % NUMS )
      t.inserir( new Integer( i ) );
    
    if( NUMS < 40 )
      t.mostra();
    if( ((Integer)(t.findMin())).intValue() != 1 ||
       ((Integer)(t.findMax())).intValue() != NUMS - 1 )
      System.out.println( "FindMin or FindMax error!" );
    
    for( int i = 1; i < NUMS; i++ )
      if( ((Integer)(t.find( new Integer( i ) ))).intValue() != i ) {
      System.out.println( "Find error1!" );
    }
    
  }
}