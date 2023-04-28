package list.pos;

import java.io.IOException;

/**
 * Demonstrates the use of a list to manage a set of objects.
 * 
 * @author Lewis and Chase
 * @version 4.0
 */
public class POSTester
{


	public static void test() throws IOException{
		ProgramOfStudy pos = new ProgramOfStudy();

		pos.addCourse(new Course("CS", 101, "Introduction to Programming", "A-"));
		pos.addCourse(new Course("ARCH", 305, "Building Analysis", "A"));
		pos.addCourse(new Course("GER", 210, "Intermediate German"));
		pos.addCourse(new Course("CS", 320, "Computer Architecture"));
		pos.addCourse(new Course("THE", 201, "The Theatre Experience"));

		System.out.println(pos);
		System.out.println("=============");

		Course arch = pos.find("CS", 320);
		pos.addCourseAfter(arch, new Course("CS", 321, "Operating Systems"));

		Course theatre = pos.find("THE", 201);
		theatre.setGrade("A-");

		Course german = pos.find("GER", 210);
		pos.replace(german, new Course("FRE", 110, "Beginning French", "B+"));

		System.out.println(pos);


		Course c1 = new Course("GEIT", 2421, "Data Structures");
		Course c2 = new Course("GEIT", 2411, "Data Structures");

		System.out.println(c1.equals(c2));

		for (Course c: pos) {
			System.out.println(c);
		}
	}
	/**
	 * Creates and populates a Program of Study. Then saves it using serialization.
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		test();
	}
}
