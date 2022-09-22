package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What number do you want to go up to?");
		int n = in.nextInt();
		boolean [] array = new boolean [n+1];
		for (int i = 0; i < array.length; i++)
		{
			array[i] = true;
		}
		for (int i = 2; i*i < n; i++)
		{
			if (array[i] == true)
			{
				for (int j = i*i; j <= n; j = j+i)
				{
					array[j] = false;
				}
			}
		}
		for (int i = 2; i < array.length; i++)
		{
			if (array[i] == true)
			{
				System.out.println(i);
			}
		}

	}

}
