/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class ProblemaAtletismo {

    public static String obtenerDatosAtletismo() {

        String cadena;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre del participante");
        String nombrePersona = entrada.nextLine();

        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();

        System.out.println("Ingrese su especialidad"
                + " (carreras, salto, lanzamiento)");
        entrada.nextLine();
        String especialidad = entrada.nextLine();

        System.out.println("Ingrese su ciudad de residencia");
        String ciudad = entrada.nextLine();

        System.out.println("Ingrese su record personal en su disciplina");
        String record = entrada.nextLine();

        cadena = String.format("Los datos ingresados para atletismo son: "
                + "\nNombre: %s\nEdad: %d\nCiudad: %s\n"
                + "Record personal: %s\nEspecialidad: %s\n ",
                nombrePersona, edad, ciudad, especialidad, record);

        return cadena;

    }
}
