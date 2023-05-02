import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileRepo;
// import Model.Model;
import Model.Student;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) {
        /** Создание студентов и добавление в список */
        List<Student> students = new ArrayList<Student>();
        // Student s1 = new Student("Сергей", "Иванов", 21, (long)101);
        // Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        // Student s3 = new Student("Иван", "Петров", 22, (long)121);
        // Student s4 = new Student("Игорь", "Иванов", 24, (long)301);
        // Student s5 = new Student("Даша", "Цветкова", 25, (long)171);
        // Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);
        // students.add(s1);
        // students.add(s2);
        // students.add(s3);
        // students.add(s4);
        // students.add(s5);
        // students.add(s6);

        /** Запись и чтение и файла */
        FileRepo fileRepo = new FileRepo("StudentDb.txt");
        // for(Student pers : students) {
        //     fileRepo.addSudent(pers);
        // }
        // fileRepo.saveAllStudentToFile();

        // iGetModel model = new Model(students);
        iGetModel modeFileRepo = fileRepo;

        iGetView viewEng = new ViewEng(); // На английском
        iGetView view = new View(); // На русском


        Scanner scan = new Scanner(System.in);
        System.out.println("Выбор языка интерфейса: \n1 - Russ \n2 - Engl");
        int num = scan.nextInt();
        if (num == 1) {
            Controller controller = new Controller(view, modeFileRepo);
            controller.run();
            
        }
        if (num == 2) {
            Controller controller = new Controller(viewEng, modeFileRepo);
            controller.runEngl();
        }



        

        // controller.updateView();
    }
}
