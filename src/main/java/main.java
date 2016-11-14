import java.util.Scanner;
import java.sql.*;

public class main {
    public static void main(String[] args){


        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:src/main/resources/warehouse.db");
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "CREATE TABLE COMPANY " +
                    "(ID INT PRIMARY KEY     NOT NULL," +
                    " NAME           TEXT    NOT NULL, " +
                    " AGE            INT     NOT NULL, " +
                    " ADDRESS        CHAR(50), " +
                    " SALARY         REAL)";
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Table created successfully");

    //Authentication login = new Authentication("vaun-pierre", "010password");
    Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter your name");
        String userName = scanner.next();
        System.out.println("\nEnter a password");
        String password = scanner.next();
        System.out.printf("Your username and password: %s,%s", userName, password);
    }
}
