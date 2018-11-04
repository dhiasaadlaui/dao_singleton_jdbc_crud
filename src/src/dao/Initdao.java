/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Dhia
 */
public class Initdao {
    protected Statement st = null;
    protected PreparedStatement pst = null;
    protected ResultSet rs = null;
    protected Connexion cnx = Connexion.getInstance();
    protected String query = null;

}
