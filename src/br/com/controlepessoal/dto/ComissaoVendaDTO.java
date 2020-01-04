package br.com.controlepessoal.dto;

import java.util.Date;

/**
 * @author MDiasT
 */

public class ComissaoVendaDTO {

    private Long id_comissao_venda;
    private Date data;
    private Double valor_venda;    
    private Double porcentagem_venda;
    private Double valor_comissao;
    private Long id_funcionario;
    private Double taxa_cartao;
    private String nome;

    public ComissaoVendaDTO(){
    }

    public ComissaoVendaDTO(Long id_comissao_venda, Date data, Double valor_venda,
            Double porcentagem_venda, Double valor_comissao, Long id_funcionario,
            Double taxa_cartao, String nome) {
        this.id_comissao_venda = id_comissao_venda;
        this.data = data;
        this.valor_venda = valor_venda;
        this.porcentagem_venda = porcentagem_venda;
        this.valor_comissao = valor_comissao;
        this.id_funcionario = id_funcionario;
        this.taxa_cartao = taxa_cartao;
        this.nome = nome;
    }

    public Long getId_comissao_venda() {
        return id_comissao_venda;
    }

    public void setId_comissao_venda(Long id_comissao_venda) {
        this.id_comissao_venda = id_comissao_venda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(Double valor_venda) {
        this.valor_venda = valor_venda;
    }

    public Double getPorcentagem_venda() {
        return porcentagem_venda;
    }

    public void setPorcentagem_venda(Double porcentagem_venda) {
        this.porcentagem_venda = porcentagem_venda;
    }

    public Double getValor_comissao() {
        return valor_comissao;
    }

    public void setValor_comissao(Double valor_comissao) {
        this.valor_comissao = valor_comissao;
    }

    public Long getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Long id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public Double getTaxa_cartao() {
        return taxa_cartao;
    }

    public void setTaxa_cartao(Double taxa_cartao) {
        this.taxa_cartao = taxa_cartao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Override
    public String toString() {
        return "ComissaoVendaDTO{"
                + "id_comissao_venda=" + id_comissao_venda + ","
                + "data=" + data + ","
                + "valor_venda=" + valor_venda + ","
                + "porcentagem_venda=" + porcentagem_venda + ","
                + "valor_comissao=" + valor_comissao + ","
                + "id_funcionario=" + id_funcionario + ","
                + "taxa_cartao=" + taxa_cartao + ","
                + "nome=" + nome + '}';
    }
}
