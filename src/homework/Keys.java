package homework;


import javax.swing.*;
import javax.swing.InputMap;

    public class Keys {



        ActionMap actionMap = new ActionMap();


        InputMap inputMap = new InputMap();

        public InputMap getInputMap() {
            return inputMap;
        }

        public void setInputMap(InputMap inputMap) {
            this.inputMap = inputMap;
        }

        public ActionMap getActionMap() {
            return actionMap;
        }

        public void setActionMap(ActionMap actionMap) {
            this.actionMap = actionMap;
        }


    }









