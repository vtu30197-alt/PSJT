import java.util.*;
class Student {
    int id;
    String name;
    double cgpa;
    Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}
class StudentComparator implements Comparator<Student> {
    public int compare(Student a, Student b) {
        int c = Double.compare(b.cgpa, a.cgpa);
        if (c != 0) return c;
        c = a.name.compareTo(b.name);
        if (c != 0) return c;
        return Integer.compare(a.id, b.id);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] s = new Student[n];
        for (int i = 0; i < n; i++)
            s[i] = new Student(sc.nextInt(), sc.next(), sc.nextDouble());
        Arrays.sort(s, new StudentComparator());
        for (Student x : s)
            System.out.println(x.name);
    }
}
