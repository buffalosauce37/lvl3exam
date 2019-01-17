package test;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCalculator {

	public Object commonKeyValues(ArrayList<Integer> lst, HashMap<Integer, String> hm) {
		ArrayList<String> st = new ArrayList<>();
		for (int i = 0; i < lst.size(); i++) {
			if(hm.containsKey(lst.get(i))) {
				st.add(hm.get(lst.get(i)));
			}
		}

		return st;
	}

}
