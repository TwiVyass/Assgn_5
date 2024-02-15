/*
4. Write a menu-driven Java Program for the following: There are 52 cards in
a deck, each of which belongs to one of four suits and one of 13 ranks.
Should have methods:
 a) createDeck() //Can also add this  method as constructor
 b) printDeck()
 c) printCard()
 d) sameCard() //Card which is from same suit
 e) compareCard() //Card having same rank or number
 f) findCard() //Search for particular card
 g) dealCard() //Print 5 random cards
 h) shuffleDeck() //Randomize the deck
*/


public class Card {
	
	private String suit;
	private String value;
	
	//initializing values for that particular instance
	public Card(String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	
	// public card() {}
	public String getSuit() {
		return suit;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public String getValue() {
		return value;
	}
	
	public void getSuit(String value) {
		this.value = value;
	}
	
	// to return value and suit as String
	public String toString() {
		return "\n" + value + " of " + suit;
	}
	
}
		
		