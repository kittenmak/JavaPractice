import java.util.Arrays;
public class TestScores{


    public TestScores(double[] scores){

        try{
            for(int i=0;i<scores.length;i++){
                if(scores[i]<0 || scores[i]>100){
                    throw new IllegalArgumentException();
                }
            }
            System.out.print(Arrays.toString(scores)+"   ");
            System.out.println("This is good scores array.");
        }catch(IllegalArgumentException e){
            System.out.print(Arrays.toString(scores)+"   ");
            System.out.println("This is bad scores array.");
        }

    }

    public static void main(String[] args){
        double[] badScores = {97.5, 66.7, 88.0, 101.0, 99.0};
        double[] goodScores = {97.5, 66.7, 88.0, 100.0, 99.0};

        TestScores ts1 = new TestScores(badScores);
        TestScores ts2 = new TestScores(goodScores);

    }



}