package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class UpdateTeacher implements ActionListener
{
    JFrame f;
    JLabel id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id12,lab,lab2;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    JButton b,b1,b2;


    UpdateTeacher()
    {
        f = new JFrame("Update Teacher Details");
        f.setSize(900, 650);
        f.setLocation(450, 150);
        f.setBackground(Color.WHITE);
        f.setLayout(null);

        JLabel l1 = new JLabel("Enter employee id  to update the data of student");
        l1.setBounds(500, 100, 200, 30);
        l1.setFont(new Font("serif", Font.ITALIC, 10));
        f.add(l1);

        t10 = new JTextField();
        t10.setBounds(500, 100, 200, 30);
        f.add(t10);

        b2 = new JButton("Update");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(720, 100, 100, 30);
        f.add(b2);
        b2.addActionListener(this);

        id8 = new JLabel("Update Teacher Details");
        id8.setBounds(50, 10, 500, 50);
        id8.setFont(new Font("serif", Font.ITALIC, 40));
        id8.setForeground(Color.BLACK);
        f.add(id8);

        id1 = new JLabel("Name");
        id1.setBounds(50, 170, 100, 30);
        id1.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id1);

        t1 = new JTextField();
        t1.setBounds(200, 170, 150, 30);
        f.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(400, 170, 200, 30);
        id2.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id2);

        t2 = new JTextField();
        t2.setBounds(600, 170, 150, 30);
        f.add(t2);

        id3 = new JLabel("DOB (dd/mm/yyyy)");
        id3.setBounds(50, 220, 100, 30);
        id3.setFont(new Font("serif", Font.BOLD, 14));
        f.add(id3);

        t3 = new JTextField();
        t3.setBounds(200, 220, 150, 30);
        f.add(t3);


        id4 = new JLabel("Age");
        id4.setBounds(400, 220, 100, 30);
        id4.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id4);

        t4 = new JTextField();
        t4.setBounds(600, 220, 150, 30);
        f.add(t4);

        id5 = new JLabel("Adhar No.");
        id5.setBounds(50, 270, 100, 30);
        id5.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id5);

        t5 = new JTextField();
        t5.setBounds(200, 270, 150, 30);
        f.add(t5);

        id6 = new JLabel("Email");
        id6.setBounds(400, 270, 100, 30);
        id6.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id6);

        t6 = new JTextField();
        t6.setBounds(600, 270, 150, 30);
        f.add(t6);

        id7 = new JLabel("Class X(%)");
        id7.setBounds(50, 320, 100, 30);
        id7.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id7);

        t7 = new JTextField();
        t7.setBounds(200, 320, 150, 30);
        f.add(t7);

        id9 = new JLabel("Class XII(%)");
        id9.setBounds(400, 320, 130, 30);
        id9.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id9);

        t8 = new JTextField();
        t8.setBounds(600, 320, 150, 30);
        f.add(t8);

        id10 = new JLabel("Phone");
        id10.setBounds(50, 370, 130, 30);
        id10.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id10);

        t9 = new JTextField();
        t9.setBounds(200, 370, 150, 30);
        f.add(t9);



        id12 = new JLabel("Course");
        id12.setBounds(50, 420, 150, 30);
        id12.setFont(new Font("serif", Font.BOLD, 20));
        f.add(id12);

        t11= new JTextField();
        t11.setBounds(200, 420, 150, 30);
        f.add(t11);

        lab = new JLabel("Dept.");
        lab.setBounds(400, 385, 150, 30);
        lab.setFont(new Font("serif", Font.BOLD, 20));
        f.add(lab);

        t12 = new JTextField();
        t12.setBounds(600, 385, 150, 30);
        f.add(t12);

        lab2 = new JLabel("Address");
        lab2.setBounds(50, 470, 150, 30);
        lab2.setFont(new Font("serif", Font.BOLD, 20));
        f.add(lab2);

        t13= new JTextField();
        t13.setBounds(200, 470, 150, 30);
        f.add(t13);

        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250, 520, 150, 40);
        f.add(b);

        b1 = new JButton("Cancel");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450, 520, 150, 40);
        f.add(b1);

        b.addActionListener(this);
        b1.addActionListener(this);

        f.setVisible(true);
    }

    public void actionPerformed (ActionEvent ae)
    {
        if (ae.getSource()==b)
        {
            try
            {
                conn con = new conn();
                String str="update teacher set name='"+t1.getText()+"',fathers_name='"+t2.getText()+"',dob='"+t3.getText()+"',age='"+t4.getText()+"',adhar='"+t5.getText()+"',email='"+t6.getText()+"',class_x='"+t7.getText()+"',class_xii='"+t8.getText()+"',phone='"+t9.getText()+"',course='"+t11.getText()+"',dept='"+t12.getText()+"',address='"+t13.getText()+"' where emp_id='"+t10.getText()+"'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"successfully updated");
                f.setVisible(false);
                new TeacherDetails();

            }catch(Exception e)
            {
                System.out.println("The error is:"+e);
            }
        }
        if (ae.getSource()==b1)
        {
            f.setVisible(false);
            new Project().setVisible(true);
        }
        if (ae.getSource()==b2)
        {
            try
            {
                conn con= new conn();
                String str="select * from student where emp_id='"+t10.getText()+"'";
                ResultSet rs= con.s.executeQuery(str);
                if (rs.next())
                {
                    f.setVisible(true);

                    t1.setText(rs.getString (1));
                    t2.setText(rs.getString (2));
                    t3.setText(rs.getString (3));
                    t4.setText(rs.getString (4));
                    t5.setText(rs.getString (5));
                    t6.setText(rs.getString (6));
                    t7.setText(rs.getString (7));
                    t8.setText(rs.getString (8));
                    t9.setText(rs.getString (9));
                    t11.setText(rs.getString (10));
                    t12.setText(rs.getString (11));
                    t13.setText(rs.getString (12));

                }

            }
            catch (Exception ex){}

            f.setVisible(true);
            f.setSize(900,650);
            f.setLocation(450,250);

        }

    }

    public static void main (String args[])
    {
        new UpdateTeacher().f.setVisible(true);
    }
}













































