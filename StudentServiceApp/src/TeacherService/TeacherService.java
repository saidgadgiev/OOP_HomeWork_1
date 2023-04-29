package TeacherService;
/**
 * Храниться весь список eучителей
 */

import StudentDomen.Teacher;
import StudentDomen.UserComparator;
import StudentService.iUserService;
import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iUserService<Teacher> {
    /** номер учителей */
    private int count;
    /** список учителей*/
    private List<Teacher> teachers;
    /** Контстуркот  списка*/
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }
    /** Получение всех учителей */
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher per = new Teacher(firstName, secondName, age, this.count, "");
        count++;
        teachers.add(per);
    }
    /**   отсортированного обобщенным классом UserComparator */
    public List<Teacher> getSortedTeacher(int age) {
        teachers = new ArrayList<>(teachers.get(age).getAge());
        teachers.sort(new UserComparator<>());
        return teachers;
    }

}
