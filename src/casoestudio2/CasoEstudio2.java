/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoestudio2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class CasoEstudio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        GrupoAmigos grupo = new GrupoAmigos(6, 8);

        Amigo joshua = new Amigo("Joshua");
        Amigo greivin = new Amigo("Greivin");
        Amigo guillermo = new Amigo("Guillermo");
        Amigo andres = new Amigo("Andres");
        Amigo tavo = new Amigo("Tavo");
        Amigo david = new Amigo("David");

        grupo.agregarAmigo(0, joshua);
        grupo.agregarAmigo(1, greivin);
        grupo.agregarAmigo(2, guillermo);
        grupo.agregarAmigo(3, andres);
        grupo.agregarAmigo(4, tavo);
        grupo.agregarAmigo(5, david);

        grupo.agregarMovimiento(0, new Movimiento("Desayuno coffePrime", grupo.amigos, guillermo, 120, "Dolares"));
        grupo.agregarMovimiento(1, new Movimiento("Almuerzo Pig Factory", grupo.amigos, guillermo, 200, "Dolares"));
        grupo.agregarMovimiento(2, new Movimiento("Cena FastFood", grupo.amigos, david, 50, "Dolares"));
        grupo.agregarMovimiento(3, new Movimiento("Pizza Hut", grupo.amigos, tavo, 100, "Dolares"));
        grupo.agregarMovimiento(4, new Movimiento("Quicksilver store", grupo.amigos, greivin, 150, "Dolares"));
        grupo.agregarMovimiento(5, new Movimiento("Apple store", grupo.amigos, joshua, 200, "Dolares"));
        grupo.agregarMovimiento(6, new Movimiento("Desayuno chillis", grupo.amigos, greivin, 150, "Dolares"));
        grupo.agregarMovimiento(7, new Movimiento("Almuerzo hooters", grupo.amigos, tavo, 180, "Dolares"));

        grupo.analizarDeudas(joshua);
        System.out.println("");
        grupo.analizarDeudas(greivin);
        System.out.println("");
        grupo.analizarDeudas(guillermo);
        System.out.println("");
        grupo.analizarDeudas(andres);
        System.out.println("");
        grupo.analizarDeudas(tavo);
        System.out.println("");
        grupo.analizarDeudas(david);
        System.out.println("");
        
        System.out.println("Deseas agregar un movimiento nuevo? 1=Si. 2=No ");
        int agregar = sc.nextInt();
        
        int cantidadMovimientos = 0;
        String[] nombres, descripciones;
        double[] montos;

        while (agregar==1) {
            System.out.print("¿Cuántos movimientos quieres agregar?: ");
            cantidadMovimientos = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            nombres = new String[cantidadMovimientos];
            descripciones = new String[cantidadMovimientos];
            montos = new double[cantidadMovimientos];

            for (int i = 0; i < cantidadMovimientos; i++) {
                System.out.print("Ingrese la descripción del movimiento " + (i + 1) + ": ");
                descripciones[i] = sc.nextLine();
                
                System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
                nombres[i] = sc.nextLine();

                System.out.print("Ingrese el monto  " + (i + 1) + ": ");
                montos[i] = sc.nextDouble();
                sc.nextLine(); // Limpiar el buffer
            }
            System.out.println("Deseas agregar un movimiento nuevo? 1=Si. 2=No ");
            agregar = sc.nextInt();
            
            
                System.out.println("\nMovimientos agregados:");
            for (int i = 0; i < cantidadMovimientos; i++) {
                System.out.println("\nMovimiento " + (i + 1) +  "\nDescripción: " + descripciones[i] + ":\nNombre: " + nombres[i]+"\nMonto: $" + montos[i]);
                System.out.println("Movimientos agregados exitosamente");
        }
            
            
        }
       

        
        
        
}
    }
