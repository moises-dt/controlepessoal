package br.com.controlepessoal.dao;

import br.com.controlepessoal.connection.DataBaseConnection;
import br.com.controlepessoal.connection.DataBaseConnectionFactory;
import br.com.controlepessoal.dto.ComissaoVendaDTO;
import br.com.controlepessoal.exception.ApplicationException;
import br.com.controlepessoal.util.Conversor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author MDiasT
 */
public class ComissaoVendaDAO extends DataBaseConnection {
    
    private static final String SQL_INSERT = " INSERT INTO comissao_venda(data, valor_venda, porcentagem_venda,"
            + "valor_comissao, id_funcionario, taxa_cartao)VALUES (?, ?, ?, ?, ?, ?) ";
    private static final String SQL_UPDATE = " UPDATE comissao_venda SET data=?, valor_venda=?, porcentagem_venda=?,"
            + "valor_comissao=?, id_funcionario=?, taxa_cartao=? WHERE id_comissao_venda = ? ";
    private static final String SQL_DELETE = " DELETE FROM comissao_venda WHERE id_comissao_venda=? ";
    private static final String SQL_SELECT_ALL = " SELECT * FROM comissao_venda ";
    private static final String SQL_SELECT_DATA = " SELECT * FROM comissao_venda WHERE data=? ";
    private static final String SQL_SELECT_TABELA = " SELECT cv.id_comissao_venda, cv.data, cv.valor_venda, "
            + " cv.porcentagem_venda, cv.valor_comissao, f.nome, cv.taxa_cartao FROM comissao_venda AS cv "
            + " JOIN funcionario AS f ON cv.id_funcionario = f.id_funcionario ORDER BY cv.id_comissao_venda "; 
    
    
    private Conversor converte = new Conversor();
    
    public void incluir(ComissaoVendaDTO cv) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_INSERT);
            if (cv.getData() != null) {
                ps.setDate(1, new java.sql.Date(cv.getData().getTime()));
            } else {
                ps.setDate(1, null);
            }
            ps.setDouble(2, cv.getValor_venda());
            ps.setDouble(3, cv.getPorcentagem_venda());
            ps.setDouble(4, cv.getValor_comissao());
            ps.setLong(5, cv.getId_funcionario());
            ps.setDouble(6, cv.getTaxa_cartao());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new ApplicationException("Incluir Comissão de Venda a" + ex.getMessage());
        } finally {
            close(con, ps, null);
        }
    }
    
    public void alterar(ComissaoVendaDTO cv) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_UPDATE);
            if (cv.getData() != null) {
                ps.setDate(1, new java.sql.Date(cv.getData().getTime()));
            } else {
                ps.setDate(1, null);
            }
            ps.setDouble(2, cv.getValor_venda());
            ps.setDouble(3, cv.getPorcentagem_venda());
            ps.setDouble(4, cv.getValor_comissao());
            ps.setLong(5, cv.getId_funcionario());
            ps.setDouble(6, cv.getTaxa_cartao());
            ps.setLong(7, cv.getId_comissao_venda());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new ApplicationException("Alterar Comissão de Venda " + ex.getMessage());
        } finally {
            close(con, ps, null);
        }
    }
    
    public void excluir(Long codigo) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_DELETE);
            ps.setLong(1, codigo);
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new ApplicationException("Excluir Comissão de Venda " + ex.getMessage());
        } finally {
            close(con, ps, null);
        }
    }
    
    public List<ComissaoVendaDTO> listar() throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<ComissaoVendaDTO> lista = new ArrayList<ComissaoVendaDTO>();
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                ComissaoVendaDTO cv = new ComissaoVendaDTO();
                cv.setId_comissao_venda(rs.getLong("id_comissao_venda"));
                cv.setData(rs.getDate("data"));
                cv.setValor_venda(rs.getDouble("valor_venda"));
                cv.setPorcentagem_venda(rs.getDouble("porcentagem_venda"));
                cv.setValor_comissao(rs.getDouble("valor_comissao"));
                cv.setId_funcionario(rs.getLong("id_funcionario"));
                cv.setTaxa_cartao(rs.getDouble("taxa_cartao"));
                lista.add(cv);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Listar Comissão de Venda " + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }
    
    public List<ComissaoVendaDTO> listarData(Date data) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<ComissaoVendaDTO> lista = new ArrayList<ComissaoVendaDTO>();
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_DATA);
            ps.setDate(1, converte.utilSql(data));
            rs = ps.executeQuery();
            while (rs.next()) {
                ComissaoVendaDTO cv = new ComissaoVendaDTO();
                cv.setId_comissao_venda(rs.getLong("id_comissao_venda"));
                cv.setData(rs.getDate("data"));
                cv.setValor_venda(rs.getDouble("valor_venda"));
                cv.setPorcentagem_venda(rs.getDouble("porcentagem_venda"));
                cv.setValor_comissao(rs.getDouble("valor_comissao"));
                cv.setId_funcionario(rs.getLong("id_funcionario"));
                cv.setTaxa_cartao(rs.getDouble("taxa_cartao"));
                lista.add(cv);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Listar Comissão de Venda " + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }
    
    public List<ComissaoVendaDTO> listarTabela() throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<ComissaoVendaDTO> lista = new ArrayList<ComissaoVendaDTO>();
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_TABELA);
            rs = ps.executeQuery();
            while (rs.next()) {
                ComissaoVendaDTO cv = new ComissaoVendaDTO();
                cv.setId_comissao_venda(rs.getLong("id_comissao_venda"));
                cv.setData(rs.getDate("data"));
                cv.setValor_venda(rs.getDouble("valor_venda"));
                cv.setPorcentagem_venda(rs.getDouble("porcentagem_venda"));
                cv.setValor_comissao(rs.getDouble("valor_comissao"));
                cv.setNome(rs.getString("nome"));
                cv.setTaxa_cartao(rs.getDouble("taxa_cartao"));
                lista.add(cv);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Listar Comissão de Venda " + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }
    
    @Override
    public Connection getConnection() throws SQLException {
        return DataBaseConnectionFactory.getConnection();
    }
}
