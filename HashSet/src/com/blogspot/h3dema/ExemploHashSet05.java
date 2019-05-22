package com.blogspot.h3dema;

import java.util.HashSet;

/**
 * demonstra como usar HashSet.removeAll()
 * @author Henrique
 */
public class ExemploHashSet05 {
        
    HashSet<Sinfonia> hash;
    HashSet<Sinfonia> hash2; // segundo hash
    
    public static void main(String[] args) {
        ExemploHashSet05 exemplo = new ExemploHashSet05();
        exemplo.criaHash1_e_2();         
        // vamos apagar os elementos comuns ...
        exemplo.hash.removeAll(exemplo.hash2); // retiramos os elementos de hash2 que existem em hash
        System.out.println(exemplo.hash); // sobra somente o "op.6"
    }

    public void criaHash1_e_2() {
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
        hash2 = new HashSet<>(); // cria o segundo hash
        hash2.addAll(hash); // usamos addAll para colocar todos os valores de hash em hash02
        // adicionamos um elemento em hash
        hash.add(new Sinfonia("op.6", "Sonata para piano a quatro mãos", "1796-1797"));
    }
}