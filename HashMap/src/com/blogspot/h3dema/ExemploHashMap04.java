package com.blogspot.h3dema;

import java.util.HashMap;


/**
 * demonstra como usar HashMap.remove()
 * @author Henrique
 */
public class ExemploHashMap04 extends ExemploHashMap02 {
        
    Sinfonia elementoARemover; // vamos usar este atributo para identificar o elemento a ser removido
    
    public static void main(String[] args) {
        ExemploHashMap04 exemplo = new ExemploHashMap04();
        exemplo.criaHash(); // criamos o map
        System.out.println(exemplo.hash);
        exemplo.removeElemento(exemplo.elementoARemover); // remove o elemento
        System.out.println(exemplo.hash);
    }

    @Override
    public void criaHash() {
        /*
         * chamamos a superclasse para criar e preencher o HashMap
         */
        super.criaHash();

        /*
         * identifica o elemento que deverá ser removido
         * precisamos guardar a referência ao bojeto
         */
        elementoARemover = new Sinfonia("op.5 n.2","2.ª Sonata para violoncelo e piano", "1796");
        hash.put(elementoARemover.getOpus(), elementoARemover);
        
        System.out.println(hash); // mostramos o hashmap criado
    }
    
    public void removeElemento(Sinfonia e) {
        /*
         * devemos passar a chave que é o campo opus do objeto
         */
        hash.remove(e.getOpus()); 
    }
}