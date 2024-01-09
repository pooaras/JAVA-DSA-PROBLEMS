import java.util.*;
public class Setinjava {

    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,2,3,4};
        for(int e:a){
            System.out.print(e);
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int e:a){
            al.add(e);
        }
        Set<Integer> s=new HashSet<>(al);
        System.out.println(s);

    }
    
}

// In Java, a Set is a collection that does not allow duplicate elements. Here are some common functions and operations you can perform with a Set:

// Create a Set:
// Set<String> set = new HashSet<>(); // or use TreeSet or LinkedHashSet

// Add Elements:

// set.add("Element1");
// set.add("Element2");
// set.add("Element3");

// Remove Elements:

// set.remove("Element2");

// Check if an Element is Present:

// boolean containsElement = set.contains("Element1");

// Iterate Over Elements:

// for (String element : set) {
//     System.out.println(element);
// }
// Get the Size of the Set:

// int size = set.size();

// Clear the Set:

// set.clear();

// Check if Set is Empty:

// boolean isEmpty = set.isEmpty();

// Convert Set to Array:

// String[] array = set.toArray(new String[0]);
// Convert Set to List:


// List<String> list = new ArrayList<>(set);
// Union of Sets:


// Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C"));
// Set<String> set2 = new HashSet<>(Arrays.asList("B", "C", "D"));

// Set<String> unionSet = new HashSet<>(set1);
// unionSet.addAll(set2);
// Intersection of Sets:


// Set<String> intersectionSet = new HashSet<>(set1);
// intersectionSet.retainAll(set2);
// Difference of Sets:


// Set<String> differenceSet = new HashSet<>(set1);
// differenceSet.removeAll(set2);