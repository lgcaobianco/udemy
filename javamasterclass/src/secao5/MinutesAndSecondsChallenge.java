package secao5;

public class MinutesAndSecondsChallenge {
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 60) {
            return "Invalid value";
        }

        int hours = minutes / 60;
        int restOfMinutes = (int) minutes % 60;

        return hours + "h " + restOfMinutes + "m " + seconds + "s";
    }

    public static void main(String[] args){
        System.out.println(getDurationString(372, 40));

    }

}
