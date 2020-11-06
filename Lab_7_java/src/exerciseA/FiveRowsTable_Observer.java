package exerciseA;

import java.util.ArrayList;

/*
 * FiveRowsTable_Observer.java
 * Lab:7-Exercise A
 * Completed by: Ziad Chemali and Lotfi Hasni
 * Submission DAte: November 6 ,2020
 */
public class FiveRowsTable_Observer implements Observer {
	ArrayList<Double> array;
	private DoubleArrayListSubject mydata;

	public FiveRowsTable_Observer(DoubleArrayListSubject mydata) {
		this.mydata = mydata;
		this.array = this.mydata.data;
		this.mydata.addObserver(this);
		display();
	}

	@Override
	public void update(ArrayList<Double> array) {
		this.array = array;
		display();
	}

	@Override
	public void display() {
		System.out.println("\nNotification to Five-Rows Table Observer: Data Changed:");
		int row = 0;
		String temp;
		while (row < 5) {
			temp = "";
			for (int i = row; i < array.size(); i += 5) {
				temp += array.get(i) + " ";
			}
			System.out.println(temp);
			row++;
		}

	}
}
