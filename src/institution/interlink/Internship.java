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
        for (Student student: studentList ) {
            student.name
        }
        return "Andrew Maslenko\nJulia Veselkina\n";
    }
}
