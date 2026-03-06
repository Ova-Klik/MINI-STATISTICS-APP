import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MiniStatisticsTest{


        


	@Test
	public void testThatLengthIsChecked(){
	
		int [] numbers = {5, 7, 6, 3, 2, 4};
		MiniStatistics stats = new MiniStatistics();
		int expectedLength = stats.getLength(numbers);
		int actualLength = 6;
		assertEquals(expectedLength, actualLength);
	}
	
	@Test
	public void testThatSumIsEqual(){
	
		int [] numbers = {5, 7, 6, 3, 2, 4};
		MiniStatistics stats = new MiniStatistics();
		double expectedSum = stats.getSum(numbers);
		double actualSum = 27;
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void testThatMeanIsEqual(){
	
		int [] numbers = {5, 7, 6, 3, 2, 4};
		MiniStatistics stats = new MiniStatistics();
		double expectedMean = stats.getMean(numbers);
		double actualMean = 27/6;
		assertEquals(expectedMean, actualMean);
	}
	
	@Test
	public void testThatSumOfXMinusMeanSquaredIsEqual(){
	
		int [] numbers = {5, 7, 6, 3, 2, 4};
		MiniStatistics stats = new MiniStatistics();
		double expectedSumOfXMinusMeanSquared = stats.getSumOfXMinusMeanSquared(numbers);
		double actualSumOfXMinusMeanSquared = 17.5;
		assertEquals(expectedSumOfXMinusMeanSquared, actualSumOfXMinusMeanSquared);
	}
	
	
	
	
}


