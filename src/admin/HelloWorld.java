package admin;
import java.util.Scanner;
import java.math.*;
import java.util.HashMap;



public class HelloWorld {
	
	static int sumArray(int a[], int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	static double avgArray(int a[], int n) {
		double tmp = 0;
		for(int i = 0; i < n; i++) {
			tmp += a[i];
		}
		return tmp/n;
	}
	
	static int countEven(int a[], int n) {
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] % 2 == 0) {
				cnt++;
			}
		}
		return cnt;
	}
	
	static void bubbleSort(int a[], int n) {
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				if(a[i] < a[j]) {
					int tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
	}
	
	static void cntFrequency(int a[], int n) {
		int maxcnt = 0;
		int rs = a[0];
		for(int i = 0; i < n; i++) {
			int cnt = 1;
			for(int j = i + 1; j < n; j++) {
				if(a[i] == a[j]) {
					cnt++;
				}
			}
			if(cnt > maxcnt) {
				maxcnt = cnt;
				rs = a[i];
			}
		}
		System.out.println("số lặp lại nhiều nhất là: " + rs);
		System.out.println("lặp lại số lần là: " + maxcnt);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Array: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = sumArray(arr, n);
		System.out.println("Sum = " + sum);
		
		double avg = avgArray(arr, n);
		System.out.println("avg " + avg);
		
		int even = countEven(arr, n);
		System.out.println("even " + even);
		
		int odd = n - even;
		System.out.println("odd " + odd);
		
		bubbleSort(arr, n);
		System.out.println("Array is arranged: ");
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
		
		System.out.println("----max cnt frequence");
		cntFrequency(arr, n);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < n; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			}else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		
		int rs = 0;
		int maxFre = 0;
		for(Integer key : map.keySet()) {
			if(maxFre < map.get(key)) {
				maxFre = map.get(key);
				rs = key;
			}
		}
		System.out.println(maxFre);
		System.out.println(rs);
	}
}
