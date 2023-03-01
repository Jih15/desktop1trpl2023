/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Zaqaul F
 */
public class registrasiForm {
    public static void main(String[] args) {
        JFrame j = new JFrame("Form Registrasi");
        
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
        
        JLabel noHp = new JLabel();
        noHp.setText("No HP");
        noHp.setBounds(100, 240, 100, 30);
        j.add(noHp);
        
        JLabel alamat = new JLabel();
        alamat.setText("Alamat");
        alamat.setBounds(100, 275, 100, 30);
        j.add(alamat);
        
        JTextField namaTxt = new JTextField();
        namaTxt.setBounds(170, 100, 200, 30);
        j.add(namaTxt);
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(170, 135, 200, 30);
        j.add(usernameTxt);
        
        JPasswordField passwordTxt = new JPasswordField();
        passwordTxt.setBounds(170, 170, 200, 30);
        j.add(passwordTxt);        
        
        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(170, 205, 200, 30);
        j.add(emailTxt);
        
        JTextField noHpTxt = new JTextField();
        noHpTxt.setBounds(170, 240, 200, 30);
        j.add(noHpTxt);
                
        JButton login = new JButton();
        login.setText("Register");
        login.setBounds(170, 500, 90, 24);
        j.add(login);
        
        JTextArea testTxt = new JTextArea();
        testTxt.setBounds(170, 275, 200, 200);
        j.add(testTxt);
        
        j.setSize(800, 800);
        j.setLayout(null);
        j.setVisible(true);
    }
}
