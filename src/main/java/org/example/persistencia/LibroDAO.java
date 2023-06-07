package org.example.persistencia;

import org.example.modelo.Libro;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class LibroDAO implements InterfazDAO {
    public LibroDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO libros(titulo, autor) VALUES(?,?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, ((Libro)obj).getTitulo());
        pstm.setString(1, ((Libro)obj).getAutor());
        rowCount = pstm.executeUpdate();
        return false;    }

    @Override
    public boolean update(Object obj) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        return false;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        return null;
    }

    @Override
    public Object buscarPorId(String obj) throws SQLException {
        return null;
    }
}
