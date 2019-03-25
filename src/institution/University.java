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
        for (Student student: studentList ) {

        }
        return "Andrew Maslenko\nJulia Veselkina\n";
    }

    public void addStudent(Student student) {
        addStudent(student);
    }
}
