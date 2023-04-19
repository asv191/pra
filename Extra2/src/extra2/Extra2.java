/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra2;

import Entidad.NIF;
import Entidad.Servicios.NIFServicio;

/**
 *
 * @author ale
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TRWAGMYFPDXBNJZSQVHLCKE
        NIF a1 = new NIF();
        NIFServicio ser=new NIFServicio();
        ser.calcularLetra(a1);
    }
    
}
