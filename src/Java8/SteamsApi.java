package Java8;

import java.rmi.Remote;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SteamsApi {

    public static void main(String[] args) throws CloneNotSupportedException {
        Stream<String> str1 = Stream.of("ab","bc","de");

        Collection<String> col = Arrays.asList("as","bc");
        Stream<String> str2 = col.stream();

        //COnsumer only
        str2.forEach(System.out::println);

        for(String str : col) {

        }

        //Parallel stream TODO
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"sujnan",88.5));
        list.add(new Student(3,"zebra",90));
        list.add(new Student(0,"anil",70));

        list.stream().sorted(Comparator.comparing(Student::getId)).forEach(System.out::println);
        list.stream().sorted(Comparator.comparing(Student::getId).reversed()).forEach(System.out::println);

        List<String> list2 = Arrays.asList("abc","def","a");
        list2.stream().sorted().forEach(System.out::println);
        Collections.sort(list2,Comparator.comparingInt(String::length));
        list2.stream().skip(1).findFirst().ifPresent(System.out::println);

        Map<Integer, Integer> map = new HashMap<>();
        Set<Map.Entry<Integer,Integer>> entry = map.entrySet();
        entry.stream().map(a->a.getKey());
        map.forEach((k,v)->{
                    System.out.println(k);
                    System.out.println(v);
                });

//      predictae bipred
        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()){};

        list2.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        /*

// Convert elements to strings and concatenate them, separated by commas
        String joined = things.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", "));

// Compute sum of salaries of employee
        int total = employees.stream()
                .collect(Collectors.summingInt(Employee::getSalary));

// Group employees by department
        Map<Department, List<Employee>> byDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

// Compute sum of salaries by department
        Map<Department, Integer> totalByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.summingInt(Employee::getSalary)));

// Partition students into passing and failing
        Map<Boolean, List<Student>> passingFailing = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getGrade() >= PASS_THRESHOLD));
        Since:
        1.8*/

        List<Integer> intt =list.stream().map(Student::getId).collect(Collectors.toList());

        list.stream().collect(Collectors.toMap(e->e.getId(), e->e, (e1,e2)->e2));
        list.stream().map(Student::getName).collect(Collectors.toCollection(HashSet::new));
        list.stream().map(Student::getMarks).reduce(0.0, (a, b)->a+b);
        list.stream().map(Student::getMarks).mapToDouble(Double::doubleValue).sum();
        //DoubleStream.of(list.stream().map(Student::getMarks).mapToDouble(Double::doubleValue)).sum();
        list.stream().collect(Collectors.summingDouble(Student::getMarks));
        Student stt = new Student();
        Student stt2 = (Student) stt.clone();


    }
}
