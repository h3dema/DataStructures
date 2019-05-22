package com.blogspot.h3dema;

/**
 * demonstra como usar HashSet.containsKey()
 * @author Henrique
 */
public class ExemploHashMap08 extends ExemploHashMap02 {
        
    Sinfonia elemento;
    
    public void verifica() {
        String chave = "op.2 n.3";
        String resultado = hash.containsKey(chave) ? "Elemento presente" : "Não achou o elemento";
        System.out.println(resultado + " com " + chave);
        chave = "op.8";
        resultado = hash.containsKey(chave) ? "Elemento presente" : "Não achou o elemento";
        System.out.println(resultado + " com " + chave);
    }
    
    public static void main(String[] args) {
        ExemploHashMap08 exemplo = new ExemploHashMap08();
        exemplo.criaHash();
        exemplo.verifica(); // verifica se contem
    }
}