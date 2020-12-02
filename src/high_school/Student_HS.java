package high_school;

import java.util.ArrayList;

import school.Student;
import school.Subject;

public class Student_HS implements Student {
	private String name;
	private double gpa;
	private ArrayList<Subject> schedule;

	public Student_HS(String name, double gpa, ArrayList<Subject> schedule) {
		this.name = name;
		this.gpa = gpa;
		this.schedule = schedule;
	}

	public Student_HS(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	public void addSchedule(Subject subject) {
		schedule.add(subject);
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public double gpa() {
		return gpa;
	}

	@Override
	public ArrayList<Subject> schedule() {
		return schedule;
	}
}
