package Model;

import java.util.List;

import Controller.iGetModel;

public class Model  implements iGetModel{
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudent() {
        return students;
    }

    /** удаление студента */
    @Override
    public boolean deleteStudent(long studentID) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID() == studentID) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }
    /** добавление студента */
    @Override
    public void addStudentToRepo(Student student) {
        students.add(student);
    
    }
}
