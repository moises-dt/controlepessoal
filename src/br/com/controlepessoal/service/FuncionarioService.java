package br.com.controlepessoal.service;

import br.com.controlepessoal.dao.FuncionarioDAO;
import br.com.controlepessoal.dto.FuncionarioDTO;
import br.com.controlepessoal.exception.ApplicationException;
import java.util.List;

/**
 * @author MDiasT
 */
public class FuncionarioService {
    
    FuncionarioDAO fDAO = new FuncionarioDAO();
    
    public void incluir(FuncionarioDTO f) throws ApplicationException {
        fDAO.incluir(f);
    }
    
    public void alterar(FuncionarioDTO f) throws ApplicationException {
        fDAO.alterar(f);
    }
    
    public void excluir(Long codigo) throws ApplicationException {
        fDAO.excluir(codigo);
    }
    
    public List<FuncionarioDTO> listar() throws ApplicationException {
        return fDAO.listar();
    }
    
    public List<FuncionarioDTO> listarNome() throws ApplicationException {
        return fDAO.listarNome();
    }
    
    public List<FuncionarioDTO> buscaNome(String nome) throws ApplicationException {
        return fDAO.buscaNome(nome);
    }
}
