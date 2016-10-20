import java.util.Hashtable;

public class IVoteService {

	/*
	 * This stores the users and their answers. In this case, the key is their
	 * ID and the value stored is their answer array
	 */
	private Hashtable <Integer, int []> table = new Hashtable <Integer, int []> ();
	private Question question;
	private int [] answers;
	
	/*
	 * We want to clear the table for every new question
	 */
	public void setQuestion(Question question) {
		table.clear();
		this.question = question;
		this.answers = question.getSolution();
	}
	
	/*
	 * Stores the students in the table
	 */
	public void getAnswer(Student student) {
		table.put(student.getID(), student.getAnswer());
	}
	
	/*
	 * This was used to test if I got the correct answer in my test cases
	 */
	public boolean correctAnswer(Student student) {
		for (int i = 0; i < answers.length; i++) {
			if (student.getAnswer()[i] != answers[i]) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * The for loop pulls all the values from the hashtable then
	 * iterates through them. Since all of the values are 0 except
	 * for the selection that the student believes is correct, we
	 * can add them without worrying about whether its correct or not
	 */
	public void printTotals() {
		int [] totals = new int[question.getSolution().length];
		for (int [] answerCheck : table.values()) {
			for (int i = 0; i < totals.length; i++) {
				totals[i] += answerCheck[i];
			}
		}
		
		System.out.println();
		System.out.println("Results");
		for (int i = 0; i < totals.length; i++) {
			System.out.println((i + 1) + ": " + totals[i]);
		}
	}
}
