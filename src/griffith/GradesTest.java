//Artem Dogadailo
//3133807

package griffith;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradesTest {

	private Grades newGrades;

	@BeforeEach
	void setUp() {
		// Initialize the Grades object before each test
		newGrades = new Grades(); 
	}

	@Test
	public void testGradesMax() {
		int[] grades1 = { 70, 85, 90, 60, 95 };
		int[] grades2 = { -10, -5, 0, 5, 10 };
		int[] grades3 = {}; // Empty array case

		// Positive value case
		assertEquals(95, newGrades.gradesMax(grades1));

		// Negative value case
		assertEquals(10, newGrades.gradesMax(grades2));

		// Empty array case (should return Integer.MIN_VALUE as default)
		assertEquals(Integer.MIN_VALUE, newGrades.gradesMax(grades3));

		// Null value case (should return Integer.MIN_VALUE as safe handling)
		assertEquals(Integer.MIN_VALUE, newGrades.gradesMax(null));
	}

	@Test
	public void testGradesTotal() {
		int[] grades1 = { 70, 85, 90, 60, 95 };
		int[] grades2 = { -10, -5, 0, 5, 10 };
		int[] grades3 = {}; // Empty array case

		// Positive value case
		assertEquals(400, newGrades.gradesTotal(grades1));

		// Negative value case
		assertEquals(0, newGrades.gradesTotal(grades2));

		// Empty array case (should return 0)
		assertEquals(0, newGrades.gradesTotal(grades3));

		// Null value case (should return 0)
		assertEquals(0, newGrades.gradesTotal(null));
	}

	@Test
	public void testGradesAverage() {
		int[] grades1 = { 70, 85, 90, 60, 95 };
		int[] grades2 = { -10, -5, 0, 5, 10 };
		int[] grades3 = {};

		// Positive value case
		assertEquals(80.0, newGrades.gradesAverage(grades1), 0.01);

		// Negative value case
		assertEquals(0.0, newGrades.gradesAverage(grades2), 0.01);

		// Empty array case
		assertEquals(0.0, newGrades.gradesAverage(grades3), 0.01);

		// Null value case
		assertEquals(0.0, newGrades.gradesAverage(null), 0.01);
	}

	@Test
	public void testCountFails() {
		int[] grades1 = { 70, 85, 90, 60, 95 };
		int[] grades2 = { 50, 40, 30, 20, 10 };
		int[] grades3 = { 70, 80, 90, 100, 110 };

		// One grade below 65
		assertEquals(1, newGrades.countFails(grades1, 65));

		// testing all grades below 65
		assertEquals(5, newGrades.countFails(grades2, 65));

		// testing if no grades below 65
		assertEquals(0, newGrades.countFails(grades3, 65));

		// null grade
		assertEquals(0, newGrades.countFails(null, 65));

		// checking for empty array case
		assertEquals(0, newGrades.countFails(new int[] {}, 65));
	}
}
