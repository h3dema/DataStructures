package com.blogspot.h3dema;

/**
 * demonstra como usar HashSet.get()
 * @author Henrique
 */
public class ExemploHashMap12 extends ExemploHashMap02 {
        
    Sinfonia elemento;
    
    public void recupera(String chave) {
        Sinfonia resultado = hash.get(chave);
        System.out.println(resultado.getOpus());
    }
    
    public static void main(String[] args) {
        ExemploHashMap12 exemplo = new ExemploHashMap12();
        exemplo.criaHash();
        exemplo.recupera("op.2 n.3"); // recupera
    }
}