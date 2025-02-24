package Coding;
import java.util.Scanner;
public class Task2 {

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of subjects: ");
	        int numSubjects = scanner.nextInt();
	        int[] marks = new int[numSubjects];
	        int totalMarks = 0;
	        for (int i = 0; i < numSubjects; i++) {
	            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
	            marks[i] = scanner.nextInt();
	            totalMarks += marks[i];
	        }
	        double averagePercentage = totalMarks / (double) numSubjects;
	        String grade;
	        if (averagePercentage >= 90) {
	            grade = "A+";
	        } else if (averagePercentage >= 80) {
	            grade = "A";
	        } else if (averagePercentage >= 70) {
	            grade = "B+";
	        } else if (averagePercentage >= 60) {
	            grade = "B";
	        } else if (averagePercentage >= 50) {
	            grade = "C";
	        } else if (averagePercentage >= 40) {
	            grade = "D";
             } else {
	            grade = "F";
	        }
	        System.out.println("\nResults:");
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Percentage: " + averagePercentage + "%");
	        System.out.println("Grade: " + grade);
	        scanner.close();
	    }
	}