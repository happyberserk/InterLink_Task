package src.institution.interlink;

import src.person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship {
    String name;
    List<Student> studentList = new ArrayList<>();


    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        studentList.add(student);
    }

    public String getStudents() {
        String names = "";
        for (Student student: studentList ) {
            names += student.name;
            names += "\n";
            // // This task was a little bit hard for me so I have skipped it.
        }
        return names;
    }
}
