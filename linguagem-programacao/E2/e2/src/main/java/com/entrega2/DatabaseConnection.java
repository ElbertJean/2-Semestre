package com.entrega2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/carrosdb";
    private static final String USER = "postgres";
    private static final String PASSWORD = "admin";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public static void insertCarro(Carro carro) {
        String SQL = "INSERT INTO carro(fabricante, placa, modelo, ano) VALUES(?,?,?,?)";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, carro.fabricante);
            pstmt.setString(2, carro.placa);
            pstmt.setString(3, carro.modelo);
            pstmt.setString(4, carro.ano);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static List<Carro> getAllCarros() {
        String SQL = "SELECT * FROM carro";
        List<Carro> carros = new ArrayList<>();
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Carro carro = new Carro(
                    rs.getString("fabricante"),
                    rs.getString("placa"),
                    rs.getString("modelo"),
                    rs.getString("ano")
                );
                carros.add(carro);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return carros;
    }

    public static void deleterCarro(Carro carro) {
        String SQL = "DELETE FROM carro WHERE placa = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, carro.placa);
            pstmt.executeUpdate();
            System.out.println("deu certo");
        } catch (SQLException ex) {
            System.out.println("deu errado");
            System.out.println(ex.getMessage());
        }
    }

    // public static void updateCarro(Carro carro) {
    //     String SQL = "UPDATE carro SET fabricante = ?, modelo = ?, ano = ? WHERE placa = ?";
    //     try (Connection conn = connect();
    //          PreparedStatement pstmt = conn.prepareStatement(SQL)) {
    //         pstmt.setString(1, carro.fabricante);
    //         pstmt.setString(2, carro.modelo);
    //         pstmt.setString(3, carro.ano);
    //         pstmt.setString(4, carro.placa);
    //         pstmt.executeUpdate();
    //     } catch (SQLException ex) {
    //         System.out.println(ex.getMessage());
    //     }
    // }
}
