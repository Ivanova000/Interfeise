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


public class FXMLTovarController implements Initializable{

    @FXML
    private Button ButtonNext;
    @FXML
    private Label label;
    @FXML
    private Button ButtonPrev;
    @FXML
    private TextField Naz;
    @FXML
    private TextField Cena;
    @FXML
    private TextField InN;
    @FXML
    private Button ButtonExit;
    @FXML
    private TextField id;
    @FXML
    private Button ButtonMenu;

  
   
    @FXML
    private void handleButtonAction(ActionEvent event) {
       if (event.getSource()==ButtonNext){
          try {
            if (rs.next()) {
               id.setText(rs.getString("id"));
                Naz.setText(rs.getString("Naz"));
               Cena.setText(rs.getString("Cena"));
                InN.setText(rs.getString("InN"));
                 ButtonPrev.setDisable(false);
            }
            else
                ButtonNext.setDisable(true);
               
            
        } catch (SQLException ex) {
            Logger.getLogger(FXMLTovarController.class.getName()).log(Level.SEVERE, null, ex);
        }}
       else{
       try {
            if (rs.previous()) {
              id.setText(rs.getString("id"));
                Naz.setText(rs.getString("Naz"));
               Cena.setText(rs.getString("Cena"));
                InN.setText(rs.getString("InN"));
                ButtonNext.setDisable(false);
            }
            else
                ButtonPrev.setDisable(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(FXMLTovarController.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            if (rs.next()) {
              id.setText(rs.getString("id"));
                Naz.setText(rs.getString("Naz"));
               Cena.setText(rs.getString("Cena"));
                InN.setText(rs.getString("InN"));
                 ButtonPrev.setDisable(true);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FXMLTovarController.class.getName()).log(Level.SEVERE, null, ex);
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


