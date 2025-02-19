//Artem Dogadailo
//3133807

package griffith;

public class Grades {

	// return max grades
	public int gradesMax(int[] grades) {
		int max = Integer.MIN_VALUE;
		for (int grade : grades) {
			if (grade > max) {
				max = grade;
			}
		}
		return max;
	}

	// get the sum of array
	public int gradesTotal(int[] grades) {
		int sum = 0;
		for (int grade : grades) {
			sum += grade;
		}
		return sum;
	}

	// get average value of an array
	public double gradesAverage(int[] grades) {
		// checking the grades length to avoid dividing by 0
		if (grades.length == 0)
			return 0;
		return (double) gradesTotal(grades) / grades.length;
	}

	// count how many grades less than the minimum grade
	public int countFails(int[] grades, int minGrade) {
		int count = 0;
		for (int grade : grades) {
			if (grade < minGrade) {
				count++;
			}
		}
		return count;
	}
}
