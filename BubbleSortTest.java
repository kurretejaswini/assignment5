package world;
import static org.junit.Assert.*;
import org.junit.Test;
import world.BubbleSort;
public class BubbleSortTest {

	@Test
	public void test() {
	BubbleSort bs=new BubbleSort();
		String result=bs.sort(new int[]{5,4,7,9,2});
		assertEquals("24579",result);
	}

}

