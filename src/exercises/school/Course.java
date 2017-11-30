package exercises.school;

import java.util.ArrayList;

public class Course {

    private String name;
    private int courseId;
    private int credit;
    private ArrayList<Student> studentList;
    private static int nextCourseId = 1;

    // constructors
    public Course(String name, int courseId, int credit, ArrayList<Student> studentList) {
        this.name = name;
        this.courseId = courseId;
        this.credit = credit;
        this.studentList = studentList;
    }

    public Course(String name, int courseId) {
        this(name, courseId, 3, new ArrayList<Student>());
    }

    public Course(String name) {
        this(name, nextCourseId);
    }

    // special methods
    public String toString() {
        return courseId + name + credit + " credits";
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

        Course theCourse = (Course) o;
        return theCourse.getCourseId() == getCourseId();
    }

    // omit getters and setters

    public int getCourseId() {
        return courseId;
    }

}
