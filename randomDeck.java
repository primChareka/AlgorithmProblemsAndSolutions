import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class randomDeck {
	public static Comparator<Integer> compareReverse= new Comparator<Integer>(){
		@Override
		public int compare(Integer i, Integer j) {
			return (int)i-j;
		}
	};
	/*
	 * Generate random numbers between 1 and 52. Once number is picked don't want to
	 * pick it again Let 0-12 = Heart such that 0 = Ace, 10 = Jack, 11 = Queen, 12 =
	 * King Let 13-25 = Spades Let 26-38 = Clubs Let 39-51 = Diamonds
	 * 
	 * Uses a random number generator that picks numbers within a valid index range.
	 * We can get the index range by always decrementing by one or use of array.getSize
	 * 
	 *Need loop to integrate until deck is empty. This means we are moving from one deck to another, need to decks
	 *Remove one deck add to another
	 */

	public static void main(String[] args) {
		ArrayList<Integer> orderedDeck = new ArrayList<Integer>();
		ArrayList<Integer> randomDeck = new ArrayList<Integer>();
		
		//Initalize array
		for (int i = 0; i < 52; i++) {
			orderedDeck.add(i, i);
		}
	
		//Smart Implementation
		Collections.shuffle(orderedDeck);
		System.out.println(orderedDeck);
		
		int i=0, max = 0;
		Collections.sort(orderedDeck);
		
		//Long Implementation
		while (orderedDeck.size() != 0) {
			max = orderedDeck.size();
			i = (int) (Math.random() * max); // goes from 0 to size-1 so always in bounds
			randomDeck.add(orderedDeck.remove(i));
		}
			
		//
		orderedDeck.sort(compareReverse);
		System.out.println(orderedDeck);
		/*
		
		int current = 0;
		for(i=0;i<52;i++) {
			current = randomDeck.get(i);
			if(current>=0&&current<13) {
				System.out.println("<3 "+ current);
			}else if(current>=13&&current<26) {
				System.out.println("<3- " + current%13);
			}else if(current>=26&&current<39) {
				System.out.println("<q " + current%13);
			}else if(current>=39&&current<52) {
				System.out.println("<> " + current%13);
				
			}else {
				System.out.println("error");
			}
		}
		*/
		
	}

}
