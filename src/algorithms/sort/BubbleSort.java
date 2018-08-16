package algorithms.sort;

import algorithms.interfaces.GeneralSort;

public class BubbleSort implements GeneralSort{

	@Override
	public void sort(Integer[] a) {
		for(Integer i=0;i<a.length-1;i++) {
			for(Integer j=0;j<a.length-1-i;j++) {
				if (a[j]>a[j+1]) {
					Integer temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
	}
	
	

}
