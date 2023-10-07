package Array;
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap to store employee IDs and names
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

        // Add employee information to the TreeMap
        employeeMap.put(101, "Deepak");
        employeeMap.put(102, "Anitha");
        employeeMap.put(103, "Rino");
        employeeMap.put(104, "Messi");

        // Extract employee names and sort them alphabetically
        ArrayList<String> employeeNames = new ArrayList<>(employeeMap.values());
        Collections.sort(employeeNames);

        // Print out the names of all employees in alphabetical order
        System.out.println("Names of Employees in Alphabetical Order:");

        for (String name : employeeNames) {
            System.out.println(name);
        }
    }
}