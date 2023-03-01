/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Zaqaul F
 */
public class FormTugas {
    public static void main(String[] args) {
        JFrame j = new JFrame("Form Registrasi");
        JLabel title = new JLabel();
        title.setText("Form Registrasi");
        title.setBounds(240, 50, 100, 30);
        j.add(title);
        
        JLabel nama = new JLabel();
        nama.setText("Nama");
        nama.setBounds(100, 100, 100, 30);
        j.add(nama);
        
        JLabel username = new JLabel();
        username.setText("username");
        username.setBounds(100, 135, 100, 30);
        j.add(username);
        
        JLabel password = new JLabel();
        password.setText("password");
        password.setBounds(100, 170, 100, 30);
        j.add(password);
        
        JLabel email = new JLabel();
        email.setText("E-mail");
        email.setBounds(100, 205, 100, 30);
        j.add(email);
        
        JLabel TglLahir = new JLabel();
        TglLahir.setText("Tanggal Lahir");
        TglLahir.setBounds(100, 240, 100, 30);
        j.add(TglLahir);
        
        JLabel Hp = new JLabel();
        Hp.setText("No HP");
        Hp.setBounds(100, 275, 100, 30);
        j.add(Hp);
        
        JLabel alamat = new JLabel();
        alamat.setText("Alamat");
        alamat.setBounds(100, 305, 100, 30);
        j.add(alamat);
        
        JLabel jenisKelamin = new JLabel();
        jenisKelamin.setText("Jenis Kelamin");
        jenisKelamin.setBounds(100, 370, 100, 30);
        j.add(jenisKelamin);
        
        
        
        JTextField namaTxt = new JTextField();
        namaTxt.setBounds(190, 100, 200, 30);
        j.add(namaTxt);
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(190, 135, 200, 30);
        j.add(usernameTxt);
        
        JPasswordField passwordTxt = new JPasswordField();
        passwordTxt.setBounds(190, 170, 200, 30);
        j.add(passwordTxt);        
        
        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(190, 205, 200, 30);
        j.add(emailTxt);
        
        String []tgl = {"1","2","3","4","5","6","7","8","9","10"
                       ,"11","12","13","14","15","16","17","18","19","20"
                       ,"21","22","23","24","25","26","27","28","29","30","31"};
        JComboBox tanggal = new JComboBox(tgl);
        tanggal.setBounds(190, 240, 45, 30);
        j.add(tanggal);
        
        String []bln = {"Januari","Februari","Maret","April","Mei","Juni","Juli"
                       ,"Agustus","September","Oktober","November","Desember"};
        JComboBox bulan = new JComboBox(bln);
        bulan.setBounds(240, 240, 75, 30);
        j.add(bulan);
        
       /* String []th = new String[80];
        int inc=1900;
        for(int i=1900;i<=2023;i++){
            th[i] = inc + "";
            inc++;
        }*/
       
        String[] th = new String[80]; 

        for (int i = 0; i < 80; i++) { 
            th[i] = String.valueOf(2023 - i); 
        } 
        JComboBox thn = new JComboBox(th);
        thn.setBounds(320, 240, 70, 30);
        j.add(thn);
        
        JTextField noHpTxt = new JTextField();
        noHpTxt.setBounds(190, 275, 200, 30);
        j.add(noHpTxt);
                
        JTextArea testTxt = new JTextArea();
        testTxt.setBounds(190, 313, 200, 60);
        j.add(testTxt);  
        
        JRadioButton KLaki = new JRadioButton();
        KLaki.setText("Laki-Laki");
        KLaki.setBounds(190, 370, 100, 30);
        j.add(KLaki);
        
        JRadioButton KPuan = new JRadioButton();
        KPuan.setText("Perempuan");
        KPuan.setBounds(290, 370, 200, 30);
        j.add(KPuan);
        
        ButtonGroup kelamin = new ButtonGroup();
        kelamin.add(KLaki);
        kelamin.add(KPuan);
        
        JButton reg = new JButton();
        reg.setText("Register");
        reg.setBounds(190, 410, 90, 24);
        j.add(reg);
                
        
        j.setSize(800, 800);
        j.setLayout(null);
        j.setVisible(true);
    }    
}
