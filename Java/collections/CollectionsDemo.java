package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionsDemo {

    class InternEmailComparator implements Comparator<Intern> {

        @Override
        public int compare(Intern o1, Intern o2) {
            return o1.getEmail().compareTo(o2.getEmail());
        }
    }

    public static void main(String[] args) {

        CollectionsDemo collectionsDemo = new CollectionsDemo();
        collectionsDemo.internsArrayList();
    }

    public void internsArrayList() {
        List<Intern> internsList = new ArrayList<>();

        internsList.add(new Intern(900345, "Arun Kumar", "arun.kumar"));
        internsList.add(new Intern(900129, "Rahul pramanik", "pramanik.rahul2"));
        internsList.add(new Intern(895015, "Krishna", "krishna.01"));

        System.out.println("\n Before sorting..");
        for (Intern intern : internsList) {
            System.out.println(intern);
        }

        System.out.println("\n After sorting using empID..");
        Collections.sort(internsList);
        for (Intern intern : internsList) {
            System.out.println(intern);
        }

        System.out.println("\n After sorting using email..");
        Collections.sort(internsList, new InternEmailComparator());
        for (Intern intern : internsList) {
            System.out.println(intern);
        }

        System.out.println("\n After sorting using name..");
        Collections.sort(internsList, new Comparator<Intern>() {
            @Override
            public int compare(Intern o1, Intern o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Intern intern : internsList) {
            System.out.println(intern);
        }

        // Using lamdas and Streams
        System.out.println("\n After sorting using name by Lambda Expression..");
        internsList.sort((Intern i1, Intern i2) -> i1.getName().compareTo(i2.getName()));
        internsList.forEach(System.out::println);
    }

    public void sortArrayList() {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(9, 3, 1, 6, 7, 4, 0, 2, 3));

        System.out.println("\nBefore sorting..");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        Collections.sort(numbers);

        System.out.println("\nfter sorting..");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public void createHashSet() {
        Set<String> names = new HashSet<>();

        names.add("Ashish"); // 0
        names.add("Rahul"); // 1
        names.add("Ashish"); // 0
        names.add("Rahul"); // 1

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
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
        // System.out.println(name);
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

class Intern implements Comparable<Intern> {

    private Integer empId;
    private String name;
    private String email;

    public Intern() {
    }

    public Intern(Integer empId, String name, String email) {
        this.empId = empId;
        this.name = name;
        this.email = email;
    }

    public Integer getEmpId() {
        return this.empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Intern o) {
        return this.getEmpId().compareTo(o.getEmpId());
    }

    @Override
    public String toString() {
        return "{" + " empId='" + getEmpId() + "'" + ", name='" + getName() + "'" + ", email='" + getEmail() + "'"
                + "}";
    }

}
