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

    public void setStudent(Student student){
        if (student.knowledge.level > 2) {

                System.out.println("Accept, student");
                    studentList.add(student);
            } else{
                System.out.println("Sorry, you level is low");
            }
        }


    public String getStudents() {
        String names = "";
        for (Student student: studentList ) {
            names += student.name;
            names += "\n";
        }
        return names;
    }
}
