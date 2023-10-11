import java.util.Arrays;
import java.util.Calendar;

public class WorkHours {
    public static final double HOURS_TO_WORK = 8;
    public static final String SPLITTER = "-";
    public static void main(String[] args){
        System.out.println(whenCanIExit(false, "7-36-35", "12-26-49", "13-00-00"));

    }
    public static String whenCanIExit (boolean verification, String... hours){ // hours MUST BE an odd number

        double[] decimalHours = new double[hours.length];
        double workingHours = 0;

        for (int i = 0; i < decimalHours.length; i++) { // transform from String to decimal hours format, and then assign to decimalHours
            decimalHours[i] = toHours(hours[i]);
        }

        if (verification) { // return array of decimal hours, for testing with calculator
            return Arrays.toString(decimalHours);
        }

        if (hours.length % 2 == 0) {
            return evenHoursCalculus(decimalHours);
        }

        String timeInPause = toString(timeInPause(decimalHours));

        for (int i = 1; i < decimalHours.length; i += 2) {
            workingHours += (decimalHours[i] - decimalHours[i-1]);
        }

        double exitTime = decimalHours[decimalHours.length - 1] + (HOURS_TO_WORK - workingHours);

        String remainingHours = toString(exitTime - getTime());
        return "For maintain " + HOURS_TO_WORK + "h at work, you will need to work until " + toString(exitTime) + ". Today you've been in pause for " + timeInPause + "; You'll have to work for other " + remainingHours ;
    }
    public static String evenHoursCalculus(double[] decimalHours) { // calculate for how much time have you worked and the pause you've done
        double[] decimalHoursWithoutLast = new double[decimalHours.length - 1];
        for (int i = 0; i < decimalHours.length - 1; i++) {
            decimalHoursWithoutLast[i] = decimalHours[i];
        }
        double pause = timeInPause(decimalHoursWithoutLast);

        double timeAtWork = 0;
        for (int i = 1; i < decimalHours.length; i += 2) {
            timeAtWork += decimalHours[i] - decimalHours[i-1];
        }

        return "Given specific parameters, you have worked for " + toString(timeAtWork) + ", and you made " + toString(pause) + " of pause.";
    }
    public static double timeInPause (double[] decimalHours) {
        double timeInPause = 0;

        for (int i = 2; i < decimalHours.length; i += 2) {
            timeInPause += decimalHours[i] - decimalHours[i-1];
        }

        return timeInPause;
    }
    public static double toHours (String hoursStr) { //transform from 7:30:00 to 7,5
        String[] arrString = hoursStr.split(SPLITTER);
        double[] hoursInDouble = new double[3];
        for (int i = 0; i < 3; i++) {
            hoursInDouble[i] = Double.parseDouble(arrString[i]);
        }
        return hoursInDouble[0] + (hoursInDouble[1] + hoursInDouble[2] / 60) / 60;
    }
    public static String toString (double h) { // transform from 7,5 to 7:30:00
        String hr = "" + ((int) h);
        h = (h - ((int) h)) * 60;
        String m = "" + ((int) (h));
        h = (h - ((int) h)) * 60;
        String s = "" + ((int) (h));

        if (m.length() == 1) { // if m or s is one character, add a 0 (16:56:9 -> 16:56:09)
            m = "0" + m;
        }
        if (s.length() == 1) {
            s = "0" + s;
        }

        return hr + ":" + m + ":" + s;
    }

    public static double getTime () { // return current time as double
        Calendar rightNow = Calendar.getInstance();
        int hour = rightNow.get(Calendar.HOUR_OF_DAY);
        int minutes = rightNow.get(Calendar.MINUTE);
        int seconds = rightNow.get(Calendar.SECOND);

        return toHours(hour + SPLITTER + minutes + SPLITTER + seconds);
    }
}
