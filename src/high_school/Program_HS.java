package high_school;

import java.util.ArrayList;

import school.Program;
import school.Subject;

public class Program_HS implements Program {
	private String name;
	private double requiredHours;
	private ArrayList<Subject> curriculum;

	public Program_HS(String name, double requiredHours, ArrayList<Subject> curriculum) {
		this.name = name;
		this.requiredHours = requiredHours;
		this.curriculum = curriculum;
	}

	public Program_HS(String name, double requiredHours) {
		this.name = name;
		this.requiredHours = requiredHours;
	}

	public void addCurriculum(Subject subject) {
		curriculum.add(subject);
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public ArrayList<Subject> curriculum() {
		return curriculum;
	}

	@Override
	public double requiredHours() {
		return requiredHours;
	}
}
