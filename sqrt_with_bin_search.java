import java.util.*;
class sqrt_stuff{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		System.out.println("Square root of "+ n +" is: ");
		
	    int start = 1, end = n; float p = 0;
	    boolean f = false;
	    
	    while(start <= end){
	    	int mid = start + (end - start)/2;
	    	float x = mid;
	    	
	        if(x * x == n){
	        	p = x; 
	        	f = true;
	        	break;
	        }
	        
	        else if((x * x) < n)
	             start = mid + 1;
	        
	        else if((x * x) > n)
	             end = mid - 1;
	        }

	    if(f == false){
	    	p = start; 
	    	double sqrt = ((n / p) + p) / 2; //newton raphson
	    	System.out.println(sqrt);
	    }
	    
	    else System.out.println((int)p);
	    
    }
}