package collections;

import java.util.Set;
import java.util.TreeSet;

import catchDemo.Account;

public class TreeSetExamples1 {

public static void main(String[] args) {
		
		// ordered array	--> 1,3,2,5 --> 1,3,25
		// sorted  set	--> 1,3,2,5	--> 1,2,3,5
		// unordered hash --> 1,3,2,5 ---> 1,5,2,3
	
	
		Set<String> ids=new TreeSet<String>();
		Account a=new Account();
		ids.add("one");
		ids.add("two");
		ids.add("three");
		ids.add("one");
	
		//System.out.println(ids);
		
		for(String value:ids){
			System.out.println(value);
		}
}
}
