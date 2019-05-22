package com.blogspot.h3dema;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Iterator;

/**
 * demonstra como converter HashSet em String ou em Array
 * @author Henrique
 */
public class ExemploHashSet13 {
        
    HashSet<Sinfonia> hash;
    
    public static void main(String[] args) {
        ExemploHashSet13 exemplo = new ExemploHashSet13();
        exemplo.criaHash();
    }

    public void criaHash() {
        // vamos criar uma HashSet de uma classe interna
        hash = new HashSet<>(); // a criação da classe utiliza Generics
        /*
         * preenchemos os valores desejados
         */
        hash.add(new Sinfonia("op.1 n.1","1.º Trio para piano, violino e violoncelo em mi bemol maior", "1793"));
        hash.add(new Sinfonia("op.1 n.2","2.º Trio para piano, violino e violoncelo em sol maior", "1793-1794"));
        hash.add(new Sinfonia("op.1 n.3","3.º Trio para piano, violino e violoncelo em dó menor", "1794"));
        hash.add(new Sinfonia("op.2 n.1","1ª sonata para piano em fá menor", "1794"));
        hash.add(new Sinfonia("op.2 n.2","2° Sonata para piano em lá maior", "1795"));
        hash.add(new Sinfonia("op.2 n.3","3ª Sonata para piano em dó maior", "1795"));
        hash.add(new Sinfonia("op.3","1.º Trio para violino, viola e violoncelo", "1796"));
        hash.add(new Sinfonia("op.4","1.º Quinteto de cordas", "1795-1796"));
        hash.add(new Sinfonia("op.5 n.1","1.ª Sonata para violoncelo e piano", "1796"));
        hash.add(new Sinfonia("op.5 n.2","2.ª Sonata para violoncelo e piano", "1796"));
        
        // convertendo em string
        String hashComoString = hash.toString();
        System.out.println(hashComoString);

        // convertendo em array
        Sinfonia[] hashComoArray = new Sinfonia[hash.size()];
        hash.toArray(hashComoArray);        
        System.out.println(hashComoArray);
    }
    
    public void navegaPeloHashSet() {
        Iterator<Sinfonia> iterator = hash.iterator();
        while (iterator.hasNext()) {
            Sinfonia e = iterator.next();
            System.out.println(e.getOpus());
        }
    }
}