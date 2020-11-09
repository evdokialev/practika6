import java.util.Comparator;

public class Sorting implements Comparator<Student3>{
    @Override
    public int compare(Student3 o1, Student3 o2)
    {
        return Float.compare(o1.getId(), o2.getId());
    }
}