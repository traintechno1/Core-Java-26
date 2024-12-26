package college;

public class CollegeDetails {
	
	public String collegeName;
	int noOfStudentsEnrolled;
	String city;
	
	public CollegeDetails(
			String collegeName,
			int noOfStudentsEnrolled,
			String city
			) {
		this.collegeName = collegeName;
		this.noOfStudentsEnrolled = noOfStudentsEnrolled;
		this.city = city;
	}
	
	public void getCollegeDetails() {
		System.out.println("College Name: " + this.collegeName + " No Of Students: "
				+ this.noOfStudentsEnrolled + " City: " + this.city);
	}
	
}
