package dependencyInjection_A1;

import java.util.List;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependencyInjection_A2.Player;

public class MainApp 
{
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("Student.xml");
		String[] students= {"student1","student2"};
		for(String studentbean:students)
		{
			System.out.println("<-----Start----->");
			Student student=(Student) ap.getBean(studentbean);
			System.out.println("StudentId = "+student.getStudentId());
			System.out.println("StudentName = "+student.getStudentName());
			List<Test> test=student.getStudentTest();
			for(Iterator it=test.iterator();it.hasNext();)
			{
				Test ts=(Test) it.next();
				System.out.println("TestId = "+ts.getTestId());
				System.out.println("TestTitle = "+ts.getTestTitle());
				System.out.println("TestMarks = "+ts.getTestMarks());
				
			}
				
			System.out.println("<-----End----->");
			System.out.println();
		}
	     
	   }
}
