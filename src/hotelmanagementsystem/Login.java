/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
        
    
        JLabel l1,l2;
        JTextField t1,t3;
        JPasswordField t2;
        JButton b1,b2; 
    Login(){    
         l1 = new JLabel("username");
         l1.setBounds(70,70,100,30);
         add(l1);
         
         l2 = new JLabel("password");
         l2.setBounds(70,120,100,30);
         add(l2);
         
         t1 = new JTextField();
         t1.setBounds(150,70,150,30);
         add(t1);
         
         t2 = new JPasswordField();
         t2.setBounds(150,120,150,30);
         add(t2);
         
        
         
         b1 = new JButton("Login");
         b1.setBackground(Color.BLACK);
         b1.setForeground(Color.WHITE);
         b1.setBounds(60,180,120,30);
         b1.addActionListener(this);
         add(b1);
         
        b2 = new JButton("Cancel");
         b2.setBackground(Color.BLACK);
         b2.setForeground(Color.WHITE);
         b2.setBounds(200,180,120,30);
        b2.addActionListener(this);
         add(b2);
         
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/second.jpg"));
         Image i2 = i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel l3 = new JLabel(i3);
         l3.setBounds(350,30,200,200);
         add(l3);
         
         getContentPane().setBackground(Color.WHITE);
         
  
         setLayout(null);
         setBounds(600,300,600,300);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
  
    
        
///   public void actionPerformed(ActionEvent ae){
//        if(ae.getSource()== b1){
//         String Username = t1.getText();
//         String Password = t2.getText();
//         Connector c = new Connector();
//         
//         String str = "select * from Login where Username = ' "+ Username + "'and Password = '"+ Password + "'";
//        try{
//            
//            
//           ResultSet rs = c.s.executeQuery(str);
//           
//           if(rs.next()){
//          new dashboard().setVisible(true); 
//          this.setVisible(false);
//          }else{
//           JOptionPane.showMessageDialog(null, "invalid username or password");
//           this.setVisible(false);
//           }
//        }catch(Exception e){
//          
//        
//        }
//            
//        }else if(ae.getSource()== b2){
//        System.exit(0);
//         
//    }
//    }
    public void actionPerformed(ActionEvent ae){
if(ae.getSource()== b1){
        try{
            Connector c1 = new Connector();
            String u = t1.getText();
            String v = t2.getText();
            
            String q = "select * from login where username='"+u+"' and password='"+v+"'";
            
            ResultSet rs = c1.s.executeQuery(q); 
            if(rs.next()){
             new dashboard().setVisible(true);
                setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
if(ae.getSource()== b2){
    System.exit (0);
}
    }
    public static void main(String[] args){
        Login l = new Login();
    }
//    public static void main(String[] args){
//    new Login();
   // }
    
    
}
