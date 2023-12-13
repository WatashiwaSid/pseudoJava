import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RadioButton 
{
    public static void main(String args[])
    {
        UserInterface object = new UserInterface();
    }
}

class UserInterface extends JFrame implements ActionListener
{
    JLabel info = new JLabel("Please select your gender");
    JRadioButton r1 = new JRadioButton("Male");
    JRadioButton r2 = new JRadioButton("Female");
    JRadioButton r3 = new JRadioButton("Other");
    ButtonGroup bg = new ButtonGroup();
    JButton click = new JButton("Greet Me");
    JLabel greet = new JLabel("Greet");

    UserInterface()
    {
        add(info);
        add(r1);
        add(r2);
        add(r3);
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        add(greet);
        add(click);

        this.setTitle("RadioButtons");
        this.setSize(300,300);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        this.setLayout(new FlowLayout());

        click.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(r1.isSelected())
            greet.setText("Hello Sir");
        else if(r2.isSelected())
            greet.setText("Hello Madam");
        else if(r3.isSelected())
            greet.setText("Hello Person");
    }
}
