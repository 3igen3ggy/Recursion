
public class Recursion {

	public static void main(String[] args) {
		
//		System.out.println(sumUpTo(1000));
//		System.out.println(factorial(10));
//		System.out.println(sumOfArithmeticSequence(4, 1, 1));
		System.out.println(fibonacci(8));

	}
	
	//calculate n!
	public static long factorial(long n) {
		
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
		
	}
	
	//sums all natural numbers up to n
	public static long sumUpTo(long n) {
		
		if (n == 0) {
			return 0;
		} else {
			return n + sumUpTo(n - 1);
		}
		
	}
	
	// n - nth term
	// an - input the first element (a1)
	// r - difference between consecutive terms of arithmetic sequence
	public static double nthOfArithmeticSequence(int n, double an, double r) {
		
	        if (n == 1) {
	            return an; 
	        } else {
	        	return  nthOfArithmeticSequence(n - 1, an + r, r);
	        }
	}
	
	// n - sum up to nth term
	// an - first term
	// r - difference between consecutive terms of arithmetic sequence
	public static double sumOfArithmeticSequence(int n, double an, double r) {

        if (n == 1) {
            return an; 
        } else {
        	return  nthOfArithmeticSequence(n - 1, an + r, r) + sumOfArithmeticSequence(n - 1, an, r);
        }	
	}
	
	// n - nth term
	// an - input the first element (a1)
	// r - ratio between consecutive terms of geometric sequence
	public static double nthOfGeometricSequence(int n, double an, double q) {
		
        if (n == 1) {
            return an; 
        } else {
        	return  nthOfGeometricSequence(n - 1, an * q, q);
        }
	}
	
	// n - sum up to nth term
	// an - first term
	// r - difference between consecutive terms of geometric sequence
	public static double sumOfGeometricSequence(int n, double an, double q) {

        if (n == 1) {
            return an; 
        } else {
        	return  nthOfGeometricSequence(n - 1, an * q, q) + sumOfGeometricSequence(n - 1, an, q);
        }	
	}
	
	//calculate nth term of fibonacci sequence
	public static long fibonacci(long n) {
		
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 1;
		} else {
			return fibonacci(n - 2) + fibonacci(n - 1);
		}			
	}

}
