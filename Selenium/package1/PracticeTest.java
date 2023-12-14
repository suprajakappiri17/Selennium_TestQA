package package1;

import java.util.ArrayList;

public class PracticeTest {

	public static void main(String[] args) {
		//variable - only a value
		int a=10;
		//multiple values
		
		int[] arr = {10,20,30,40,50};
		
		//Strght array
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);	
		}
	
	
	
	
	ArrayList ob=new ArrayList();
	ob.add(0, 10);
	ob.add(200);
	ob.add(300);
	
	ArrayList<String> ob1=new ArrayList<String>();
	ob1.add("Supraja");
	ob1.add("Vishnu");
	ob1.add("Abdul");
	ob1.add("ABC");
	
	
	String s="Supraja";
	for (int i=0;i<s.length();i++)
	{
		System.out.println(s.charAt(i));
	}
	
	
		
	}

}
