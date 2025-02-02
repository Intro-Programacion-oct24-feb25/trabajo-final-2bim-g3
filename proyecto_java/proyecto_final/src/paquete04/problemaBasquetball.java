/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class problemaBasquetball {

    public static String obtenerDatosBasquetball() {

        String cadena;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre del participante");
        String nombrePersona = entrada.nextLine();

        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();

        System.out.println("Ingrese su posicion preferida de juego");
        entrada.nextLine();
        String posicion = entrada.nextLine();

        System.out.println("Ingrese su estatura");
        double estatura = entrada.nextDouble();

        System.out.println("Ingrese su ciudad de residencia");
        entrada.nextLine();
        String ciudad = entrada.nextLine();

        cadena = String.format("\nLos datos ingresados son: "
                + "\nNombre: %s\nEdad: %d\nCiudad: %s\nEstatura: %.2f\n"
                + "Posicion: %s\n",
                nombrePersona, edad, ciudad, estatura, posicion);

        return cadena;

    }
}
