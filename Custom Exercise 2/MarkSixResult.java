import java.util.Random;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;


public class MarkSixResult{

    public static void main (String[] args){

        Random ran = new Random();
        
        int [] numbers= new int[6];
        int i =0;
        while(i<numbers.length){
            int num = ran.nextInt(49)+1;
            boolean repeat=false;
            for(int j=0;j<numbers.length;j++){
                if(numbers[j]==num){
                    repeat=true;
                }
            }
            if(!repeat){
                numbers[i] = num;
                System.out.println("Got a unique number: " + num);
                i++;

            }else{
                System.out.println("This number(" + num +") is in the result already.");
            }
        }
        System.out.println(Arrays.toString(numbers));

        
        try{
            File file = new File("markSixResult.txt");
            file.createNewFile();
            Scanner sc = new Scanner(file);
            int lineCounter = 1;
            while(sc.hasNext()){
                sc.nextLine();
                lineCounter++;
            }
            Writer output = new BufferedWriter(new FileWriter("markSixResult.txt", true));
            output.append("Week "+ lineCounter + ": " + Arrays.toString(numbers) +"\n");
            output.close();

        }catch(IOException e){
            System.out.println(e);
        }



    }
}