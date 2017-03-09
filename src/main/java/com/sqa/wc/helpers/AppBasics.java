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
	 * @param question
	 * @return
	 */
	public static boolean requestBoolean(String question) {
		String input;
		boolean count = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println(question + " ");
		input = scanner.nextLine();
		try {
			count = Boolean.parseBoolean(input.trim());
		} catch (NumberFormatException e) {
			System.out.println(
					"You have not entered a correct boolean value (" + input + ")\n Using false for set value");
		}
		return count;
	}

	/**
	 * @param string
	 * @return
	 */
	public static char requestChar(String question) {
		/**
		 * @param question
		 * @return
		 */
		String input;
		char character = 'A';
		System.out.println(question + " ");
		input = scanner.nextLine();
		character = input.trim().charAt(0);
		if (input.trim().length() > 1) {
			System.out.println("You have entered more than one character (" + input + ")\nUsing 'A' for set value");
		} else {
			character = input.trim().charAt(0);
		}
		return character;
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
			count = Double.parseDouble(input.trim());
		} catch (NumberFormatException e) {
			System.out.println("You have not entered a correct double value (" + input + ")\n Using 0 for set value");
		}
		return count;
	}

	public static float requestFloat(String question) {
		/**
		 * @param question
		 * @return
		 */
		String input;
		float count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println(question + " ");
		input = scanner.nextLine();
		try {
			count = Float.parseFloat(input.trim());
		} catch (NumberFormatException e) {
			System.out.println("You have not entered a correct float value (" + input + ")\n Using 0 for set value");
		}
		return count;
	}

	/**
	 * @param string
	 * @return
	 */
	public static int requestInt(String question) {
		/**
		 * @param question
		 * @return
		 */
		String input;
		int count = 0;
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

	public static long requestLong(String question) {
		/**
		 * @param question
		 * @return
		 */
		String input;
		long count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println(question + " ");
		input = scanner.nextLine();
		try {
			count = Long.parseLong(input.trim());
		} catch (NumberFormatException e) {
			System.out.println("You have not entered a correct long value (" + input + ")\n Using 0 for set value");
		}
		return count;
	}

	public static short requestShort(String question) {
		/**
		 * @param question
		 * @return
		 */
		String input;
		short count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println(question + " ");
		input = scanner.nextLine();
		try {
			count = Short.parseShort(input.trim());
		} catch (NumberFormatException e) {
			System.out.println("You have not entered a correct short value (" + input + ")\n Using 0 for set value");
		}
		return count;
	}

	/**
	 * @return
	 *
	 */
	public static String requestString(String question) {
		String input;
		Scanner scanner = new Scanner(System.in);
		System.out.println(question + " ");
		input = scanner.nextLine();
		return input;
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
