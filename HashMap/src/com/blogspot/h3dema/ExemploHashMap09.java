package com.blogspot.h3dema;

/**
 * demonstra como usar HashSet.containsValue()
 * @author Henrique
 */
public class ExemploHashMap09 extends ExemploHashMap02 {
        
    Sinfonia elemento;
    
    public void verifica() {
        /*
         * cria um valor (objeto Sinfonia) que será testado
         */
        Sinfonia e = new Sinfonia("op.3","1.º Trio para violino, viola e violoncelo", "1796");
        String resultado = hash.containsValue(e) ? "Elemento presente" : "Não achou o elemento";
        /*
         * como é um novo objeto não conseguimos achar, apesar de ter os mesmos dados
         */
        System.out.println(resultado + " com " + e.getOpus()); // mostra que não achou
        
        /*
         * vamos criar um novo objeto Sinfonia, inserir no HashMap e verificar se ele foi inserido
         */
        e = new Sinfonia("op.8","Serenade for String Trio in D major: (arranged later for piano & viola Opus 42)", "1796-1797");
        hash.put(e.getOpus(), e);
        resultado = hash.containsValue(e) ? "Elemento presente" : "Não achou o elemento";
        System.out.println(resultado + " com " + e.getOpus()); // mostra que não achou        
    }
    
    public static void main(String[] args) {
        ExemploHashMap09 exemplo = new ExemploHashMap09();
        exemplo.criaHash();
        exemplo.verifica(); // verifica se contem
    }
}