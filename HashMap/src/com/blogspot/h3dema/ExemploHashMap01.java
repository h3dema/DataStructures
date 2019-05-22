package com.blogspot.h3dema;

import java.util.HashMap;

/**
 * demonstra como criar um HashMap<K, T>
 * K é a chave
 * T é o objeto armazenado
 * @author Henrique
 */
public class ExemploHashMap01 {
    // entrada do programa
    public static void main(String[] args) {
        ExemploHashMap01 exemplo = new ExemploHashMap01();
        exemplo.criaHash();
    }
    
    public void criaHash() {
        // vamos criar uma HashSet de uma classe interna
        HashMap<String, Sinfonia> hash = new HashMap<>(); // a criação da classe utiliza Generics
    }
        
}