package com.bridgelabz.Addressbook;

import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
	
		System.out.println("Welcome to the Address Book Program");
		AddressBookMain main = new AddressBookMain();
		main.operation();
	}

	public void operation() {
		AddressBook contact = new AddressBook();
		contact.setUpInfo();
		contact.displayListItems();

		System.out.println("Press 1 to continue adding a new contact");
		System.out.println("Press 2 to edit an existing contact");	
		System.out.println("Press 3 to delete an existing contact");
		System.out.println("Press 0 to exit the address book program    ");
		
				Scanner in = new Scanner(System.in);
				int operation = in.nextInt();
				if (operation == 1) {
					contact.setUpInfo();
					contact.displayListItems();
				} else if (operation == 2) {
					System.out.println("You have chosen to edit a contact");
					contact.editContact();
				} else if (operation==3) {
					System.out.println("You have chosen to delete a contact");
					contact.deleteContact();
				} else if (operation == 0) {
					System.out.println("You have chosen to exit the program");
					System.exit(0);
				}
	}
}	

