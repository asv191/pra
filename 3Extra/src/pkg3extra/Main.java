/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3extra;

import entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author ale
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n");
        HashSet<Libro> libro = new HashSet<>();
        
        boolean salir = true;
        do {
         
        System.out.println("Ingrese titulo del libro");
        String titulo = sc.next();
        System.out.println("Ingrese autor");
        String autor = sc.next();
        System.out.println("Ingrese cantidad de ejemplares en la biblioteca");
        int nejemplares = sc.nextInt();
        System.out.println("Ingrese ejemplares prestados");
        int nprestados = sc.nextInt();
            System.out.println("Desea cargar otro libro? Si / No");
            String sal = sc.next();
            if (sal.equalsIgnoreCase("no")) {
                salir  = false;
            }
            libro.add(new Libro(titulo, autor, nejemplares, nprestados));
            } while (salir);
        
        for (Object object : libro) {
            System.out.println(object);
        }
        
    }
    
}
