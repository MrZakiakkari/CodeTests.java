// you can also use imports, for example:
// import java.util.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
package io.github.mrzakiakkari;

import java.util.Arrays;

/**
 * @author M.Zaki Al Akkari <https://github.com/MrZakiakkari>
 */
class DemoTestSolution
{
	public int solution(int[] A)
	{
		int smallestPositiveInteger = 1;
		Arrays.sort(A);

		// write your code in Java SE 8
		for (int i = 0; i < A.length; i++)
		{
			if (A[i] == smallestPositiveInteger)
			{
				smallestPositiveInteger++;
			}
		}
		return smallestPositiveInteger;
	}
}
