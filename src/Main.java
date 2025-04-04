import java.util.Scanner;

public class Main {
    private static final int STUDENT_COUNT = 10;
    private static final int SUBJECT_COUNT = 5;
    private static final String[] SUBJECTS = {"Math", "Programming", "Web Development", "Accounting", "ICT"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[STUDENT_COUNT];
        GradingService gradingService = new StrathmoreGradingService();

        for (int i = 0; i < STUDENT_COUNT; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("ID: ");
            String id = scanner.nextLine();

            int[] scores = new int[SUBJECT_COUNT];
            for (int j = 0; j < SUBJECT_COUNT; j++) {
                System.out.print("Score in " + SUBJECTS[j] + ": ");
                scores[j] = scanner.nextInt();
            }
            scanner.nextLine(); // consume leftover newline

            students[i] = new Student(name, id, scores);
        }

        // Students reports
        for (Student student : students) {
            ReportCard reportCard = new ReportCard(student, gradingService);
            reportCard.printReport(SUBJECTS);
        }

        scanner.close();
    }
}
