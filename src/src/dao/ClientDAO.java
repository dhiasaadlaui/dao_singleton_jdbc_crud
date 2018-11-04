/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.dao;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import src.entities.Client;

/**
 *
 * @author Dhia
 */
public class ClientDAO extends Initdao implements InterfaceDAO<Client> {

    @Override
    public List<Client> findAll() {

        List<Client> allClients = new ArrayList<>();
        Client c;
        query = "SELECT * FROM client";
        try {
            st = cnx.connect().createStatement();
            rs = st.executeQuery(query);

            int count = 0;

            while (rs.next()) {
                c = new Client();
                c.setCin(rs.getInt("cin"));
                c.setPrenom(rs.getString("prenom"));
                c.setNom(rs.getString("nom"));
                c.setTelephone(rs.getString("telephone"));
                c.setAdresse(rs.getString("adresse"));
                allClients.add(c);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return allClients;
    }

    @Override
    public int insert(Client e) {
        int rowsInserted = 0;
        try {
            query = "INSERT INTO client (cin, prenom, nom, telephone, adresse) VALUES (?, ?, ?, ?, ?)";

            pst = cnx.connect().prepareStatement(query);
            pst.setInt(1, e.getCin());
            pst.setString(2, e.getPrenom());
            pst.setString(3, e.getNom());
            pst.setString(4, e.getTelephone());
            pst.setString(5, e.getAdresse());
            rowsInserted = pst.executeUpdate();
//            if (rowsInserted > 0) {
//                System.out.println("Client ajouté avec succes!");
//            } else {
//                System.out.println("Erreur d'ajout");
//            }
        } catch (SQLException ex) {
            //  ex.printStackTrace();
            System.out.println("Erreur d'ajout : verfifier les attributs du client");
        }
        return rowsInserted;

    }

    @Override
    public int delete(Client e) {
         int rowsDeleted = 0;
        try {
            query = "DELETE FROM client WHERE id=?";
            pst = cnx.connect().prepareStatement(query);
            pst.setInt(1, e.getId());
            rowsDeleted = pst.executeUpdate();
//            if (rowsDeleted > 0) {
//                System.out.println("A user was deleted successfully!");
//            }
        } catch (SQLException ex) {
           ex.printStackTrace();
           System.out.println("Erreur de suppr");
           
        }
        return rowsDeleted;
    }

    @Override
    public int update(Client e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Client findById(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
