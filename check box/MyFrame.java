import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
    
    JButton button;
    JCheckBox checkbox;
    ImageIcon crossicon;
    ImageIcon checkicon;

    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button=new JButton("Submit");
        button.setFocusable(false);
        button.addActionListener(this);

        crossicon = new ImageIcon("cross.png");
        checkicon = new ImageIcon("check.png");



        checkbox =new JCheckBox();
        checkbox.setText("I'm not a robot");
        checkbox.setFocusable(false);
        checkbox.setFont(new Font("Consolas",Font.PLAIN,35));
        checkbox.setIcon(crossicon);
        checkbox.setSelectedIcon(checkicon);


        this.add(button);
        this.add(checkbox);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button)
        {
            System.out.println(checkbox.isSelected());

            
        }
    }
    
}
