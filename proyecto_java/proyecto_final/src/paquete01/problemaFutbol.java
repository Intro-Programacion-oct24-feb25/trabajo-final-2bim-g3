/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class problemaFutbol {

    public static String obtenerDatosFutbol() {

        String cadena;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre del participante");
        String nombrePersona = entrada.nextLine();

        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();

        System.out.println("Ingrese su posicion preferida en el campo");
        entrada.nextLine();
        String posicion = entrada.nextLine();

        System.out.println("Ingrese su ciudad de residencia");
        String ciudad = entrada.nextLine();

        System.out.println("Ingrese su equipo favorito");
        String equipo = entrada.nextLine();

        cadena = String.format("\nLos datos ingresados son: "
                + "\nNombre: %s\nEdad: %d\nCiudad: %s\n"
                + "Posicion: %s\nEquipo favorito: %s\n",
                nombrePersona, edad, ciudad, posicion, equipo);

        return cadena;

    }
}
