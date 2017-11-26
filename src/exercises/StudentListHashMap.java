package exercises;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class StudentListHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int newStudentId;
        String newStudentName;

        System.out.println("Enter your students (or ENTER to finish):");

        do {
            System.out.println("Student ID:");
            newStudentId = in.nextInt();

            if (newStudentId != 0) {
                System.out.println("Student Name:");
                newStudentName = in.next();
                students.put(newStudentId, newStudentName);
                in.nextLine();
            }
        } while (newStudentId != 0);

        System.out.println("\nStudent List:");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + ". " + student.getValue());
            }
        }
}
