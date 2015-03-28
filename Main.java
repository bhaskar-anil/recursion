 /*
 *Very simple and basic Recursion examples
 *
 *@author : Anil Bhaskar
 *Feel free to use the code.
 */
 
 public class Main{
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
	
	
	//Multiply two numbers using recursion
	public int mul(int a, int b){
		
		if(a==1){
			return b;
		}
		else if(a==0){
			return 0;
		}
		else if(a<0){
			return b-mul(1-a,b);
		}
		else{
			return b+mul(a-1,b);
		}
	}
	
	//LCM using recursion
	int LCM(int a, int b){
		int x=2,z=0;
		
		if(a==1){
			return b;
		}else if(a%x==0 || b%x==0){
			if(a%x==0 && b%x==0){
				z = b/x;
				return x*LCM(a/x,z);
			}else
			if(a%x==0 && b%x!=0){
				return x*LCM(a/x,b);
			}else{
				return x*LCM(a,b/x);
			}
		
		}else{
		return a*b;
		}
	}
	
	//Sum of digits using recursion
	public int digitSUM(int n){
		if(n/10==0){
			return n;
		}else{
			return n%10+digitSUM(n/10);
		}
	}
	
	//Power of a number using recursion
	public int pow(int n, int p){
		if(p==0){
			return 1;
		}else{
			return n*pow(n,p-1);
		}
	}
	
	//GSD using recursion
	public int GCD(int a, int b){
		int p,q,m;
		if(a==1 || b==1){
			return 1;
		}else{
			if(a%x==0 && b%x==0){
				p=a/x; 
				q=b/x;
				m=x;
				x++;
				return m*GCD(p,q);
			}else if(a%x==0 && b%x!=0){
				p=a/x;
				m=x;
				x++;
				return m*GCD(p,b);
			}else if(a%x!=0 && b%x==0){
				q=b/x;
				m=x;
				x++;
				return m*GCD(a,q);
			}else {;}
		}
	}
	public static void main(String args[]){
		int n = 5;
		System.out.println("Factorial of "+n+" is :"+this.fact(n));
	}
 }