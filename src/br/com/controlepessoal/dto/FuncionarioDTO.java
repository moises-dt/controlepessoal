package br.com.controlepessoal.dto;

/**
 * @author MDiasT
 */
public class FuncionarioDTO {
    
    private Long id_funcionario;
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String cep;
    private String cpf;
    private String identidade;
    private Integer numero;
    private String complemento;
    private String telefone_fixo;
    private String telefone_celular;
    private String email;
    private Long id_quadro;
    
    public FuncionarioDTO(){
    }

    public FuncionarioDTO(Long id_funcionario, String nome, String endereco,
            String bairro, String cidade, String cep, String cpf,
            String identidade, Integer numero, String complemento,
            String telefone_fixo, String telefone_celular, String email,
            Long id_quadro) {
        this.id_funcionario = id_funcionario;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.cpf = cpf;
        this.identidade = identidade;
        this.numero = numero;
        this.complemento = complemento;
        this.telefone_fixo = telefone_fixo;
        this.telefone_celular = telefone_celular;
        this.email = email;
        this.id_quadro = id_quadro;
    }

    public Long getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Long id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTelefone_fixo() {
        return telefone_fixo;
    }

    public void setTelefone_fixo(String telefone_fixo) {
        this.telefone_fixo = telefone_fixo;
    }

    public String getTelefone_celular() {
        return telefone_celular;
    }

    public void setTelefone_celular(String telefone_celular) {
        this.telefone_celular = telefone_celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId_quadro() {
        return id_quadro;
    }

    public void setId_quadro(Long id_quadro) {
        this.id_quadro = id_quadro;
    }

    @Override
    public String toString() {
        return "FuncionarioDTO{" +
                "id_funcionario=" + id_funcionario + ","
                + "nome=" + nome + ","
                + "endereco=" + endereco + ","
                + "bairro=" + bairro + ","
                + "cidade=" + cidade + ","
                + "cep=" + cep + ","
                + "cpf=" + cpf + ","
                + "identidade=" + identidade + ","
                + "numero=" + numero + ","
                + "complemento=" + complemento + ","
                + "telefone_fixo=" + telefone_fixo + ","
                + "telefone_celular=" + telefone_celular + ","
                + "email=" + email + ","
                + "id_quadro=" + id_quadro + '}';
    }
}
