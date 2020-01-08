package br.com.controlepessoal.util;

import br.com.controlepessoal.service.ComissaoVendaService;
import javax.swing.JOptionPane;

/**
 * @author faetec
 */
public class Calculos {
    
    private ComissaoVendaService cvSER = new ComissaoVendaService();
    private int resultado = 0;
    private double valor = 0.0;
    
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
    
    public double calculoComissao(double valorvenda, double porcentagemcomissao, double taxacartao, double entrada){
        double desconto = 0.0;
        desconto = (valorvenda - entrada) - (valorvenda * (taxacartao/100));
        System.out.println(desconto);
        valor = (desconto + entrada) * (porcentagemcomissao/100);
        System.out.println(valor);
        return valor;
    }
    
    public void mostrarResultado(){
         JOptionPane.showMessageDialog(null, "Resultado = "+resultado);
    }
    
    public double calculoTotal(Double valor){
        resultado += valor;
        return resultado;
    }
}
