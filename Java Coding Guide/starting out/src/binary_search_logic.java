
public class binary_search_logic {

	//Has to be in numerical order. Only works with numbers from 0 to infinity.
	//Binary search best case scenario:  O(n) = 1
	//Binary search Worst case scenario: O(n) = log(n)
	//Linear Search   algorithm = n
	//Fastest sorting algorithm = n*log(n)
	//Use linear search if you have to use a sorting algorithm to use binary search.
	public static int binary_search(int a[], int key) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if      (key < a[mid]) hi = mid - 1;
			else if (key > a[mid]) lo = mid + 1;
			else return mid;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] {3,4,19,23,27,39,44,95,120,132,142,153,167};
		int key = 63;
		int element = binary_search(a,key);
		
		if (element == -1)
			System.out.println(key + " is not in the array.");
		else
			System.out.println(key + " is in element " + element + ".");
	}

}
