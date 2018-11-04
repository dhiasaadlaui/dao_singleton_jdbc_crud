/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.dao;

import java.util.List;

/**
 *
 * @author Dhia
 */
public interface InterfaceDAO<T> {
    
    public List<T> findAll () ;
    public int insert(T e);
    public int delete(T e);
    public int update(T e);
    public T findById(int numero);
   

}
