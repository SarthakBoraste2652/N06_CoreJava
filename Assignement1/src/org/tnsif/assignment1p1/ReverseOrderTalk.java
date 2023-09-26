/*
 * Mary is good in mathematics. She is always playful and has a good memory. 
 * When her friend Pinky tells n numbers, she has a habit of telling all those numbers 
 * in the reverse order of what she told. Please help her friend to find if the order 
 * in which Mary says are correct or not.
Sample Input 1:

Enter the value of n
5
Numbers said by Pinky
12
78
34
21
56
Numbers said by Mary
56
21
34
78
12

Sample Output 1: 

Yes, it is in reverse order
 */
package org.tnsif.assignment1p1;

public class ReverseOrderTalk {
	
	public static void checkOrder(int[] numsByP, int[] numsByM)
	{
		int size = numsByP.length;
		for(int left=0, right=size-1; left<size && right>=0; left++, right--)
		{
			if(numsByP[left]!= numsByM[right])
			{
				System.out.println("No, it's not in order..!!");
				return;
			}
		}
		System.out.println("Yes, it is in reverse order");
	}
	
	public static void main(String[] args) {
		int numbers = 5;
		int[] numsByPinky= {12,78,34,21,56};
		int[] numsByMary= {56,21,34,78,12};
		checkOrder(numsByPinky, numsByMary);
	}

}
