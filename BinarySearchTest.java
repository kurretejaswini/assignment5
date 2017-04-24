package world;

import static org.junit.Assert.*;

import org.junit.Test;

import world.BinarySearch;


public class BinarySearchTest {

	@Test
	public void test() {
		
			BinarySearch bs=new BinarySearch();
			boolean result=bs.search(new int[]{5,4,7,9,2},9);
			assertEquals(true,result);
	}

}
