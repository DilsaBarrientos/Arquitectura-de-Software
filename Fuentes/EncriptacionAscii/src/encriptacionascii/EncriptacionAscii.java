/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptacionascii;

import javax.swing.JOptionPane;

/**
 *
 * @author default
 */
public class EncriptacionAscii {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        String mensaje;
        String mensajeEncriptado;
        String mensajeDesencriptado;
        char array[];
        mensaje=JOptionPane.showInputDialog("Ingrese su mensaje a encriptar");
        array= mensaje.toCharArray();
        for (int i = 0; i < array.length; i++) 
        {
            array[i]= (char)(array[i] + (char) 6);
                        
        }
        mensajeEncriptado=String.valueOf(array);
        System.out.println(mensaje);
        System.out.println(mensajeEncriptado);
        
        for (int i = 0; i < array.length; i++) 
        {
           array[i]= (char)(array[i] - (char) 6);
                        
        }
        mensajeDesencriptado=String.valueOf(array);
        System.out.println(mensajeDesencriptado);
    }
    
}
