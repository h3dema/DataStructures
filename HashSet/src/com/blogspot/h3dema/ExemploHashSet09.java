package com.blogspot.h3dema;

import java.util.HashSet;

/**
 * demonstra como usar HashSet.contains()
 * @author Henrique
 */
public class ExemploHashSet09 {
        
    HashSet<Sinfonia> hash;
    Sinfonia elemento;
    
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
        elemento = new Sinfonia("op.2 n.3","3ª Sonata para piano em dó maior", "1795");
        hash.add(elemento); // precisamos deste elemetno destacado para fazer a comparacao
        System.out.println(hash);
    }
    
    public void verifica() {
        Sinfonia e = new Sinfonia("op.2 n.3","3ª Sonata para piano em dó maior", "1795");
        String resultado = hash.contains(e) ? "Elemento presente" : "Não achou o elemento";
        System.out.println(resultado + " " + e.getOpus());
        resultado = hash.contains(elemento) ? "Elemento presente" : "Não achou o elemento";
        System.out.println(resultado + " " + elemento.getOpus());
    }
    
    public static void main(String[] args) {
        ExemploHashSet09 exemplo = new ExemploHashSet09();
        exemplo.criaHash();
        exemplo.verifica(); // verifica se contem
    }
}