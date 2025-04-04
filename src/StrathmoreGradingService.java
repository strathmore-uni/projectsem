public class StrathmoreGradingService implements GradingService {
    public String calculateGrade(double average) {
        if (average >= 70) return "A";
        else if (average >= 60) return "B";
        else if (average >= 50) return "C";
        else if (average >= 40) return "D";
        else return "F";
    }

    public String getRecommendation(String grade) {
        return switch (grade) {
            case "A" -> "Excellent";
            case "B" -> "Good";
            case "C" -> "Average";
            case "D" -> "Poor";
            default -> "Fail - Needs Improvement";
        };
    }
}

