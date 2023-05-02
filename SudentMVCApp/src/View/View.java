package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class View implements iGetView{
    // Метод для отображения студентов
    public void printAllStudent(List<Student> students) {
        System.out.println("-----Вывод списка студентов-----");
        for (Student person : students) {
        System.out.println(person);
        }
        System.out.println("-----Конец списка студентов-----");
    }

    public String prompt(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        return scan.nextLine();
    }
}
