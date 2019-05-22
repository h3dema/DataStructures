package com.blogspot.h3dema;

import java.util.HashMap;

/**
 * demonstra como usar HashMap.put()
 * @author Henrique
 */
public class ExemploHashMap02 {
        
    HashMap<String, Sinfonia> hash;
    
    public static void main(String[] args) {
        ExemploHashMap02 exemplo = new ExemploHashMap02();
        exemplo.criaHash();         System.out.println(exemplo.hash);
    }

    public void criaHash() {
        // vamos criar uma HashMap de uma classe interna
        hash = new HashMap<>(); // a criação da classe utiliza Generics
        /*
         * preenchemos os valores desejados
         * note que: a chave do HashMap é o campo opus do objeto Sinfonia
         */
        Sinfonia e = new Sinfonia("op.1 n.1","1.º Trio para piano, violino e violoncelo em mi bemol maior", "1793");
        hash.put(e.getOpus(), e);
        e = new Sinfonia("op.1 n.2","2.º Trio para piano, violino e violoncelo em sol maior", "1793-1794");
        hash.put(e.getOpus(), e);
        e = new Sinfonia("op.1 n.3","3.º Trio para piano, violino e violoncelo em dó menor", "1794");
        hash.put(e.getOpus(), e);
        e = new Sinfonia("op.2 n.1","1ª sonata para piano em fá menor", "1794");
        hash.put(e.getOpus(), e);
        e = new Sinfonia("op.2 n.2","2° Sonata para piano em lá maior", "1795");
        hash.put(e.getOpus(), e);
        e = new Sinfonia("op.2 n.3","3ª Sonata para piano em dó maior", "1795");
        hash.put(e.getOpus(), e);
        e = new Sinfonia("op.3","1.º Trio para violino, viola e violoncelo", "1796");
        hash.put(e.getOpus(), e);
        e = new Sinfonia("op.4","1.º Quinteto de cordas", "1795-1796");
        hash.put(e.getOpus(), e);
        e = new Sinfonia("op.5 n.1","1.ª Sonata para violoncelo e piano", "1796");
        hash.put(e.getOpus(), e);
        e = new Sinfonia("op.5 n.2","2.ª Sonata para violoncelo e piano", "1796");
        hash.put(e.getOpus(), e);
    }
}