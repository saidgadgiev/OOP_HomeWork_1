package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;
/** Это класс-модель, который представляет собой хранилище 
 * для объектов студентов. Он содержит приватное поле 
 * HashMap<Long, Student>, которое используется для 
 * хранения объектов Student, ключом для которых является 
 * их id */
public class ModelHashMap implements iGetModel{
    private HashMap<Long, Student> studentMap;
    public ModelHashMap(HashMap<Long, Student> studentMap) {
        this.studentMap = studentMap;
    }
   
    /** извлекает все значения из 
     * HashMap studentMap и помещает их в новый список 
     * типа List, который затем возвращается. */

    public List<Student> getAllStudent() {
        List<Student> studentList = new ArrayList<Student>(studentMap.values());
        return studentList;
    }

    @Override
    public boolean deleteStudent(long studentID) {
        // Находим студента в HashMap по его id
        Student student = studentMap.get(studentID);
        if (student != null) {
            studentMap.remove(studentID);
            return true;
        }
        return false;
    }
    // добавляем студента в HashMap, используя его id в качестве ключа
    @Override
    public void addStudentToRepo(Student student) {
    studentMap.put(student.getStudentID(), student);        
    }

}
