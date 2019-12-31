package br.com.controlepessoal.util;

import javax.swing.JOptionPane;

/**
 * @author faetec
 */
public class Calculos {
    
    private int resultado = 0;
    
    public int somar (int n1, int n2){
        resultado = n1 + n2;
        return resultado;
        
    }
      
    public int subtrair (int n1, int n2){
        resultado = n1 - n2;
        return resultado;
        
    }
    
    public int dividir (int n1, int n2){
        resultado = n1 / n2;
        return resultado;
             
    }
    public int multiplicar (int n1, int n2){
        resultado = n1 * n2;
        return resultado;
        
    }
    public void mostrarResultado(){
         JOptionPane.showMessageDialog(null, "Resultado = "+resultado);
    }
    
}
