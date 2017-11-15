public class CheckSpace{


    public static void main(String args[]){
        String str = "Java Coding is Tricky And Fun";
        int counter=0;
        for(int i=0; i < str.length();i++){
            
            if(Character.isWhitespace(str.charAt(i))){
                counter++;
                System.out.println(str.charAt(i) + " is a space");
            }else{
                System.out.println(str.charAt(i)+ " is not a space");
            }
        }
        System.out.println("Num of Space: "+ counter);
    }

}