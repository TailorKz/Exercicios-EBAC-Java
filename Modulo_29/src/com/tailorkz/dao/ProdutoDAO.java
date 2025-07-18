package com.tailorkz.dao;

import com.tailorkz.dao.jdbc.ConnectionFactory;

import com.tailorkz.dao.Produto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements IProdutoDAO {

    @Override
    public Integer cadastrar(Produto produto) throws Exception {
        Connection conn = null;
        PreparedStatement stm = null;
        try {
            conn = ConnectionFactory.getConnection();
            String sql = "INSERT INTO TB_PRODUTO (ID, NOME, CATEGORIA) VALUES (nextval('SQ_PRODUTO'),?,?)";
            stm = conn.prepareStatement(sql);
            stm.setString(1, produto.getNome());
            stm.setString(2, produto.getCategoria());
            return stm.executeUpdate();
        } finally {
            if (stm != null && !stm.isClosed()) stm.close();
            if (conn != null && !conn.isClosed()) conn.close();
        }
    }

    @Override
    public Produto consultar(String nome) throws Exception {
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Produto produto = null;
        try {
            conn = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM TB_PRODUTO WHERE NOME = ?";
            stm = conn.prepareStatement(sql);
            stm.setString(1, nome);
            rs = stm.executeQuery();
            if (rs.next()) {
                produto = new Produto();
                produto.setId(rs.getLong("id"));
                produto.setNome(rs.getString("nome"));
                produto.setCategoria(rs.getString("categoria"));
            }
            return produto;
        } finally {
            if (rs != null && !rs.isClosed()) rs.close();
            if (stm != null && !stm.isClosed()) stm.close();
            if (conn != null && !conn.isClosed()) conn.close();
        }
    }

    @Override
    public Integer excluir(Produto produto) throws Exception {
        Connection conn = null;
        PreparedStatement stm = null;
        try {
            conn = ConnectionFactory.getConnection();
            String sql = "DELETE FROM TB_PRODUTO WHERE NOME = ?";
            stm = conn.prepareStatement(sql);
            stm.setString(1, produto.getNome());
            return stm.executeUpdate();
        } finally {
            if (stm != null && !stm.isClosed()) stm.close();
            if (conn != null && !conn.isClosed()) conn.close();
        }
    }

    @Override
    public List<Produto> buscar(String nome) throws Exception {
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Produto> produtos = new ArrayList<>();
        try {
            conn = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM TB_PRODUTO WHERE NOME ILIKE ?";
            stm = conn.prepareStatement(sql);
            stm.setString(1, "%" + nome + "%");
            rs = stm.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getLong("id"));
                produto.setNome(rs.getString("nome"));
                produto.setCategoria(rs.getString("categoria"));
                produtos.add(produto);
            }
            return produtos;
        } finally {
            if (rs != null && !rs.isClosed()) rs.close();
            if (stm != null && !stm.isClosed()) stm.close();
            if (conn != null && !conn.isClosed()) conn.close();
        }
    }

    @Override
    public List<Produto> buscarTodos() throws Exception {
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Produto> produtos = new ArrayList<>();
        try {
            conn = ConnectionFactory.getConnection();
            String sql = "SELECT * FROM TB_PRODUTO";
            stm = conn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getLong("id"));
                produto.setNome(rs.getString("nome"));
                produto.setCategoria(rs.getString("categoria"));
                produtos.add(produto);
            }
            return produtos;
        } finally {
            if (rs != null && !rs.isClosed()) rs.close();
            if (stm != null && !stm.isClosed()) stm.close();
            if (conn != null && !conn.isClosed()) conn.close();
        }
    }
}
