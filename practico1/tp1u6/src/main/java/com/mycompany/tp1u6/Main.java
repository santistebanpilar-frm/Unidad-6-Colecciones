/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1u6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Trabajo Practico N°1 Unidad 6 Colecciones");
        List<Alumno> alumnos = new ArrayList<>();
            alumnos.add(new Alumno("PILAR",8));
            alumnos.add(new Alumno("MATI",9));
            alumnos.add(new Alumno("JULI",10));
            alumnos.add(new Alumno("PABLO",8));
            alumnos.add(new Alumno("ANDRES",7));
            
        for (Alumno a : alumnos) {
        System.out.println(a);
        }
    }
}

        