package university.management.system;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentFeeForm extends JFrame implements ActionListener {
    private JPanel contentPane;
    private JTextField t1, t2, t3;
    private JComboBox combo, combo1, combo2;
    JButton b1, b2;
    Choice c1;

    public static void main(String args[]) {
        new StudentFeeForm().setVisible(true);

    }

    public StudentFeeForm() {
        super("Student Fee Form");
        setBounds(700, 200, 550, 450);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        c1 = new Choice();
        c1.setForeground(new Color(47, 79, 79));
        c1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));

        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from student");
            while (rs.next()) {
                c1.add(rs.getString("rollno"));
            }

        } catch (Exception e) {
        }

        JLabel l1 = new JLabel("Select Roll No");
        l1.setForeground(new Color(25, 25, 112));
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        l1.setBounds(64, 63, 102, 22);
        contentPane.add(l1);

        JLabel l2 = new JLabel("Name");
        l2.setForeground(new Color(25, 25, 112));
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setBounds(64, 97, 102, 22);
        contentPane.add(l2);

        JLabel l3 = new JLabel("Father's Name");
        l3.setForeground(new Color(25, 25, 112));
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setBounds(64, 130, 102, 22);
        contentPane.add(l3);

        JLabel l4 = new JLabel("Branch");
        l4.setForeground(new Color(25, 25, 112));
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setBounds(64, 209, 102, 22);
        contentPane.add(l4);

        JLabel l5 = new JLabel("Semester");
        l5.setForeground(new Color(25, 25, 112));
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setBounds(64, 242, 102, 22);
        contentPane.add(l5);

        JLabel l6 = new JLabel("Total Payable");
        l6.setForeground(new Color(25, 25, 112));
        l6.setFont(new Font("Tahoma", Font.BOLD, 14));
        l6.setBounds(64, 275, 102, 22);
        contentPane.add(l6);

        c1.setBounds(174, 66, 156, 20);
        contentPane.add(c1);


        t2 = new JTextField();
        t2.setForeground(new Color(47, 79, 79));
        t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t2.setColumns(10);
        t2.setBounds(174, 100, 156, 20);
        contentPane.add(t2);

        t3 = new JTextField();
        t3.setForeground(new Color(47, 79, 79));
        t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t3.setColumns(10);
        t3.setBounds(174, 133, 156, 20);
        contentPane.add(t3);

        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from student where rollno='" + c1.getSelectedItem() + "'");
            while (rs.next()) {
                t2.setText(rs.getString("name"));
                t3.setText(rs.getString("fathers_name"));
            }
        } catch (Exception e) {

        }

        combo = new JComboBox();
        combo.setModel(new DefaultComboBoxModel(new String[]{"Mechanical", "CSE", "IT", "Civil", "Automobile", "Electronics", "Other"}));
        combo.setForeground(new Color(47, 79, 79));
        combo.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        combo.setBounds(176, 211, 154, 20);
        contentPane.add(combo);

        combo1 = new JComboBox();
        combo1.setModel(new DefaultComboBoxModel(new String[]{"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th"}));
        combo1.setForeground(new Color(47, 79, 79));
        combo1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        combo1.setBounds(176, 244, 154, 20);
        contentPane.add(combo1);

        t1 = new JTextField();
        t1.setForeground(new Color(47, 79, 79));
        t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t1.setColumns(10);
        t1.setBounds(174, 275, 156, 20);
        add(t1);

        b1 = new JButton("Pay");
        b1.addActionListener(this);
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b1.setBounds(64, 321, 111, 33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b2.setBounds(198, 321, 111, 33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        contentPane.add(b2);

        JLabel l7 = new JLabel("Course");
        l7.setForeground(new Color(25, 25, 112));
        l7.setFont(new Font("Tahoma", Font.BOLD, 14));
        l7.setBounds(64, 173, 102, 22);
        contentPane.add(l7);

        combo2 = new JComboBox();
        combo2.setModel(new DefaultComboBoxModel(new String[]{"B.Tech", "M.Tech", "MBA", "BBA", "BCA", "B.Sc", "MCA"}));
        combo2.setForeground(new Color(47, 79, 79));
        combo2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        combo2.setBounds(176, 176, 154, 20);
        contentPane.add(combo2);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(102, 205, 170), 2, true), "Fee Form",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(30, 144, 255)));
        panel.setBackground(Color.WHITE);
        panel.setBounds(10, 38, 358, 348);

        contentPane.setBackground(Color.WHITE);
        panel.setBackground(Color.WHITE);

        contentPane.add(panel);
    }

    public void actionPerformed(ActionEvent ae)
    {
        try {
            if (ae.getSource() == b1)
            {
                try
                {
                    conn con = new conn();
                    String sql = "insert into fee (roll_no, name, fathers_name, course, branch, sem, fee_paid) values (?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement st = con.c.prepareStatement(sql);
                    st.setString(1, c1.getSelectedItem());
                    st.setString(2, t2.getText());
                    st.setString(3, t3.getText());
                    st.setString(4, (String) combo2.getSelectedItem());
                    st.setString(5, (String) combo.getSelectedItem());
                    st.setString(6, (String) combo1.getSelectedItem());
                    st.setString(7, t1.getText());

                    int i = st.executeUpdate();
                    if (i > 0)
                    {
                        JOptionPane.showMessageDialog(null, "Successfully Paid");
                        this.setVisible(false);

                    }
                    else
                        JOptionPane.showMessageDialog(null, "error");
                 }
                catch (Exception e)
                {
                    e.printStackTrace();

                }
            }


            if (ae.getSource() == b2) {
                this.setVisible(false);
            }

        } catch (Exception e) {

        }
    }

}
























