package org.java.es3;

import java.util.Arrays;

public class MyIterator {

	int index = 0;
	int[] values;
	
	public MyIterator(int[] values) {
		
		setValues(values);
	}

	public int getNextElement() {
		
		return values[index++];
	}
	public boolean hasNext() {
		
		return index < values.length - 1;
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
