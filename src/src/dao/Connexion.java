/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Ahlem
 */

  public class Connexion {
	private String url = "jdbc:mysql://localhost:3306/test";
	private String username = "root";
	private String password = "";
	private static Connexion instance = null;
	private Connection cn;

	public static Connexion getInstance() {
		if (instance == null) {
                    synchronized(Connexion.class){
                    if (instance == null) 
                        instance = new Connexion();
                    }
                    
                }
			
		
		return instance;
	}
        private Connexion() {
		
	}
	public Connection connect() {
            try {
			Class.forName("com.mysql.jdbc.Driver");
                        
			cn = DriverManager.getConnection(url, username, password);
                   //     System.out.println("Connected");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
            return cn;
	}
	
	public void disconnect() {
		try {
			if (cn != null)
				cn.close();
		} catch (Exception e) {
		}
	}
}
