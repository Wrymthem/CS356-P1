public abstract class Question {
    
    private String question;
    private String [] answer;
    
    public void setQuestion(String question) {
        this.question = question;
    }
    
    public void setAnswer(String [] answer) {
        this.answer = answer;
    }
    
    public abstract void setSolution();
    
    public String getQuestion() {
        return this.question;
    }
    
    public String [] getAnswer() {
        return this.answer;
    }
    
    public abstract int [] getSolution();
    
    
    public abstract void printQuestion();
}