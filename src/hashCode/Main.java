package hashCode;

import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {

        Test t = new Test();
        Test t2 = new Test();
        Object ii=new Object();
        Object iii=new Object();
        System.out.println(t.equals(t2));
        System.out.println(t.hashCode());
        System.out.println(ii.hashCode()+" "+iii.hashCode());

        int[] arrrr = {2,3};
        int[] arrrrr = {3,2};

        String dtr = new String("java");
        String dtt = "java";
        System.out.println(dtr.hashCode()==dtt.hashCode());
        System.out.println(arrrr.hashCode());
        System.out.println(arrrrr.hashCode());
        System.out.println(Arrays.hashCode(arrrr));
        System.out.println(Arrays.hashCode(arrrrr));
        System.out.println(Arrays.equals(arrrrr, arrrr));

        Integer x=2000;
        Integer y=2000;

        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Name: " + System.getProperty("java.runtime.name"));
        System.out.println("Java Home: " + System.getProperty("java.home"));


        System.out.println(x==2000);

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(10);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(10);
        list2.add(5);
        System.out.println(list.hashCode());
        System.out.println(list2.hashCode());
        System.out.println(list.equals(list2));


        Test[] testArray = {new Test(2),new Test(2)};
        Test[] testArray2 = {new Test(2),new Test(2)};
        System.out.println(Arrays.hashCode(testArray));
        System.out.println(Arrays.hashCode(testArray2));
        System.out.println(Arrays.equals(testArray2, testArray));

        Set<Test> set = new HashSet<>();
        set.add(new Test(3));
        //set.add(5);
        Set<Test> set2 = new HashSet<>();
        set2.add(new Test(3));
        //set2.add("b");
        System.out.println(set.hashCode());
        System.out.println(set2.hashCode());
        System.out.println(set.equals(set2));

        Map<Integer, Integer> map = new HashMap<>();
        map.put(9, 1);
        map.put(5, 1);
        Map<Integer, Integer> map2 = new HashMap<>();
        map2.put(1, 1);
        map2.put(5, 9);
        System.out.println(map.hashCode());
        System.out.println(map2.hashCode());
        System.out.println(map.equals(map2));
        //list
        System.out.println(1000^(1000>>>16));
        //0001
        //0010
        //re = 0011


    }

}

class Test {
    private int id;
    private String name;
    public Test(int id, String name){
        this.id=id;
        this.name = name;
    }
    public Test(){

    }

    public Test(int id){
        this.id=id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj ==null  || getClass() != obj.getClass())
            return false;

        Test us = (Test) obj;
        return  id == us.id && name ==us.name;

    }


}

