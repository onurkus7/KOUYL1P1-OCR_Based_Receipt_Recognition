/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baykus;

/**
 *
 * @author K4RK1N
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fisİslemleri {

    private Connection con = null;

    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public ArrayList<FisOzellik> fisleriGetir() {

        ArrayList<FisOzellik> cikti = new ArrayList<FisOzellik>();
        
        try {
            //statement =  con.createStatement();
            
            com.mysql.jdbc.Connection myConn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/fis_other?verifyServerCertificate=false&useSSL=true", "root", "1234");
            com.mysql.jdbc.Statement statement = (com.mysql.jdbc.Statement) myConn.createStatement();
            
            String sorgu =  "Select * From fis";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int fis_no = rs.getInt("fis_no");
                String fis_isletme = rs.getString("fis_isletme");
                String fis_tarih = rs.getString("fis_tarih");
                String fis_urun  = rs.getString("fis_urunler");
                String fis_urun_fiyat = rs.getString("fis_urunler_fiyat");
                String fis_urun_kdv = rs.getString("fis_urunler_kdv");
                String fis_toplam_fiyat = rs.getString("fis_toplam_fiyat");
                String fis_toplam_kdv = rs.getString("fis_toplam_kdv");
                
                cikti.add(new FisOzellik(fis_no, fis_isletme, fis_tarih, fis_urun, fis_urun_fiyat,fis_urun_kdv,fis_toplam_fiyat,fis_toplam_kdv));
                
                
            }
            return cikti;
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Fisİslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
        

    }
    public ArrayList<FisOzellik> fis_tarih_arama(String sorgu_ek) {
        
               
        ArrayList<FisOzellik> cikti = new ArrayList<FisOzellik>();
        
        try {
            
            com.mysql.jdbc.Connection myConn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/fis_other?verifyServerCertificate=false&useSSL=true", "root", "1234");
            com.mysql.jdbc.Statement statement = (com.mysql.jdbc.Statement) myConn.createStatement();
            
        String sorgu =  "Select * From fis_other.fis where fis.fis_tarih='"+sorgu_ek+"'";
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int fis_no = rs.getInt("fis_no");
                String fis_isletme = rs.getString("fis_isletme");
                String fis_tarih = rs.getString("fis_tarih");
                String fis_urun  = rs.getString("fis_urunler");
                String fis_urun_fiyat = rs.getString("fis_urunler_fiyat");
                String fis_urun_kdv = rs.getString("fis_urunler_kdv");
                String fis_toplam_fiyat = rs.getString("fis_toplam_fiyat");
                String fis_toplam_kdv = rs.getString("fis_toplam_kdv");
                
                cikti.add(new FisOzellik(fis_no, fis_isletme, fis_tarih, fis_urun, fis_urun_fiyat,fis_urun_kdv,fis_toplam_fiyat,fis_toplam_kdv));
                
                
            }
            return cikti;
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Fisİslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        } 
        
    }
    
     public ArrayList<FisOzellik> fis_isletmead_arama(String sorgu_ek) {
        
               
        ArrayList<FisOzellik> cikti = new ArrayList<FisOzellik>();
        
        try {
            
            com.mysql.jdbc.Connection myConn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/fis_other?verifyServerCertificate=false&useSSL=true", "root", "1234");
            com.mysql.jdbc.Statement statement = (com.mysql.jdbc.Statement) myConn.createStatement();
            
        String sorgu =  "Select * From fis_other.fis where fis.fis_isletme LIKE '"+sorgu_ek+"%'";
            System.out.println(sorgu);
            
            ResultSet rs =  statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int fis_no = rs.getInt("fis_no");
                String fis_isletme = rs.getString("fis_isletme");
                String fis_tarih = rs.getString("fis_tarih");
                String fis_urun  = rs.getString("fis_urunler");
                String fis_urun_fiyat = rs.getString("fis_urunler_fiyat");
                String fis_urun_kdv = rs.getString("fis_urunler_kdv");
                String fis_toplam_fiyat = rs.getString("fis_toplam_fiyat");
                String fis_toplam_kdv = rs.getString("fis_toplam_kdv");
                
                cikti.add(new FisOzellik(fis_no, fis_isletme, fis_tarih, fis_urun, fis_urun_fiyat,fis_urun_kdv,fis_toplam_fiyat,fis_toplam_kdv));
                
                
            }
            return cikti;
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Fisİslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        } 
        
    }
    
    

    public Fisİslemleri() {

        try {
            com.mysql.jdbc.Connection myConn = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/fis_other?verifyServerCertificate=false&useSSL=true", "root", "1234");
            com.mysql.jdbc.Statement myStat = (com.mysql.jdbc.Statement) myConn.createStatement();
            
            

        } catch (Exception e) {
            e.printStackTrace();
        }
       

    }

   

}
