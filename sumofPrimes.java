
public class sumofPrimes {
	    public static void main(String[] args){
	    int count = 0;
	    long sum = 0;
	    int number = 2;
	    while(count < 1000){
	    if(isPrimeNum(number)){
	        sum += number;
	        count++;
	       }
	    number++;
	    }
	    System.out.println(sum);
	}
	    
	    private static boolean isPrimeNum(int number){
	        for(int i= 2; i < number ; i++){
	            if(number % i ==0){
	                return false;
	            }
	        }
	        return true;
	    }
	}


