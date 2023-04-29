package StudentDomen;
/**
 * Класс учитель с добаклением интерфейса для сравнения учителей
 */
public class Teacher extends User {
    /**
     * конструктор класса
     *
     * @param firstName  имя
     * @param secondName фамилия
     * @param age        возраст
     * @param teacerId  идентификационный номер
     *
     */
    private long teacherId;
    private String academicDegree;

    public Teacher(String firstName, String secondName, int age, long teacherId, String academicDegree ) {
        super(firstName, secondName, age);
        this.teacherId = teacherId;
        this.academicDegree = academicDegree;
    }
    /**
     * получение  номера
     */
    public long getTeacherId() {
        return teacherId;
    }
    /**
     *  установка  номера
     */
    public void setTeacherId(int teacerId) {
        this.teacherId = teacerId;
    }
    /**
     * получение  степени
     */
    public String getAcademicDegree() {
        return academicDegree;
    }
    /**
     *  установка  степени
     */
    public void getAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    @Override
    public String toString() {
        return "Учитель {"

                + "Имя = " + super.getFirstName()
                + ", Фамилия = " + super.getSecondName()
                + ", Возвраст = " + super.getAge() +
                ", ID номер учителя = " + teacherId +
                '}';
    }


    /**
     *  сравнения двух учителей
     */
//    @Override
//    public int compareTo(Teacher o) {
//        if (super.getAge() == o.getAge()) {
//            if (this.teacerId == o.teacerId) {
//                return 0;
//            }
//            if (this.teacerId < o.teacerId) {
//                return -1;
//            }
//            return 1;
//        }
//        if (super.getAge() < o.getAge()) {
//            return -1;
//        }
//        return 1;
//    }

}
