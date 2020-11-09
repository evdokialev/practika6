import java.util.Comparator;

public class Sorting implements Comparator<Student1>{
    @Override
    public int compare(Student1 o1, Student1 o2)
    {
        return Float.compare(o1.getId(), o2.getId());
    }
}