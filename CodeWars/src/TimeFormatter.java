import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {
    public static void main(String[] args) {
        System.out.println(formatDuration(315365000));
        System.out.println(formatDuration(Integer.MAX_VALUE));
        System.out.println(formatDuration(0));
        System.out.println(formatDuration(9476));
        System.out.println(formatDuration(3640));
        System.out.println(formatDuration(31536060));
    }

    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }
        int[] conversionRates = {31536000, 86400, 3600, 60, 1};
        String[] names = {" year", " day", " hour", " minute", " second"};
        List<String> partials = new ArrayList<>();
        int carry = seconds, res;

        for (int i = 0; i < conversionRates.length; i++) {
            res = carry / conversionRates[i];
            carry = carry % conversionRates[i];

            if (res > 1){
                partials.add(res + names[i] + "s");
            } else if (res == 1){
                partials.add(res + names[i]);
            }

        }
        return renderStringFromArray(partials);
    }

    static String renderStringFromArray(List<String> partials) {
        if (partials.size()==1){
            return partials.get(0);
        }

        StringBuilder finalString = new StringBuilder();

        for (int i = 0; i < partials.size() - 1; i++) {
            if (i < partials.size() - 2) {
                finalString.append(partials.get(i)).append(", ");
            } else {
                finalString.append(partials.get(i)).append(" and ").append(partials.get(i + 1));
            }
        }

        return finalString.toString();
    }
}