package com.blogspot.h3dema;

import java.util.HashMap;

/**
 * demonstra como usar HashMap.clone()
 * @author Henrique
 */
public class ExemploHashMap06 extends ExemploHashMap02  {
        
    HashMap<String, Sinfonia> hash2;
    
    public static void main(String[] args) {
        ExemploHashMap06 exemplo = new ExemploHashMap06();
        exemplo.criaHash();
        System.out.println(exemplo.hash);
        exemplo.clonaHash(); // faz o clone do hash para hash2        
    }

    public void clonaHash() {
        // tem que fazer o type casting
        // pois o retorno de clone() é do tipo Object
        hash2 = (HashMap<String, Sinfonia>) hash.clone(); 
        System.out.println(hash2);
        System.out.println(hash2.equals(hash));
    }
}