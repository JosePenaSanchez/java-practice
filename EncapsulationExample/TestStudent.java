public class TestStudent{
	public static void main(String[] args){
		//Making Studnet Instance
		Student mStudent = new Student();

		mStudent.setStudentId(5555);
		mStudent.setStudentName("Jose Pena");
		mStudent.setCollegeName("Humboldt State University");
		mStudent.setAddress("123 Elm St.");

		System.out.println(mStudent.getStudentId());
		System.out.println(mStudent.getStudentName());
		System.out.println(mStudent.getCollegeName());
		System.out.println(mStudent.getAddress());
	}
}