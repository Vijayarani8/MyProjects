package myLearning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
			
			String str ="totalqa";
			Map map  = new HashMap();
			for(int i = 0;i set = map.keySet();
			Iterator it=Set.iterator();
			 
			while(it.hasNext())
			{
				Character ch= it.next();
				System.out.println(ch + " -- "+map.get(ch));	 
				 
			}
		}
	}