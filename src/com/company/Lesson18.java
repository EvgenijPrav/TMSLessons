package com.company;

import java.sql.*;
import java.util.Scanner;

public class Lesson18 {

    private static final String CREATE = "CREATE";
    private static final String TABLE = "TABLE";

    private static final String TABLE_NAME = "products";

    private static final String COLUMN_ID = "Id";
    private static final String COLUMN_PRODUCT_NAME = "ProductName";
    private static final String COLUMN_PRICE = "Price";

    public static void main(String[] args) {
        System.out.println("***********");
//        createTable();
//        updateTable();
//        updateValuesInTheTable();
//        deleteRow();
//        getResult();
//        preparedStatement();
        preparedStatementV2();
    }

    public static Connection getConnection() throws SQLException {
//        Properties  properties = new Properties();
//        try(InputStream inputStream = Files.newInputStream(Paths.get("database.properties"))) {
//            properties.load(inputStream);
//        }
//        String url = properties.getProperty("url");
//        String user = properties.getProperty("username");

        return DriverManager.getConnection(
                "jdbc:mysql://localhost/store",
                "root",
                "pass"
        );
    }

    private static void createTable() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            String sqlCommand = CREATE + TABLE + "IF NOT EXISTS " + TABLE_NAME +" (" + COLUMN_ID + " INT PRIMARY KEY AUTO_INCREMENT, " + COLUMN_PRODUCT_NAME + " VARCHAR(20), " + COLUMN_PRICE + " INT NOT NULL DEFAULT -369871)";
            try (Connection connection = getConnection()) {
                System.out.println("Connection is successful");
                Statement statement = connection.createStatement();
                statement.executeUpdate(sqlCommand);
                System.out.println("Table has been created");
            }
        } catch (Exception e) {
            System.out.println("Cannot connect to the database");
            System.err.println(e.getMessage());
        }
    }

    private static void updateTable() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            String sqlCommand = "INSERT Products(ProductName) VALUES ('iPhone'), ('Galaxy'), ('Pixel4')";
            try (Connection connection = getConnection()) {
                System.out.println("Connection is successful");
                Statement statement = connection.createStatement();
                int rows = statement.executeUpdate(sqlCommand);
                System.out.println("Values has been inserted");
                System.out.println("Number of rows: " + rows);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static void updateValuesInTheTable() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            String sqlCommand = "UPDATE Products SET Price = Price + 500000";
            try (Connection connection = getConnection()) {
                System.out.println("Connection is successful");
                Statement statement = connection.createStatement();
                int rows = statement.executeUpdate(sqlCommand);
                System.out.println("Values has been updated");
                System.out.println("Number of rows: " + rows);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static void deleteRow() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            String sqlCommand = "DELETE FROM Products WHERE Id = 1";
            try (Connection connection = getConnection()) {
                System.out.println("Connection is successful");
                Statement statement = connection.createStatement();
                int rows = statement.executeUpdate(sqlCommand);
                System.out.println("Deletion is completed");
                System.out.println("Number of rows: " + rows);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static void getResult() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            String sqlCommand = "SELECT Id, Price FROM Products WHERE " + COLUMN_PRODUCT_NAME + " = 'Galaxy'";
            try (Connection connection = getConnection()) {
                System.out.println("Connection is successful");
                Statement statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sqlCommand);
                while (result.next()) {
                    int id = result.getInt(COLUMN_ID);
//                    String name = result.getNString(COLUMN_PRODUCT_NAME);
                    int price = result.getInt(COLUMN_PRICE);
                    System.out.println("Id: " + id + ", price: " + price);
                }
            }
        } catch (Exception e) {
            System.out.println("Connection failed");
            System.err.println(e.getMessage());
        }
    }

    private static void preparedStatement() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please type product name: ");
            String name  = scanner.nextLine();
            System.out.println("Please drop the price: ");
            int price = scanner.nextInt();

            String sqlCommand = "INSERT Products(ProductName, Price) VALUES (?, ?)";
            try (Connection connection = getConnection()) {
                System.out.println("Connection is successful");
                PreparedStatement statement = connection.prepareStatement(sqlCommand);
                statement.setString(1, name);
                statement.setInt(2, price);

                int rows = statement.executeUpdate();
                System.out.println(rows + " rows has been added");
            }
        } catch (Exception e) {
            System.out.println("Connection failed");
            System.err.println(e.getMessage());
        }
    }

    private static void preparedStatementV2() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please type product name: ");
            String name  = scanner.nextLine();
            System.out.println("Please drop the price: ");
            int price = scanner.nextInt();

            String sqlCommand = "SELECT * FROM products WHERE ProductName = ? OR Price > ?";
            try (Connection connection = getConnection()) {
                System.out.println("Connection is successful");
                PreparedStatement statement = connection.prepareStatement(sqlCommand);
                statement.setString(1, name);
                statement.setInt(2, price);

                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt(COLUMN_ID);
                    String productName = resultSet.getString(COLUMN_PRODUCT_NAME);
                    int productPrice = resultSet.getInt(COLUMN_PRICE);
                    System.out.println("Id: " + id + ", name: " + productName + ", price: " + productPrice);
                }
            }
        } catch (Exception e) {
            System.out.println("Connection failed");
            System.err.println(e.getMessage());
        }
    }

    /**
     * url = jdbc:mysql://localhost/store
     * username = root
     * password = pass
     */
}
