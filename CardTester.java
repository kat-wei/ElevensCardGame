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
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
                Card one = new Card("ace", "spades", 1);
                System.out.println(one);
                
                Card two = new Card("jack", "hearts", 0);
                System.out.println(two);
                
                Card three = new Card("queen", "clubs", 0);
                System.out.println(three);
	}
}

