import java.util.*;
import java.io.*;
import java.lang.*;


public class ValuesCal2{
    private static int lineCounter = 0;
    static int numOfInt = 0;
    static int numOfFloat = 0;
    public static void main(String[] args){

        try{
            File file = new File("values.txt");
            Scanner sc = new Scanner(file);
            ArrayList<String> allVar = new ArrayList<String>();
        
            while(sc.hasNext()){
                // System.out.println(sc.next());
                lineIncrementer();
                String line = sc.next();
                String[] var = line.split(",");
                for(int i =0;i<var.length;i++){
                    allVar.add(var[i]);
                }

            }
            float [] allNum = new float[allVar.size()];

            for(int i=0;i<allVar.size();i++){
                //check if int
                try{
                    Integer.parseInt(allVar.get(i));
                    numOfInt++;
                }catch(NumberFormatException e){
                    numOfFloat++;
                }
                
                float value = Float.parseFloat(allVar.get(i));
                try{
                    if(value<=200 && value>=0){
                        allNum[i] = value;
                    }else{
                        throw new IllegalArgumentException("condition not fulfilled: 0<=val("+ value+")<=200");
                    }
                }catch(IllegalArgumentException e){
                    System.out.println(e);
                }
                
                
            }

            for(int i=0;i<allNum.length;i++){
                System.out.println(allNum[i]);
            }

            System.out.println("Line Counter: " + getLineCounter());
            System.out.println("Sum of all values: " + getSum(allNum));
            System.out.println("Avg of all values: " + getAvg(allNum));
            System.out.println("There are " + numOfInt +" int values in the file.");
            System.out.println("There are " + numOfFloat +" float values in the file.");
        }catch(IOException e){
            System.out.println("File Not Found!\n" + e);
        }
    }

    public static void lineIncrementer(){
        lineCounter++;
    }

    public static int getLineCounter(){
        return lineCounter;
    }

    public static float getSum(float[] numbers){
        float ans = 0;
        for(int i=0; i<numbers.length;i++){
            ans += numbers[i];
        }
        return ans;
    }

    public static float getAvg(float[] numbers){
        float ans = 0;
        for(int i=0; i<numbers.length;i++){
            ans += numbers[i];
        }
        ans = ans/numbers.length;
        return ans;
    }


}