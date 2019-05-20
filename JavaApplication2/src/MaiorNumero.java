import javax.swing.JOptionPane;
public class MaiorNumero {
   // inicia o método main para execução da aplicação
   public static void main ( String args []) {
       int maior = 0; // Armazena o maior numero dos digitados pelo usuário
       int contador = 1; // contador de controle
       int number;
       String numero; // String digitada pelo usuário
       // Inicia a fase de processamento da aplicação
       while ( contador <= 10) {
       // Inicia o contador de controle da aplicação
          contador ++;
       // Solicita a entrada do usuário
          numero = JOptionPane.showInputDialog ( "Digite o número no campo:");
          
       // Converte a entrada do usuário para um tipo inteiro
          number = Integer.parseInt (numero);
        if ( number > maior ) {
                
           maior = number;
        }   // Fim da estrutura de controle   if    
       
       } 
      JOptionPane.showMessageDialog (null, "O Maior dos números digitados é: " + maior, "Resultado", JOptionPane.INFORMATION_MESSAGE);
      
   } // Fim do método main
} // Fim da classe MaiorNUmero
