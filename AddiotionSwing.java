import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddiotionSwing 
{
    public static void main(String args[])
    {
        Addition graphicObject = new Addition();
    }
}

class Addition extends JFrame implements ActionListener
{
    JLabel l1 = new JLabel("Enter first number : ");
    JLabel l2 = new JLabel("Enter second number : ");
    JTextField t1Field = new JTextField(10);
    JTextField t2Field = new JTextField(10);
    JButton add = new JButton("Add");
    JLabel result = new JLabel("Result");
    JButton subtract = new JButton("Subtract");


    Addition()
    {
        
        add.addActionListener(this);
        subtract.addActionListener(this);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setSize(250,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Swing GUI Add");
        add(l1);
        add(l2);
        add(t1Field);
        add(t2Field);        
        add(add);        
        add(result);        
        add(subtract);

    }

    public void actionPerformed(ActionEvent ae)
    {
        int n1 = Integer.parseInt(t1Field.getText()); //Jlabel data is string, so we need to convert it into text
        int n2 = Integer.parseInt(t2Field.getText());
        int sum=0;

        if(ae.getSource()==add)
            sum = n1+n2;

        else if(ae.getSource()==subtract)
            sum = n1-n2;

        result.setText(sum + " ");
    }

}
