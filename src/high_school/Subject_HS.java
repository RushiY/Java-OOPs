package high_school;

import java.util.ArrayList;

import school.Student;
import school.Subject;

public class Subject_HS implements Subject {
	private String name;
	private double requiredGPA;
	private String description;
	private ArrayList<Student> enrolledStudents;

	public Subject_HS(String name, double requiredGPA, String description, ArrayList<Student> enrolledStudents) {
		this.name = name;
		this.requiredGPA = requiredGPA;
		this.description = description;
		this.enrolledStudents = enrolledStudents;
	}

	public Subject_HS(String name, double requiredGPA, String description) {
		this.name = name;
		this.requiredGPA = requiredGPA;
		this.description = description;
	}

	public void addEnrolledStudents(Student student) {
		enrolledStudents.add(student);
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public String description() {
		return description;
	}

	@Override
	public double requiredGPA() {
		return requiredGPA;
	}

	@Override
	public ArrayList<Student> enrolledStudents() {
		return enrolledStudents;
	}
}
