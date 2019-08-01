import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {
	private BubbleSort sorter = new BubbleSort();

	@Test
	public void bubbleSortWithEmptyArray() {
		int[] values = {};

		sorter.sort(values);
	}

	@Test
	public void bubbleSortWithOneElementArray() {
		int[] values = { 42 };

		sorter.sort(values);

		assertArrayEquals(new int[] { 42 }, values);
	}

	@Test
	public void shouldSortValues() {
		int[] values = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		int[] expectedOrder = { 1, 5, 6, 7, 12, 14, 19, 23, 26, 35, 37, 47, 52, 78, 86 };

		sorter.sort(values);

		assertArrayEquals(expectedOrder, values);
	}

}