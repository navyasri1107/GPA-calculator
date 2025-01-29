 import java.util.Scanner;

public class GPAcalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of courses: ");
        int numCourses = scanner.nextInt();
        double totalPoints = 0.0;
        int totalCredits = 0;

        // Loop through each course and get grades and credit hours
        for (int i = 0; i < numCourses; i++) {
            System.out.println("\nCourse " + (i + 1) + ":");

            System.out.print("Enter the grade (A, B, C, D, F): ");
            char grade = scanner.next().toUpperCase().charAt(0);

            System.out.print("Enter the number of credit hours for this course: ");
            int credits = scanner.nextInt();

            // Convert letter grade to grade points (assuming 4.0 scale)
            double gradePoints = getGradePoints(grade);

            // Add to total points and total credits
            totalPoints += gradePoints * credits;
            totalCredits += credits;
        }
         scanner.close();
        // Calculate GPA
        double gpa = totalPoints / totalCredits;
        System.out.printf("\nYour GPA is: %.2f\n", gpa);
    }

    // Method to convert letter grade to grade points
    private static double getGradePoints(char grade) {
        switch (grade) {
            case 'A': return 4.0;
            case 'B': return 3.0;
            case 'C': return 2.0;
            case 'D': return 1.0;
            case 'F': return 0.0;
            default: 
                System.out.println("Invalid grade. Assuming 'F' grade.");
                return 0.0;
        }
    }
}
 
