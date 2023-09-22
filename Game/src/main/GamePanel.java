package main;

import input.KeyboardInputs;
import input.MouseInputs;
import utilz.Constants;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import  static utilz.Constants.PlayerConstants.*;
import static utilz.Constants.Directions.*;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private KeyboardInputs keyboardInputs;
    private Game game;

    public GamePanel(Game game) {
        keyboardInputs = new KeyboardInputs(this);
        mouseInputs = new MouseInputs(this);

        this.game = game;

        setPanelSize();
        addKeyListener(keyboardInputs);
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

    }



    private void setPanelSize() {
        Dimension size = new Dimension(1024,640);
        setMinimumSize(size);
        setMaximumSize(size);
        setPreferredSize(size);
    }

    public void updateGame(){

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        game.render(g);

    }

    public Game getGame(){
        return game;
    }





}
