package demo.struct;

public class Search {
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		
		while(high >= low) {
			int mid = (high + low) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if(key == list[mid]) {
				return mid;
			}
			else {
				low = mid + 1;
			}
		}
		
		return -low-1;
	}
	
	public static void main(String[] args) {
		int[] list = {1,3,5,7,9};
		int key = 2;
		int index = binarySearch(list, key);  // 返回为负数说明不在List中，应当插入的位置是返回值的绝对值-1
		System.out.print(index);
	}
}
