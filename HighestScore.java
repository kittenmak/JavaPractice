public class HighestScore{


	public static int findHighestScoreIndex(double[] score){
		double highest =0;
		int highestIndex =0;
		for(int i=0;i<score.length;i++){
			if (highest<score[i]){

				highest = score[i];
				highestIndex = i;
			}
		}
		return highestIndex;
	}

	public static void main(String[]args){
		double[] score = {90, 87.5, 85,97.5};
		String[] name = new String[4];
		for (int i=0; i<args.length;i++){
			name[i]=args[i];
		}
		int highestScoreIndex = findHighestScoreIndex(score);
		double highestScore = score[highestScoreIndex];
		String highestScoreStudent = name[highestScoreIndex];
		System.out.printf("%s is No.1 in Mid-term exam and he got %.1f. \n", highestScoreStudent, highestScore); 
		
	}



}