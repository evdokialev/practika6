import java.util.Scanner;

class Number_2 {
    public static void main(String[] args) {
        System.out.print("Введите количество студентов: ");
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[in.nextInt()];
        for (int i = 0; i < students.length; ++i) {
            System.out.print("Введите GPA и имя студента №" + (i + 1) + ": ");
            students[i] = new Student(in.nextFloat(), in.next());
        }
        for (Student student : students)
            System.out.print(student.getGpa() + " " + student.getName() + "; ");
        System.out.print('\n');
        SortingStudentsByGPA comp = new SortingStudentsByGPA();
        QuickSort.quickSort(students, comp, 0, students.length - 1);
        for (Student student : students)
            System.out.print(student.getGpa() + " " + student.getName() + "; ");
    }
}
