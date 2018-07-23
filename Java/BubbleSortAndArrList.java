
import java.util.*;

public class BubbleSortAndArrList {
public static void main(String args[]) {
		int[] a= new int[10];
		Random r = new Random();
		for (int i =0;i<10;i++) {
		a[i]=r.nextInt(10);
		//System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
		int tmp;
		for (int i =0;i<a.length;i++) {
			for (int j =a.length-1;j>i;j--) {			
			if (a[j-1] > a[j]) {
				tmp = a[j-1];
				a[j-1]=a[j];
				a[j]=tmp;
			}}	}
		System.out.println(Arrays.toString(a));	
		//ArrList Sort
		ArrayList<Integer> arr = new ArrayList(10);
		for (int i =0;i<10; i++) {
		arr.add(r.nextInt(20));}
		System.out.println();
		System.out.println("UnSort arr: "+arr);
		Collections.sort(arr);
		System.out.println("Sorted arr: "+arr);
	}
}
