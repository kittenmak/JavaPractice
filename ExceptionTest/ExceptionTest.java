import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class ExceptionTest{

    public static String getClassName() {
        String name = ExceptionTest.class.getName();
        return name;
    }



    public static int getValueFromFile(){
        int value=-1;

        try{
            File file = new File("file.txt");
            Scanner reader = new Scanner(file);
            value = reader.nextInt();
        }catch(IOException e){
            if (e instanceof FileNotFoundException){
                System.out.println("File Not Found.");
                e.printStackTrace();                
            }else{
                System.out.println("Other IOExceptions.");
                e.printStackTrace();
            }


        }finally{
            System.out.println("Program Name(Class Name): " + getClassName());
            String method_name = Thread.currentThread().getStackTrace()[1].getMethodName();
            System.out.println("Current Method Name: " + method_name);            
        }

        return value;
    }

    public static void main(String[] args){
        System.out.println("Value from file (-1 means invalid): "+ getValueFromFile());
    }




}