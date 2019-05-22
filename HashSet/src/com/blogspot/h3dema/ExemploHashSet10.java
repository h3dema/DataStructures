package com.blogspot.h3dema;

import java.util.HashSet;

/**
 * demonstra como usar HashSet.containsAll()
 * @author Henrique
 */
public class ExemploHashSet10 {
    /*
     * vamos criar dois objetos do tipo HashSet e vamos inserir os objetos individualmente em cada HashSet
     * para mostrar que a comparação é feita baseado na existência dos mesmos objetos. Isto é,
     * os elementos não podem ser objetos diferentes, mesmo que o conteudo seja igual.
     */    
    HashSet<Sinfonia> hash;
    HashSet<Sinfonia> hash2;
    
    public static void main(String[] args) {
        ExemploHashSet10 exemplo = new ExemploHashSet10();
        exemplo.criaHash1_e_2();
        exemplo.verifica(); // verifica se contem
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
        String resultado = hash.containsAll(hash2) ? "Elementos presentes" : "Hash não contem os mesmos elementos";
        System.out.println(resultado);
    }
}