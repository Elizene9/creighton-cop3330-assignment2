package ex36;

// Processes all data entered by user
public class ProcessData {

    // Calculates average in list
    public double average(int[] userData) {
        int sum = 0;

        for (int i = 0; i < userData.length; i++) {
            sum += userData[i];
        }
        return (double) sum / userData.length;
    }

    // Calculates maximum in list
    public int max (int[] userData) {
        int max = 0;

        System.out.print("\nNumbers: ");
        for (int i = 0; i < userData.length; i++) {

            System.out.printf("%d, ", userData[i]);
            if (userData[i] > max)
                max = userData[i];
        }
        return max;
    }

    // Calculates minimum in list
    public int min (int[] userData) {
        int min = userData[0];
        for (int i = 0; i < userData.length; i++) {
            if (userData[i] < min)
                min = userData[i];
        }
        return min;
    }

    // Returns standard deviation
    public double std (int []userData, double mean) {
        int sum = 0, i;
        double dev;

        for (i = 0; i < userData.length; i++) {
            sum += Math.pow((userData[i] - mean), 2);
        }
        dev = Math.sqrt((double) sum / userData.length);
        return dev;
    }
    // Prints all data
    void printData(double average, int max, int min, double stdDev) {
        System.out.printf("\nThe average is %.1f", average);
        System.out.printf("\nThe minimum is %d", min);
        System.out.printf("\nThe maximum is %d", max);
        System.out.printf("\nThe standard deviation is %.2f", stdDev);
    }


}
