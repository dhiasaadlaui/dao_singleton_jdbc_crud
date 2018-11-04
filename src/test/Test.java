/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.List;
import src.dao.ClientDAO;
import src.entities.Client;

/**
 *
 * @author Dhia
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ClientDAO clientdao= new ClientDAO();
 
        
        Client cl = new Client(111, "dhia", "Saadlaui", "+216 55 884 629", "Mourouj");
//        Client c2 = new Client(222, "khalil", "Saadlaui", "+216 55 884 629", "Mourouj");
//        Client c3 = new Client(333, "amal", "Saadlaui", "+216 55 884 629", "Mourouj");
        clientdao.insert(cl);
//        clientdao.insert(c2);
//        clientdao.insert(c3);
      
    List <Client> ls = clientdao.findAll();
    
        for (Client l : ls) {
            System.out.println(l);
            
        }
    }
    
}
