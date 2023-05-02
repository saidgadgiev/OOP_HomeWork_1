package Controller;

import java.util.List;

import Model.Student;

public interface iGetModel {
    public List<Student> getAllStudent();
    void addStudentToRepo(Student student);
    boolean deleteStudent(long studentID); 
}
