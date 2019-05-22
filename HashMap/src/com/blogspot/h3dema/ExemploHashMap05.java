package com.blogspot.h3dema;

/**
 * demonstra como usar HashMap.clear()
 * @author Henrique
 */
public class ExemploHashMap05 extends ExemploHashMap02  {
        
    public static void main(String[] args) {
        ExemploHashMap05 exemplo = new ExemploHashMap05();
        exemplo.criaHash(); 
        System.out.println(exemplo.hash);
        // vamos apagar os elementos comuns ...
        exemplo.hash.clear(); // retiramos os elementos de hash
        System.out.println(exemplo.hash);
    }

}