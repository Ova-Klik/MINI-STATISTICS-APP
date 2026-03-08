
public class MiniStatistics{


	
	public double getLength(int [] numbers){
	
		return numbers.length;
	}
	
	public double getSum(int [] numbers){
	   
	    double sum=0;
		for(int index=0; index<numbers.length; index++){
            sum+= numbers[index];
        		
		}
		return sum;
	}
	
	public double getMean(int [] numbers){
	    
	    double sum= getSum(numbers);
	    double length=getLength(numbers);
	    double average=sum/length;
	    
	    
	    return average;

}

    public double getSumOfXMinusMeanSquared(int [] numbers){
	    double sum = 0;
        double mean = getMean(numbers); 

            for (int number : numbers) {
                sum += (number - mean) * (number - mean);
            }

        return sum;
}

   public double getVariance(int [] numbers){
	    double variance = 0;
        double sumOfMeanSquared = getSumOfXMinusMeanSquared(numbers);
        double length=getLength(numbers);
        
        variance = (int)((sumOfMeanSquared/length)*100)/100.0;
            
        return variance;
}

    public double getStandardDeviation(int [] numbers){
	    double standardDeviation = 0;
        double variance = getVariance(numbers);
        
        standardDeviation = (int)((Math.sqrt(variance)*100))/100.0;
            
        return standardDeviation;
}
	  
	
}
