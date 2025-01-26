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
public class problemaAtletismo {

    public static void obtenerDatosAtletismo() {

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
        String equipo = entrada.nextLine();

        System.out.println("Ingrese su record personal en su disciplina");
        String posicion = entrada.nextLine();

        System.out.printf("Los datos ingresados son: \n%s\n%d\n%s\n%s\n%s\n ",
                nombrePersona, edad, posicion, especialidad, equipo);

    }
}
