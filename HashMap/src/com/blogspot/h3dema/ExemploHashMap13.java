package com.blogspot.h3dema;

import java.util.Iterator;
import java.util.Map.Entry;

/**
 * demonstra como usar iterator hash.entrySet().iterator()
 *
 * @author Henrique
 */
public class ExemploHashMap13 extends ExemploHashMap02 {

    public void listaComIterator() {
        Iterator<Entry<String, Sinfonia>> iterator = hash.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, Sinfonia> e = iterator.next();
            System.out.println(e.getValue().getOpus());
        }
    }

    public static void main(String[] args) {
        ExemploHashMap13 exemplo = new ExemploHashMap13();
        exemplo.criaHash();
        exemplo.listaComIterator(); // recupera
    }
}