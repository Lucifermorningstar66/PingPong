package PongGame;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/*
 * Created by JFormDesigner on Sun Jan 14 09:43:44 IRST 2024
 */



/**
 * @author global village
 */
public class End extends JFrame implements ActionListener {
    public End() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        label1 = new JLabel();

        //======== this ========
        setTitle("Ping Pong");
        setIconImage(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\PongGame\\1.jpg").getImage());
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- button1 ----
        button1.setText("DONE");
        button1.setBackground(new Color(0x0933A6));
        button1.setForeground(new Color(0xFFFFFF));
        button1.setFont(button1.getFont().deriveFont(button1.getFont().getStyle() | Font.BOLD, button1.getFont().getSize() + 5f));
        contentPane.add(button1);
        button1.setBounds(365, 200, 235, 60);
        button1.addActionListener(this);


        //---- label1 ----
        label1.setText("Congrats!!! You WON . . .");
        label1.setForeground(new Color(0xFFFFFF));
        label1.setFont(new Font("Niagara Solid", Font.BOLD, 70));
        contentPane.add(label1);
        label1.setBounds(300, 90, 550, 50);

        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("C:/Users/global village/OneDrive/Desktop/PongGame/11.jpg"));
        add(background);
        background.setLayout(new FlowLayout());




        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        setSize(985, 660);
        setVisible(true);
        setLocationRelativeTo(getOwner());

    }


    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel label1;




    @Override
    public void actionPerformed (ActionEvent e) {
        if (e.getSource() == button1){
            dispose();
            StartMenu startMenu = new StartMenu();
        }



    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}


