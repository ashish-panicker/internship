package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {

    public static void main(String[] args) {

        CollectionsDemo collectionsDemo;

        collectionsDemo = new CollectionsDemo();
        collectionsDemo.createHashSet();
        collectionsDemo.createArrayList();
    }

    public void createHashSet(){
        Set<String> names = new HashSet<>();

        names.add("Ashish"); // 0
        names.add("Rahul"); // 1
        names.add("Ashish"); // 0
        names.add("Rahul"); // 1

        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void createArrayList() {
        List<String> names = new ArrayList<>();
        names.add("Ashish"); // 0
        names.add("Rahul"); // 1
        names.add("Ashish"); // 0
        names.add("Rahul"); // 1

        System.out.println("\n\n================ArrayList=================");
        for (String name : names) {
            System.out.println(name);
        }

        // names.forEach(System.out::println);

        // System.out.println(names.contains("Arun"));

        // names.remove(1);

        // System.out.println("\n\n================ArrayList=================");
        // for (String name : names) {
        //     System.out.println(name);
        // }
    }

    public void createLinkedList() {
        List<String> names = new LinkedList<>();
        names.add("Ashish");
        names.add("Rahul");

        System.out.println("\n\n================LinkedList=================");
        for (String name : names) {
            System.out.println(name);
        }
    }

}

