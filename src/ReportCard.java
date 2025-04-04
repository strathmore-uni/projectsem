import java.time.LocalDate;

public class ReportCard {
    private final Student student;
    private final double average;
    private final String grade;
    private final String recommendation;
    private final String date;

    public ReportCard(Student student, GradingService gradingService) {
        this.student = student;
        this.average = calculateAverage(student.getScores());
        this.grade = gradingService.calculateGrade(average);
        this.recommendation = gradingService.getRecommendation(grade);
        this.date = LocalDate.now().toString();
    }

    private double calculateAverage(int[] scores) {
        int sum = 0;
        for (int score : scores) sum += score;
        return (double) sum / scores.length;
    }

    public void printReport(String[] subjects) {
        System.out.println("\n----- Report Card -----");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        int[] scores = student.getScores();
        for (int i = 0; i < scores.length; i++) {
            System.out.println(subjects[i] + ": " + scores[i]);
        }
        System.out.printf("Average Score: %.2f\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Recommendation: " + recommendation);
        System.out.println("Date: " + date);
        System.out.println("-----------------------");
    }
}

