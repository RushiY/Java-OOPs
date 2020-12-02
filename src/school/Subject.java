package school;

import java.util.ArrayList;

public interface Subject {
	public String name();

	public double requiredGPA();

	public ArrayList<Student> enrolledStudents();

	public String description();
}
