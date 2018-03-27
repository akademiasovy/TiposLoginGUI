package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
    public Button btnLogin;
    public Label lblError;
    public PasswordField txtPassword;
    public TextField txtLogin;




    public void clickLogin(ActionEvent actionEvent) throws Exception{
        lblError.setText("");
        String login = txtLogin.getText().trim();
        String password = txtPassword.getText().trim();
        System.out.println(login+" "+password);
        if(login.length()<1 || password.length()<2){
            lblError.setText("Incorrect login or password!");
        }else {
            Stage stage = (Stage) btnLogin.getScene().getWindow();

            Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
            Stage newStage = new Stage();
            newStage.setTitle("TIPOS admin portal");
            newStage.setScene(new Scene(root, 450, 300));
            newStage.show();
            // do what you have to do
            stage.close();
        }
    }


}
