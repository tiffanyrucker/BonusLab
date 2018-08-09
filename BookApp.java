package com.lab18;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Book> books = new ArrayList<>();
		Book myBook = new Book();// object
		String cont = "";
		int userNum;

		
		books.add((new Book("1234567891", "Agatha Christie", "Murder on the Orient Express", 15.00)));
		books.add((new Book("2345678910", "Agatha Christie", "Evil Under the Sun", 20.00)));
		books.add((new Book("3456789102", "Agatha Christie", "Death on the Nile", 18.50)));
		books.add((new UsedBook("4578565554", "Agatha Christie", "Triangle in Rhodes", 8.25, "used")));
		books.add((new UsedBook("1089786565", "Agatha Christie", "Death in the Clouds", 7.00, "acceptable")));
		books.add((new UsedBook("5958746232", "Agatha Christie", "10 Little Indians", 12.00, "good")));

		System.out.println("Which book would you like to choose?");

		do {
			for (int i = 0; i < books.size(); i++) {
				System.out.println((i + 1) + ":" + books.get(i)); 
				//printing out the number plus selection of books
			}

			userNum = scan.nextInt();// user's choice
			// print out the number of car user wants
			System.out.println(books.get(userNum - 1));
			System.out.println("Would you like to buy this book? (yes/no)");
			scan.nextLine(); // garbage line since going from int to string
			String answer = scan.nextLine();
			if (answer.equalsIgnoreCase("yes")) {
				System.out.println("Ok, thanks!");
				books.remove(userNum - 1);

				System.out.println("Would you like to choose another book? (yes/no)");
				cont = scan.nextLine();
				// System.out.println(books.get(userNum));
			}

		} while (cont.equalsIgnoreCase("yes"));

		// part2 of lab
		do {
			for (int i = 0; i < books.size(); i++) {
				System.out.println((i + 1) + ":" + books.get(i));
			}
			System.out.println("Would you like to add a book? (yes/no)");
			String answer = scan.nextLine();
			if (answer.equalsIgnoreCase("yes")) {
				System.out.println("How many books do you want to add?");
				int num = scan.nextInt();
				scan.nextLine();

				for (int i = 0; i < num; i++) {
					System.out.println("Enter Book #" + (i + 1) + " ISBN: ");
					String isbnInput = scan.nextLine();
					System.out.println("Enter Book #" + (i + 1) + " Author: ");
					String authorInput = scan.nextLine();
					System.out.println("Enter Book #" + (i + 1) + " Title: ");
					String titleInput = scan.nextLine();
					System.out.println("Enter Book #" + (i + 1) + " Price: $");
					Double priceInput = scan.nextDouble();
					scan.nextLine();
					System.out.println("Enter Book#" + (i + 1) + " Wear: ");
					String wearInput = scan.nextLine();

					books.add(new UsedBook(isbnInput, authorInput, titleInput, priceInput, wearInput));

				}
				System.out.println("Again?(yes/no)");
				cont = scan.nextLine();

				for (Book b : books) {
					System.out.println(b.toString());
				}

			}
		} while (cont.equalsIgnoreCase("yes"));
		System.out.println("Goodbye!Come again");

	}
}