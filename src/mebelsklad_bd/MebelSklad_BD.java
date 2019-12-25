/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mebelsklad_bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author ivano
 */
public class MebelSklad_BD extends Application {
    private static final  String url = "jdbc:mysql://localhost:3306/MebelSklad?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false";
    private static  String user = "root";
    private static final String password = "";
      // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    static ResultSet rs;
   
  
    static void iniTovar(){
    

        String query = "select * from Tovar";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            rs = stmt.executeQuery(query);

           

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
           // try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            //try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            //try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }
        
    }


    
    @Override
    public void start(Stage stage) throws Exception {
        iniTovar();
        iniSklad();
        iniPostavka();
        iniPostavschik();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLMenu.fxml"));
        Scene scene = new Scene(root);
                stage.setScene(scene);
        stage.show();
    }
    @Override
    public void stop(){
        //close connection ,stmt and resultset here
         try { con.close(); } catch(SQLException se) { /*can't do anything */ }
         try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
         try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void iniSklad() {
        String query = "select * from Sklad";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            rs = stmt.executeQuery(query);

           

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
           // try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            //try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            //try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }
        
    }
    

    private void iniPostavka() {
         String query = "select * from Postavka";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            rs = stmt.executeQuery(query);

           

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
           // try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            //try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            //try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }
        
    }
    

    private void iniPostavschik() {
          String query = "select * from Postavschik";

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            rs = stmt.executeQuery(query);

           

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            //close connection ,stmt and resultset here
           // try { con.close(); } catch(SQLException se) { /*can't do anything */ }
            //try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
            //try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
        }}

}