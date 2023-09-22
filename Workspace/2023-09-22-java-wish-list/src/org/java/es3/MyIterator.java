package org.java.es3;

import java.util.Arrays;

public class MyIterator {

	int index = 0;
	int counter = 0;
	int[] values;
	
	public MyIterator() {
		
		values = new int[16];
	}
//	public MyIterator(int[] values) {
//		
//		setValues(values);
//	}
	
	public void addElement(int value) {
		
		values[counter++] = value;
		
		if (counter == values.length) {
			
			int[] newValues = new int[values.length * 2];
			for (int x=0;x<values.length;x++) {
				newValues[x] = values[x];
			}
					
			values = newValues;
		}
	}

	public int getNextElement() {
		
		return values[index++];
	}
	public boolean hasNext() {
		
		return index < values.length;
	}
	
	public int[] getValues() {
		return values;
	}
	public void setValues(int[] values) {
		this.values = values;
	}
	
	@Override
	public String toString() {
		
		return Arrays.asList(values).toString();
	}
}
