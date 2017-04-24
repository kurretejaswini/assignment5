package world;

import static org.junit.Assert.*;

import org.junit.Test;

public class InsertionsortTest {

	@Test
	public void test() {
		Insertionsort ss=new Insertionsort();
		int[] arr1 = {10,34,2,56,7,67,88,42};
		 
        String arr2 =ss.insertionSort(arr1);
        assertEquals("27103442566788",arr2);
	}
}