public class Main {

    public static int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];

            if (altitude > maxAltitude) {
                maxAltitude = altitude;
            }
        }

        return maxAltitude;
    }

    public static void main(String[] args) {

        int[] gain = {-5, 1, 5, 0, -7};

        int result = largestAltitude(gain);

        System.out.println(result);
    }
}
