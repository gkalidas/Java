public class SimpleDotCom {
	int[] locationCells;
	int numberOfHits = 0;
	
	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}
	
	public String checkYourself(String stringGuesses) {
		int guess = Integer.parseInt(stringGuesses);
		String result = "miss";
		
		for(int cell: locationCells) {
			if(guess==cell) {
				result = "hit";
				numberOfHits ++;
				break;
			}
		}
		if(numberOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.print(result);
		return result;
	}
}
