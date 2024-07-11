package hashMap;

import javax.lang.model.element.Name;
import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    private Map<String, Integer> grades = new HashMap<>();

    void addStudent(String name, int grade){
        grades.put(name, grade);
    }
    void printStudentsAboveGrade(int threshold){
        return;
    }
}
