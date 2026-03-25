package com.practice.Student;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class studentService {
    List<students> studentsList= new ArrayList<>(Arrays.asList(new students(101,"Thaiseelan")));

    public List<students> getStudents() {
        return studentsList;
    }
    public students getStudentById(int StuId){
        return studentsList.stream()
                .filter(p->p.getStuId()==StuId)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Student not found"));

    }

    public void addStudents(students student) {
        studentsList.add(student);
    }

    public void updateStudent(students student) {
        for(int i=0;i<studentsList.size();i++){
            if(studentsList.get(i).getStuId()==student.getStuId()){
                studentsList.get(i).setStuName(student.getStuName());
                break;
            }
        }

    }

    public String deleteStudent(int StuId) {
        studentsList.removeIf(s->s.getStuId()==StuId);
        return "Deletion Success";
    }
}
