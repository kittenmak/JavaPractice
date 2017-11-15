import java.io.*;
import java.util.Scanner;

public class ArrayPractice{

	int row =0;
	String fileName= "numbers.csv";
	double[] data;



	public ArrayPractice() throws IOException{
		File file = new File(fileName);
		Scanner reader = new Scanner(file);
		while(reader.hasNext()){	
			row++;
			reader.nextDouble();
		}
		reader.close();
		data = new double[getLineNumber()];
		Scanner reader2 = new Scanner(file);
		for(int i=0; i<row; i++){
			data[i]=reader2.nextDouble();
		}


	}

	public int getLineNumber(){
		return row;
	}

	public double getSmallest(){
		double smallest=9999999;
		for(int i=0; i<data.length; i++){

			if (data[i]<smallest){

				smallest = data[i];
			}
			
		}
		return smallest;
	}

	public double getAverage(){
		return getTotal()/data.length;	
	}

	public double getTotal(){
		double sum=0;
		for(int i=0; i<data.length; i++){
			sum += data[i];
			
		}
		return sum;	
	}

	public static void main(String[] args) throws IOException{

		ArrayPractice ap = new ArrayPractice();
		System.out.println("The smallest number in the array: " + ap.getSmallest());
		System.out.println("The avg number in the array: " + ap.getAverage());
		System.out.println("The sum of all numbers in the array: " + ap.getTotal());
		// System.out.println(ap.getLineNumber());


		}
}



