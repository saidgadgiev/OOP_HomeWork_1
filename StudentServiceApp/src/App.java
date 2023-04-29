/**
  * ДЗ Гаджиев Саид
  */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Controllers.EmploeeController;
import StudentDomen.*;
import TeacherService.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Сергей", "Иванов", 20, (long) 401);
        Student s2 = new Student("Андрей", "Сидоров", 22, (long) 111);
        Student s3 = new Student("Иван", "Петров", 18, (long) 121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long) 301);
        Student s5 = new Student("Даша", "Цветкова", 23, (long) 171);
        Student s6 = new Student("Лена", "Незабудкина", 23, (long) 104);
        Student s7 = new Student("Николай", "Иванов", 21, (long) 102);
        Student s8 = new Student("Александр", "Сидоров", 19, (long) 110);
        Student s9 = new Student("Распутин", "Петров", 22, (long) 122);
        Student s10 = new Student("Аня", "Иванова", 18, (long) 321);
        Student s11 = new Student("Вдова", "Черная", 23, (long) 131);
        Student s12 = new Student("Шварц", "Негер", 23, (long) 100);

        /** Добавление учителей */
        Teacher t1 = new Teacher("Татьяна", "Николаевна", 35, 1, "Географ");
        Teacher t2 = new Teacher("Вера", "Павловна", 43, 2, "Математика");
        Teacher t3 = new Teacher("Федер", "Нипколаевич", 51, 3, "Физика");
        Teacher t4 = new Teacher("Меджид", "Шахбанович", 49, 4, "Химия");

        /** Добавление учителей в список*/
        List<Teacher> listTeach = new ArrayList<Teacher>();
        listTeach.add(t1);
        listTeach.add(t2);
        listTeach.add(t3);
        listTeach.add(t4);
        /** Студенческие группы */
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s8);

        List<Student> listStud2 = new ArrayList<Student>();
        listStud1.add(s5);
        listStud1.add(s9);
        listStud1.add(s4);
        listStud1.add(s10);
        listStud1.add(s12);

        List<Student> listStud3 = new ArrayList<Student>();
        listStud1.add(s6);
        listStud1.add(s7);
        listStud1.add(s11);


        StudentGroup group1 = new StudentGroup(listStud1, (long) 1);
        StudentGroup group2 = new StudentGroup(listStud2, (long) 2);
        StudentGroup group3 = new StudentGroup(listStud3, (long) 3);

        List<StudentGroup> listSteam = new ArrayList<StudentGroup>();
        listSteam.add(group1);
        listSteam.add(group2);
        listSteam.add(group3);
        StudentSteam flow = new StudentSteam(listSteam);

//        for (StudentGroup group : flow) {
//            System.out.println("");
//            System.out.println("Group:" + group.getGroupID());
//            for (Student stud : group) {
//                System.out.println(stud);
//            }
//        }
//
//        System.out.println("============= после сортировки =============");
//        Collections.sort(flow.getSteam());
//
//        for (StudentGroup group : flow) {
//            Collections.sort(group.getStudents());
//        }
//        for (StudentGroup group : flow) {
//            System.out.println("");
//            System.out.println("Group:" + group.getGroupID());
//            for (Student stud : group) {
//                System.out.println(stud);
//            }
//        }

        /** Семинар 4 */
//        Emploee peron1 = new Emploee("Иванов", "Олег", 55, 110);
//        Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
//
//        //EmploeeController contrEmp = new EmploeeController();
//        EmploeeController.paySalary(peron1);
//        //contrEmp.paySalary(s1);
//
//        Integer studHour[] = {124,234,231,1,45};
//        System.out.println(EmploeeController.mean(studHour));
//
//        Double emplSalary[] = {12555.23,34213.5,10000.0};
//        System.out.println(EmploeeController.mean(emplSalary));

        System.out.println("Дамашнее задание\n");
        System.out.println("Список учителей\n");
        for (Teacher teach : listTeach) {
            System.out.println(teach);
        }
        /** Вывод среднего возвраста учителей */
        AverageAge.getAverageAge(listTeach);

        System.out.println("Список студентов\n");
        for (Student stud : listStud1) {
            System.out.println(stud);
        }
        /** Вывод среднего возвраста студентов */
        AverageAge.getAverageAge(listStud1);

    }

}
