package Array;
	import java.util.ArrayList;

	public class ArrayListExample {
	    public static void main(String[] args) {
	        // Create an ArrayList of Strings
	        ArrayList<String> arrayList = new ArrayList<>();

	        // Add elements to the ArrayList
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Cherry");
	        arrayList.add("Date");

	        // Display the ArrayList before removing elements
	        System.out.println("ArrayList before removing elements: " + arrayList);

	        // Remove all elements from the ArrayList
	        arrayList.clear();

	        // Display the ArrayList after removing elements
	        System.out.println("ArrayList after removing elements: " + arrayList);
	    }
	}
	


