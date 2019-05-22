package com.blogspot.h3dema;

import java.util.HashSet;

/**
 * demonstra como usar HashSet.retainAll()
 * @author Henrique
 */
public class ExemploHashSet14 {
    HashSet<Sinfonia> hash;
    HashSet<Sinfonia> hash2;
    
    public static void main(String[] args) {
        ExemploHashSet14 exemplo = new ExemploHashSet14();
        exemplo.criaHash1_e_2();
        exemplo.verifica(); // 
    }

    public void criaHash1_e_2() {
        // vamos criar os HashSet que serão comparados
        hash = new HashSet<>(); 
        hash2 = new HashSet<>(); 
        /*
         * preenchemos os valores desejados
         */
        Sinfonia e = new Sinfonia("op.1 n.1","1.º Trio para piano, violino e violoncelo em mi bemol maior", "1793");
        hash.add(e); hash2.add(e);
        e = new Sinfonia("op.1 n.2","2.º Trio para piano, violino e violoncelo em sol maior", "1793-1794");
        hash.add(e); // não inserimos este em hash2
        e = new Sinfonia("op.1 n.3","3.º Trio para piano, violino e violoncelo em dó menor", "1794");
        hash.add(e); hash2.add(e);
        e = new Sinfonia("op.2 n.1","1ª sonata para piano em fá menor", "1794");
        hash.add(e); // não inserimos este em hash2
        e = new Sinfonia("op.2 n.2","2° Sonata para piano em lá maior", "1795");
        hash.add(e); hash2.add(e);
        System.out.println(hash);
        System.out.println(hash2);
    }
    
    public void verifica() {
        hash.retainAll(hash2); // mantem somente os elementos que existem em hash2
        System.out.println(hash);
    }
}