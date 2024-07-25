
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {

    String nic;
    String name;

    Student(String nic1, String name1) {
        this.nic = nic1;
        this.name = name1;
    }
}

class C1 implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class C2 implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.valueOf(s1.nic).compareTo(Integer.valueOf(s2.nic));
    }
}

class TestDemo {

    public static void main(String[] args) {
        ArrayList<Student> a = new ArrayList<Student>();
        Student s1 = new Student("123", "Abc");
        Student s2 = new Student("456", "Def");
        a.add(s1);
        a.add(s2);
        Collections.sort(a, new C1());
        System.out.println(a);
        Collections.sort(a, new C2());
        System.out.println(a);
    }
}
