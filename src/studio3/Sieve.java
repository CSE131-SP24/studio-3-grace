package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a value for n: ");
		int n = in.nextInt();
		
		//true and false for prime or no prime
		boolean[] primes = new boolean[n];
		//write loop to go through this array
		
		//first assume that all array values are prime
		for (int i= 0; i<primes.length; i++)
		{
			primes[i]= true;
		}
		
		//find multiples of 2 then 3 then 5...
		for(int i = 2; i<primes.length; i++)
		{
			for(int j = i*2; j<primes.length; j=j+i)
			{
				primes[j] = false;
			}
		}
		
		for(int i=0; i<primes.length; i++)
		{
			System.out.println(i + ": "+ primes[i]);
		}
		
		

	}

}
