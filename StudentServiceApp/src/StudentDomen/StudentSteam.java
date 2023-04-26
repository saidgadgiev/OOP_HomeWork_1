/**
 * Класс добавление и полученте списка групп в потоке
 */

package StudentDomen;

import java.util.Iterator;
import java.util.List;
/**
 * Класс поток студентов
 * @param steam список потока
 */
public class StudentSteam implements Iterable<StudentGroup>{
    private List<StudentGroup> steam;
    public StudentSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }
    /** 
     * получение списка групп в потоке
     */
    public List<StudentGroup> getSteam() {
        return steam;
    }

    /**
     * установка списка групп
     */
    public void srtSteam(List<StudentGroup> steam) {
        this.steam = steam;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < steam.size();
            }

            @Override
            public StudentGroup next() {
                
                if (!hasNext()) {
                    return null;
                }
                return steam.get(index++);
            }   
        };
    }    
}

