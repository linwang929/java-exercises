package exercises.school;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;
    private static int nextStudentId = 1;

    // constructors
    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0.0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    // instance methods
    public void addGrade(int courseCredits, double grade) {
        double totalQualityScore = gpa * numberOfCredits;
        numberOfCredits += courseCredits;
        totalQualityScore += grade * courseCredits;
        gpa = totalQualityScore / numberOfCredits;
    }

    public String getGradeLevel() {
        String gradeLevel;
        if (numberOfCredits >= 0 & numberOfCredits < 30) {
            gradeLevel = "freshman";
        } else if (numberOfCredits >= 30 & numberOfCredits < 60) {
            gradeLevel = "sophomore";
        } else if (numberOfCredits >= 60 & numberOfCredits < 90) {
            gradeLevel = "junior";
        } else if (numberOfCredits >= 90) {
            gradeLevel = "senior";
        }
    }

    // special methods
    public String toString() {
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
    }

    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (o == null) {
            return false;
        }

        if (o.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) o;
        return theStudent.getStudentId() == getStudentId();
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    private void setNumberOfCredits(int aNumberOfCredit) {
        numberOfCredits = aNumberOfCredit;
    }

    public double getGpa() {
        return gpa;
    }

    private void setGpa(double aGpa) {
        gpa = aGpa;
    }

}
