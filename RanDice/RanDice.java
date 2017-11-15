import java.util.Random;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.io.*;

public class RanDice{

    public static int[] shakeDice(){
        int[] result = new int[6];
        Random ran = new Random();
        for(int i=0;i<6;i++){
            result[i]=ran.nextInt(5)+1;
        }


        return result;
    }

    public static void writeResult(int[] result){
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("diceResult.txt", true)));
            String printResult="";
            for(int i=0;i<result.length;i++){
                printResult += result[i];
                if(i!=result.length-1){
                    printResult += ", ";
                }
            }


            out.println(printResult);
            out.close();
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
            System.out.println("IO Exception");
        }


    }

    public static void main(String[] args){

        writeResult(shakeDice());

    }
}