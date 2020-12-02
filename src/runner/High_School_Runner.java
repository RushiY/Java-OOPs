package runner;

import high_school.Program_HS;
import high_school.School_HS;
import high_school.Student_HS;
import high_school.Subject_HS;

public class High_School_Runner {
	public static void main(String[] args) {

		School_HS hebron = new School_HS("Hebron High School", "4207 Plano Pkwy, Carrollton, TX 75010");

			Program_HS computer_science = new Program_HS("Computer Science", 157);

				Subject_HS cs101 = new Subject_HS("CS101", 3.42, "Introductory course to programming.");
				Subject_HS cs102 = new Subject_HS("CS102", 3.31, "Amateur course to programming.");
				Subject_HS cs201 = new Subject_HS("CS201", 3.57, "Intermediate course to programming.");
				Subject_HS cs202 = new Subject_HS("CS202", 3.65, "Advanced course to programming.");

					Student_HS jack = new Student_HS("Jack", 3.71);
					Student_HS ben = new Student_HS("Ben", 3.24);
					Student_HS tom = new Student_HS("Tom", 3.58);
					Student_HS jerry = new Student_HS("Jerry", 3.96);

		// Program_HS business_management = new Program_HS("Business Management", 124);
		// Program_HS traditional_science = new Program_HS("Traditional Science", 192);

	}
}
