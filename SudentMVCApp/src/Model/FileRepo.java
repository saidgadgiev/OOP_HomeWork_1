package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

public class FileRepo implements iGetModel{
    private String fileName;
    private List<Student> students;
    public FileRepo(String fileName) {
        this.fileName = fileName;
        this.students = new ArrayList<>();
        try (FileWriter fw = new FileWriter(fileName, true)){ // попытаеться открыть файл
            fw.flush(); // если получиться то сразу закроет
        } catch (Exception e) { // если ошибка 
            System.out.println(e.getMessage()); // то выведит ошибку
        }
    }
    // метод  заполнения хранилиша
    public void addSudent (Student student) {
        this.students.add(student);
    }

    // метод  чтения из хранилиша
    public void readAllStudentsFromFile() {
        try {
            File file = new File(fileName); // создаем объект файл
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr); 
            String line = reader.readLine();
            while (line != null) {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Long.parseLong(param[3]));
                students.add(pers);
                line = reader.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage()); // то выведит ошибку
        }
    } 
    public void saveAllStudentToFile() { // сохранение
        try (FileWriter fw = new FileWriter(fileName, true)){ // попытаеться открыть файл
            for(Student pers : students) {
                fw.write(pers.getFirstName()+" "+
                    pers.getSecondName()+" "+
                    pers.getAge()+" "+
                    pers.getStudentID());
                fw.append("\n");
            }
            fw.flush(); // если получиться то сразу закроет
        } catch (Exception e) { // если ошибка 
            System.out.println(e.getMessage()); // то выведит ошибку
        }
    }
    @Override
    public List<Student> getAllStudent() {
        readAllStudentsFromFile();
        return students;
    }
    @Override
    public boolean deleteStudent(long studentID) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID() == studentID) {
                students.remove(i);
                saveAllStudentToFile();
                return true;
            }
        }
        return false;
        
    }
    @Override
    public void addStudentToRepo(Student student) {
        students.add(student);
        saveAllStudentToFile();
    }
    
}
