// Task
/*The first thing we will need is a Scanner object created. 
We need to import the Scanner class. 
In your main() method, create a Scanner object and save it into a variable
Next, let's add in a menu so that the user can see their menu options.

Let's give the user the ability to choose a menu option. Recall that we will use the scanner object to get user input. Use the scanner object's nextInt() method to get the user's choice and make sure to save it into a variable named choice.

Now that the user can enter a menu choice, let's make a decision based off of that choice
Use switch statement

A switch statement takes in a value and tries to match it to a value in each of its case clauses.

Next, let's have the user make another decision, for example choice drink
Also use switch statment to chose drink

Test should show input and messeges


*/

import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    Scanner choiceObj = new Scanner(System.in);
    System.out.println("Welcome to our Diner! Please select an entree:\n"
        + "1) steak\n"
        + "2) wings\n"
        + "3) salad\n"
        + "4) pizza\n"
        + "5) nachos\n"
        + "6) garlic breed\n"
        + "7) cevapi\n"
        + "8) see food\n"
        + "and any other number for nothing!");

    int choice = choiceObj.nextInt();
    System.out.println("you choice is: " + choice);
    switch (choice) {
      case 1:
        System.out.println("Here is your steak!");
        break;
      case 2:
        System.out.println("Here is your wings!");
        break;
      case 3:
        System.out.println("Here is your salad!");
        break;
      case 4:
        System.out.println("Here is your pizza!");
        break;
      case 5:
        System.out.println("Here is your nachos!");
        break;
      case 6:
        System.out.println("Here is your garlic breed!");
        break;
      case 7:
        System.out.println("Here is your cevapi!");
        break;
      case 8:
        System.out.println("Here is your see food!");
        break;
      default:
        System.out.println("You want nothing?!");
        break;
      }
      

  }

}