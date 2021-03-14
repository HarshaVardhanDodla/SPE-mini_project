
import java.io.*;
import java.util.*;
/**
 * Hello world!
 *
 */
public class Calculator {

	public static void main(String[] args){
		System.out.println("sqrt(6) = " + sqrt(6));
		System.out.println("6! = " + factorial(6));
		System.out.println("log(6) = " + log(6));
		System.out.println("6^3 = " + power(6,3));
	}

	public static double sqrt(double a) {
		 return Math.sqrt(a);
		 }
	
	public static double factorial(double a) {
		double n = 1;
		for(int i=2;i<=n;i++){
		n *=i;
		}
		return n;
	}

	public static double log(double a) {
		double result;
		if (a <= 0) {
			throw new IllegalArgumentException("Log is not defined for negative values");
		} else {
		   result = Math.log(a);
		}
		return result;
	}

	public static double power(double a, double b) {
		return Math.pow(a,b);
	}
}
