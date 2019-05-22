package com.blogspot.h3dema;

import java.util.Set;

/**
 * demonstra como usar HashSet.keySet()
 * @author Henrique
 */
public class ExemploHashMap10 extends ExemploHashMap02 {

    
    public static void main(String[] args) {
        ExemploHashMap10 exemplo = new ExemploHashMap10();
        exemplo.criaHash();
        /* 
         * é possível obtermos um Set contendo todas as chaves contidas no HashMap
         */
        Set<String> chaves = exemplo.hash.keySet();
        System.out.println(chaves);
    }
    
}