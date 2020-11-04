package exerciseA;

import java.util.ArrayList;

public class OneRow_Observer implements Observer{

	private DoubleArrayListSubject mydata;
	private ArrayList<Double> array;

	public OneRow_Observer(DoubleArrayListSubject mydata) {

		this.mydata=mydata;
		this.array=this.mydata.data;
		this.mydata.addObserver(this);
		display();
	}

	@Override
	public void update(ArrayList<Double> array) {
		// TODO Auto-generated method stub
		this.array=array;
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("\nNotification to One-Row Observer: Data Changed:");
		System.out.println(array.toString());
	
	}

}
