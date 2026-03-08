public class Scholarship {

    public static void main(String[] args) {

        int[] marks = {55, 90, 73, 38, 82, 91, 67, 45, 78, 88, 30, 71};
        int i;
        float sum = 0, average;
        int full = 0, half = 0, none = 0;
        int belowAverage = 0;

        for (i = 0; i < 12; i++) {
            if (marks[i] < 40) {
                marks[i] = 40;
            }
        }

        for (i = 0; i < 12; i++) {
            sum = sum + marks[i];
        }
        average = sum / 12;

        System.out.println("Class Average: " + average);
        System.out.println();

        for (i = 0; i < 12; i++) {
            System.out.print("Student " + (i + 1) + " - Marks: " + marks[i] + " - ");

            if (marks[i] > 85) {
                System.out.println("Full Scholarship");
                full++;
            } else if (marks[i] >= 70 && marks[i] <= 85) {
                System.out.println("Half Scholarship");
                half++;
            } else {
                System.out.println("No Scholarship");
                none++;
            }

            if (marks[i] < average) {
                belowAverage++;
            }
        }

        System.out.println();
        System.out.println("--- Summary ---");
        System.out.println("Full Scholarship: " + full + " students");
        System.out.println("Half Scholarship: " + half + " students");
        System.out.println("No Scholarship: " + none + " students");
        System.out.println("Students below class average: " + belowAverage);

    }
}
