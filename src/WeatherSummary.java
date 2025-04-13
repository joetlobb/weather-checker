import java.util.Scanner;

public class WeatherSummary {
    /**
     * Reads newline-delimted temperatures from System.in and prints summary
     * statistics to System.out.
     * 
     * Example input:
     * 66.4
     * 77.1
     * 72.6
     * 
     * Example output:
     * Max: 66.4
     * Min: 77.1
     * Average: 72.03333333333333
     * 
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {
        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!

        Scanner scan = new Scanner(System.in);

        double max = 0;
        double min = 0;
        boolean firstTemp = true;
        double sum = 0;
        int count = 0;
    
        while (scan.hasNextDouble()) {
            double current = scan.nextDouble();
            sum += current;
            count++;

            if (firstTemp) {
                max = current;
                min = current;
                firstTemp = false;
            } else if (current > max) {
                max = current;
            } else if (current < min) {
                min = current;
            }

        }

        double averageTemp = sum / count;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + averageTemp);

    }
}
