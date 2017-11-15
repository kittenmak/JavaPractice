public class FirstLetterAsString{

    public static void main(String[] args){
        String str = "Java Coding is Tricky And Fun";
        String[] strArray = str.split(" ");
        String initial = "";
        for(int i=0;i<strArray.length;i++){
            
            initial = initial + strArray[i].charAt(0);
        }
        System.out.println(initial);
    }
}

