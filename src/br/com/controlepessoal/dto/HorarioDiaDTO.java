package br.com.controlepessoal.dto;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * @author MDiasT
 */
public class HorarioDiaDTO {
    
    private Long id_horario;
    private Date data;
    private Timestamp entrada1;
    private Timestamp saida1;
    private Timestamp entrada2;
    private Timestamp saida2;
    private Timestamp entrada3;
    private Timestamp saida3;
    private Timestamp carga_horaria;
    private Long id_funcionario;
    
    public HorarioDiaDTO(){
    }

    public HorarioDiaDTO(Long id_horario, Date data, Timestamp entrada1,
            Timestamp saida1, Timestamp entrada2, Timestamp saida2,
            Timestamp entrada3, Timestamp saida3, Timestamp carga_horaria,
            Long id_funcionario) {
        this.id_horario = id_horario;
        this.data = data;
        this.entrada1 = entrada1;
        this.saida1 = saida1;
        this.entrada2 = entrada2;
        this.saida2 = saida2;
        this.entrada3 = entrada3;
        this.saida3 = saida3;
        this.carga_horaria = carga_horaria;
        this.id_funcionario = id_funcionario;
    }

    public Long getId_horario() {
        return id_horario;
    }

    public void setId_horario(Long id_horario) {
        this.id_horario = id_horario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Timestamp getEntrada1() {
        return entrada1;
    }

    public void setEntrada1(Timestamp entrada1) {
        this.entrada1 = entrada1;
    }

    public Timestamp getSaida1() {
        return saida1;
    }

    public void setSaida1(Timestamp saida1) {
        this.saida1 = saida1;
    }

    public Timestamp getEntrada2() {
        return entrada2;
    }

    public void setEntrada2(Timestamp entrada2) {
        this.entrada2 = entrada2;
    }

    public Timestamp getSaida2() {
        return saida2;
    }

    public void setSaida2(Timestamp saida2) {
        this.saida2 = saida2;
    }

    public Timestamp getEntrada3() {
        return entrada3;
    }

    public void setEntrada3(Timestamp entrada3) {
        this.entrada3 = entrada3;
    }

    public Timestamp getSaida3() {
        return saida3;
    }

    public void setSaida3(Timestamp saida3) {
        this.saida3 = saida3;
    }

    public Timestamp getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(Timestamp carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public Long getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(Long id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    @Override
    public String toString() {
        return "HorarioDiaDTO{"
                + "id_horario=" + id_horario + ","
                + "data=" + data + ","
                + "entrada1=" + entrada1 + ","
                + "saida1=" + saida1 + ","
                + "entrada2=" + entrada2 + ","
                + "saida2=" + saida2 + ","
                + "entrada3=" + entrada3 + ","
                + "saida3=" + saida3 + ","
                + "carga_horaria=" + carga_horaria + ","
                + "id_funcionario=" + id_funcionario + '}';
    }
}
