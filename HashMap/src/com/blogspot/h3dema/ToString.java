/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.h3dema;

import java.util.HashMap;

/**
 *
 * @author Henrique
 */
public class ToString {

    public static void main(String args[]) {
    
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(0, "entrada #1");
        hash.put(1, "entrada #2");
        hash.put(2, "entrada #3");
        System.out.println(hash.toString());
    }
    
}
