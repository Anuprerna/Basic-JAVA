import java.io.Serializable;


public class Question implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String question;
	private String ans1;
	private String ans2;
	private String ans3;
	private String ans4;
	private String rans;
	private String urans;
	public String getUrans() {
		return urans;
	}
	public void setUrans(String urans) {
		this.urans = urans;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAns1() {
		return ans1;
	}
	public void setAns1(String ans1) {
		this.ans1 = ans1;
	}
	public String getAns2() {
		return ans2;
	}
	public void setAns2(String ans2) {
		this.ans2 = ans2;
	}
	public String getAns3() {
		return ans3;
	}
	public void setAns3(String ans3) {
		this.ans3 = ans3;
	}
	public String getAns4() {
		return ans4;
	}
	public void setAns4(String ans4) {
		this.ans4 = ans4;
	}
	public String getRans() {
		return rans;
	}
	public void setRans(String rans) {
		this.rans = rans;
	}
	

}
