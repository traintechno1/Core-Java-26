package core;

public class Chapter extends Teacher {
	
	String chapterName;
	int noOfLectures;
	
	Chapter(String chapterName, int noOfLectures, String subject, String name){
		super(name, subject);
		this.chapterName = chapterName;
		this.noOfLectures = noOfLectures;
	}
	
	void displayChapterDetails() {
		System.out.println("-------------Chapter Details------------");
		System.out.println("Name Of Teacher: " + this.name);
		System.out.println("Subject: " + this.subject);
		System.out.println("Chapter Name: " + this.chapterName);
		System.out.println("No Of Lectures Required: " + this.noOfLectures);
	}
}
