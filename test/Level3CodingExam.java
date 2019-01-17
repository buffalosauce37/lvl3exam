package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

public class Level3CodingExam {

	/**
	 * PART A
	 * 
	 * There are two people competing in a gold mining contest. The weight of each gold nugget found by each competitor is stored in a separate ArrayList.
	 * Write a methods that takes in two ArrayLists of Doubles and returns the ArrayList with the highest total of Doubles.
	 * **/
	@Test
	public void testWinner() {
		ArrayList<Double> WyateErpsNuggets = new ArrayList<Double>();
		ArrayList<Double> ButchCassidaysNuggets = new ArrayList<Double>();
		
		WyateErpsNuggets.add(3.14);
		WyateErpsNuggets.add(2.34);
		WyateErpsNuggets.add(1.16);
		WyateErpsNuggets.add(4.76);
		WyateErpsNuggets.add(8.48);
		
		ButchCassidaysNuggets.add(2.34);
		ButchCassidaysNuggets.add(4.35);
		ButchCassidaysNuggets.add(1.35);
		ButchCassidaysNuggets.add(6.36);
		ButchCassidaysNuggets.add(0.84);

		assertEquals(WyateErpsNuggets, new ContestCalculator().calculateWinner(WyateErpsNuggets, ButchCassidaysNuggets));
	}


	/** 
	 * PART B
	 * 
	 * Write a method that takes in an ArrayList of Integers and a HashMap that matches and Integer key to a String Value.
	 * The method should return an ArrayList of all the Values from the HashMap that have matching keys to the passed in ArrayList.
	 * 
	 * */
	@Test
	public void testAddMatching() throws Exception {
		ArrayList<Integer> lst = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++){
			lst.add(i);
		}

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Ecstatic");
		hm.put(9, "Healthy");
		hm.put(2, "Superb");
		hm.put(77, "Fine");
		hm.put(4, "Happy");

		ArrayList<String> st = new ArrayList<String>();
		st.add("Ecstatic");
		st.add("Superb");
		st.add("Happy");
	
		assertEquals(st, new HashMapCalculator().commonKeyValues(lst, hm));
	}
}
