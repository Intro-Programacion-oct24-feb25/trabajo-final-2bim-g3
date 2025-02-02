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
                + "(montaña, ruta, urbano)");
        entrada.nextLine();

        String especialidad = entrada.nextLine();

        System.out.println("Ingrese su marca de bicicleta preferida");
        String marca = entrada.nextLine();

        System.out.println("Ingrese su ciudad de residencia");
        String ciudad = entrada.nextLine();

        cadena = String.format("\nLos datos ingresados son: "
                + "\nNombre: %s\nEdad: %d\nCiudad: %s\n"
                + "Tipo que practica: %s\nMarca favorita: %s\n",
                nombrePersona, edad, ciudad, especialidad, marca);

        return cadena;

    }
}
