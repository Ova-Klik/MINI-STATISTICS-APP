
public class MiniStatistics{


	
	public int getLength(int [] numbers){
	
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
	    double average=(double)sum/length;
	    
	    
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
	  
	
}
