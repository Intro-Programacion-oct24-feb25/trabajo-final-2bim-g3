/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class problemaCiclismo {

    public static String obtenerDatosCiclismo() {
        
        String cadena;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre del participante");
        String nombrePersona = entrada.nextLine();

        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();

        System.out.println("Ingrese el tipo de ciclismo que practica"
                + "(montana, ruta, urbano)");
        entrada.nextLine();

        String especialidad = entrada.nextLine();

        System.out.println("Ingrese su marca de bicicleta preferida");
        String equipo = entrada.nextLine();

        System.out.println("Ingrese su ciudad de residencia");
        String posicion = entrada.nextLine();

        cadena = String.format("Los datos ingresados son: \n%s\n%d\n%s\n%s\n%s\n",
                nombrePersona, edad, especialidad, posicion, equipo);
        
        return cadena;

    }
}
