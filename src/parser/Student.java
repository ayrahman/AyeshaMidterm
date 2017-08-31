package parser;

public class Student {

	/*
	 * Student class have 4 variables which will be constructed as Student Object into List<Student>.
	 */
	protected String firstName;
	protected String lastName;
	protected String score;
	protected String id;

	public Student() {
	}

	@Override
	public String toString(){
		return "Student" + "("+"id= "+id+")"+ firstName+" "+lastName+" "+" Grade = "+score;
	}
	
	}
