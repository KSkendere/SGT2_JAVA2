package homework;



import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

    class KeyListenerExapmle extends Spaceship {



        KeyListenerExapmle(Spaceship spaceship) {

            JFrame frame = new JFrame("KeyBinding Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(420, 420);
            frame.setLayout(null);
////        int x = (int) spaceship.getCoordinateX();
////        int y = (int) spaceship.getCoordinateY();
////        JLabel label = new JLabel();
////        label.setBackground(Color.red);
////        label.setBounds(x, y, 20, 20);
////        label.setOpaque(true);
////        frame.add(label);
            frame.setVisible(true);


            frame.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {

                }

                @Override
                public void keyPressed(KeyEvent e) {
                    int keyCode = e.getKeyCode();
                    if (keyCode == KeyEvent.VK_LEFT) {
                        spaceship.accelerate(-1);
                    }
                    if (keyCode == KeyEvent.VK_RIGHT) {
                        spaceship.accelerate(1);
                    }
                    if (keyCode == KeyEvent.VK_UP) {
                        spaceship.rotate(1);
                    }
                    if (keyCode == KeyEvent.VK_DOWN) {
                        spaceship.rotate(-1);
                    }
                    if (keyCode == KeyEvent.VK_SPACE) {
                        System.out.println(spaceship.getCoordinateX());
                        System.out.println(spaceship.getCoordinateY());

                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
        }
    }

