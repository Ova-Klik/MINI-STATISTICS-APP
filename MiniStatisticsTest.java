import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MiniStatisticsTest{

	@Test
	public void testThatLengthIsChecked(){
	
		int [] numbers = {5, 7, 6, 3, 2, 4};
		MiniStatistics stats = new MiniStatistics();
		double expectedLength = stats.getLength(numbers);
		double actualLength = 6;
		assertEquals(expectedLength, actualLength);
	}
	
	@Test
	public void testThatSumIsEqual(){
	
		int [] numbers = {5, 7, 6, 3, 2, 4};
		MiniStatistics stats = new MiniStatistics();
		double expectedSum = stats.getSum(numbers);
		double actualSum = 27.0;
		assertEquals(expectedSum, actualSum);
	}
	
	@Test
	public void testThatMeanIsEqual(){
	
		int [] numbers = {5, 7, 6, 3, 2, 4};
		MiniStatistics stats = new MiniStatistics();
		double expectedMean = stats.getMean(numbers);
		double actualMean = 4.5;
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
	
	@Test
	public void testThatVarianceIsEqual(){
	
		int [] numbers = {5, 7, 6, 3, 2, 4};
		MiniStatistics stats = new MiniStatistics();
		double expectedVariance= stats.getVariance(numbers);
		double actualVariance = 2.91;
		assertEquals(expectedVariance, actualVariance);
	}
	
	@Test
	public void testThatStandardDeviationIsEqual(){
	
		int [] numbers = {5, 7, 6, 3, 2, 4};
		MiniStatistics stats = new MiniStatistics();
		double expectedStandardDeviation= stats.getStandardDeviation(numbers);
		double actualStandardDeviation = 1.70;
		assertEquals(expectedStandardDeviation, actualStandardDeviation);
	}
	
	
	
	
	
	
}


