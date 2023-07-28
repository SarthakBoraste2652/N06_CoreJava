/*
 There are n people standing in a circle waiting to be executed. 
 The counting begins out at some point in the circle & proceeds around the circle in the 
 fixed direction.
 In each step a certain no. of people are skipped. And the next person is executed.
 the elimination proceeds around the circle (which is becoming smaller and smaller as 
 the executed people are removed), until only the last person remains, who is given freedom.
 
 Given the total no of people = n 
 and a no. k which indicates that k-1 person are skipped
 and k'th person killed the task is to choose a person in the initial circle survives 
 
 */

package org.tnsif.dayfourchallenge;
import java.util.Scanner;

public class CircleSurviveChallenge {
	static int circleGame(int num, int skip)
	{
		if(num ==1)
			return 1;
		else
		{
			return (circleGame(num - 1, skip) + (skip-1)) % num +1;
		}	
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int peopleNo= scan.nextInt();
		int skipCount = scan.nextInt();		
		System.out.println(circleGame(peopleNo, skipCount));
		scan.close();
	}

}
