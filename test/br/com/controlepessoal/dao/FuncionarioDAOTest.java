/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controlepessoal.dao;

import br.com.controlepessoal.dto.FuncionarioDTO;
import br.com.controlepessoal.service.FuncionarioService;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MDiasT
 */
public class FuncionarioDAOTest {
    
    private FuncionarioService fSER = new FuncionarioService();
    private FuncionarioDTO fDTO = new FuncionarioDTO();
    private List<FuncionarioDTO> ListaFuncionarios = null;
    
    public FuncionarioDAOTest() {
    }

    @Test
    public void testIncluir() throws Exception {
    }

    @Test
    public void testAlterar() throws Exception {
    }

    @Test
    public void testExcluir() throws Exception {
    }

    @Test
    public void testListar() throws Exception {
    }

    @Test
    public void testGetConnection() throws Exception {
        ListaFuncionarios = fSER.listar();
        
        for (int i = 0; i < ListaFuncionarios.size(); i++) {
            System.out.println("Nome: " + ListaFuncionarios.get(i).getNome());
        }
        
    }
    
}
