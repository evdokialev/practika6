public class Student1 implements Comparable<Student1>{
    private String name;
    private int id;


    public Student1(int id, String name)
    {
        this.name = name;
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    @Override
    public int compareTo(Student1 o)
    {
        return (int) (this.id - o.getId());
    }
}