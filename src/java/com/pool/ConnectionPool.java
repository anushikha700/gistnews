/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pool;
import java.sql.*;
import java.util.*;

/**
 *
 * @author anushikha
 */
public class ConnectionPool {
    static final int MAX_CONNECTIIONS=20;
    static Vector connections= null;
    static ConnectionPool instance= null;
    
    public synchronized void removeAllCOnnections(){
        try{
            if(connections==null){
                return;
            }
            int sz=connections.size();
            for(int i=0;i<sz;i++)
            {
                Connection c= (Connection) connections.elementAt(i);
                c.close();
            }
            connections.removeAllElements();
            connections=null;
        }
        catch(SQLException sqlE)
        {
            System.out.println(sqlE);
        }
    }
    
    public static synchronized ConnectionPool getInstance(){
        if (instance == null){
            instance = new ConnectionPool();
        }
        return instance;
    }
    
    public synchronized void initialize(){
        if(connections==null){
            try{
                String userName ="root";
                String password= "root";
                
                String url= "jdbc:mysql://localhost:3306/gisttraining";
                Class.forName("com.mysql.jdbc.Driver");
                
                connections= new Vector();
                int count=0;
                while(count < MAX_CONNECTIIONS){
                    Connection c= DriverManager.getConnection(url,userName, password);
                    connections.addElement(c);
                    count++;
                }
            }
            catch(Exception e)
                {
                    System.err.println(e.getMessage());
                }
            }
        }
    
    
    public  synchronized Connection getConnection(){
        Connection c= null;
        if(connections==null){
            return null;
        }
        if(connections.size()>0)
        {
            c=(Connection) connections.elementAt(0);
            connections.removeElementAt(0);
        }
        return c;
    }
    
    public synchronized void putConnection(Connection c){
        connections.addElement(c);
        notifyAll();
    }
}
