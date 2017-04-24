package world;

import static org.junit.Assert.*;

import org.junit.Test;

public class SelectionSortTest {


	@Test
	public void test() {
		SelectionSort ss=new SelectionSort();
		 int[] arr1 = {11,6,3,34,2,15,20};
		 
	        String arr2 =ss.doSort(arr1);
	        assertEquals("23611152034",arr2);
	}
}