import java.util.Scanner;

public class main {
    public static void main(String[] args){
        System.out.print("Введите количество студентов: ");
        Scanner in = new Scanner(System.in);
        Student1[] students = new Student1[in.nextInt()];
        for (int i = 0; i < students.length; ++i){
            System.out.print("Введите id и имя студента №" + (i + 1) + ": ");
            students[i] = new Student1(in.nextInt(), in.next());
        }
        for (Student1 student : students)
            System.out.print(student.getId() + " " + student.getName() + "; ");
        System.out.print('\n');
        Sorting comp = new Sorting();
        MyInsertionSort.InsertionSort(students, comp);
        for (Student1 student : students)
            System.out.print(student.getId() + " " + student.getName() + "; ");
    }
}
