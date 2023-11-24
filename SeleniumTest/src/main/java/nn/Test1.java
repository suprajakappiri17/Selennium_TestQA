package nn;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		String s = "java,selenium,POM,cucumber";
		String[] arr = s.split(",");
		for (int i = arr.length - 1; i > 0; i--) {
			System.out.println(arr[i]);
		}

		System.out.println("-------------Difference between String literal and string object----------");

		String s1 = "Supraja";
		for (int i = s1.length() - 1; i > 0; i--) {
			System.out.println(s1.charAt(i));

		}
		
		ArrayList<String> arr2=new ArrayList<String>();
				arr2.add("Suprajaaaa");
				arr2.add(s1);
				System.out.println(arr2);
				arr2.remove(1);
				System.out.println(arr2);
				
				//arr2.remove(arr2[1]);

	}

}
