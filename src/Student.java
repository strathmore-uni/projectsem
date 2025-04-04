public class Student {
    private final String name;
    private final String id;
    private final int[] scores;

    public Student(String name, String id, int[] scores) {
        this.name = name;
        this.id = id;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int[] getScores() {
        return scores;
    }
}

