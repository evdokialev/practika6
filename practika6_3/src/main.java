import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.print("Введите количество студентов в первом списке: ");
        Scanner in = new Scanner(System.in);
        Student3[] students1 = new Student3[in.nextInt()];
        for (int i = 0; i < students1.length; ++i) {
            System.out.print("Введите id и имя студента №" + (i + 1) + ": ");
            students1[i] = new Student3(in.nextInt(), in.next());
        }

        System.out.print("Введите количество студентов во втором списке: ");
        Student3[] students2 = new Student3[in.nextInt()];
        for (int i = 0; i < students2.length; ++i) {
            System.out.print("Введите id и имя студента №" + (i + 1) + ": ");
            students2[i] = new Student3(in.nextInt(), in.next());
        }

        Student3[] students3 = new Student3[students1.length+students2.length];

        System.out.print('\n');
        Sorting comp = new Sorting();
        for (int i=0; i<students1.length;i++){
            students3[i]=students1[i];
        }
        for (int i=0; i<students2.length;i++){
            students3[i+students1.length]=students2[i];
        }
        MergeSort.MergeSort(students3, comp, 0,students3.length-1);
        for (Student3 student : students3)
            System.out.print(student.getId() + " " + student.getName() + "; ");

    }
}