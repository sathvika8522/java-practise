package DataStructures;
import java.util.*;
public class arrayClassDemo {
    public static void main(String[] args) {
		int arr[]=new int[10];
		for(int i=0;i<10;i++)
			arr[i]=10*i;

		System.out.println("Initial array : ");
		display(arr);

		Arrays.fill(arr,2,6,-400);
		System.out.println("After filling " );
		display(arr);

		Arrays.sort(arr);
		System.out.println("After sorting : ");
		display(arr);

		int ind=Arrays.binarySearch(arr,10);
		System.out.println("the index of element 10 : " +ind);
	}
  
  static void display(int array[]) {
	   for(int i :array) 
			System.out.print(" " + i);
	   System.out.println();
  }
}
