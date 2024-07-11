package generics;

import java.util.ArrayList;
import java.util.List;

public class StudentList<T extends Student> {

    private List<T> students = new ArrayList<>();

    public StudentList() {
    }

    public StudentList(List<T> students) {
        this.students = students;
    }

    void addStudent(T student) {
        students.add(student);
    }

    void removeStudent(T student) {
        students.remove(student);
    }

    T getHighestGpaStudent() {
        double max = Double.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < students.size(); i++) {
            if (max < students.get(i).getGpa()) {
                max = students.get(i).getGpa();
                index = i;
            }

        }
        return students.get(index);
    }

    public void sortByLastName() {
        for (int i = 0; i < students.size() - 1; i++) { // чтобы не выйти за рамки коллекции
            for (int j = i + 1; j < students.size(); j++) { // предпоследний элемент в коллекции сравнивается с последним (j)
                T st1 = students.get(i); // сохраняем в объект st1 студента по индексу i
                T st2 = students.get(j); // сохраняем в объект st1 студента по индексу j
                if (students.get(i).getLastName().compareTo(students.get(j).getLastName()) > 0) { // сравнение студентов по фамилии по алфавиту
                    students.set(i, st2); // если у студента с индексом i фамилия по алфавиту идет раньше, то он установится по индексу j
                    students.set(j, st1); // если у студента с индексом j фамилия по алфавиту будет позже, то он установится по индексу i
                }
            }
        }

        students.forEach(System.out::println); // вывод в одну строчку циклом foreach
    }


    List<T> getStudents() {
        return students;
    }

    void swap(int index1, int index2) {
        T temp = students.get(index1);
        students.set(index1, students.get(index2));
        students.set(index2, temp);
    }
}

