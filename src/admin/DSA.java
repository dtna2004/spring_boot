package admin;

import java.util.HashMap;
import java.util.Scanner;


public class DSA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		String[] words = sentence.split(" ");
		
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i < words.length; i++) {
			String word = words[i];
			if(map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			}
			else {
				map.put(word, 1);
			}
		}
		
		for(String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}
}
