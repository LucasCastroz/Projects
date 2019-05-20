/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maior;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Maior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int n, maior=0, cont =1;
    
         
     while (cont <= 10){    
        cont++;   
        String numero = JOptionPane.showInputDialog ( "Digite o número no campo:");
        n = Integer.parseInt(numero);
        
        if (n > maior){
        maior =n;    
            
     }   
    }
    JOptionPane.showMessageDialog (null, "O Maior dos números digitados é: " + maior, "Resultado", JOptionPane.INFORMATION_MESSAGE);                                          
    }
    
}
