package exerciseA;

import java.util.ArrayList;
/*
 * ThreeColumnTable_Observer.java
 * Lab:7 Exercise A
 * Completed by: Ziad Chemali and Lotfi Hasni
 * Submission DAte: November 6 ,2020
 */
public class ThreeColumnTable_Observer implements Observer {
ArrayList<Double> array;
private DoubleArrayListSubject mydata;

public ThreeColumnTable_Observer(DoubleArrayListSubject mydata) {

	this.mydata=mydata;
	this.array=this.mydata.data;
	this.mydata.addObserver(this);
	display();
	}

	@Override
	public void update(ArrayList<Double> array) {
		this.array=array;
		display();
	}

	@Override
	public void display() {

		System.out.println("\nNotification to Three-Column Table Observer: Data Changed:");
		int col=0;
	   for(int i=0;i<array.size();i++) {
		   if(col<3)
		   System.out.print(array.get(i)+" ");
		   col++;
		   if(col==3)
		   { col=0;
		   System.out.println();
		   }
		   
	   }
	}

}
