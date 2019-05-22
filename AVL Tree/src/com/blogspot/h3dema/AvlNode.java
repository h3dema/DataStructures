/**
 * estrutura básica dos nós da árvore AVL
 * --> árvore de busca binária auto-balanceada
 */
package com.blogspot.h3dema;

class AvlNode<T extends Comparable<T>> implements Comparable<T> {

    private T dados;                // dados contidos no nó da árvore
    private AvlNode<T> esq;         // filhos a esquerda deste no
    private AvlNode<T> dir;         // filhos a direita deste nó
    private int altura;             // altura do nó na árvore

    // Construtores
    public AvlNode(T dados) {
        this(dados, null, null);
    }

    // Construtores
    public AvlNode(T dados, AvlNode<T> esq, AvlNode<T> dir) {
        this.dados = dados;
        this.esq = esq;
        this.dir = dir;
        this.altura = 0;
    }

    public T get_dados() {
        return dados;
    }

    public void set_dados(T dados) {
        this.dados = dados;
    }

    public AvlNode<T> get_esquerda() {
        return esq;
    }

    public void set_esquerda(AvlNode<T> esq) {
        this.esq = esq;
    }

    public AvlNode<T> get_direita() {
        return dir;
    }

    public void set_direita(AvlNode<T> dir) {
        this.dir = dir;
    }

    public int get_altura() {
        return altura;
    }

    public void set_altura(int h) {
        this.altura = h;
    }

    @Override
    public int compareTo(T o) {
        return dados.compareTo(o);
    }


}
