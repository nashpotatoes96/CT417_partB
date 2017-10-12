package studentregsystemtester;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.joda.time.DateTime;

import com.sys.reg.CourseProgram;
import com.sys.reg.Module;
import com.sys.reg.Student;

public class StudentRegSystemTest {
	
	public static void main(String args[]) throws ParseException {
		
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date date1 = dateformat.parse("12/12/1994");
		Student valarie = new Student("Valarie", date1, 1001);
		
		Date date2 = dateformat.parse("13/3/1996");
		Student david = new Student("David", date2, 1002);
		
		Date date3 = dateformat.parse("1/1/1994");
		Student mary = new Student("Mary", date3, 1003);
		
		Date date4 = dateformat.parse("25/9/1995");
		Student john = new Student("John", date4, 1004);
		
		Date date5 = dateformat.parse("8/8/1998");
		Student elena = new Student("Elena", date5, 1005);
		
		Date date6 = dateformat.parse("11/5/1995");
		Student alan = new Student("Alan", date6, 1006);
		
		
		Student[] students1 = new Student[3];
		students1[0] = valarie;
		students1[1] = david;
		students1[2] = mary;
		Module softEng = new Module("Software Engineering", "CT417", students1);
		
		Student[] students2 = new Student[3];
		students2[0] = valarie;
		students2[1] = david;
		students2[2] = mary;
		Module dataSys = new Module("Database Systems", "CT230", students2);
		
		Student[] students3 = new Student[3];
		students3[0] = john;
		students3[1] = elena;
		students3[2] = alan;
		Module teleCom = new Module("Telecommunications", "EE453", students3);
		
		Student[] students4 = new Student[3];
		students4[0] = john;
		students4[1] = elena;
		students4[2] = alan;
		Module realTim = new Module("Real Time Systems", "EE420", students4);
		
		
		Module[] modules1 = new Module[2];
		modules1[0] = softEng;
		modules1[1] = dataSys;
		DateTime start1 = new DateTime(25/8/2017);
		DateTime end1 = new DateTime(9/5/2021);
		CourseProgram comSci = new CourseProgram("Computer Science", modules1, start1, end1);
		
		Module[] modules2 = new Module[2];
		modules2[0] = teleCom;
		modules2[1] = realTim;
		DateTime start2 = new DateTime(25/8/2016);
		DateTime end2 = new DateTime(9/5/2020);
		CourseProgram eleCom = new CourseProgram("Electronic Engineering", modules2, start2, end2);
		
		CourseProgram[] courses = new CourseProgram[2];
		courses[0] = comSci;
		courses[1] = eleCom;
		
		for(int i = 0; i < courses.length; i++) {
			
			System.out.println("Course name:" + courses[i].getName() + "\n");
			Module[] modules = courses[i].getModules();
			
			for(int j = 0; j < modules.length; j++) {
				
				System.out.println("\tModule name:\t" + modules[j].getName() + "\n");
				Student[] students = modules[j].getStudents();
				
				for(int k = 0; k < students.length; k++) {
					
					System.out.println("\t\tStudent username:\t\t" + students[k].getUsername() + "\n");
					
				}
			}
		}
		
	}

}
