import java.util.*; 
import java.util.Random;

public class Dice
{
	public static void main(String [] args){
		Random ran = new Random();
		int[] array1 = {5};
		int i =0;
		
		for(i=0;i<6;i++){
			System.out.print(ran.nextInt(5)+1 + " ");
		}
		System.out.println();

	}
}