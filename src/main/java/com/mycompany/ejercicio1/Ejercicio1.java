/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.ArrayList;
import persona.Personas;

/**
 *
 * @author Personal
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        ArrayList<Personas>personas = new ArrayList<>();
        personas.add(new Personas("Natalia", 20, "F"));
        personas.add(new Personas("Nata", 50, "F"));
        personas.add(new Personas("Natia", 90, "F"));
        personas.add(new Personas("Natal", 29, "F"));
        
         System.out.println("Lista de personas:");
        for(Personas persona : personas){
            persona.mostrarIfo();
            persona.getEdad();
            persona.getGenero();
            //PROMEDIO (ya esta calculado solo falta como hacer que se sumen todas las edades y se divida para 4)(porque me sale para cada uno )
            double promedio;
            promedio= persona.getEdad()/4;
            System.out.println(promedio);
            //Persona mayor
           
                }
            
            }
    }


