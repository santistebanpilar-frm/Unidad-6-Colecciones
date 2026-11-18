/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp3u6;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author
 */
public class Tp3u6 {

    public static void main(String[] args) {
        System.out.println("Trabajo Practico N°3 Unidad 6 Colecciones");
        Map<String, Curso> cursos = new HashMap<>();
        cursos.put("PROG3", new Curso("Programación III", "Prof.Magni"));
        cursos.put("BD1", new Curso("Base de Datos I", "Prof.Yacomo"));
        cursos.put("MET1", new Curso("Metodologia I", "Prof.Bertoldo"));

        //se busca el curso por clave y si no exite tira null
        System.out.println("Busqueda de curso en especifico");
        System.out.println("Curso PROG3: " + cursos.get("PROG3"));
        System.out.println("Curso ABC: " + cursos.get("ABC"));

        //dsp se recorrer con entrySet()
        System.out.println("Recorre cursos");
        for (Map.Entry<String, Curso> entrada : cursos.entrySet()) {
            System.out.println(entrada.getKey() + "→" + entrada.getValue());
        }
    }
}
