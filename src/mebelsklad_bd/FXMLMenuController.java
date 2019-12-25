/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mebelsklad_bd;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author ivano
 */
public class FXMLMenuController {

    @FXML
    private AnchorPane pane;
    @FXML
    private Label MebelSklad;
    @FXML
    private Label Menu;
    @FXML
    private Button ButtonPostavschik;
    @FXML
    private Button ButtonPostavka;
    @FXML
    private Button ButtonSklad;
    @FXML
    private Button ButtonTovar;
    @FXML
    private Button ButtonExit;
    
    private static final  String url = "jdbc:mysql://localhost:3306/person?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false";
    private static  String user = "root";
    private static final String password = "";
     private static Connection con;
    private static Statement stmt;
    static ResultSet rs;
    
    
    
//    static void iniBD(){
//    
//
//        String query = "select * from Tovar";
//
//        try {
//            // opening database connection to MySQL server
//            con = DriverManager.getConnection(url, user, password);
//
//            // getting Statement object to execute query
//            stmt = con.createStatement();
//
//            // executing SELECT query
//            rs = stmt.executeQuery(query);
//
//           
//
//        } catch (SQLException sqlEx) {
//            sqlEx.printStackTrace();
//        } 
//    }
    
    
    
     @FXML
    private void handleButtonTovarAction(ActionEvent event) throws IOException {
//    iniBD();
        Stage stage;
FXMLLoader loader = new FXMLLoader();
stage=(Stage) ((Button)(event.getSource())).getScene().getWindow();
URL fxmlUrl = getClass().getResource("FXMLTovar.fxml");
loader.setLocation(fxmlUrl);
Parent root = loader.load();



stage.setScene(new Scene(root));
stage.show();


}
  
     @FXML
    private void handleButtonSkladAction(ActionEvent event) throws IOException {
//    iniBD();
        Stage stage;
FXMLLoader loader = new FXMLLoader();
stage=(Stage) ((Button)(event.getSource())).getScene().getWindow();
URL fxmlUrl = getClass().getResource("FXMLSklad.fxml");
loader.setLocation(fxmlUrl);
Parent root = loader.load();



stage.setScene(new Scene(root));
stage.show();


}
    
    
    
     @FXML
    private void handleButtonPostavschikAction(ActionEvent event) throws IOException {
//    iniBD();
        Stage stage;
FXMLLoader loader = new FXMLLoader();
stage=(Stage) ((Button)(event.getSource())).getScene().getWindow();
URL fxmlUrl = getClass().getResource("FXMLPostavschik.fxml");
loader.setLocation(fxmlUrl);
Parent root = loader.load();



stage.setScene(new Scene(root));
stage.show();


}
     @FXML
    private void handleButtonPostavkaAction(ActionEvent event) throws IOException {
//    iniBD();
        Stage stage;
FXMLLoader loader = new FXMLLoader();
stage=(Stage) ((Button)(event.getSource())).getScene().getWindow();
URL fxmlUrl = getClass().getResource("FXMLPostavka.fxml");
loader.setLocation(fxmlUrl);
Parent root = loader.load();



stage.setScene(new Scene(root));
stage.show();


}

       

@FXML
    public void ButtonExit(ActionEvent event) {
 Stage stage = (Stage) ButtonExit.getScene().getWindow();
 stage.close();
}
    
}