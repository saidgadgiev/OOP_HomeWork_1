package TeacherService;

import Controllers.iUserController;
import StudentDomen.Teacher;

public class TeacherController implements iUserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();

    @Override
    public void create(String firstName, String secondName, int age) {
        teacherService.create(firstName, secondName, age);
    }
}
