package br.com.controlepessoal.service;

import br.com.controlepessoal.connection.DataBaseConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 * @author MDiasT
 */
public class RelatoriosService {
 
    public void relatorioComissao() {                                                      
        Connection con;
        try {
            con = DataBaseConnectionFactory.getConnection();
            String src = "./src/br/com/controlepessoal/relatorios/relatoriocomissoesfuncionariogerais.jasper";
            JasperPrint jasperprint = null;
            try {
                jasperprint = JasperFillManager.fillReport(src, null, con);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao gerar o relatório");
            }
            JasperViewer view = new JasperViewer(jasperprint, false);
            view.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }  
    
    public void relatorioComissaoResumida() {                                                      
        Connection con;
        try {
            con = DataBaseConnectionFactory.getConnection();
            String src = "./src/br/com/controlepessoal/relatorios/relatoriocomissoesfuncionarioSomaDia.jasper";
            JasperPrint jasperprint = null;
            try {
                jasperprint = JasperFillManager.fillReport(src, null, con);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Erro ao gerar o relatório");
            }
            JasperViewer view = new JasperViewer(jasperprint, false);
            view.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }  
    
}
