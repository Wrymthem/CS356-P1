public class Student {
    
    private int iD;
    private int [] answer;
    
    public Student (int iD) {
        this.setID(iD);
    }
    
    public void setID(int iD) {
        this.iD = iD;
    }
    
    /*
     * Here we store their answers as an array
     * as in Option 1, 2, 3, 4, etc.
     */
    public void setAnswer(int [] answer) {
    	this.answer = answer;
    }
    
    public int getID() {
        return this.iD;
    }
    
    public int [] getAnswer() {
    	return this.answer;
    }
}