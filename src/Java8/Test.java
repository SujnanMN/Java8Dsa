package Java8;

import java.util.HashSet;

public class Test {

    public static void main(String[] args) {
        Student st = new Student(1, "ss",0);
        Student st2 = new Student(1, "ss",0);
        HashSet<Student> set = new HashSet<>();
        set.add(st);
        set.add(st2);
        System.out.println(set);
    }
}
