// you can also use imports, for example:
// import java.util.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
package io.github.mrzakiakkari;

import java.util.Arrays;

/**
 * @author M.Zaki Al Akkari <https://github.com/MrZakiakkari>
 */
public class DemoTestSolution
{
	public static void main(String[] args)
	{
		DemoTestSolution demoTestSolution = new DemoTestSolution();
		System.out.println(demoTestSolution.altSolution(new int[]
		{
			1, 3, 6, 4, 1, 2
		}));
		System.out.println(demoTestSolution.altSolution(new int[]
		{
			1, 2, 3
		}));
		System.out.println(demoTestSolution.altSolution(new int[]
		{
			-1, -3
		}));
	}
	public int solution(int[] A)
	{
		int smallestPositiveInteger = 1;
		Arrays.sort(A);

		for (int i = 0; i < A.length; i++)
		{
			if (A[i] == smallestPositiveInteger)
			{
				smallestPositiveInteger++;
			}
		}
		return smallestPositiveInteger;
	}
	public int altSolution(int[] A)
	{
		int smallestPositiveInteger = 1;
		for (int count = 0; count < A.length; count++)
		{
			for (int i = 0; i < A.length; i++)
			{
				if (A[i] == smallestPositiveInteger)
				{
					smallestPositiveInteger++;
					break;
				}
				if (i == A.length - 1)
				{
					return smallestPositiveInteger;
				}
			}
		}
		return smallestPositiveInteger;
	}
}
