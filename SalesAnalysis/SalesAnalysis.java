import java.util.Scanner;
import java.io.*;

public class SalesAnalysis
{
	public static void main(String [] args) throws IOException
	{
		String wData;
		int wNum=0, hWeekNum=0, lWeekNum=0;
		double wTotal=0.0 ,hSale=0.0,lSale=0.0, total=0.0;
		
		//create file object and scanner object to read from the file
		File myFile = new File("SalesData.txt");
		Scanner input = new Scanner(myFile);
		
		//read the data from the file
		while(input.hasNext())
		{
			//read one line of data representing the sales
			// of a particular week
			wData = input.nextLine();
			wNum++;
			//call a method to calculate the total sales for the week
			wTotal = getWeeklyTotal(wData);
			System.out.println("The weekly total for week "
				+ wNum + " is: " + wTotal);
				
			System.out.println("The average daily sale for week "
				+ wNum + " is: " + (wTotal/7));
			//initial the highest and lowest total to the first week's total
			if(wNum == 1)
			{
				hSale = wTotal;
				lSale = wTotal;
			}
			else
			{
				if(wTotal > hSale)
				{
					hSale = wTotal;
					hWeekNum = wNum;
				}
				if(wTotal < lSale)
				{
					lSale = wTotal;
					lWeekNum = wNum;
				}
			total += wTotal;
			}
			
		}	
		System.out.println("The Total sales for all weeks is :" + total);
		System.out.println("The average weekly sale  is :" + total/wNum);
		System.out.println("The week number that had the highest amount of sale  is :" + hWeekNum);
		System.out.println("The week number that had the lowest amount of sale  is :" + lWeekNum);
		
	}
		public static double getWeeklyTotal(String str)
		{
			double total = 0.0;
			//using split() method to get each sales number
			String[] data = str.split(",");
			
			for(String s: data)
			{
				total += Double.parseDouble(s);
			}
			return total;
	}	
}		
		
		
		
		
		
		
		
		
		


