/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.views.LoginViews;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 *
 * @author Dhia
 */
public class LoginForm extends VBox{
    
    Label usernameLabel = new Label("Username");
    TextField txtusername = new TextField();
    
    Label passwordLabel = new Label("Password");
    PasswordField txtpassword = new PasswordField();
    
    
    Button btnLogin = new Button("Login");
    public LoginForm(){
       
        this.getChildren().addAll(usernameLabel,txtusername,passwordLabel,txtpassword,btnLogin);
        
    }
    
}
