package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> s = new ArrayList<String>();
		//2. Add five Strings to your list
		s.add("H");
		s.add("He");
		s.add("Hel");
		s.add("Hell");
		s.add("Hello");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
			if (i%2==0) {
				System.out.println(s.get(i));
			}
		}
		//4. Print all the Strings using a for-each loop
		for(String w: s) {
			System.out.println(w);
		}
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		for(int i = s.size(); i >0; i--) {
			System.out.println(s.get(i-1));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for(String e: s) {
			
			if (e.contains("e")) {
				System.out.println(e);
			}
		}
	}
}
