package UmumMethod;

import java.sql.*;
import javax.swing.*;

public class koneksiDatabase {
    public Statement st; 
    public void Cekkoneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi =
            DriverManager.getConnection("jdbc:mysql://localhost/kredit","root","");
            st = koneksi.createStatement();
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal!","Cek Koneksi",JOptionPane.ERROR_MESSAGE);
            }
    }
    public void teskoneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi =
            DriverManager.getConnection("jdbc:mysql://localhost/kredit","root","");
            st = koneksi.createStatement();
            JOptionPane.showMessageDialog(null,"Koneksi Berhasil!","Tersambung Database",JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Koneksi Gagal!","Cek Koneksi",JOptionPane.ERROR_MESSAGE);
            }
    }
    
   
    
}
