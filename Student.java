public class Student {
    private String name;
    private int rollNo;
    private float marks;

    public Student(String name, int rollNo, float marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public float calculatePercentage() {
        return (marks / 500) * 100;
    }

    public String getGrade() {
        float percentage = calculatePercentage();
        if (percentage >= 85) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 50) return "C";
        else return "D";
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Percentage: "
                + calculatePercentage() + "%, Grade: " + getGrade();
    }
}
