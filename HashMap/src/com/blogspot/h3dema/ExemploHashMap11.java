package com.blogspot.h3dema;

import java.util.ArrayList;

/**
 * demonstra como usar HashSet.values()
 * @author Henrique
 */
public class ExemploHashMap11 extends ExemploHashMap02 {
    
    public static void main(String[] args) {
        ExemploHashMap11 exemplo = new ExemploHashMap11();
        exemplo.criaHash();
        /* 
         * é possível obtermos um Set contendo todas as chaves contidas no HashMap
         */
        ArrayList<Sinfonia> sinfonias = new ArrayList<>();
        sinfonias.addAll( exemplo.hash.values() );
                
        System.out.println("Array:");      
        System.out.println(sinfonias);
    }
    
}