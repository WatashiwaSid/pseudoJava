import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChangeButtonColor 
{
    public static void main(String args[])
    {
    UI girgit = new UI();
    }
}

class UI extends JFrame implements ActionListener
{
    JButton red = new JButton("Red");
    JButton blue = new JButton("Blue");

    public UI()
    {
        this.setTitle("ChangeColorsLikeMyEx");
        this.setVisible(true);
        this.setSize(150,250);
        this.setDefaultCloseOperation(3);
        this.setLayout(new FlowLayout());

        add(red);
        add(blue);

        red.addActionListener(this);
        blue.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==red)
            red.setBackground(Color.RED);
        else
            blue.setBackground(Color.BLUE);
    }
}