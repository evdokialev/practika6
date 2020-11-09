public class Student3 implements Comparable<Student3>{
    private String name;
    private int id;


    public Student3(int id, String name)
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
    public int compareTo(Student3 o)
    {
        return (int) (this.id - o.getId());
    }
}