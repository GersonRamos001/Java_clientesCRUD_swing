/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clientescrud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class ConexionMYSQL {
    String usuario = "root";
    String clave = "root";
    String url = "jdbc:mysql:/localhost:3306/clientes";
    
    
    Connection con;
    Statement stmt;
    ResultSet rs;
  
       

}
