package world;
import static org.junit.Assert.*;

import org.junit.Test;

import world.LinearSearch;

public class LinearSearchTest {

	@Test
	public void test() {
	LinearSearch ls=new LinearSearch();
	boolean result=ls.search(new int[]{5,4,7,9,2},7);
	assertEquals(true,result);
	}

}
