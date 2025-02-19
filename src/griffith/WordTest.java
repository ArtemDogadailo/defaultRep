//Artem Dogadailo
//3133807

package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WordTest {

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
	
	//writing test cases for each of the unit test methods 
	//expected to fail initially
	//testing a range of values
	
	@Test
    public void testContains() {
        Word word = new Word(new char[]{'h', 'e', 'l', 'l', 'o'});
        assertTrue(word.contains('e')); 
    }

    @Test
    public void testLength() {
        Word word = new Word(new char[]{'h', 'e', 'l', 'l', 'o'});
        assertEquals(5, word.length()); 
    }

    @Test
    public void testNotNull() {
        Word word = new Word(new char[]{'h', 'e', 'l', 'l', 'o'});
        assertNotNull(word.getLetters()); 
    }

}
