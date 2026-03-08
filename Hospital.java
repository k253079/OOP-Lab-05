public class Hospital {

    public static void main(String[] args) {

        double[][] temps = {
            {98.6, 101.2, 99.4, 97.8, 102.3, 100.5, 98.9},
            {94.5, 96.7, 101.8, 103.2, 99.6, 98.4, 97.1},
            {100.1, 99.8, 98.7, 101.5, 94.2, 96.3, 102.4},
            {97.3, 98.1, 99.9, 100.7, 101.1, 99.2, 98.6},
            {93.8, 102.5, 100.3, 99.1, 97.4, 101.9, 98.7}
        };

        int i, j;
        int highCount = 0;
        double highestAvg = 0;
        int highestPatient = 0;

        for (i = 0; i < 5; i++) {
            for (j = 0; j < 7; j++) {
                if (temps[i][j] < 95) {
                    temps[i][j] = 95;
                }
            }
        }

        for (i = 0; i < 5; i++) {
            double sum = 0;
            for (j = 0; j < 7; j++) {
                sum = sum + temps[i][j];
                if (temps[i][j] > 100) {
                    highCount++;
                }
            }
            double avg = sum / 7;
            System.out.println("Patient " + (i + 1) + " average temperature: " + avg);

            if (avg > highestAvg) {
                highestAvg = avg;
                highestPatient = i + 1;
            }
        }

        System.out.println();
        System.out.println("Patient with highest weekly average: Patient " + highestPatient + " (" + highestAvg + "F)");
        System.out.println("Number of times temperature exceeded 100F: " + highCount);

    }
}
