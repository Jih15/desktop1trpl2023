/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Zaqaul F
 */
public class NewMain {
    public static void main(String[] args) {
        JFrame j = new JFrame("JFrame Pertamaku");
        JLabel username = new JLabel();
        username.setText("username");
        username.setBounds(100, 96, 100, 30);
        j.add(username);
        
        JLabel password = new JLabel();
        password.setText("password");
        password.setBounds(100, 133, 100, 30);
        j.add(password);
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(170, 100, 200, 30);
        j.add(usernameTxt);
        
        JPasswordField passwordTxt = new JPasswordField();
        passwordTxt.setBounds(170, 135, 200, 30);
        j.add(passwordTxt);        
        
        JButton login = new JButton();
        login.setText("Login");
        login.setBounds(170, 170, 70, 24);
        j.add(login);
        
        
        j.setSize(500, 400);
        j.setLayout(null);
        j.setVisible(true);
    }
}
