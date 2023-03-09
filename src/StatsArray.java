/*
 * Jared Lee
 * 11/27/19
 * Array Activity
 */
import java.awt.*;
import java.util.Random;  //for our random number generator




public class StatsArray {

	//instance variables
	private int size;  //how big is the array
	private int[] stats; // an array of integers

	//default constructor -overloaded method
	StatsArray() {
		size = 10;
		stats = new int[size] ;  //instantiate the array called stats
	}

	public void display(Graphics g)
	{
		int x = 50;  //coordinates for displaying
		int y = 40;

		//display the array with position number
		for(int i = 0; i < stats.length; i++)
		{
			g.drawString("Stats [" + i + "] = "+ stats[i],
			 x,	(y + 15 * i));
		}
	}

	public void fillArray()
   {
		/*fill the array with random numbers (int) in the range 0 - 100.*/
		Random random = new Random();
		
		for (int i = 0; i < stats.length; i++)
			      stats[i] = random.nextInt(100+1);
	}

	public int getSum() 
	{
		//add up all the values in the array
		   int sum = 0;// Variable to keep track of sum
	  for (int i = 0; i < stats.length; i++) //For loop to cycle through the aray at each element
	  {
		 sum += stats[i]; // Add each element onto the total of sum
	  }
   
		return sum;// Returns sum, which is the added total of all the elements
 }



	public int getMax() 
	{
		//return the maximum value in the array
int max = stats[0];
		
		for (int i = 0; i < stats.length; i++)
		{
			if (max < stats[i])
			{
				max = stats[i];
			}
		}
		return max;
}
		 
	

	public int getMin()
	{
		//return the minimum value in the array
int min = stats[0];
		
		for (int i = 0; i < stats.length; i++)
		{
			if (min > stats[i])
			{
				min = stats[i];
			}
		}
		return min;
			
	}

	public double getAverage() 
	{
		//return the average
		int sum = 0;// Variable to keep track of sum
		  for (int i = 0; i < stats.length; i++) //For loop to cycle through the aray at each element
		  {
			 sum += stats[i]; // Add each element onto the total of sum
		  }
	   
		  double average = sum / stats.length;
		  return average;
	}

	public int countValues(int lowRange, int highRange) 
	{
		//count how many numbers are >= lowRange and <= highRange

		return 0;
	}


	public boolean isValueFound(int someNumber) 
	{
		//check to see if someNumber is in the array

		return true;
	}


	public void sortArray() 
	{
		/*sort the array in ascending order - selection sort*/

		int tempValue;
		int min;

		for (int i = 0; i < (stats.length - 1); i++)
		{
			min = i;
			for (int j = (i + 1); j < (stats.length); j++)
			{
				if (stats[j] < stats[min])
				{
					min = j;
				}
			}
			tempValue = stats[min];
			stats[min] = stats[i];
			stats[i] = tempValue;


		}

	}


	public void sortBArray() {
		/*Here is another common sort algorithm.
		  It sorts the array in ascending order.
		  This is called a bubble sort.  I have added it
		  so that you can take a look at it.*/

		int tempValue;

		for (int i = 0; i < (stats.length - 1); i++)
		{
			for (int j = (i + 1); j < (stats.length); j++)
			{
				if (stats[j] < stats[i])
				{
					tempValue = stats[i];
					stats[i] = stats[j];
					stats[j] = tempValue;
				}
			}
		}


	}





}