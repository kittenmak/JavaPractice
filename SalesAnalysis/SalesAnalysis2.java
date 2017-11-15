import java.io.IOException;
import java.util.*;
import java.io.*;


public class SalesAnalysis2{

    public static void main(String[] args) throws IOException{
        File myFile = new File("SalesData.txt");
		Scanner input = new Scanner(myFile);
        ArrayList<String> weeklyInfo = new ArrayList<String>();
        
		//read the data from the file
		while(input.hasNext()){
            weeklyInfo.add(input.nextLine());
        }
        //show how many weeks are there in the file
        System.out.println("There are " + weeklyInfo.size() + " weeks in total.");

        //show the total sales for each week
        for(int i=0;i<weeklyInfo.size();i++){
            System.out.println("Week "+ (i+1) + " Total Sales: $" +findWeeklyTotalSales(weeklyInfo.get(i)));
        }

        //show avg daily sales for each week
        for(int i=0;i<weeklyInfo.size();i++){
            System.out.println("Week "+ (i+1) + " Avg Daily Sales: $" +findWeeklyAvgDailySales(weeklyInfo.get(i)));
        }

        //The total sales for all the weeks
        double totalSalesForAllWeek = 0;
        for(int i=0;i<weeklyInfo.size();i++){
            totalSalesForAllWeek += findWeeklyTotalSales(weeklyInfo.get(i));
        }
        System.out.println( "Total Sales For All Weeks: $" +totalSalesForAllWeek);

        //The avg weekly sales
        double avgWeeklySales = totalSalesForAllWeek/weeklyInfo.size();
        System.out.println( "Avg Weekly Sales: $" +avgWeeklySales);

        //The week number that had the highest amount of sales
        int highestSalesWeekNo=0;
        double tmpHighestSales = 0;
        for(int i=0;i<weeklyInfo.size();i++){
            double weeklyTotalSales = findWeeklyTotalSales(weeklyInfo.get(i));
            // System.out.println("Week "+ i);
            // System.out.println("Sales in this week: " + weeklyTotalSales);
            if(weeklyTotalSales>tmpHighestSales){
                tmpHighestSales=weeklyTotalSales;
                
                highestSalesWeekNo = i;
            }
        }
        System.out.println("Week "+ (highestSalesWeekNo+1) +" had the highest amount of sales");

        //The week number that had the lowest amount of sales
        int lowestSalesWeekNo=0;
        double tmpLowestSales = findWeeklyTotalSales(weeklyInfo.get(0));
        for(int i=0;i<weeklyInfo.size();i++){
            double weeklyTotalSales = findWeeklyTotalSales(weeklyInfo.get(i));
            // System.out.println("Week "+ i);
            // System.out.println("Sales in this week: " + weeklyTotalSales);
            if(weeklyTotalSales<tmpLowestSales){
                tmpLowestSales=weeklyTotalSales;
                lowestSalesWeekNo = i;
            }
        }
        System.out.println("Week "+ (lowestSalesWeekNo+1) +" had the lowest amount of sales");

    }
    public static int numOfDays(String data){
        String[] dailySales = data.split(",");
        return dailySales.length;
    }

    
    public static double findWeeklyTotalSales(String data){
        double weeklyAmount =0;
        String[] dailySales = data.split(",");

        for(int i=0; i<dailySales.length;i++){
            weeklyAmount += Double.parseDouble(dailySales[i]);
        }
        return weeklyAmount;
    }

    public static double findWeeklyAvgDailySales(String data){
        
        double weekTotalSales = findWeeklyTotalSales(data);

        int numOfDays = numOfDays(data);
        return weekTotalSales/numOfDays;
    }

}