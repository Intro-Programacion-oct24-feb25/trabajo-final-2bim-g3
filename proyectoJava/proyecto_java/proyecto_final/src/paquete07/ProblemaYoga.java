/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete07;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class ProblemaYoga {

    public static String obtenerDatosYoga() {

        String cadena;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre del participante");
        String nombrePersona = entrada.nextLine();

        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();

        System.out.println("Ingrese su nivel"
                + "(principiante, intermedio, avanzado)");
        entrada.nextLine();
        String nivel = entrada.nextLine();

        System.out.println("Ingrese su estilo de yoga favorito");
        String estilo = entrada.nextLine();

        System.out.println("Ingrese su ciudad de residencia");
        String ciudad = entrada.nextLine();

        cadena = String.format("Los datos ingresados para yoga son: "
                + "\nNombre: %s\nEdad: %d\nCiudad: %s\nNivel: %s\n"
                + "Estilo favorito: %s\n",
                nombrePersona, edad, ciudad, nivel, estilo);

        return cadena;

    }
}
