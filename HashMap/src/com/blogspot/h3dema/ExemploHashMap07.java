package com.blogspot.h3dema;

/**
 * demonstra como usar HashMap.size()
 * @author Henrique
 */
public class ExemploHashMap07 extends ExemploHashMap02 {
        
    public static void main(String[] args) {
        ExemploHashMap07 exemplo = new ExemploHashMap07();
        exemplo.criaHash();
        System.out.println(exemplo.hash.size()); // retorna o número de elementos do set
    }
}