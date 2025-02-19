//Artem Dogadailo
//3133807

package griffith;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradesTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testGradesMax() {
		Grades newGrades = new Grades();
		int[] grades1 = {70, 85, 90, 60, 95};
        int[] grades2 = {-10, -5, 0, 5, 10};
        int[] grades3 = null;
        
        //positive value case
        assertEquals(95, newGrades.gradesMax(grades1));
        
        //negative value case
        assertEquals(10, newGrades.gradesMax(grades2)); 
        
        //null value case
        assertEquals(10, newGrades.gradesMax(grades3)); 
	}

	public void testGradesTotal() {
		Grades newGrades = new Grades();
		int[] grades1 = {70, 85, 90, 60, 95};
        int[] grades2 = {-10, -5, 0, 5, 10};
        int[] grades3 = null;
        int[] grades4 = {};
        
        //positive value case
        assertEquals(95, newGrades.gradesMax(grades1));
        
        //negative value case
        assertEquals(10, newGrades.gradesMax(grades2)); 
        
        //null value case
        assertEquals(10, newGrades.gradesMax(grades3)); 
        
        //empty array case
        assertEquals(10, newGrades.gradesMax(grades4)); 
	}

	public void testGradesAverage() {
		Grades newGrades = new Grades();
		int[] grades1 = {70, 85, 90, 60, 95};
        int[] grades2 = {-10, -5, 0, 5, 10};
        int[] grades3 = null;
        
        //positive value case
        assertEquals(95, newGrades.gradesMax(grades1));
        
        //negative value case
        assertEquals(10, newGrades.gradesMax(grades2)); 
        
        //null value case
        assertEquals(10, newGrades.gradesMax(grades3)); 
	}

	public void testCountFails() {
		Grades newGrades = new Grades();
		
		int[] grades1 = {70, 85, 90, 60, 95};
        int[] grades2 = {50, 40, 30, 20, 10};
        int[] grades3 = {70, 80, 90, 100, 110};
        
        //One grade below 65
        assertEquals(1, newGrades.countFails(grades1, 65)); 
        //All grades below 65
        assertEquals(5, newGrades.countFails(grades2, 65));
        //No grades below 65
        assertEquals(0, newGrades.countFails(grades3, 65)); 
	}
	
}
