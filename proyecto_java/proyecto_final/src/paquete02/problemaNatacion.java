/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class problemaNatacion {

    public static String obtenerDatosNatacion() {

        String cadena;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre del participante");
        String nombrePersona = entrada.nextLine();

        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();

        System.out.println("Ingrese su nivel (principiante,"
                + " intermedio o avanzado)");
        entrada.nextLine();
        String posicion = entrada.nextLine();

        System.out.println("Ingrese su ciudad de residencia");
        String ciudad = entrada.nextLine();

        System.out.println("Ingrese su estilo de nado favorito");
        String equipo = entrada.nextLine();

        cadena = String.format("Los datos ingresados son: "
                + "\n%s\n%d\n%s\n%s\n%s\n",
                nombrePersona, edad, posicion, ciudad, equipo);

        return cadena;

    }
}
