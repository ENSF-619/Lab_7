package exerciseA;

import java.util.ArrayList;

public class DoubleArrayListSubject implements Subject {
	public ArrayList<Double> data;
	private ArrayList<Observer> observers;
public DoubleArrayListSubject() {
data=new ArrayList<Double>();
observers=new ArrayList<Observer>();
}

public void addData(Double num) {
	this.data.add(num);
	notifAll();
}
public void setData(Double num,int index) {
	data.set(index, num);
	notifAll();
}

public void populate(double[] arr) {
	for(int i=0;i<arr.length;i++) {
		data.add(arr[i]);
	}
	notifAll();
	
}

public void display() {

	if(data.size()==0)
		System.out.println("List is Empty");
	else {
		for(int i=0;i<data.size();i++)
		{
			System.out.print(data.get(i)+"  ");
		}
	}
}

@Override
public void addObserver(Observer observer) {
this.observers.add(observer);
}

@Override
public void remove(Observer observer) {
	this.observers.remove(observer);
}

@Override
public void notifAll() {
	// TODO Auto-generated method stub
	for(int i=0;i<observers.size();i++) {
		observers.get(i).update(data);
	}
}}

