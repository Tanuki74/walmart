/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Walmart;

/**
 *
 * @author Banny Juanda
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection koneksi;
    public static Connection koneksiDB(){
        if(koneksi == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3308/walmart_kelompok4", "root", "");
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Database Tidak Terkoneksi!!\nerror:"+e);
            }
        }
        return koneksi;
    }
    
    public static void main(String[] args) {
        koneksi test = new koneksi();
        test.koneksiDB();
        System.exit(0);
    }
}