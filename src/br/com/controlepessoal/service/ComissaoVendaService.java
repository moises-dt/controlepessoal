package br.com.controlepessoal.service;

import br.com.controlepessoal.dao.ComissaoVendaDAO;
import br.com.controlepessoal.dto.ComissaoVendaDTO;
import br.com.controlepessoal.exception.ApplicationException;
import java.sql.Date;
import java.util.List;

/**
 * @author MDiasT
 */
public class ComissaoVendaService {
    
    ComissaoVendaDAO cvDAO = new ComissaoVendaDAO();
    
    public void incluir(ComissaoVendaDTO cv) throws ApplicationException {
            cvDAO.incluir(cv);
    }
    
    public void alterar(ComissaoVendaDTO cv) throws ApplicationException {
        cvDAO.alterar(cv);
    }
    
    public void excluir(Long codigo) throws ApplicationException {
        cvDAO.excluir(codigo);
    }
    
    public List<ComissaoVendaDTO> listar() throws ApplicationException {
        return cvDAO.listar();
    }
    
    public List<ComissaoVendaDTO> listarTabela() throws ApplicationException {
        return cvDAO.listarTabela();
    }
    
    public List<ComissaoVendaDTO> listarData(Date data) throws ApplicationException {
        return cvDAO.listarData(data);
    }
}
