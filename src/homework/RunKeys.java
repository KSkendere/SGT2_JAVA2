package homework;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class RunKeys extends Spaceship {

    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;
    Action spaceAction;
    public RunKeys(Spaceship spaceship) {

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();
        spaceAction = new SpaceAction();

        Keys keys = new Keys();
        keys.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        keys.getActionMap().put("downAction",downAction);
        keys.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
        keys.getActionMap().put("leftAction",leftAction);
        keys.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
        keys.getActionMap().put("rightAction",rightAction);
        keys.getInputMap().put(KeyStroke.getKeyStroke("SPACE"),"spaceAction");
        keys.getActionMap().put("spaceAction",spaceAction);
    }




    public class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) { accelerate(+1);
        }
    }

    public class LeftAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            rotate(-1);
        }
    }

    public class RightAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            rotate(+1);
        }
    }

    public class DownAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            accelerate(-1);
        }
    }

    public class SpaceAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(getCoordinateX());
            System.out.println(getCoordinateY());
        }

    }

}