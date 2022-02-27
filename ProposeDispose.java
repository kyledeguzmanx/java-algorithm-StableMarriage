import java.io.File;  //  File class
import java.io.FileNotFoundException;  // class to handle errors
import java.util.Scanner; // class to read files


public class ProposeDispose {
	public static void main(String args[]) {
		
		
		int numMen,numWomen, temp;

		try {
			
			File file = new File("input.txt");
			Scanner scanner = new Scanner(file);
			
			numMen = scanner.nextInt();
			numWomen = numMen;
			int [][] preferenceArry = new int[numWomen][numMen];
			int [][] outputArry = new int [numWomen][numMen];
	
			//INPUT TEXT FILE TO ARRAY
			//I'm not doing any checks like hasNextInt because i'm going to assume it will always be NxN input
			for(int i=0; i < numWomen; i++) {
				for(int j=0; j < numMen; j++) {
					preferenceArry[i][j] = scanner.nextInt();
				}
			}

			/*  CHECK THAT THE ARRAY POPULATED PROPERLY
			 for(int i=0; i < numWomen; i++) {
				for(int j=0; j < numMen; j++) {
					System.out.println(preferenceArry[i][j]);
				}
			}
			
			----------- The code below only works when n is equal to 4. i did not realize it until later. 
			for(int i=0; i < numWomen; i++) {
				for(int j=0; j < numMen; j++) {
					temp = 0;
					int counter = j;
					if(j+1 == preferenceArry[i][0]) {
						temp += 1;
					}                                           
					else if(j+1 == preferenceArry[i][1]) {
						temp += 2;
					}
					else if(j+1 == preferenceArry[i][2]) {
						temp += 3;
					}
					else if(j+1 == preferenceArry[i][3]) {
						temp += 4;
					}

					outputArry[i][j] = temp;
				}
			}
			
			 * */
			
			//CREATE OUTPUT ARRAY
			for(int i=0; i < numWomen; i++) {
				for(int j=0; j < numMen; j++) {
					int k = 0;
					while(j+1 != preferenceArry[i][k]) {
						k++;
					}
					outputArry[i][j] = ++k; //in case that the while loop never executes, I have to pre-increment it
				}
			}
			
			//PRINTING 
			for(int i=0; i < numWomen; i++) {
				for(int j=0; j < numMen; j++) {
					if(j == outputArry[0].length -1) {
						System.out.println(outputArry[i][j]);
					}
					else {
						System.out.print(outputArry[i][j]+"\t");
					}
				}
			}
			
			
		}
		 catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		
		
		
	}//end-main
		
}//end-ProposeDispose
