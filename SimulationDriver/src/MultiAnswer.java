import java.util.Random;

public class MultiAnswer extends Question {
	
    private String [] answer;
    private int [] solution;

    /*
     * When you enter the array of answers, the correct
     * answer must be first, or it won't work properly
     */
    public void setAnswer(String [] answer) {
        this.answer = answer;
        setSolution();
    }
    
    public String [] getAnswer() {
    	return answer;
    }
    
    /*
     * Sets the first as the solution
     */
    public void setSolution() {
    	this.solution = new int[answer.length];
    	for (int i = 0; i < answer.length; i++) {
    		if (i == 0) {
    			solution[i] = 1;
    		} else { 
    			solution[i] = 0;
    		}
    	}
    	swap(answer, solution);
    }
    
    public int [] getSolution() {
    	return solution;
    }
    
    public void printQuestion() {
    	System.out.println(this.getQuestion());
    	System.out.println();
    	for (int i = 0; i < this.answer.length; i++) {
    		System.out.println((i + 1) + ". " + answer[i]);
    	}
    }
    
    /*
     * This just swaps the answers around so its random.
     * 
     * Not sure why this was happening, but I originally kept
     * a copy of the array of answers to compare, but it wasn't
     * working cause the copy was getting swapped as well.
     */
    public void swap(String [] firstSwap, int [] secondSwap) {
    	Random rand = new Random();
    	for (int i = (answer.length - 1); i > 0; i--) {
    		int current = rand.nextInt(i + 1);
    		String temp1 = firstSwap[i];
    		firstSwap[i] = firstSwap[current];
    		firstSwap[current] = temp1;
    		
    		int temp2 = secondSwap[i];
    		secondSwap[i] = secondSwap[current];
    		secondSwap[current] = temp2;
    	}
    }
}