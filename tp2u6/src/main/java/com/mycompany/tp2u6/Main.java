/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp2u6;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Trabajo Practico N°2 Unidad 6 Colecciones");
        Set<Producto> productos = new HashSet<>();
        productos.add(new Producto("A1", "Auriculares"));
        productos.add(new Producto("B2", "CPU"));
        productos.add(new Producto("C3", "Teclado"));
        productos.add(new Producto("A1", "Auriculares inalabricos")); 

        for (Producto p : productos) {
            System.out.println(p);
        }
        System.out.println("Cantidad: " + productos.size());        
    }
}
