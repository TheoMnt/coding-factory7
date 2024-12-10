package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

public class SecoondsConverter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int SECONDS_PER_DAY = 3600*24;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;

        int inputDays = 0;
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        int totalSeconds = 0;

        System.out.printf("Please give the days,hours,minutes and seconds ");


        inputDays = in.nextInt();
        inputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputSeconds = in.nextInt();


        totalSeconds = inputDays * SECONDS_PER_DAY + inputHours * SECONDS_PER_HOUR + inputMinutes *SECONDS_PER_MINUTE +inputSeconds;
        System.out.printf(Locale.US,"The total amount of seconds is %,d",totalSeconds);
        // το locale είναι για να μου βγάλει το κομμα για διαχωριστικό χιλιάδων όπως στο αμερικάνικο σύστημα





    }
}
