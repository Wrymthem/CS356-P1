public class SingleAnswer extends Question{
    private String [] answer;
    private int [] solution = new int [2];
    private String [] choices = {"True", "False"};
    
    /*
     * When you enter the array of answers, the correct
     * answer must be first, or it won't work properly
     */
    public void setAnswer(String [] answer) {
        this.answer = answer;
        this.setSolution();
    }
    
    public String [] getAnswer() {
    	return answer;
    }

    /*
     * Sets the first as the solution
     */
    public void setSolution() {
    	for (int i = 0; i < choices.length; i++) {
    		if (choices[i].matches(answer[0])) {
    			solution[i] = 1;
    		} else { 
    			solution[i] = 0;
    		}
    	}
    }
    
    public int [] getSolution() {
    	return solution;
    }
    
    public void printQuestion() {
    	System.out.println(this.getQuestion());
    	System.out.println();
    	for (int i = 0; i < this.choices.length; i++) {
    		System.out.println((i + 1) + ". " + choices[i]);
    	}
    }
}
