/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendas;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Vendas {

    public static void main(String[] args) {
      int n, m = 0;
        String numero = JOptionPane.showInputDialog ( "Digite o valor vendido pelo vendedor:");
        n = Integer.parseInt(numero);
           if (n <= 10000){
           m= 3000 +  500 ;            
 JOptionPane.showMessageDialog (null, "Seu salário será de : " + m, "Resultado", JOptionPane.INFORMATION_MESSAGE);                                         
     } 
           else if (n > 10000 || n== 20000){
                m= 3000 + 800 ;
                JOptionPane.showMessageDialog (null, "Seu salário será de : " + m, "Resultado", JOptionPane.INFORMATION_MESSAGE);
           }
           
             else if (n > 20000){
                m= 3000 + 1200 ;
                JOptionPane.showMessageDialog (null, "Seu salário será de  : " + m, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }                                                    
    }   
}
