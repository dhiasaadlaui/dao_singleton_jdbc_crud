/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.views.LoginViews;

import javafx.scene.layout.HBox;

/**
 *
 * @author Dhia
 */
public class LoginMainView extends HBox{
    public static LoginForm loginform= new LoginForm();
    public LoginMainView(){
        this.getChildren().add(loginform);
    }
}
