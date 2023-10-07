package Array;
	import java.util.ArrayList;
	import java.util.List;

	public class ListToArrayExample {
	    public static void main(String[] args) {
	        // Create a list
	        List<Integer> myList = new ArrayList<>();
	        myList.add(1);
	        myList.add(2);
	        myList.add(3);
	        myList.add(4);
	        myList.add(5);

	        // Convert the list to an array
	        Integer[] myArray = myList.toArray(new Integer[myList.size()]);

	        // Print the list and the array
	        System.out.println("List:");
	        System.out.println(myList);
	        System.out.println("\nArray:");
	        for (Integer item : myArray) {
	            System.out.print(item + " ");
	        }
	    }
	}


