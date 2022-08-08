/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagementsystem;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class Hotel extends JFrame implements ActionListener{
    JButton b1,b2;
 
    public static void main(String[] args) {
    Hotel h =  new Hotel();
     
 }
public Hotel(){



ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/background.jpg"));
JLabel l1 = new JLabel(i1);
l1.setBounds(0,0,1366,683);
add(l1);

  b1 = new JButton("Login");
b1.setBackground(Color.WHITE);
b1.setForeground(Color.BLACK);
b1.setBounds(1090,590,150,50);
b1.addActionListener(this);
l1.add(b1);

 b2 = new JButton("Add User");
b2.setBackground(Color.white);
b2.setForeground(Color.BLACK);
b2.setBounds(100,590,150,50);
b2.addActionListener(this);
l1.add(b2);
                     
JLabel l2 = new JLabel("Hotel Management System");
l2.setBounds(400,0,1000,70);
l2.setForeground(Color.BLACK); 
l2.setFont(new Font("serif", Font.PLAIN, 50));
l1.add(l2);
    
    setLayout(null);
    setVisible(true);
    setBounds(100,120,1366,683);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

    while(true){
    l2.setVisible(false);
    try{
        Thread.sleep(500);
    }catch (Exception e) {
    }
     l2.setVisible(true);
     try{
         
         Thread.sleep(500);
     }catch (Exception e){}
}






 }
 public void actionPerformed(ActionEvent ae){
   if (ae.getSource()== b1 ){
     new Login().setVisible(true);
    this.setVisible(false);
}
   if(ae.getSource()==b2){
       new AddUser().setVisible(true);
      this.setVisible(false);
   }
 }

}