package high_school;

import java.util.ArrayList;

import school.Program;
import school.School;

public class School_HS implements School {
	private String name;
	private String location;
	private ArrayList<Program> avaliablePrograms;

	public School_HS(String name, String location, ArrayList<Program> avaliablePrograms) {
		this.name = name;
		this.location = location;
		this.avaliablePrograms = avaliablePrograms;
	}

	public School_HS(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public void addPrograms(Program program) {
		avaliablePrograms.add(program);
	}

	@Override
	public String schoolName() {
		return name;
	}

	@Override
	public String location() {
		return location;
	}

	@Override
	public ArrayList<Program> avaliablePrograms() {
		return avaliablePrograms;
	}

}
