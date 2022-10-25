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
    private static int countAddStudents;
    private static int countAddCities;

    public static void main(String[] args) throws ClassNotFoundException, SQLException, RuntimeException {

        String choiceForPattern;
        int choice = 0;
        ResultSet resultSet = null;

        System.out.print("Enter username for a database access: ");
        Scanner scanner = new Scanner(System.in);
        setUsername(scanner.nextLine());
        System.out.print("Enter password for a database access: ");
        Scanner scanner1 = new Scanner(System.in);
        setPassword(scanner1.nextLine());
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException();
        }

        try (Connection connection = DriverManager.getConnection(URL, getUsername(), getPassword());
             Statement statement = connection.createStatement()) {

            firstInitDatabase(statement);

            do {
                choice = setChoice(choice, connection, statement);

                if (choice == 1) {
                    resultSet = viewStudentsList(resultSet, statement);
                } else if (choice == 2) {
                    resultSet = addStudent(resultSet, statement);
                } else if (choice == 3) {
                    resultSet = addCity(resultSet, statement);
                } else if (choice == 4) {
                    resultSet = deleteStudent(resultSet, statement);
                } else if (choice == 5) {
                    resultSet = deleteCity(resultSet, statement);
                } else if (choice == 6) {
                    exitMethod(connection, statement);
                    break;
                }
            } while (true);
        } catch (SQLException e) {
            throw new RuntimeException("Username or password are not valid");
        }
    }

    private static ResultSet deleteCity(ResultSet resultSet, Statement statement) throws SQLException {
        setCountAddCities(getCountAddCities() - 1);
        System.out.println("Enter a city name to be deleted: ");
        Scanner scannerDeleteCity = new Scanner(System.in);
        String nameDeleteCity = scannerDeleteCity.nextLine();
        System.out.println("Enter a number of student: ");
        int numberOfStudentForDeleteCity = new Scanner(System.in).nextInt();
        String commandDeleteCity = "delete from cities where id=" + numberOfStudentForDeleteCity;
        statement.executeUpdate(commandDeleteCity);
        if (getCountAddStudents() > getCountAddCities()) {
            resultSet = statement.executeQuery("select students.id, students.name,cities.city " +
                    "from students left join cities on students.id = cities.id");
        } else if (getCountAddStudents() == getCountAddCities()) {
            resultSet = statement.executeQuery("select students.id, students.name,cities.city " +
                    "from students join cities on students.id = cities.id");
        } else if (getCountAddStudents() < getCountAddCities()) {
            resultSet = statement.executeQuery("select students.id, students.name,cities.city " +
                    "from students right join cities on students.id = cities.id");
        }
        while (resultSet.next()) {
            System.out.println(resultSet.getString("id") + "\t" + resultSet.getString("name") +
                    "\t" + resultSet.getString("city"));
        }
        return resultSet;
    }

    private static ResultSet deleteStudent(ResultSet resultSet, Statement statement) throws SQLException {
        setCountAddStudents(getCountAddStudents() - 1);
        System.out.println("Enter name a student to be deleted: ");
        Scanner scannerDeleteStudent = new Scanner(System.in);
        String nameDeleteStudent = scannerDeleteStudent.nextLine();
        String commandDeleteStudent = "delete from students where name='" + nameDeleteStudent + "'";
        statement.executeUpdate(commandDeleteStudent);
        if (getCountAddStudents() > getCountAddCities()) {
            resultSet = statement.executeQuery("select students.id, students.name,cities.city " +
                    "from students left join cities on students.id = cities.id");
        } else if (getCountAddStudents() == getCountAddCities()) {
            resultSet = statement.executeQuery("select students.id, students.name,cities.city " +
                    "from students join cities on students.id = cities.id");
        } else if (getCountAddStudents() < getCountAddCities()) {
            resultSet = statement.executeQuery("select students.id, students.name,cities.city " +
                    "from students right join cities on students.id = cities.id");
        }
        while (resultSet.next()) {
            System.out.println(resultSet.getString("id") + "\t" + resultSet.getString("name") +
                    "\t" + resultSet.getString("city"));
        }
        return resultSet;
    }

    private static ResultSet addCity(ResultSet resultSet, Statement statement) throws SQLException {
        setCountAddCities(getCountAddCities() + 1);
        System.out.println("Enter a new city name: ");
        String nameNewCity = new Scanner(System.in).nextLine();
        System.out.println("Enter a number of student: ");
        int numberOfStudentForAddCity = new Scanner(System.in).nextInt();
        String commandAddCity = "insert into cities (id,city) values (" + numberOfStudentForAddCity + ",'" + nameNewCity + "')";
        statement.executeUpdate(commandAddCity);
        if (getCountAddStudents() > getCountAddCities()) {
            resultSet = statement.executeQuery("select students.id, students.name,cities.city " +
                    "from students left join cities on students.id = cities.id");
        } else if (getCountAddStudents() == getCountAddCities()) {
            resultSet = statement.executeQuery("select students.id, students.name,cities.city " +
                    "from students join cities on students.id = cities.id");
        } else if (getCountAddStudents() < getCountAddCities()) {
            resultSet = statement.executeQuery("select students.id, students.name,cities.city " +
                    "from cities left join students on students.id = cities.id");
        }
        while (resultSet.next()) {
            System.out.println(resultSet.getString("id") + "\t" + resultSet.getString("name") +
                    "\t" + resultSet.getString("city"));
        }
        return resultSet;
    }

    private static ResultSet addStudent(ResultSet resultSet, Statement statement) throws SQLException {
        setCountAddStudents(getCountAddStudents() + 1);
        System.out.println("Enter name a new student: ");
        String nameNewStudent = new Scanner(System.in).nextLine();
        String commandAddStudent = "insert into students (name) values ('" + nameNewStudent + "')";
        statement.executeUpdate(commandAddStudent);
        if (getCountAddStudents() > getCountAddCities()) {
            resultSet = statement.executeQuery("select students.id, students.name,cities.city " +
                    "from students left join cities on students.id = cities.id");
        } else if (getCountAddStudents() == getCountAddCities()) {
            resultSet = statement.executeQuery("select students.id, students.name,cities.city " +
                    "from students join cities on students.id = cities.id");
        } else if (getCountAddStudents() < getCountAddCities()) {
            resultSet = statement.executeQuery("select students.id, students.name,cities.city " +
                    "from students right join cities on students.id = cities.id");
        }
        while (resultSet.next()) {
            System.out.println(resultSet.getString("id") + "\t" + resultSet.getString("name") +
                    "\t" + resultSet.getString("city"));
        }
        return resultSet;
    }

    private static ResultSet viewStudentsList(ResultSet resultSet, Statement statement) throws SQLException {
        if (getCountAddStudents() > getCountAddCities()) {
            resultSet = statement.executeQuery("select students.id,students.name,cities.city " +
                    "from students left join cities on students.id = cities.id");
        } else if (getCountAddStudents() == getCountAddCities()) {
            resultSet = statement.executeQuery("select students.id,students.name,cities.city " +
                    "from students join cities on students.id = cities.id");
        } else if (getCountAddStudents() < getCountAddCities()) {
            resultSet = statement.executeQuery("select students.id,students.name,cities.city " +
                    "from students right join cities on students.id = cities.id");
        }
        while (resultSet.next()) {
            System.out.println(resultSet.getString("id") + "\t" + resultSet.getString("name") +
                    "\t" + resultSet.getString("city"));
        }
        return resultSet;
    }

    private static int setChoice(int choice, Connection connection, Statement statement) throws SQLException {
        String choiceForPattern;
        System.out.println("Enter what you need now: \n1. View students list\n2. Add student\n3. Add city\n4. Delete student\n5. Delete city\n6. Exit");
        Scanner scanner2 = new Scanner(System.in);
        choiceForPattern = scanner2.nextLine();


        Pattern patternForChoice = Pattern.compile("^\\d+$");
        Matcher matcherForChoice = patternForChoice.matcher(choiceForPattern);

        if (matcherForChoice.matches()) {
            choice = parseInt(choiceForPattern);
            if (choice < 1 && choice > 6) {
                System.out.println("invalid input");
                exitMethod(connection, statement);
            }
        } else {
            System.out.println("invalid input");
            exitMethod(connection, statement);
        }
        return choice;
    }

    private static void firstInitDatabase(Statement statement) throws SQLException {
        statement.executeUpdate("create database if not exists students_db");
        statement.executeUpdate("use students_db");
        statement.executeUpdate("drop table students");
        statement.executeUpdate("drop table cities");
        statement.executeUpdate("create table if not exists students (id integer primary key auto_increment not null, name varchar(30) not null)");
        statement.executeUpdate("create table if not exists cities (id integer primary key not null, city varchar(30) not null)");
        statement.executeUpdate("insert into students (name) values ('Vasily'), ('Dmitry'), ('Sergey'), ('Ivan'), ('Igor'), ('Gennady'), ('Anton')");
        statement.executeUpdate("insert into cities (id, city) values (1,'Brest'), (2,'Grodno'), (3,'Brest'), (4,'Minsk'), (5,'Smolevichi'), (6,'Minsk'), (7,'Vitebsk')");
    }

    private static void exitMethod(Connection connection, Statement statement) throws SQLException {
        statement.executeUpdate("drop table students");
        statement.executeUpdate("drop table cities");
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

    public static int getCountAddStudents() {
        return countAddStudents;
    }

    public static void setCountAddStudents(int countAddStudents) {
        JDBCStudents.countAddStudents = countAddStudents;
    }

    public static int getCountAddCities() {
        return countAddCities;
    }

    public static void setCountAddCities(int countAddCities) {
        JDBCStudents.countAddCities = countAddCities;
    }
}