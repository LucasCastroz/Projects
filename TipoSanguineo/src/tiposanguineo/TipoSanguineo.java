/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposanguineo;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class TipoSanguineo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
           String n3 =  (JOptionPane.showInputDialog(null, "Qual é o seu tipo sanguineo \nA  \nB  \nO \nAB"));
            
            switch(n3){
                case "A": case "a":
                    
                    JOptionPane.showMessageDialog(null , "\nSeu tipo sanguíneo é:  " + n3);
                    break;
                
                case "B": case "b":
                    
                    JOptionPane.showMessageDialog(null ,"\nSeu tipo sanguíneo é: " + n3);
                    break;
                    
                case "O": case "o":
                    
                    JOptionPane.showMessageDialog(null, "\nSeu tipo sanguíneo é : " + n3);
                    break;
                    
                case "AB": case "ab":
                    JOptionPane.showMessageDialog(null, "\nSeu tipo sanguíneo é: " +n3);
                   
                    break;
                    
                default:
                JOptionPane.showMessageDialog(null,"ERRO! Você digitou uma opção inválida.");
            }            
    }   
}
        
    
    

