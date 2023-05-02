package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class ViewEng implements iGetView{
    /** Метод для отображения */
    public void printAllStudent(List<Student> students) {
        System.out.println("\n----- Output of the list of students -----\n");
        for (Student pers : students) {
            System.out.println(pers);
        }
        System.out.println("\n----- End of the list of students -----\n");
    }
    /** Метод выбора меню путем набора  */
    public String prompt(String message) {
        Scanner scan = new Scanner(System.in);
        System.out.println(message);
        return scan.nextLine();
    }
    
    
}
