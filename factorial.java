 /*
 *Recursion 
 *Factorial of a positive integer number
 *
 *@author : Anil Bhaskar
 *Feel free to use the code.
 */
 
 public class factorial{
	//Recursive function to find out factorial
	public int fact(int n){
		if(n==0){
			//Factorial of 0 is 1
			//Here it is our base case
			return 1;
		}else{
			return n*fact(n-1);
		}
	}
	
	public static void main(String args[]){
		factorial f = new factorial();
		int n = 5;
		System.out.println("Factorial of "+n+" is :"+f.fact(n));
	}
 }