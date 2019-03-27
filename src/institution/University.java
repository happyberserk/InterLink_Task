package src.institution;


import src.person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {
    String name;
    List<Student> studentList = new ArrayList<>();
    public University(String name) {
        this.name = name;
    }

    public String getStudents() {
        String names = "";
        for (Student student: studentList ) {
        names += student.name;
        names += "\n";
        }
        return names;
    }

    public void addStudent(Student student) {
        addStudent(student);
    }
}
