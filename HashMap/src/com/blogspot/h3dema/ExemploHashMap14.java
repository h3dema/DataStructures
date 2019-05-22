package com.blogspot.h3dema;

/**
 * demonstra como usar iterator hash.toString()
 * @author Henrique
 */
public class ExemploHashMap14 extends ExemploHashMap02 {
            
    public static void main(String[] args) {
        ExemploHashMap14 exemplo = new ExemploHashMap14();
        exemplo.criaHash();
        System.out.println(exemplo.hash.toString()); // converte em String
    }
}