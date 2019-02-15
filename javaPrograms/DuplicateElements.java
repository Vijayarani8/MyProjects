package javaPrograms;

import java.util.HashSet;

public class DuplicateElements {

	public static void main(String[] args) {
		String d[] = {"eye", "leg", "eye", "ear", "hair"};
		HashSet<String> hs = new HashSet<String>();
		for(String elements : d)
		{
			if(!hs.add(elements))
			{
				System.out.println(elements);
			}
		}

	}

}
