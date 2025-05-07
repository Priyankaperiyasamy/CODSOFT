import java.util.Scanner;

class StudentMarksProcessor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subjectCount = input.nextInt();

        int[] marks = readMarks(input, subjectCount);
        int total = computeTotal(marks);
        double average = computeAverage(total, subjectCount);
        String grade = assignGrade(average);

        displayResults(total, average, grade);
    }

    public static int[] readMarks(Scanner input, int count) {
        int[] marks = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }
        return marks;
    }

    public static int computeTotal(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    public static double computeAverage(int total, int count) {
        return (double) total / count;
    }

    public static String assignGrade(double average) {
        if (average >= 90) return "A+";
        else if (average >= 80) return "A";
        else if (average >= 70) return "B";
        else if (average >= 60) return "C";
        else if (average >= 50) return "D";
        else return "F";
    }

    public static void displayResults(int total, double average, String grade) {
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);
    }
}
