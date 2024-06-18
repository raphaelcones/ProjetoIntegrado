package projetointegrador1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/danilanches"; // Replace with your database details
    private static final String USERNAME = "root"; // Defina seu nome de usuário aqui
    private static final String PASSWORD = "123456"; // Defina sua senha aqui

    public static Connection getConnection() throws SQLException {
        try {
            // Load the JDBC driver (optional for newer MySQL versions)
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Error loading JDBC driver: " + e.getMessage());
        }

        try {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Error connecting to database: " + e.getMessage());
            throw e;
        }
    }
}