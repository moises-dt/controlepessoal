package br.com.controlepessoal.dto;

import java.sql.Timestamp;

/**
 * @author MDiasT
 */
public class QuadroHorarioDTO {
    
    private Long id_quadro;
    private String descricao;
    private Timestamp seg_entrada1;
    private Timestamp seg_saida1;
    private Timestamp seg_entrada2;
    private Timestamp seg_saida2;
    private Timestamp seg_entrada3;
    private Timestamp seg_saida3;
    private Timestamp seg_carga_horaria;
    private Timestamp ter_entrada1;
    private Timestamp ter_saida1;
    private Timestamp ter_entrada2;
    private Timestamp ter_saida2;
    private Timestamp ter_entrada3;
    private Timestamp ter_saida3;
    private Timestamp ter_carga_horaria;
    private Timestamp gua_entrada1;
    private Timestamp gua_saida1;
    private Timestamp gua_entrada2;
    private Timestamp gua_saida2;
    private Timestamp gua_entrada3;
    private Timestamp gua_saida3;
    private Timestamp gua_carga_horaria;
    private Timestamp gui_entrada1;
    private Timestamp gui_saida1;
    private Timestamp gui_entrada2;
    private Timestamp gui_saida2;
    private Timestamp gui_entrada3;
    private Timestamp gui_saida3;
    private Timestamp gui_carga_horaria;
    private Timestamp sex_entrada1;
    private Timestamp sex_saida1;
    private Timestamp sex_entrada2;
    private Timestamp sex_saida2;
    private Timestamp sex_entrada3;
    private Timestamp sex_saida3;
    private Timestamp sex_carga_horaria;
    private Timestamp sab_entrada1;
    private Timestamp sab_saida1;
    private Timestamp sab_entrada2;
    private Timestamp sab_saida2;
    private Timestamp sab_entrada3;
    private Timestamp sab_saida3;
    private Timestamp sab_carga_horaria;
    private Timestamp dom_entrada1;
    private Timestamp dom_saida1;
    private Timestamp dom_entrada2;
    private Timestamp dom_saida2;
    private Timestamp dom_entrada3;
    private Timestamp dom_saida3;
    private Timestamp dom_carga_horaria;
    
    public QuadroHorarioDTO(){
    }

    public QuadroHorarioDTO(Long id_quadro, String descricao, Timestamp seg_entrada1,
            Timestamp seg_saida1, Timestamp seg_entrada2, Timestamp seg_saida2,
            Timestamp seg_entrada3, Timestamp seg_saida3, Timestamp seg_carga_horaria,
            Timestamp ter_entrada1, Timestamp ter_saida1, Timestamp ter_entrada2,
            Timestamp ter_saida2, Timestamp ter_entrada3, Timestamp ter_saida3,
            Timestamp ter_carga_horaria, Timestamp gua_entrada1, Timestamp gua_saida1,
            Timestamp gua_entrada2, Timestamp gua_saida2, Timestamp gua_entrada3,
            Timestamp gua_saida3, Timestamp gua_carga_horaria, Timestamp gui_entrada1,
            Timestamp gui_saida1, Timestamp gui_entrada2, Timestamp gui_saida2,
            Timestamp gui_entrada3, Timestamp gui_saida3, Timestamp gui_carga_horaria,
            Timestamp sex_entrada1, Timestamp sex_saida1, Timestamp sex_entrada2,
            Timestamp sex_saida2, Timestamp sex_entrada3, Timestamp sex_saida3,
            Timestamp sex_carga_horaria, Timestamp sab_entrada1, Timestamp sab_saida1,
            Timestamp sab_entrada2, Timestamp sab_saida2, Timestamp sab_entrada3,
            Timestamp sab_saida3, Timestamp sab_carga_horaria, Timestamp dom_entrada1,
            Timestamp dom_saida1, Timestamp dom_entrada2, Timestamp dom_saida2,
            Timestamp dom_entrada3, Timestamp dom_saida3, Timestamp dom_carga_horaria) {
        this.id_quadro = id_quadro;
        this.descricao = descricao;
        this.seg_entrada1 = seg_entrada1;
        this.seg_saida1 = seg_saida1;
        this.seg_entrada2 = seg_entrada2;
        this.seg_saida2 = seg_saida2;
        this.seg_entrada3 = seg_entrada3;
        this.seg_saida3 = seg_saida3;
        this.seg_carga_horaria = seg_carga_horaria;
        this.ter_entrada1 = ter_entrada1;
        this.ter_saida1 = ter_saida1;
        this.ter_entrada2 = ter_entrada2;
        this.ter_saida2 = ter_saida2;
        this.ter_entrada3 = ter_entrada3;
        this.ter_saida3 = ter_saida3;
        this.ter_carga_horaria = ter_carga_horaria;
        this.gua_entrada1 = gua_entrada1;
        this.gua_saida1 = gua_saida1;
        this.gua_entrada2 = gua_entrada2;
        this.gua_saida2 = gua_saida2;
        this.gua_entrada3 = gua_entrada3;
        this.gua_saida3 = gua_saida3;
        this.gua_carga_horaria = gua_carga_horaria;
        this.gui_entrada1 = gui_entrada1;
        this.gui_saida1 = gui_saida1;
        this.gui_entrada2 = gui_entrada2;
        this.gui_saida2 = gui_saida2;
        this.gui_entrada3 = gui_entrada3;
        this.gui_saida3 = gui_saida3;
        this.gui_carga_horaria = gui_carga_horaria;
        this.sex_entrada1 = sex_entrada1;
        this.sex_saida1 = sex_saida1;
        this.sex_entrada2 = sex_entrada2;
        this.sex_saida2 = sex_saida2;
        this.sex_entrada3 = sex_entrada3;
        this.sex_saida3 = sex_saida3;
        this.sex_carga_horaria = sex_carga_horaria;
        this.sab_entrada1 = sab_entrada1;
        this.sab_saida1 = sab_saida1;
        this.sab_entrada2 = sab_entrada2;
        this.sab_saida2 = sab_saida2;
        this.sab_entrada3 = sab_entrada3;
        this.sab_saida3 = sab_saida3;
        this.sab_carga_horaria = sab_carga_horaria;
        this.dom_entrada1 = dom_entrada1;
        this.dom_saida1 = dom_saida1;
        this.dom_entrada2 = dom_entrada2;
        this.dom_saida2 = dom_saida2;
        this.dom_entrada3 = dom_entrada3;
        this.dom_saida3 = dom_saida3;
        this.dom_carga_horaria = dom_carga_horaria;
    }

    public Long getId_quadro() {
        return id_quadro;
    }

    public void setId_quadro(Long id_quadro) {
        this.id_quadro = id_quadro;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Timestamp getSeg_entrada1() {
        return seg_entrada1;
    }

    public void setSeg_entrada1(Timestamp seg_entrada1) {
        this.seg_entrada1 = seg_entrada1;
    }

    public Timestamp getSeg_saida1() {
        return seg_saida1;
    }

    public void setSeg_saida1(Timestamp seg_saida1) {
        this.seg_saida1 = seg_saida1;
    }

    public Timestamp getSeg_entrada2() {
        return seg_entrada2;
    }

    public void setSeg_entrada2(Timestamp seg_entrada2) {
        this.seg_entrada2 = seg_entrada2;
    }

    public Timestamp getSeg_saida2() {
        return seg_saida2;
    }

    public void setSeg_saida2(Timestamp seg_saida2) {
        this.seg_saida2 = seg_saida2;
    }

    public Timestamp getSeg_entrada3() {
        return seg_entrada3;
    }

    public void setSeg_entrada3(Timestamp seg_entrada3) {
        this.seg_entrada3 = seg_entrada3;
    }

    public Timestamp getSeg_saida3() {
        return seg_saida3;
    }

    public void setSeg_saida3(Timestamp seg_saida3) {
        this.seg_saida3 = seg_saida3;
    }

    public Timestamp getSeg_carga_horaria() {
        return seg_carga_horaria;
    }

    public void setSeg_carga_horaria(Timestamp seg_carga_horaria) {
        this.seg_carga_horaria = seg_carga_horaria;
    }

    public Timestamp getTer_entrada1() {
        return ter_entrada1;
    }

    public void setTer_entrada1(Timestamp ter_entrada1) {
        this.ter_entrada1 = ter_entrada1;
    }

    public Timestamp getTer_saida1() {
        return ter_saida1;
    }

    public void setTer_saida1(Timestamp ter_saida1) {
        this.ter_saida1 = ter_saida1;
    }

    public Timestamp getTer_entrada2() {
        return ter_entrada2;
    }

    public void setTer_entrada2(Timestamp ter_entrada2) {
        this.ter_entrada2 = ter_entrada2;
    }

    public Timestamp getTer_saida2() {
        return ter_saida2;
    }

    public void setTer_saida2(Timestamp ter_saida2) {
        this.ter_saida2 = ter_saida2;
    }

    public Timestamp getTer_entrada3() {
        return ter_entrada3;
    }

    public void setTer_entrada3(Timestamp ter_entrada3) {
        this.ter_entrada3 = ter_entrada3;
    }

    public Timestamp getTer_saida3() {
        return ter_saida3;
    }

    public void setTer_saida3(Timestamp ter_saida3) {
        this.ter_saida3 = ter_saida3;
    }

    public Timestamp getTer_carga_horaria() {
        return ter_carga_horaria;
    }

    public void setTer_carga_horaria(Timestamp ter_carga_horaria) {
        this.ter_carga_horaria = ter_carga_horaria;
    }

    public Timestamp getGua_entrada1() {
        return gua_entrada1;
    }

    public void setGua_entrada1(Timestamp gua_entrada1) {
        this.gua_entrada1 = gua_entrada1;
    }

    public Timestamp getGua_saida1() {
        return gua_saida1;
    }

    public void setGua_saida1(Timestamp gua_saida1) {
        this.gua_saida1 = gua_saida1;
    }

    public Timestamp getGua_entrada2() {
        return gua_entrada2;
    }

    public void setGua_entrada2(Timestamp gua_entrada2) {
        this.gua_entrada2 = gua_entrada2;
    }

    public Timestamp getGua_saida2() {
        return gua_saida2;
    }

    public void setGua_saida2(Timestamp gua_saida2) {
        this.gua_saida2 = gua_saida2;
    }

    public Timestamp getGua_entrada3() {
        return gua_entrada3;
    }

    public void setGua_entrada3(Timestamp gua_entrada3) {
        this.gua_entrada3 = gua_entrada3;
    }

    public Timestamp getGua_saida3() {
        return gua_saida3;
    }

    public void setGua_saida3(Timestamp gua_saida3) {
        this.gua_saida3 = gua_saida3;
    }

    public Timestamp getGua_carga_horaria() {
        return gua_carga_horaria;
    }

    public void setGua_carga_horaria(Timestamp gua_carga_horaria) {
        this.gua_carga_horaria = gua_carga_horaria;
    }

    public Timestamp getGui_entrada1() {
        return gui_entrada1;
    }

    public void setGui_entrada1(Timestamp gui_entrada1) {
        this.gui_entrada1 = gui_entrada1;
    }

    public Timestamp getGui_saida1() {
        return gui_saida1;
    }

    public void setGui_saida1(Timestamp gui_saida1) {
        this.gui_saida1 = gui_saida1;
    }

    public Timestamp getGui_entrada2() {
        return gui_entrada2;
    }

    public void setGui_entrada2(Timestamp gui_entrada2) {
        this.gui_entrada2 = gui_entrada2;
    }

    public Timestamp getGui_saida2() {
        return gui_saida2;
    }

    public void setGui_saida2(Timestamp gui_saida2) {
        this.gui_saida2 = gui_saida2;
    }

    public Timestamp getGui_entrada3() {
        return gui_entrada3;
    }

    public void setGui_entrada3(Timestamp gui_entrada3) {
        this.gui_entrada3 = gui_entrada3;
    }

    public Timestamp getGui_saida3() {
        return gui_saida3;
    }

    public void setGui_saida3(Timestamp gui_saida3) {
        this.gui_saida3 = gui_saida3;
    }

    public Timestamp getGui_carga_horaria() {
        return gui_carga_horaria;
    }

    public void setGui_carga_horaria(Timestamp gui_carga_horaria) {
        this.gui_carga_horaria = gui_carga_horaria;
    }

    public Timestamp getSex_entrada1() {
        return sex_entrada1;
    }

    public void setSex_entrada1(Timestamp sex_entrada1) {
        this.sex_entrada1 = sex_entrada1;
    }

    public Timestamp getSex_saida1() {
        return sex_saida1;
    }

    public void setSex_saida1(Timestamp sex_saida1) {
        this.sex_saida1 = sex_saida1;
    }

    public Timestamp getSex_entrada2() {
        return sex_entrada2;
    }

    public void setSex_entrada2(Timestamp sex_entrada2) {
        this.sex_entrada2 = sex_entrada2;
    }

    public Timestamp getSex_saida2() {
        return sex_saida2;
    }

    public void setSex_saida2(Timestamp sex_saida2) {
        this.sex_saida2 = sex_saida2;
    }

    public Timestamp getSex_entrada3() {
        return sex_entrada3;
    }

    public void setSex_entrada3(Timestamp sex_entrada3) {
        this.sex_entrada3 = sex_entrada3;
    }

    public Timestamp getSex_saida3() {
        return sex_saida3;
    }

    public void setSex_saida3(Timestamp sex_saida3) {
        this.sex_saida3 = sex_saida3;
    }

    public Timestamp getSex_carga_horaria() {
        return sex_carga_horaria;
    }

    public void setSex_carga_horaria(Timestamp sex_carga_horaria) {
        this.sex_carga_horaria = sex_carga_horaria;
    }

    public Timestamp getSab_entrada1() {
        return sab_entrada1;
    }

    public void setSab_entrada1(Timestamp sab_entrada1) {
        this.sab_entrada1 = sab_entrada1;
    }

    public Timestamp getSab_saida1() {
        return sab_saida1;
    }

    public void setSab_saida1(Timestamp sab_saida1) {
        this.sab_saida1 = sab_saida1;
    }

    public Timestamp getSab_entrada2() {
        return sab_entrada2;
    }

    public void setSab_entrada2(Timestamp sab_entrada2) {
        this.sab_entrada2 = sab_entrada2;
    }

    public Timestamp getSab_saida2() {
        return sab_saida2;
    }

    public void setSab_saida2(Timestamp sab_saida2) {
        this.sab_saida2 = sab_saida2;
    }

    public Timestamp getSab_entrada3() {
        return sab_entrada3;
    }

    public void setSab_entrada3(Timestamp sab_entrada3) {
        this.sab_entrada3 = sab_entrada3;
    }

    public Timestamp getSab_saida3() {
        return sab_saida3;
    }

    public void setSab_saida3(Timestamp sab_saida3) {
        this.sab_saida3 = sab_saida3;
    }

    public Timestamp getSab_carga_horaria() {
        return sab_carga_horaria;
    }

    public void setSab_carga_horaria(Timestamp sab_carga_horaria) {
        this.sab_carga_horaria = sab_carga_horaria;
    }

    public Timestamp getDom_entrada1() {
        return dom_entrada1;
    }

    public void setDom_entrada1(Timestamp dom_entrada1) {
        this.dom_entrada1 = dom_entrada1;
    }

    public Timestamp getDom_saida1() {
        return dom_saida1;
    }

    public void setDom_saida1(Timestamp dom_saida1) {
        this.dom_saida1 = dom_saida1;
    }

    public Timestamp getDom_entrada2() {
        return dom_entrada2;
    }

    public void setDom_entrada2(Timestamp dom_entrada2) {
        this.dom_entrada2 = dom_entrada2;
    }

    public Timestamp getDom_saida2() {
        return dom_saida2;
    }

    public void setDom_saida2(Timestamp dom_saida2) {
        this.dom_saida2 = dom_saida2;
    }

    public Timestamp getDom_entrada3() {
        return dom_entrada3;
    }

    public void setDom_entrada3(Timestamp dom_entrada3) {
        this.dom_entrada3 = dom_entrada3;
    }

    public Timestamp getDom_saida3() {
        return dom_saida3;
    }

    public void setDom_saida3(Timestamp dom_saida3) {
        this.dom_saida3 = dom_saida3;
    }

    public Timestamp getDom_carga_horaria() {
        return dom_carga_horaria;
    }

    public void setDom_carga_horaria(Timestamp dom_carga_horaria) {
        this.dom_carga_horaria = dom_carga_horaria;
    }

    @Override
    public String toString() {
        return "QuadroHorarioDTO{"
                + "id_quadro=" + id_quadro + ","
                + "descricao=" + descricao + ","
                + "seg_entrada1=" + seg_entrada1 + ","
                + "seg_saida1=" + seg_saida1 + ","
                + "seg_entrada2=" + seg_entrada2 + ","
                + "seg_saida2=" + seg_saida2 + ","
                + "seg_entrada3=" + seg_entrada3 + ","
                + "seg_saida3=" + seg_saida3 + ","
                + "seg_carga_horaria=" + seg_carga_horaria + ","
                + "ter_entrada1=" + ter_entrada1 + ","
                + "ter_saida1=" + ter_saida1 + ","
                + "ter_entrada2=" + ter_entrada2 + ","
                + "ter_saida2=" + ter_saida2 + ","
                + "ter_entrada3=" + ter_entrada3 + ","
                + "ter_saida3=" + ter_saida3 + ","
                + "ter_carga_horaria=" + ter_carga_horaria + ","
                + "gua_entrada1=" + gua_entrada1 + ","
                + "gua_saida1=" + gua_saida1 + ","
                + "gua_entrada2=" + gua_entrada2 + ","
                + "gua_saida2=" + gua_saida2 + ","
                + "gua_entrada3=" + gua_entrada3 + ","
                + "gua_saida3=" + gua_saida3 + ","
                + "gua_carga_horaria=" + gua_carga_horaria + ","
                + "gui_entrada1=" + gui_entrada1 + ","
                + "gui_saida1=" + gui_saida1 + ","
                + "gui_entrada2=" + gui_entrada2 + ","
                + "gui_saida2=" + gui_saida2 + ","
                + "gui_entrada3=" + gui_entrada3 + ","
                + "gui_saida3=" + gui_saida3 + ","
                + "gui_carga_horaria=" + gui_carga_horaria + ","
                + "sex_entrada1=" + sex_entrada1 + ","
                + "sex_saida1=" + sex_saida1 + ","
                + "sex_entrada2=" + sex_entrada2 + ","
                + "sex_saida2=" + sex_saida2 + ","
                + "sex_entrada3=" + sex_entrada3 + ","
                + "sex_saida3=" + sex_saida3 + ","
                + "sex_carga_horaria=" + sex_carga_horaria + ","
                + "sab_entrada1=" + sab_entrada1 + ","
                + "sab_saida1=" + sab_saida1 + ","
                + "sab_entrada2=" + sab_entrada2 + ","
                + "sab_saida2=" + sab_saida2 + ","
                + "sab_entrada3=" + sab_entrada3 + ","
                + "sab_saida3=" + sab_saida3 + ","
                + "sab_carga_horaria=" + sab_carga_horaria + ","
                + "dom_entrada1=" + dom_entrada1 + ","
                + "dom_saida1=" + dom_saida1 + ","
                + "dom_entrada2=" + dom_entrada2 + ","
                + "dom_saida2=" + dom_saida2 + ","
                + "dom_entrada3=" + dom_entrada3 + ","
                + "dom_saida3=" + dom_saida3 + ","
                + "dom_carga_horaria=" + dom_carga_horaria + '}';
    }
}
