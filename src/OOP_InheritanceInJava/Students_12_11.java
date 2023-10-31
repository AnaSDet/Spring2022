package OOP_InheritanceInJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Students_12_11 {
    public static void main(String[] args) {
        Students students = new Students("2000");
        students.addStudent("Alice");
        students.addStudent("Bob");

        // To print each student separately
        List<String> studentList = students.getStudentList();
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("Student " + (i + 1) + ": " + studentList.get(i));
        }

        students.addMarks("Math", 90);
        students.addMarks("Science", 85);
        students.addMarks("English", 92);

        Map<String, Integer> studentMarks = students.getMarks();
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Retrieving year of birth
        String yearOfBirth = students.getYearOfBirth();
        System.out.println("Year of Birth: " + yearOfBirth);
    }
}

class Students {
    private String yearOfBirth;
    private List<String> studentList;
    private Map<String, Integer> marks;

    public Students(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        this.studentList = new ArrayList<>();
        this.marks = new HashMap<>();
    }

    public void addStudent(String studentName) {
        studentList.add(studentName);
    }

    public List<String> getStudentList() {
        return studentList;
    }

    public void addMarks(String subject, int marksObtained) {
        marks.put(subject, marksObtained);
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }
}


