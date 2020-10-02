public class Student{
	//Data Fields
	private int studentId;
	private String studentName, collegeName, address;


	//Setters
	public void setStudentId(int studentId){
		this.studentId = studentId;
	}

	public void setStudentName(String studentName){
		this.studentName = studentName;
	}

	public void setCollegeName(String collegeName){
		this.collegeName = collegeName;
	}

	public void setAddress(String address){
		this.address = address;
	}


	//Getters
	public int getStudentId(){
		return studentId;
	}

	public String getStudentName(){
		return studentName;
	}

	public String getCollegeName(){
		return collegeName;
	}

	public String getAddress(){
		return address;
	}

}