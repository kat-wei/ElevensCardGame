/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevens;

/**
 *
 * @author 18_kat_18
 */
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
            String[] ranks = {"jack","queen", "king", "ace", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
            String[] suits = {"spades", "diamonds", "clubs", "hearts"};
            int[] pointValue = { 0, 0, 0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            Deck one = new Deck(ranks, suits, pointValue);
            System.out.println(one.deal());
            System.out.println(one);
	}
}
