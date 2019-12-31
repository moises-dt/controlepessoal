package br.com.controlepessoal.gui;

import br.com.controlepessoal.dto.ComissaoVendaDTO;
import br.com.controlepessoal.dto.FuncionarioDTO;
import br.com.controlepessoal.exception.ApplicationException;
import br.com.controlepessoal.service.ComissaoVendaService;
import br.com.controlepessoal.service.FuncionarioService;
import br.com.controlepessoal.util.Calculos;
import br.com.controlepessoal.util.Formatar;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author MDiasT
 */
public class ComissaoVendaGUI extends javax.swing.JInternalFrame {

    private ComissaoVendaService cvSER = new ComissaoVendaService();
    private FuncionarioService fSER = new FuncionarioService();
    private ComissaoVendaDTO cvDTO = new ComissaoVendaDTO();
    private List<ComissaoVendaDTO> comissaovenda = null;
    private List<FuncionarioDTO> funcionarios = null;
    private Calculos calculo = new Calculos();
    private Formatar formata = new Formatar();
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    /**
     * Creates new form ComissaoVendaGUI
     */
    public ComissaoVendaGUI() {
        initComponents();
        carregarTabelaComissaoVenda();
        carregarListaComboBoxFuncionario();
        dccData.setDate(Date.from(Instant.now()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdComissaoVenda = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dccData = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txtValorVenda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPorcentagemVenda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtValorComissao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbListaFuncionarios = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtTaxaCartao = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btCancelarLimpar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblComissaoVenda = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setText("Id:");

        txtIdComissaoVenda.setEditable(false);
        txtIdComissaoVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setText("Data:");

        jLabel3.setText("Valor da Venda:");

        txtValorVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorVendaFocusLost(evt);
            }
        });

        jLabel4.setText("Porcentagem Comissão:");

        txtPorcentagemVenda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPorcentagemVenda.setText("2.0");
        txtPorcentagemVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPorcentagemVendaFocusLost(evt);
            }
        });

        jLabel5.setText("Valor Comissão:");

        txtValorComissao.setEditable(false);
        txtValorComissao.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setText("Lista de Funcionários:");

        cmbListaFuncionarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "....... Selecione o Funcionário ......." }));

        jLabel7.setText("Taxa Cartão");

        txtTaxaCartao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTaxaCartao.setText("0.0");
        txtTaxaCartao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTaxaCartaoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdComissaoVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(txtValorVenda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dccData, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPorcentagemVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                .addComponent(txtTaxaCartao, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbListaFuncionarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(51, 51, 51)
                .addComponent(txtValorComissao, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dccData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtIdComissaoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtPorcentagemVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTaxaCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbListaFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtValorComissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Adicionar / Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");

        btCancelarLimpar.setText("Cancelar / Limpar");
        btCancelarLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCancelarLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCancelarLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tblComissaoVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Data", "Valor da Venda", "Porcentagem da Venda", "Valor da Comissão", "Funcionário", "Taxa do Cartão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblComissaoVenda);
        if (tblComissaoVenda.getColumnModel().getColumnCount() > 0) {
            tblComissaoVenda.getColumnModel().getColumn(0).setMaxWidth(100);
            tblComissaoVenda.getColumnModel().getColumn(5).setMinWidth(300);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            capturarInformcaoes();
            cvSER.incluir(cvDTO);
            carregarTabelaComissaoVenda();
        } catch (ApplicationException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void carregarListaComboBoxFuncionario(){
        try {
            funcionarios = fSER.listarNome();
        } catch (ApplicationException ex) {
            ex.printStackTrace();
        }
        for (int i = 0; i < funcionarios.size(); i++) {
            cmbListaFuncionarios.addItem(funcionarios.get(i).getNome());
        }
    }
    
    private void carregarTabelaComissaoVenda()  {
        modelo = (DefaultTableModel)tblComissaoVenda.getModel();
        modelo.setNumRows(0);
        try {
            comissaovenda = cvSER.listar();
        } catch (ApplicationException ex) {
            ex.printStackTrace();
        }
        for(ComissaoVendaDTO cv : comissaovenda) {
            modelo.addRow(new String[]{
                cv.getId_comissao_venda().toString(),
                cv.getData().toString(),
                cv.getValor_venda().toString(),
                cv.getPorcentagem_venda().toString(),
                cv.getValor_comissao().toString(),
                cv.getId_funcionario().toString(),
                cv.getTaxa_cartao().toString(),
            });
        }
    }
    
    private void btCancelarLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarLimparActionPerformed
        if (txtIdComissaoVenda.getText().equals("")) {
            this.dispose();
        } else {
            int confirma = JOptionPane.showConfirmDialog(this, "Deseja Salvar a comissão antes de fechar?");
            if (confirma == 0) {
            } else {
                this.dispose();
            }
        }
    }//GEN-LAST:event_btCancelarLimparActionPerformed

    private void txtValorVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorVendaFocusLost
        calculo();
    }//GEN-LAST:event_txtValorVendaFocusLost

    private void txtPorcentagemVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPorcentagemVendaFocusLost
        calculo();
    }//GEN-LAST:event_txtPorcentagemVendaFocusLost

    private void txtTaxaCartaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTaxaCartaoFocusLost
        calculo();
    }//GEN-LAST:event_txtTaxaCartaoFocusLost

    public void calculo(){
       if(txtValorVenda.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Necessita digitar valor no campo Valor de Venda");
        }else{
            txtValorComissao.setText(formata.doubleParaStringComPontoDeMilhar(Double.parseDouble(String.valueOf(calculo.calculoComissao(Double.parseDouble(formata.convertendoDoubleAmericano(txtValorVenda.getText())),
                    Double.parseDouble(txtPorcentagemVenda.getText()), Double.parseDouble(txtTaxaCartao.getText()))))));
        }
       try{ 
            String valor = txtValorVenda.getText();
            txtValorVenda.setText(formata.doubleParaStringComPontoDeMilhar(Double.parseDouble(valor)));
       }catch(NumberFormatException ex){     
           ex.printStackTrace();
       }
    }
    
    private void capturarInformcaoes(){
        if(!txtIdComissaoVenda.getText().trim().equals("")){
        cvDTO.setId_comissao_venda(Long.parseLong(txtIdComissaoVenda.getText()));
        }
        cvDTO.setData(dccData.getDate());
        cvDTO.setValor_venda(Double.parseDouble(formata.convertendoDoubleAmericano(txtValorVenda.getText())));
        cvDTO.setPorcentagem_venda(Double.parseDouble(txtPorcentagemVenda.getText()));
        cvDTO.setTaxa_cartao(Double.parseDouble(txtTaxaCartao.getText()));
        cvDTO.setValor_comissao(Double.parseDouble(formata.convertendoDoubleAmericano(txtValorComissao.getText())));
        
        try {
            
            funcionarios = fSER.listarNome();
            for(int i = 0; i < funcionarios.size(); i++){
                System.out.println(fSER.listarNome().get(i).getId_funcionario());
            }
        } catch (ApplicationException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public void limparTela(){
        txtIdComissaoVenda.setText("");
        dccData.setDate(Date.from(Instant.now()));
        txtPorcentagemVenda.setText("2.0");
        txtValorComissao.setText("");
        txtValorVenda.setText("");
        txtTaxaCartao.setText("4.5");
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarLimpar;
    private javax.swing.JComboBox<String> cmbListaFuncionarios;
    private com.toedter.calendar.JDateChooser dccData;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblComissaoVenda;
    private javax.swing.JTextField txtIdComissaoVenda;
    private javax.swing.JTextField txtPorcentagemVenda;
    private javax.swing.JTextField txtTaxaCartao;
    private javax.swing.JTextField txtValorComissao;
    private javax.swing.JTextField txtValorVenda;
    // End of variables declaration//GEN-END:variables
}
