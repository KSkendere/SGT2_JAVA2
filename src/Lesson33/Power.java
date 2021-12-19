package Lesson33;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Power {

    private static final Logger log = Logger.getLogger("Power");


    public float pow (float base, int pow){
        log.setLevel(Level.FINEST);
float result = 1;


log.log(Level.INFO,"initial value is 1, loop is strating");
        for (int i = 0; i < pow; i++) {
            result = result * base;

        }

        return result;


    }
}
