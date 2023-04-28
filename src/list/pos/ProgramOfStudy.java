package list.pos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * Represents a Program of Study, a list of courses taken and planned, for an
 * individual student.
 * 
 * @author Lewis and Chase
 * @version 4.0
 */
public class ProgramOfStudy implements Iterable<Course>
{
	private List<Course> list;
	
	/**
	 * Constructs an initially empty Program of Study.
	 */
	public ProgramOfStudy()
	{
		list = new ArrayList<Course>();
	}
	
	/**
	 * Adds the specified course to the end of the course list.
	 * 
	 * @param course the course to add
	 */
	public void addCourse(Course course)
	{
		if (course != null)
			list.add(course);
	}
	
	/**
	 * Finds and returns the course matching the specified prefix and number.
	 * 
	 * @param prefix the prefix of the target course
	 * @param number the number of the target course
	 * @return the course, or null if not found
	 */
	public Course find(String prefix, int number)
	{
		for (Course course : list) {
			if (prefix.equals(course.getPrefix()) &&
					number == course.getNumber())
				return course;
		}
		return null;
	}
	
	/**
	 * Adds the specified course after the target course. Does nothing if
	 * either course is null or if the target is not found.
	 * 
	 * @param target the course after which the new course will be added
	 * @param newCourse the course to add
	 */
	public void addCourseAfter(Course target, Course newCourse)
	{
		if (target == null || newCourse == null)
			return;
		
		int targetIndex = list.indexOf(target);
		if (targetIndex != -1)
			list.add(targetIndex + 1, newCourse);
	}

	/**
	 * Replaces the specified target course with the new course. Does nothing if
	 * either course is null or if the target is not found.
	 * 
	 * @param target the course to be replaced
	 * @param newCourse the new course to add
	 */
	public void replace(Course target, Course newCourse)
	{
		if (target == null || newCourse == null)
			return;
		
		int targetIndex = list.indexOf(target);
		if (targetIndex != -1)
			list.set(targetIndex, newCourse);
	}

	/**
	 * Creates and returns a string representation of this Program of Study.
	 * 
	 * @return a string representation of the Program of Study
	 */
	public String toString()
	{
		String result = "";
		for (Course course : list)
			result += course + "\n";
		return result;
	}
	
	/**
	 * Returns an iterator for this Program of Study.
	 * 
	 * @return an iterator for the Program of Study
	 */
	public Iterator<Course> iterator()
	{
		return list.iterator();
	}

}
