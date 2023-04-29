import java.util.List;
import StudentDomen.User;

public class AverageAge<T extends User>  {
    /** подсчета среднего возраста универсальный */
    public static <T extends User> void getAverageAge(List<T> list) {
        int sum = 0;
        for (T user : list) {
            sum += user.getAge();
        }
        sum /= list.size();
        System.out.println("Средний возвраст: = " + sum + "\n");
    }
}
