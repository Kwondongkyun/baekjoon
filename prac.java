import java.util.*;
public class prac {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
		int tmp;

		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		
	}
}