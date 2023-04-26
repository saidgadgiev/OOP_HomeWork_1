package StudentDomen;

/**
 * Класс Студент с добаклением интерфейса для сравнения студентов
 */
public class Student extends User implements Comparable<Student> {
    private long studentID;

    /**
     * конструктор класса
     * 
     * @param firstName  имя
     * @param secondName фамилия
     * @param age        возраст
     * @param studentID  идентификационный номер
     */
    public Student(String firstName, String secondName, int age, long studentID) {
        super(firstName, secondName, age);
        this.studentID = studentID;
    }

    /**
     * получение  номера студента 
     */
    public long getStudentID() {
        return studentID;
    }

    /**
     *  установка  номера студента 
     */
    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    /**
     *  перегрузка метода вывода 
     */
    @Override
    public String toString() {
        return "Студент {"

                + "Имя = " + super.getFirstName()
                + ", Фамилия = " + super.getSecondName()
                + ", Возвраст = " + super.getAge() +
                ", ID номер студента = " + studentID +
                '}';
    }

    /**
     *  сравнения двух студентов 
    */
    @Override
    public int compareTo(Student o) {
        if (super.getAge() == o.getAge()) {
            if (this.studentID == o.studentID) {
                return 0;
            }
            if (this.studentID < o.studentID) {
                return -1;
            }
            return 1;
        }
        if (super.getAge() < o.getAge()) {
            return -1;
        }
        return 1;
    }
}
