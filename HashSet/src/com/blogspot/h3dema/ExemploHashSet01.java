package com.blogspot.h3dema;

import java.util.HashSet;

/**
 * demonstra como criar um HashSet<T>
 * @author Henrique
 */
public class ExemploHashSet01 {
    // entrada do programa
    public static void main(String[] args) {
        ExemploHashSet01 exemplo = new ExemploHashSet01();
        exemplo.criaHash();
    }
    
    public void criaHash() {
        // vamos criar uma HashSet de uma classe interna
        HashSet<Sinfonia> hash = new HashSet<>(); // a criação da classe utiliza Generics
    }
        
}