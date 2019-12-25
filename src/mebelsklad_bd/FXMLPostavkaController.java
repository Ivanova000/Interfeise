/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mebelsklad_bd;
import java.io.IOException;
import static mebelsklad_bd.MebelSklad_BD.rs;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLPostavkaController {

    @FXML
    private Button ButtonNext;
    @FXML
    private Label label;
    @FXML
    private Button ButtonPrev;
    @FXML
    private TextField InN;
    @FXML
    private TextField ID;
    @FXML
    private TextField Data;
    @FXML
    private TextField Kolich;
    @FXML
    private Button ButtonExit;
    @FXML
    private Button ButtonMenu;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       if (event.getSource()==ButtonNext){
          try {
            if (rs.next()) {
                ID.setText(rs.getString("ID"));
                InN.setText(rs.getString("InN"));
                Data.setText(rs.getString("Data"));
                Kolich.setText(rs.getString("Kolich"));
                 ButtonPrev.setDisable(false);
            }
            else
                ButtonNext.setDisable(true);
               
            
        } catch (SQLException ex) {
            Logger.getLogger(FXMLPostavkaController.class.getName()).log(Level.SEVERE, null, ex);
        }}
       else{
       try {
            if (rs.previous()) {
             ID.setText(rs.getString("ID"));
                InN.setText(rs.getString("InN"));
                Data.setText(rs.getString("Data"));
                Kolich.setText(rs.getString("Kolich"));
                ButtonNext.setDisable(false);
            }
            else
                ButtonPrev.setDisable(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(FXMLPostavkaController.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    }
    
    public void initialize(URL url, ResourceBundle rb) {
        try {
            if (rs.next()) {
              ID.setText(rs.getString("ID"));
                InN.setText(rs.getString("InN"));
                Data.setText(rs.getString("Data"));
                Kolich.setText(rs.getString("Kolich"));
                 ButtonPrev.setDisable(true);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FXMLPostavkaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
        @FXML
   public void handleButtonExitAction(ActionEvent event) {
 Stage stage = (Stage) ButtonExit.getScene().getWindow();
 stage.close();
}
    @FXML
    public void ButtonMenu(ActionEvent event) throws IOException {
    Stage stage;
FXMLLoader loader = new FXMLLoader();
stage=(Stage) ((Button)(event.getSource())).getScene().getWindow();
URL xmlUrl = getClass().getResource("FXMLMenu.fxml");
loader.setLocation(xmlUrl);
Parent root = loader.load();
stage.setScene(new Scene(root));
stage.show();

}
}
