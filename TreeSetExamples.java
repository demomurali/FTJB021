package collections;

import java.util.Set;
import java.util.TreeSet;

import catchDemo.Account;

public class TreeSetExamples {

	public static void main(String[] args) {
		
		Set<Integer> ids=new TreeSet<Integer>();
		Account a=new Account();
		ids.add(1001);
		ids.add(1002);
		ids.add(1004);
		ids.add(1003);
		ids.add(1003);
		ids.add(1001);
		System.out.println(ids);
		
		for(int value:ids){
			System.out.println(value);
		}
		
	}

}
