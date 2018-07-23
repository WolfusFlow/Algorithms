
import java.util.*;

public class QuickSort {	
public static void main(String args[]) {
	Random r=new Random();
	int[] a = new int[10];
	for (int i=0;i<10;i++) {
	a[i] = r.nextInt(10);	
	}	
	System.out.println("UnSorted Arr"+Arrays.toString(a));
	separation s = new separation();
	s.sort(a, 0, a.length-1);
	System.out.println("Sorted Arr");
	s.printArr(a);    //check it later if you understand this sorting correct
}
}
class separation{
	int partion(int arr[],int low, int high) {
		int base=arr[high];
		int i = (low-1);//index of smallest element
		for (int j=low;j<high;j++) {
			if (arr[j]<=base) {
				i++;
				int tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
			}
		}
		int tmp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=tmp;		
		return i+1;
	}
	void sort(int arr[], int low, int high) {
		if(low<high) {
			int pi =partion(arr,low,high); //pi - partition index
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
	}
	static void printArr(int arr[]) {		
			System.out.print(Arrays.toString(arr));		
	}	
}