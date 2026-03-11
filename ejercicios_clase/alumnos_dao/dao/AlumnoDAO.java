package ejercicios_clase.alumnos_dao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ejercicios_clase.alumnos_dao.database.ConexionDB;
import ejercicios_clase.alumnos_dao.model.Alumno;

public class AlumnoDAO {
    public List<Alumno> obtenerAlumnos() {
        List<Alumno> listaAlumnos = new ArrayList<>();
        String sql = "SELECT * FROM alumnos";

        try (Connection conn = ConexionDB.conectar();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setId(rs.getInt("id"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setEdad(rs.getInt("edad"));

                listaAlumnos.add(alumno);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return listaAlumnos;
    }

}