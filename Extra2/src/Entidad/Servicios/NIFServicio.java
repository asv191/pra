/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Servicios;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author ale
 */
public class NIFServicio {
 
    Scanner sc = new Scanner(System.in);
    
    public void calcularLetra(NIF x){
        char [] tablaCaracteres = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        System.out.println("Ingrese el dni");
        x.setDni(sc.nextLong());
        int posicion = (int) (x.getDni() % 23);
        x.setLetra(tablaCaracteres[posicion]);
        System.out.println("la letra es "+x.getLetra());
    }
    
}
