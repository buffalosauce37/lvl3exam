package test;

import java.util.ArrayList;

public class ContestCalculator {

	public Object calculateWinner(ArrayList<Double> wyateErpsNuggets, ArrayList<Double> butchCassidaysNuggets) {
		int nug1 = 0;
		int nug2 = 0;
		for (int i = 0; i < wyateErpsNuggets.size(); i++) {
			nug1 += wyateErpsNuggets.get(i);
		}
		for (int i = 0; i < butchCassidaysNuggets.size(); i++) {
			nug2 += butchCassidaysNuggets.get(i);
		}
		System.out.println(nug1);
		if (nug1 < nug2) {
			return butchCassidaysNuggets;
		}
		else {
			return wyateErpsNuggets;
		}
		// TODO Auto-generated method stub

	}

}
