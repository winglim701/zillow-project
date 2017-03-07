/**
 *   File Name: AppBasics.java<br>
 *
 *   Chan, William<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 6, 2017
 *
 */

package com.sqa.wc.helpers;

import java.util.*;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chan, William
 * @version 1.0.0
 * @since 1.0
 *
 */
public class AppBasics {

	static Scanner scanner = new Scanner(System.in);

	/**
	 * Method to farewell user given the appName and user name
	 */
	public static void farewellUser(String appName, String user) {
		System.out.println("Thank you for using the " + appName + " app " + user + ", have a great day!");
	}

	/**
	 * @param string
	 * @return
	 */
	public static double requestDouble(String question) {
		/**
		 * @param question
		 * @return
		 */
		String input;
		double count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println(question + " ");
		input = scanner.nextLine();
		try {
			count = Integer.parseInt(input.trim());
		} catch (NumberFormatException e) {
			System.out
					.println("You have not entered a correct numerical value (" + input + ")\n Using 0 for set value");
		}
		return count;
	}

	/**
	 * Helper method to welcome user and return their supplied name.
	 */
	public static String welcomeUserAndName(String appName) {
		System.out.println("Welcome to the " + appName + " application.");
		System.out.print("Could I get your name?");
		return scanner.nextLine();
	}
}
