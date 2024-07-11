package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class University {

    Scanner in = new Scanner(System.in);
    private HashMap<String, Integer> studentList = new HashMap<>();

    public HashMap<String, Integer> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.put(student.getName(), student.getGrade());

    }
}

