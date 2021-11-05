package lesson6;

import lesson6.clockfeatures.domain.Hour;

public class Application {

    public static void main(String[] args) {
        DigitalColck digitalColck = new DigitalColck();

      String currentTime=  digitalColck.showTime();
        System.out.println(currentTime);
        Hour hour = digitalColck.getTimeClock().getHour();
    }
}
