//Artem Dogadailo
//3133807

package griffith;

public class Grades {

 // Returns the maximum grade from the array
 public int gradesMax(int[] grades) {
     if (grades == null || grades.length == 0) {
         return Integer.MIN_VALUE; // Safe return value for empty/null arrays
     }
     
     int max = grades[0]; // Start with the first element
     for (int grade : grades) {
         if (grade > max) {
             max = grade;
         }
     }
     return max;
 }

 // Returns the sum of all grades in the array
 public int gradesTotal(int[] grades) {
     if (grades == null || grades.length == 0) {
         return 0; // Return 0 for empty/null arrays
     }

     int sum = 0;
     for (int grade : grades) {
         sum += grade;
     }
     return sum;
 }

 // Returns the average of all grades
 public double gradesAverage(int[] grades) {
     if (grades == null || grades.length == 0) {
         return 0.0; // Return 0.0 for empty/null arrays
     }
     return (double) gradesTotal(grades) / grades.length;
 }

 // Counts how many grades are below minGrade
 public int countFails(int[] grades, int minGrade) {
     if (grades == null || grades.length == 0) {
         return 0; // Return 0 for empty/null arrays
     }

     int count = 0;
     for (int grade : grades) {
         if (grade < minGrade) {
             count++;
         }
     }
     return count;
 }
}

