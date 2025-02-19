//Artem Dogadailo
//3133807

package griffith;

public class Word {
	//adding an attrubute letters
	private char[] letters;

    //creating constructor
	//modifying constructor
	public Word(char[] letters) {
	    if (letters == null) {
	        throw new IllegalArgumentException("Letters cannot be null");
	    }
	    this.letters = letters;
	}

    // Checks if the word contains a given character
	public boolean contains(char symbol) {
	    for (char letter : letters) {
	        if (letter == symbol) {
	            return true;
	        }
	    }
	    return false;
	}

    // Returns the length of the word
	public int length() {
	    return letters.length;
	}

    // Returns the letters array
	public char[] getLetters() {
	    return letters;
	}
}
