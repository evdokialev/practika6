public class Student implements Comparable<Student>{
    private String name;
    private final float gpa;


    public Student(float gpa, String name)
    {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName()
    {
        return name;
    }

    public float getGpa()
    {
        return gpa;
    }

    @Override
    public int compareTo(Student o)
    {
        return (int) (this.gpa - o.getGpa());
    }
}

