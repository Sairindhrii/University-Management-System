package university.management.system;

import javax.swing.*;
import java.awt.*;

public class AboutUs extends JFrame
{
    private JPanel contentPane;
    public  static void main ( String args[])
    {
        new AboutUs().setVisible(true);

    }
    public AboutUs()
    {
        super ("About Us - City University ");
        setBackground(new Color(173,216,230));
        setBounds (500,250,700,500);

        contentPane = new JPanel ();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel l1= new JLabel ("New Label");
        ImageIcon i1 = new ImageIcon(getClass().getResource("/university/management/system/icons/image.jpg"));

        Image i2 = i1.getImage().getScaledInstance (150,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        l1= new JLabel (i3);
        l1.setBounds(300,50,450,150);
        contentPane.add(l1);

        JLabel l3= new JLabel ("University");
        l3.setForeground(new Color(0,250,154));
        l3.setFont(new Font("Trebuchet MS",Font.BOLD|Font.ITALIC,30));
        l3.setBounds(140,40,200,55);
        contentPane.add(l3);

        JLabel l4= new JLabel ("Management System");
        l4.setForeground(new Color(127,255,154));
        l4.setFont(new Font("Trebuchet MS",Font.BOLD|Font.ITALIC,30));
        l4.setBounds(70,80,405,100);
        contentPane.add(l4);

        JLabel l6= new JLabel ("Developed by : Sairindhri Dutta");
        l6.setFont(new Font("Trebuchet MS",Font.BOLD,30));
        l6.setBounds(70,198,600,35);
        contentPane.add(l6);

        JLabel l7= new JLabel ("Contact Number: +916290587047");
        l7.setFont(new Font("Trebuchet MS",Font.BOLD,20));
        l7.setBounds(70,260,600,34);
        contentPane.add(l7);

        JLabel l8= new JLabel ("Contact : sairindhridutta26@gmail.com");
        l8.setFont(new Font("Trebuchet MS",Font.BOLD,20));
        l8.setBounds(70,300,600,34);
        contentPane.add(l8);

        contentPane.setBackground(Color.WHITE);

    }

}