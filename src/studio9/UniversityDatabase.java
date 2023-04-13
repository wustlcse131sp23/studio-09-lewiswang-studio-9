package studio9;

import assignment7.Student;

import java.util.Map;
import java.util.HashMap;

public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions

	private final Map<String, Student> students;
	
	public UniversityDatabase() {
	    this.students = new HashMap<>();

	}
	
	public void addStudent(String accountName, Student student) {
		students.put(accountName, student);
	}

	public int getStudentCount() {
		return students.size();
	}

	public String lookupFullName(String accountName) {
	    Student student = students.get(accountName);
	    if (student != null) {
	        return student.getFullName();
	    } else {
	        return null;
	    }
	}

	public double getTotalBearBucks() {
		double total = 0.0;
		for (Student student : students.values()) {
			total += student.getBearBucksBalance();
		}
		return total;
	}
	
	
	
}
