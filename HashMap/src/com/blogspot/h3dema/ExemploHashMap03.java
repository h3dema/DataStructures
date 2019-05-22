package com.blogspot.h3dema;

import java.util.HashMap;

/**
 * demonstra como usar HashMap.putAll()
 * @author Henrique
 */
public class ExemploHashMap03 extends ExemploHashMap02 {
        
    HashMap<String, Sinfonia> hash2; // segundo hash
    
    public static void main(String[] args) {
        ExemploHashMap03 exemplo = new ExemploHashMap03();
        exemplo.criaHash(); // herdada da classe ExemploHashMap02
        exemplo.addHashEmHash2(); // adicionar todos os elementos (pares)
    }

    public void addHashEmHash2() {
        hash2 = new HashMap<>(); // cria o segundo hash
        hash2.putAll(hash); // usamos putAll para colocar todos os valores de hash em hash02
        System.out.println(hash2);
        System.out.println(hash2.equals(hash));
    }
}