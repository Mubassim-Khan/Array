// Write a program to define a 2D array and store students’ marks of different subjects. Calculate the average marks of students and average marks of Subjects.

public class Program1 {
    public static void main(String[] args) {
        int[][] marks = {
                { 85, 90, 78, 92, 88 },
                { 76, 80, 70, 85, 91 },
                { 90, 88, 92, 78, 85 },
                { 88, 82, 79, 90, 76 },
                { 94, 89, 91, 87, 84 }
        };

        int totalStudents = marks.length;
        int numOfSubjects = marks[0].length;

        // Calculate the average marks of students
        double[] studentAverages = new double[totalStudents];
        for (int i = 0; i < totalStudents; i++) {
            int sum = 0;
            for (int j = 0; j < numOfSubjects; j++) {
                sum += marks[i][j];
            }
            studentAverages[i] = (double) sum / numOfSubjects;
        }

        // Calculate the average marks of subjects
        double[] subjectAverage = new double[numOfSubjects];
        for (int j = 0; j < numOfSubjects; j++) {
            int sum = 0;
            for (int i = 0; i < totalStudents; i++) {
                sum += marks[i][j];
            }
            subjectAverage[j] = (double) sum / totalStudents;
        }

        // Display the average marks of students
        System.out.println("Average marks of each student is");
        for (int i = 0; i < totalStudents; i++) {
            System.out.println("Student " + (i + 1) + ": " + studentAverages[i]);
        }

        // Display the average marks of subjects
        System.out.println("\nAverage marks of each subject is");
        for (int j = 0; j < numOfSubjects; j++) {
            System.out.println("Subject " + (j + 1) + ": " + subjectAverage[j]);
        }
    }
}