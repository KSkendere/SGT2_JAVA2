package lesson23;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Lesson23Main {
    public static void main(String[] args) {

        try {

            DBConnection db = new DBConnection();
            Statement statement = db.connection.createStatement();
// Create query
            String query = "SELECT * from spaceships";

            ResultSet rs = statement.executeQuery(query);

            while (rs.next()){
                System.out.println(rs.getString("name"));
            }
//            INSERT EXAMPLE
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name of spaceship");
            String spacespiName = scanner.nextLine();

            query = "INSERT INTO spaceship (name, type, status) VALUES ('" +spacespiName+ "'+ 'regular' )";
              statement.execute(query);
              //Instead of regular Statement you s
String preparedQuery = "INSERT INTO spaceship (name, type, status) VALUES (?,type,status)";
            PreparedStatement preparedStatement = db.connection.prepareStatement(preparedQuery);
preparedStatement.setString(1,spacespiName);
preparedStatement.setInt(2,1);
        } catch (SQLException e) {
            System.out.println("There was SQL exception" + e);
        }
    }
}
