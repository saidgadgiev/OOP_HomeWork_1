package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// import Model.ModelHashMap;
import Model.Student;
// import View.View;

public class Controller {
    private List<Student> students;
    private iGetView view;
    private iGetModel model;
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
    }
    
    //1 этап Получили данные и положили внутрь нашего контроллера
    public void getAllStudent() {
        students = model.getAllStudent();
    }

    // 2 Этап тест проверка
    public boolean testData() {
        if (students.size() > 0) {
            return true;
        }
        else {
            return false;
        }
    }


    public void updateView() {
        // MVP
        getAllStudent(); // получаем данные от модели
        if (testData()) { //тестируем
            view.printAllStudent(students); // отдаем данные
        }
        else {
            System.out.println("Список студентов пуст!");
        }
        

        
        // MVC
        // view.printAllStudent(model.getAllStudent());
    }


    public void run() {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration) {
            System.out.println("LIST\nDELETE\nEXIT");
            String command = view.prompt("Введите команду: ");
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                getNewIteration = false;
                System.out.println("Выход из программы!");
                break;
                case LIST:
                // getAllStudent();
                updateView();
                break;
                /** кайс для удаления студента */
                case DELETE:
                System.out.println("Введите номер студента для удаления: ");
                Scanner num = new Scanner(System.in);
                Long studentId = num.nextLong();
                boolean result = model.deleteStudent(studentId);
                if (result) {
                    System.out.println("Студент успешно удален");
                    break;
                }
                System.out.println("Студент с таким номерам не найден");
                break;
            }
        }
    }

    /** Меню на английском */
    public void runEngl() {
        
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration) {
            System.out.println("LIST\nDELETE\nEXIT");
            String command = view.prompt("Enter the command: ");
            com = Commands.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                getNewIteration = false;
                System.out.println("Exit the program!");
                break;
                case LIST:
                // getAllStudent();
                updateView();
                break;
                /** кайс для удаления студента */
                case DELETE: 
                System.out.println("Enter the student's number to delete: ");
                Scanner num = new Scanner(System.in); 
                Long studentId = num.nextLong(); // ввод номера ID для удаления
                boolean result = model.deleteStudent(studentId); // получение об успешности удаления
                if (result) {
                    System.out.println("Student successfully removed"); // успешно удален
                    break;
                }
                System.out.println("A student with this number was not found"); // ID если не найден
                break;
            }
        }
    }
}
