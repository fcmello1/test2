//Fábio Cervi de Mello
//Done
//Test 2

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class distinct
{
	ArrayList<Integer> array = new ArrayList<Integer>();

	void input(Integer n)
	{
		int i;
		int num;
		Scanner input = new Scanner(System.in);
		for (i = 0; i < n; i++)
		{
			System.out.println("Type an int bigger than 0: ");
			num = input.nextInt();
			array.add(num);
		}
	}

	void sort()
	{
		Collections.sort(array);
	}

	void distinctNumbers()
	{
		int i;
		int numbers = 1;
		for(i = 1; i < array.size(); i++)
		{
			if((array.get(i - 1)) != (array.get(i)))
				numbers++;
		}

		System.out.println("The number of distinct numbers in this array is: " + numbers);
	}
}

class Program
{
	public static void main(String args[])
	{
		distinct number = new distinct();

		Integer n;
		Integer length;
		
		length = args.length;

		if (length == 0)
		{
			System.out.println("Please run again with the size of th array as an argument.");
			System.exit(0);			
		}

		n = Integer.parseInt(args[0]);

		if (n == 0)
		{
			System.out.println("The array has a size of 0");
			System.exit(0);
		}
		
		number.input(n);

		number.sort();

		number.distinctNumbers();
	}
}

