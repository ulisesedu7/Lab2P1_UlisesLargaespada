/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_uliseslargaespada;

import java.util.Scanner;

/**
 *
 * @author ularg
 */
public class Lab2P1_UlisesLargaespada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner para recibir entradas        
        Scanner entrada = new Scanner(System.in);
        
        /* Inicio del programa con un Do while,
           para que pueda leer una opción y en base a ello escoger
           el ejercicio a realizar.
        */
        do {
            // Impresión del menú
            System.out.println("-- Bienvenido al programa de desarollo de ejercicios --");
            System.out.println("-- Porfavor seleccione una opción del menu --");
            System.out.println("1 - Índice académico");
            System.out.println("2 - Ok Boomer!");
            System.out.println("3 - Gotta Know Them All!");
            System.out.println("4 - Salir");
            
            // Solicitud de la opción
            System.out.print("Opcion: ");
            int option = entrada.nextInt();
            System.out.println("");
            
            // Programa de indice academico
            if (option == 1) {
                System.out.println("-- Bienvenido al programa de Índice Académico --");
                System.out.println("-- En este programa va a calcular el máximo común divisor de dos números --");
                
                // Solicitud de los numeros
                System.out.println("-- Ingrese el primer número --");
                double numberA = entrada.nextDouble();
                
                System.out.println("-- Ingrese el segundo número --");
                double numberB = entrada.nextDouble();
                
                double respuesta;
                
                // Evaluacion del calculo del MCD
                if (numberA != 0 && numberB != 0) {
                    // Realizar la comparación de los números para calcular su MCD
                    while (numberA != numberB) {
                        while (numberA > numberB) {
                            numberA = numberA - numberB;
                        } 
                        while (numberB > numberA){
                            numberB = numberB - numberA;
                        }
                    }
                
                    respuesta = numberA;

                    System.out.println("Su respuesta es: " + respuesta);
                    System.out.println("");
                } 
                else {
                    System.out.println("Los numeros deben ser positivos");
                    System.out.println("");
                }
            }
            // Programa de Ok Boomer
            else if (option == 2) {
                System.out.println("-- Bienvenido al programa de Ok Boomer! --");
                System.out.println("-- En este programa le diermos a qué generación pertenece en base a su año de nacimiento --");
                
                // Solicitud de entrada del nacimiento
                System.out.print("Ingrese su año de nacimiento: ");
                int nacimiento = entrada.nextInt();
                
                // Comparacion de los años respectivos
                if (nacimiento <= 2025 && nacimiento >= 2013) {
                    System.out.println("!Felicidades usted es de la Gen Alpha!");
                } else if (nacimiento <= 2012 && nacimiento >= 1995) {
                    System.out.println("!Felicidades usted es de la Gen Z!");
                } else if (nacimiento <= 1994 && nacimiento >= 1986) {
                    System.out.println("!Felicidades usted es de la Gen Millenials!");
                } else if (nacimiento <= 1985 && nacimiento >= 1980) {
                    System.out.println("!Felicidades usted es de la Gen Xennials!");
                } else if (nacimiento <= 1979 && nacimiento >= 1965) {
                    System.out.println("!Felicidades usted es de la Generation X!");
                } else if (nacimiento <= 1964 && nacimiento >= 1946) {
                    System.out.println("!Felicidades usted es de la Gen Baby Boomer!");
                } else {
                    System.out.println("!Felicidades usted es de una Gen desconocida!");
                }
                System.out.println("");
            }
            // Programa de gotta know them all
            else if (option == 3) {
                System.out.println("-- Bienvenido al programa de Gotta Know Them All! --");
                System.out.println("-- En este programa usted nos ayudara como maestro Pokemon --");
                System.out.println("-- Vamos a identificar que eficacia tiene un Pokemon ante otro --");
                
                // Menu de opciones de los respectivos tipos
                System.out.println("Los tipos de Pokemon son los siguientes: ");
                System.out.println("1 - Hada (Fairy)");
                System.out.println("2 - Luchador (Fighting)");
                System.out.println("3 - Hierro (Steel)");
                System.out.println("4 - Psiquico (Psychic)");
                System.out.println("");
                
                // Variables de eficacia
                String eficaz = "Super Eficaz";
                String debil = "Debil";
                String neutral = "Neutral";
                
                // Solicitud de las entradas a los tipos de pokemon
                System.out.println("Ingrese los tipos respectivos seleccionando el numero del tipo");
                System.out.print("Ingrese el Tipo del atacador: ");
                int atacador = entrada.nextInt();
                
                System.out.print("Ingrese el Tipo del defensor: ");
                int defensor = entrada.nextInt();
                
                // Logica para comparar el resultado de los tipos
                if (atacador == 1) {
                    if (defensor == 1) {
                        System.out.println("El tipo Fairy es " + neutral + " contra el tipo Fairy");
                    } else if (defensor == 2) {
                        System.out.println("El tipo Fairy es " + eficaz + " contra el tipo Fighthing");
                    } else if (defensor == 3) {
                        System.out.println("El tipo Fairy es " + debil + " contra el tipo Steel");
                    } else if (defensor == 4) {
                        System.out.println("El tipo Fairy es " + neutral + " contra el tipo Psychic");
                    }
                }
                else if (atacador == 2) {
                    if (defensor == 1) {
                        System.out.println("El tipo Fighting es " + debil + " contra el tipo Fairy");
                    } else if (defensor == 2) {
                        System.out.println("El tipo Fighting es " + neutral + " contra el tipo Fighthing");
                    } else if (defensor == 3) {
                        System.out.println("El tipo Fighting es " + eficaz + " contra el tipo Steel");
                    } else if (defensor == 4) {
                        System.out.println("El tipo Fighting es " + debil + " contra el tipo Psychic");
                    }
                }
                else if (atacador == 3) {
                    if (defensor == 1) {
                        System.out.println("El tipo Steel es " + eficaz + " contra el tipo Fairy");
                    } else if (defensor == 2) {
                        System.out.println("El tipo Steel es " + neutral + " contra el tipo Fighthing");
                    } else if (defensor == 3) {
                        System.out.println("El tipo Steel es " + debil + " contra el tipo Steel");
                    } else if (defensor == 4) {
                        System.out.println("El tipo Steel es " + neutral + " contra el tipo Psychic");
                    }
                }
                else if (atacador == 4) {
                    if (defensor == 1) {
                        System.out.println("El tipo Psychic es " + neutral + " contra el tipo Fairy");
                    } else if (defensor == 2) {
                        System.out.println("El tipo Psychic es " + eficaz + " contra el tipo Fighthing");
                    } else if (defensor == 3) {
                        System.out.println("El tipo Psychic es " + debil + " contra el tipo Steel");
                    } else if (defensor == 4) {
                        System.out.println("El tipo Psychic es " + debil + " contra el tipo Psychic");
                    }
                } else {
                    System.out.println("Ingreso una opcion incorrecta");
                }
                
                System.out.println("");
            }
            // Terminar el codigo
            else if (option == 4) {
                break;
            }
            else {
                System.out.println("Elija un número del 1 al 4 por favor.");
                System.out.println("");
            }
            
        } while(true);
    }
    
}
