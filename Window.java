package PongGame;

import javax.swing.*;

public class Window {

    public Window(String title, Game game , boolean end) {

        JFrame frame = new JFrame(title);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setIconImage(new ImageIcon("C:\\Users\\global village\\OneDrive\\Desktop\\PongGame\\1.jpg").getImage());
        frame.add(game);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        game.start();

        if (end){
            frame.dispose();
        }

    }


}