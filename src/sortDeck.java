import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class sortDeck {
	public static Comparator<Integer> compare= new Comparator<Integer>(){
		@Override
		public int compare(Integer i, Integer j) {
			return (int)i-j;
		}
	};

	public static void main(String[] args) {
		ArrayList<Integer> originalDeck = new ArrayList<Integer>();
		
		//Initalize array
		for (int i = 0; i < 52; i++) {
			originalDeck.add(i, i);
		}
	
		//Shuffle deck
		Collections.shuffle(originalDeck);
		System.out.println(originalDeck);
		
		//Smart Implementation
		Collections.sort(originalDeck);
		System.out.println(originalDeck);
		
		//Shuffle deck
		Collections.shuffle(originalDeck);
		System.out.println(originalDeck);
		
		//Long Implementation
		originalDeck.sort(compare); //implemented my own comparator
		System.out.println(originalDeck);
			
	}
}
