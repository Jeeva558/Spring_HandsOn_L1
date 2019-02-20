package dependencyInjection_A1;

import java.util.List;

public class Student 
{
public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<Test> getStudentTest() {
		return studentTest;
	}
	public void setStudentTest(List<Test> studentTest) {
		this.studentTest = studentTest;
	}
private String studentId;
private String studentName;
private List<Test> studentTest;
}
