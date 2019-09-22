import java.util.Scanner;

public class Topics {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		String[] topics = new String[5];
		int i;
		int j;
		int rate;
		int choice;
		int quit = 1;
		
	
		topics[0] = "Champions League Soccer";
		topics[1] = "Cybersecurity";
		topics[2] = "College Sports";
		topics[3] = "Military News";
		topics[4] = "Education a scam";
		
		int survey[][];
		survey = new int[5][10];
		
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 10; j++) {
				survey [i][j] = 0;
				//System.out.println(i,j+"\t");
			}
		}
		int surveyCount = 0;
		int x;//topics tracker
		System.out.println("Choice 1. Rate each topic ");
		while (quit != 0) {
			 
			choice = scnr.nextInt();
			if (choice == 1)
			{
				for (x = 0; x < 5; x++) {
					System.out.printf(topics[x] + ":");
					rate = scnr.nextInt();//what the use rates the topics
					survey[x][rate] = survey[x][rate] + 1;
					}
				surveyCount++;
				}
			if (choice == 2){
				System.out.println("Display of the table below: ");
				System.out.println("topic" + "| |" + "ratings" + "| |" + "avg_Rate");
				int totalResponses = 0;
				int keepTrack = 0;
				int highestPoint= 0;
				int lowestPoint = 0;
				for (i = 0; i < 5; i++) {
					
					for (j = 0; j < 10; j++) {
						totalResponses = totalResponses + (survey[i][j]);//store all the responses of the survey in total
						keepTrack = keepTrack + survey[i][j];
						//System.out.print(totalResponses);
						//System.out.print(keepTrack);
					}
					System.out.println();
					System.out.println(topics[i] + "| |" + totalResponses + "| |" + ((double)totalResponses/ keepTrack));
				
				if (highestPoint < totalResponses) {
					highestPoint = totalResponses;
					highestPoint = i;
				}
				if (lowestPoint > totalResponses) {
					lowestPoint = totalResponses;
					lowestPoint = i;
				}

				}
				System.out.println ("The topic with highest point  is" + " " + topics[highestPoint]);
				System.out.println ("The topic with lowest point is" + " " + topics[lowestPoint]);
			}
			if (choice == 3){
				System.out.println("Not doing the survey.");
			}
	
		

	}
 }
}
