package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on, if it is raining
 * AND car is running (>100) OR its dark
 */
public class LightsOn {
    public static void main(String[] args) {
        final int MAX_CAR_SPEED = 100 ;
        boolean lightsOn = false;
        boolean isRaining = false;
        boolean isCarRunning = false;
        boolean isDark = false;
        int carSpeed =0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();


        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert car's speed");
        carSpeed =in.nextInt();
        isCarRunning=carSpeed > MAX_CAR_SPEED;

        lightsOn= isRaining && (isCarRunning || isDark);

        System.out.println("The lights of the car are on " +lightsOn );



    }
}
