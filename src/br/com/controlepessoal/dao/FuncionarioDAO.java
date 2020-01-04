package br.com.controlepessoal.dao;

import br.com.controlepessoal.connection.DataBaseConnection;
import br.com.controlepessoal.connection.DataBaseConnectionFactory;
import br.com.controlepessoal.dto.FuncionarioDTO;
import br.com.controlepessoal.exception.ApplicationException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author MDiasT
 */
public class FuncionarioDAO  extends DataBaseConnection {
    
    private static final String SQL_INSERT = " INSERT INTO funcionario (nome, endereco, bairro, cidade, cep, cpf, "
            + " identidade, numero, complemento, telefone_fixo, telefone_celular, email, id_quadro) "
            + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
    private static final String SQL_UPDATE = " UPDATE funcionario SET nome=?, endereco=?, bairro=?, cidade=?, cep=?, "
            + " cpf=?, identidade=?, numero=?, complemento=?, telefone_fixo=?, telefone_celular=?, email=?, id_quadro=? "
            + " WHERE id_funcionario=? ";
    private static final String SQL_DELETE = " DELETE FROM funcionario WHERE id_funcionario=? ";
    private static final String SQL_SELECT_ALL = " SELECT * FROM funcionario ";
    private static final String SQL_SELECT_NOME = " SELECT * FROM funcionario WHERE nome=? ";
    
    public void incluir(FuncionarioDTO f) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_INSERT);
            ps.setString(1, f.getNome());
            ps.setString(2, f.getEndereco());
            ps.setString(3, f.getBairro());
            ps.setString(4, f.getCidade());
            ps.setString(5, f.getCep());
            ps.setString(6, f.getCpf());
            ps.setString(7, f.getIdentidade());
            ps.setInt(8, f.getNumero());
            ps.setString(9, f.getComplemento());
            ps.setString(10, f.getTelefone_fixo());
            ps.setString(11, f.getTelefone_celular());
            ps.setString(12, f.getEmail());
            ps.setLong(13, f.getId_quadro());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new ApplicationException("Incluir Cadastro de Funcionário " + ex.getMessage());
        } finally {
            close(con, ps, null);
        }
    }
    
    public void alterar(FuncionarioDTO f) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_UPDATE);
            ps.setString(1, f.getNome());
            ps.setString(2, f.getEndereco());
            ps.setString(3, f.getBairro());
            ps.setString(4, f.getCidade());
            ps.setString(5, f.getCep());
            ps.setString(6, f.getCpf());
            ps.setString(7, f.getIdentidade());
            ps.setInt(8, f.getNumero());
            ps.setString(9, f.getComplemento());
            ps.setString(10, f.getTelefone_fixo());
            ps.setString(11, f.getTelefone_celular());
            ps.setString(12, f.getEmail());
            ps.setLong(13, f.getId_quadro());
            ps.executeUpdate();
        } catch (SQLException ex) {
            throw new ApplicationException("Alterar Cadastro de Funcionáro " + ex.getMessage());
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
            throw new ApplicationException("Excluir Cadastro de Funcionário " + ex.getMessage());
        } finally {
            close(con, ps, null);
        }
    }
    
    public List<FuncionarioDTO> listar() throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<FuncionarioDTO> lista = new ArrayList<FuncionarioDTO>();
                
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                FuncionarioDTO f = new FuncionarioDTO();
                f.setId_funcionario(rs.getLong("id_funcionario"));
                f.setNome(rs.getString("nome"));
                f.setEndereco(rs.getString("endereco"));
                f.setBairro(rs.getString("bairro"));
                f.setCidade(rs.getString("cidade"));
                f.setCep(rs.getString("cep"));
                f.setCpf(rs.getString("cpf"));
                f.setIdentidade(rs.getString("identidade"));
                f.setNumero(rs.getInt("numero"));
                f.setComplemento(rs.getString("complemento"));
                f.setTelefone_fixo(rs.getString("telefone_fixo"));
                f.setTelefone_celular(rs.getString("telefone_celular"));
                f.setEmail(rs.getString("email"));
                f.setId_quadro(rs.getLong("id_quadro"));
                lista.add(f);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Listar de Funcionários Cadastrados" + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }
    
    public List<FuncionarioDTO> listarNome() throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<FuncionarioDTO> lista = new ArrayList<FuncionarioDTO>();
                
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_ALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                FuncionarioDTO f = new FuncionarioDTO();
                f.setId_funcionario(rs.getLong("id_funcionario"));
                f.setNome(rs.getString("nome"));
                lista.add(f);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Listar de Funcionários Cadastrados Nome para Preencher Combo Box" + ex.getMessage());
        } finally {
            close(con, ps, rs);
        }
        return lista;
    }
    
    public List<FuncionarioDTO> buscaNome(String nome) throws ApplicationException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<FuncionarioDTO> lista = new ArrayList<FuncionarioDTO>();
                
        try {
            con = getConnection();
            ps = con.prepareStatement(SQL_SELECT_NOME);
            ps.setString(1, nome);
            rs = ps.executeQuery();
            while (rs.next()) {
                FuncionarioDTO f = new FuncionarioDTO();
                f.setId_funcionario(rs.getLong("id_funcionario"));
                f.setNome(rs.getString("nome"));
                lista.add(f);
            }
        } catch (SQLException ex) {
            throw new ApplicationException("Listar de Funcionários Cadastrados Nome para Preencher Combo Box" + ex.getMessage());
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
