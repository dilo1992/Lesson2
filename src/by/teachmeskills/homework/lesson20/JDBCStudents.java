package by.teachmeskills.homework.lesson20;

import java.sql.*;
import java.util.Scanner;

public class JDBCStudents {
    public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/students_db";
    private static String username;
    private static String password;
    private static int countAddStudents;
    private static int countAddCities;

    public static void main(String[] args) throws ClassNotFoundException, RuntimeException {

        int choice;
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
            new RuntimeException("Username or password are not valid");
        }

        try (Connection connection = DriverManager.getConnection(URL, getUsername(), getPassword());
             Statement statement = connection.createStatement()) {

            statement.executeUpdate("create table if not exists students (id integer primary key auto_increment, name varchar(30) not null)");
            statement.executeUpdate("create table if not exists cities (id integer primary key auto_increment, city varchar(30) not null)");
            statement.executeUpdate("insert into students (name) values ('Vasily'), ('Dmitry'), ('Sergey'), ('Ivan'), ('Igor'), ('Gennady'), ('Anton')");
            statement.executeUpdate("insert into cities (city) values ('Brest'), ('Grodno'), ('Brest'), ('Minsk'), ('Smolevichi'), ('Minsk'), ('Vitebsk')");

            do {
                System.out.println("Enter what you need: \n1. View students list\n2. Add student\n3. Add city\n4. Delete student\n5. Delete city\n6. Exit");
                Scanner scanner2 = new Scanner(System.in);
                choice = scanner2.nextInt();

                if (choice < 1 && choice > 6) {
                    System.out.println("invalid input");
                    break;
                }
                if (choice == 1) {
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
                        System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name") +
                                " " + resultSet.getString("city"));
                    }
                } else if (choice == 2) {
                    setCountAddStudents(getCountAddStudents() + 1);
                    System.out.println("Enter name a new student: ");
                    Scanner scannerNewStudent = new Scanner(System.in);
                    String nameNewStudent = scannerNewStudent.nextLine();
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
                        System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name") +
                                " " + resultSet.getString("city"));
                    }
                } else if (choice == 3) {
                    setCountAddCities(getCountAddCities() + 1);
                    System.out.println("Enter name a new city: ");
                    Scanner scannerNewCity = new Scanner(System.in);
                    String nameNewCity = scannerNewCity.nextLine();
                    String commandAddCity = "insert into cities (city) values ('" + nameNewCity + "')";
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
                        System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name") +
                                " " + resultSet.getString("city"));
                    }
                } else if (choice == 4) {
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
                        System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name") +
                                " " + resultSet.getString("city"));
                    }
                } else if (choice == 5) {
                    setCountAddCities(getCountAddCities() - 1);
                    System.out.println("Enter name a city to be deleted: ");
                    Scanner scannerDeleteCity = new Scanner(System.in);
                    String nameDeleteCity = scannerDeleteCity.nextLine();
                    String commandDeleteCity = "delete from cities where name='" + nameDeleteCity + "'";
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
                        System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name") +
                                " " + resultSet.getString("city"));
                    }
                } else if (choice == 6) {
                    statement.executeUpdate("drop table students");
                    statement.executeUpdate("drop table cities");
                    connection.close();
                    break;
                }
            } while (true);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

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
