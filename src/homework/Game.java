package homework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {
       Spaceship spaceship = new Spaceship();
    JFrame frame;
    JLabel label;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    Action spaceAction;


    Game(Spaceship spaceship) {
        frame = new JFrame("KeyBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);


        int x = (int) spaceship.getCoordinateX();
        int y = (int) spaceship.getCoordinateY();
        label = new JLabel();

        label.setBackground(Color.red);
        label.setBounds(x, y, 20, 20);
        label.setOpaque(true);


        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();
        spaceAction = new SpaceAction();


        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        label.getActionMap().put("upAction", upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        label.getActionMap().put("downAction", downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        label.getActionMap().put("leftAction", leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        label.getActionMap().put("rightAction", rightAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "spaceAction");
        label.getActionMap().put("spaceAction", spaceAction);

        frame.add(label);
        frame.setVisible(true);
    }

    public class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

            spaceship.accelerate(1);
        }
    }
    public class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            spaceship.rotate(-1);
        }
    }
    public class RightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            spaceship.rotate(+1);
        }
    }
    public class DownAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            spaceship.accelerate(-1);
        }
    }
    public class SpaceAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(" Space + The coordinates are:");
            System.out.println(spaceship.getCoordinateX());
            System.out.println(spaceship.getCoordinateY());
        }
    }
}


