package by.teachmeskills.classwork.lesson20;

import java.sql.*;

public class JDBCMain {
    public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/test_db";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "PassSQL1286";
    public static final String SELECT_ALL_USERS_QUERY = "select * from users";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(JDBC_DRIVER); //�������� �������� ��� jdbc

        //������������ � ����� ���� ������ (connection) � �������� �������� � ��, ������� � ���, ��� �������� ����� �����-�� ������� (statement)
        try (Connection connection = DriverManager
                .getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_USERS_QUERY);  //��������� �������� ResultSet

            //��������� ������, ���������� � resultSet
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name") + " " + resultSet.getInt("age"));
            }

            System.out.println("----------------------");

            statement.executeUpdate("update users set age=30 where id<5"); //��������� ������� � ������� �����������
            // ������� (�������: ��� ������ � id ������ 5 ������������� age=30)
            resultSet = statement.executeQuery(SELECT_ALL_USERS_QUERY);  //��������� ��������� ResultSet
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name") + " " + resultSet.getInt("age"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
