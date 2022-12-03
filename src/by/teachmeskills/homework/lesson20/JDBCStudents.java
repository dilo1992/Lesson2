package by.teachmeskills.homework.lesson20;

import java.sql.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class JDBCStudents {
    public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/students_db";
    private static String username;
    private static String password;

    public static void main(String[] args) throws ClassNotFoundException, SQLException, RuntimeException {

        int choice = 0;

        System.out.print("Enter username for a database access: ");
        setUsername(new Scanner(System.in).nextLine());
        System.out.print("Enter password for a database access: ");
        setPassword(new Scanner(System.in).nextLine());
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException();
        }

        try (Connection connection = DriverManager.getConnection(URL, getUsername(), getPassword());
             Statement statement = connection.createStatement()) {

            firstInitDatabase(statement);


            do {
                choice = getChoice(choice, connection);

                switch (choice) {
                    case 1 -> viewStudentsList(statement);
                    case 2 -> addStudent(statement);
                    case 3 -> addCity(statement);
                    case 4 -> deleteStudent(statement);
                    case 5 -> deleteCity(connection, statement);
                    case 6 -> exitMethod(connection);
                }
            } while (true);
        } catch (SQLException e) {
            throw new RuntimeException("Username or password are not valid");
        }
    }

    private static void firstInitDatabase(Statement statement) throws SQLException {
        statement.executeUpdate("create database if not exists students_db;");
        statement.executeUpdate("use students_db;");
        statement.executeUpdate("create table if not exists students (student_id integer primary key not null, city_id integer not null, name varchar(30) not null);");
        statement.executeUpdate("create table if not exists cities (id integer primary key auto_increment not null, city_id integer not null, city varchar(30));");
    }

    private static void viewStudentsList(Statement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery("select students.student_id,students.name,cities.city " +
                "from students left join cities on students.city_id = cities.city_id;");
        while (resultSet.next()) {
            System.out.println(resultSet.getString("student_id") + "\t" + resultSet.getString("name") +
                    "\t" + resultSet.getString("city"));
        }
    }

    private static void addStudent(Statement statement) throws SQLException {
        System.out.println("Enter new student id: ");
        int idNewStudent = new Scanner(System.in).nextInt();
        System.out.println("Enter the name of the new student: ");
        String nameNewStudent = new Scanner(System.in).nextLine();
        System.out.println("Enter city id for the new student: ");
        int cityIdNewStudent = new Scanner(System.in).nextInt();
        String commandAddStudent = "insert into students (student_id,city_id, name) values (" + idNewStudent + ","
                + cityIdNewStudent + ",'" + nameNewStudent + "');";
        statement.executeUpdate(commandAddStudent);
        viewStudentsList(statement);
    }

    private static void addCity(Statement statement) throws SQLException {
        System.out.println("Enter new city id: ");
        int idNewCity = new Scanner(System.in).nextInt();
        System.out.println("Enter the name of the new city: ");
        String nameNewCity = new Scanner(System.in).nextLine();
        String commandAddCity = "insert into cities (city_id,city) values (" + idNewCity + ",'" + nameNewCity + "');";
        statement.executeUpdate(commandAddCity);
        viewStudentsList(statement);
    }

    private static void deleteStudent(Statement statement) throws SQLException {
        System.out.println("Enter a student id to be deleted: ");
        int studentIdForDeleteStudent = new Scanner(System.in).nextInt();
        String commandDeleteStudent = "delete from students where student_id=" + studentIdForDeleteStudent + ";";
        statement.executeUpdate(commandDeleteStudent);
        viewStudentsList(statement);
    }

    private static void deleteCity(Connection connection, Statement statement) throws SQLException {
        System.out.println("Enter the city id to be deleted: ");
        String cityIdForDeleteCity = new Scanner(System.in).next();
        String firstCommandDeleteCity = "update cities set city=null where city_id=" + cityIdForDeleteCity;
        String secondCommandDeleteCity = "delete from cities where cities.city=null";
        connection.setAutoCommit(false);
        statement.executeUpdate(firstCommandDeleteCity);
        statement.executeUpdate(secondCommandDeleteCity);
        connection.commit();
        viewStudentsList(statement);
    }

    private static int getChoice(int choice, Connection connection) throws SQLException {
        System.out.println("Enter what you need now: \n1. View students list\n2. Add student\n3. Add city\n4. Delete student\n5. Delete city\n6. Exit");
        String choiceForPattern = new Scanner(System.in).nextLine();

        Pattern patternForChoice = Pattern.compile("^\\d+$");
        Matcher matcherForChoice = patternForChoice.matcher(choiceForPattern);

        if (matcherForChoice.matches()) {
            choice = parseInt(choiceForPattern);
            if (choice < 1 && choice > 6) {
                System.out.println("invalid input");
                exitMethod(connection);
            }
        } else {
            System.out.println("invalid input");
            exitMethod(connection);
        }
        return choice;
    }

    private static void exitMethod(Connection connection) throws SQLException {
        connection.close();
    }


    public static void setUsername(String username) {
        JDBCStudents.username = username;
    }

    public static void setPassword(String password) {
        JDBCStudents.password = password;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }
}