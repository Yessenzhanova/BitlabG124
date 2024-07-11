package clas;

import java.util.Arrays;

public class StudentHouse {
    String name;
    Student[] students = new Student[1000];
    int size = 0;

    public StudentHouse() {

    }

    public StudentHouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        if (size == students.length) {
            students = Arrays.copyOf(students, students.length * 2); // Увеличиваем размер массива вдвое
        }
        students[size] = student;
        size++;
    }

    public void deleteStudent(int i) {
        for (int j = 0; j < size; j++)
            students[i] = null;
    }
    public  Student theBestStudent() {
        if (size == 0) {
            return null; // Если список студентов пуст, вернуть null
        }

        Student bestStudent = students[0]; // Предполагаем, что первый студент лучший
        for (int i = 1; i < size; i++) {
            if (students[i] != null && students[i].getGpa() > bestStudent.getGpa()) {
                bestStudent = students[i]; // Если текущий студент имеет более высокий GPA, обновить лучшего студента
            }
        }
        return null;
    }
    public void printStudents() {
        for (int i = 0; i < size; i++) {
            if (students[i] != null)
                System.out.println(students[i]);
        }
        }
    }
