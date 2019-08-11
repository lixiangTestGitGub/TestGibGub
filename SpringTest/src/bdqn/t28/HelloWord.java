package bdqn.t28;

public class HelloWord {
	
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println(userName);
		this.userName = userName;
	}
	
	public void hello() {
		System.out.println("hello"+userName);
	}

	public HelloWord() {

	}

	public HelloWord(String userName) {
		this.userName = userName;
	}
}
