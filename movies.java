/**
 *  Author: MazzyK
 *  Description: A java implementation to find two movies with a total duration less than that of the flight - 30. If more than one pair exists, return pair with longest movie
 */
package flightmovies;

import java.util.ArrayList;



public class movies {
	
	public static ArrayList<Integer> findMoviePair(int flightDur, ArrayList<Integer> movieDurations){
		
		ArrayList<Integer> tempArray = new ArrayList<Integer>(); //temp array
		int len = movieDurations.size(); //get size of movieDurations array
		int maxTime = flightDur - 30; //max size of movie pair durations allowed
		ArrayList<Integer> result = new ArrayList<Integer>(); // create new dynamic array to store result replaceFirst()
		int [] temp = new int [2];
		int largerNum=0; //to store larger number of pair result
		int pairDuration;
		
		//two loops to create comparison of pair sums in movieDurations
		
		for (int i=0; i<len; i++){
		    for (int j=i+1;j<len;j++){
		        if(movieDurations.get(i)+movieDurations.get(j)<= maxTime){
		            result.add(movieDurations.get(i));
		            result.add(movieDurations.get(j));
		        }
		    }
		}
				
		//if more than one pair found, find pair with largest packagesSpace
		
		if (result.size()>2){				//if result contains more than one pair 
		    
			temp[0]=result.get(0);
			temp[1] = result.get(1);
			pairDuration = result.get(1)+result.get(2); //duration of the two movies
			
			//find which of the two movies in the pair has the longest duration and assign it to largerNum variable
			if(temp[0]>temp[1]) {
				largerNum = temp[0];
			}else {
				largerNum = temp[1];
			}
			
			//loop through result, increment by 2 to check pairs not individual elements
			
			for (int i=2; i<result.size();i+=2) {
				if (result.get(i)+result.get(i+1)>=pairDuration) { //if the next pair has a longest duration
					if ((result.get(i)>largerNum)||(result.get(i+1)>largerNum)) { //if the next pair contains a duration greater than the previous longest duration
						temp[0] = result.get(i);
						temp[1] = result.get(i+1);
						pairDuration = result.get(i)+result.get(i+1); //update pair duration to new sum 
						
						//update new longest duration in pair
						if(temp[0]>temp[1]) {
							largerNum = temp[0];
						}else {
							largerNum = temp[1];
						}
					}
				}
				
			}
			
			//assign final pair to tempArray and return it as a result
		    tempArray.add(temp[0]); 
			tempArray.add(temp[1]);    
		    return tempArray;
			  
		}else{
			return result;
		}
	}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int one =250;
			ArrayList<Integer> test = new ArrayList<Integer>();
			
			test.add(90);
			test.add(85);
			test.add(75);
			test.add(60);
			test.add(120);
			test.add(150);
			test.add(125);
			
			System.out.print(findMoviePair(one,test));
		}
}
