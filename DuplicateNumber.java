package learnProg;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(1);
		ls.add(3);
		ls.add(3);
		ls.add(7);
		ls.add(8);
		ls.add(8);
		ls.add(9);
		
		System.out.println(ls);
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.addAll(ls);
		ls.clear();
		ls.addAll(lhs);
		
		System.out.println(lhs);
		
		

	}

}
