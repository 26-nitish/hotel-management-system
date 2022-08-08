package hotelmanagementsystem;





import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class AddEmployee extends JFrame{ //Third Frame


	JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6;
        JComboBox c1;

        public AddEmployee(){
            getContentPane().setForeground(Color.BLUE);
            getContentPane().setBackground(Color.WHITE);
            setTitle("ADD EMPLOYEE DETAILS");

            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            setSize(778,486);
            getContentPane().setLayout(null);

            JLabel Passportno = new JLabel("NAME");
            Passportno.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Passportno.setBounds(60, 30, 150, 27);
            add(Passportno);

            textField = new JTextField();
            textField.setBounds(200, 30, 150, 27);
            add(textField);

            JButton Next = new JButton("SAVE");
            Next.setBounds(200, 420, 150, 30);
            Next.setBackground(Color.BLACK);
            Next.setForeground(Color.WHITE);
            add(Next);

            JLabel age = new JLabel("AGE");
            age.setFont(new Font("Tahoma", Font.PLAIN, 17));
            age.setBounds(60, 80, 150, 27);
            add(age);

            textField_1 = new JTextField();
            textField_1.setBounds(200, 80, 150, 27);
            add(textField_1);

            JLabel Gender = new JLabel("GENDER");
            Gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Gender.setBounds(60, 120, 150, 27);
            add(Gender);

            JRadioButton NewRadioButton = new JRadioButton("MALE");
            NewRadioButton.setBackground(Color.WHITE);
            NewRadioButton.setBounds(200, 120, 70, 27);
            add(NewRadioButton);

            JRadioButton Female = new JRadioButton("FEMALE");
            Female.setBackground(Color.WHITE);
            Female.setBounds(280, 120, 100, 27);
            add(Female);
            
            JRadioButton other = new JRadioButton("OTHER");
            other.setBackground(Color.WHITE);
            other.setBounds(230, 140, 100, 27);
            add(other);


            JLabel Address = new JLabel("JOB");
            Address.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Address.setBounds(60, 170, 150, 27);
            add(Address);

            String course[] = {"Front Desk Clerks","Porters","Housekeeping","Kitchen Staff","Room Service","Waiter/Waitress","Manager","Accountant","Chef"};
            c1 = new JComboBox(course);
            c1.setBackground(Color.WHITE);
            c1.setBounds(200,170,150,30);
            add(c1);

            JLabel salary = new JLabel("SALARY");
            salary.setFont(new Font("Tahoma", Font.PLAIN, 17));
            salary.setBounds(60, 220, 150, 27);
            add(salary);

            textField_3 = new JTextField();
            textField_3.setBounds(200, 220, 150, 27);
            add(textField_3);

            JLabel phone = new JLabel("PHONE");
           phone.setFont(new Font("Tahoma", Font.PLAIN, 17));
            phone.setBounds(60, 270, 150, 27);
            add(phone);

            textField_4 = new JTextField();
            textField_4.setBounds(200, 270, 150, 27);
            add(textField_4);

            JLabel id = new JLabel("AADHAR");
            id.setFont(new Font("Tahoma", Font.PLAIN, 17));
            id.setBounds(60, 320, 150, 27);
            add(id);

            textField_5 = new JTextField();
            textField_5.setBounds(200, 320, 150, 27);
            add(textField_5);


            JLabel email = new JLabel("EMAIL");
            email.setFont(new Font("Tahoma", Font.PLAIN, 17));
            email.setBounds(60, 370, 150, 27);
            add(email);

            textField_6 = new JTextField();
            textField_6.setBounds(200, 370, 150, 27);
            add(textField_6);

            setVisible(true);

            JLabel AddStaff = new JLabel("ADD STAFF DETAILS");
            AddStaff.setForeground(Color.black);
            AddStaff.setFont(new Font("Tahoma", Font.ITALIC, 31));
            AddStaff.setBounds(450, 24, 442, 35);
            add(AddStaff);


            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotelmanagementsystem/icons/tenth.jpg"));
            Image i3 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
            ImageIcon i2 = new ImageIcon(i3);
            JLabel image = new JLabel(i2);
            image.setBounds(410,80,480,410);
            add(image);


            Next.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String name = textField.getText();
                    String age = textField_1.getText();
                    String salary = textField_3.getText();
                    String phone = textField_4.getText();
                    String aadhar = textField_5.getText();
                    String email = textField_6.getText();

                    String gender = null;

                    if(NewRadioButton.isSelected()){
                        gender = "male";

                    }else if(Female.isSelected()){
                        gender = "female";
                    }else if(other.isSelected()){
                        gender = "other";
                    }
                    

                    String s6 = (String)c1.getSelectedItem();

                    try {
                        Connector c = new Connector();
                        String str = "INSERT INTO Staff values( '"+name+"', '"+age+"', '"+gender+"','"+s6+"', '"+salary+"', '"+phone+"','"+aadhar+"', '"+email+"')";

                        c.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null,"Staff Added");
                        setVisible(false);

                    } catch (Exception e) {
                        e.printStackTrace();
        	    }
		}
            });

           
            setVisible(true);
            setBounds(320,200,900,600);
            

	}

    public static void main(String[] args){
        new AddEmployee();
    }   
}