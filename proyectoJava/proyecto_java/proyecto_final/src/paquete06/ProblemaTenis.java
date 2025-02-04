/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class ProblemaTenis {

    public static String obtenerDatosTenis() {

        String cadena;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre del participante");
        String nombrePersona = entrada.nextLine();

        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();

        System.out.println("Ingrese su nivel de juego"
                + "(principiante, intermedio, avanzado)");
        entrada.nextLine();
        String nivel = entrada.nextLine();

        System.out.println("Ingrese su mano habil de juego");
        String mano = entrada.nextLine();

        System.out.println("Ingrese su ciudad de residencia");
        String ciudad = entrada.nextLine();

        cadena = String.format("Los datos ingresados para tenis son: "
                + "\nNombre: %s\nEdad: %d\nCiudad: %s\nNivel: %s\n"
                + "Mano habil: %s\n",
                nombrePersona, edad, ciudad, nivel, mano);

        return cadena;

    }
}
