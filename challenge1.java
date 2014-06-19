import java.util.Scanner;

public class challenge1
{
	

	public static void main (String args[])
	{
		String name;
	int age;
	String username;

		System.out.println("What is your Name?");
		Scanner keyboard = new Scanner(System.in);
		name = keyboard.next();

		System.out.println("What is your age?");
		age = keyboard.nextInt();

		System.out.println("What is your username?");
		username = keyboard.next();

		System.out.println("Your name is " + name + "Your age is " + age + "Your username is " + username);
	}


/*import java.util.Scanner;

public class DailyPractice {

public static void main(String[] args) {

    String name;
    String age;
    String Rname;

    Scanner info = new Scanner(System.in); 

    System.out.println("What is your name?");
    name = info.nextLine();

    System.out.println("How old are you?");
    age = info.nextLine();

    System.out.println("What is your reddit username?");
    Rname = info.nextLine();

    System.out.println("Your name is " + name + ". Your age is " + age +". Your reddit username is " + Rname );

}*/
	
	/* import java.util.Scanner;
   import java.util.InputMismatchException;
   public class daily1{
           public static void main (String args[]){
                   String name = null;
                   int age = 0;
                   String reddit = null;
                   Boolean flag = false;
                   Scanner in = new Scanner(System.in);

                  System.out.printf ("Welcome!\nPlease provide the following:\n");
                  System.out.printf ("\tPlease provide your name: ");
                  name = in.nextLine();
                  do{
                          try{
                                  System.out.printf ("\tPlease provide your age: ");
                                  age = in.nextInt();
                                  flag = true;
                          }
                          catch (InputMismatchException ime){
                                  System.err.printf ("You provided the wrong type of data, please re-try\n");
                                  in.nextLine();
                                  flag = false;
                          }
                          if (flag)
                                  if (age < 0 || age > 121){
                                          flag = false;
                                          System.out.printf ("Invalid age detected, try again.\n");
                                  }
                  }while (!flag);

                  System.out.printf ("\tPlease provide your reddit username: ");
                  reddit = in.next();

                  System.out.printf ("Thank you %s (A.K.A %s) for providing your age of %d.\n", name, reddit, age);
          }
  }*/

  /*import java.util.Scanner;

public class EC1 {

public static void main(String[] args) {
    String name = "", username = "";
    int age = 0;
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter your name: ");
    name = scan.next();
    do{
        System.out.print("Enter your age: ");
        try{
        age = Integer.parseInt(scan.next());
        }
        catch(Exception e){
            System.out.println("Please enter a number.");
        }   
    }
    while(age > 0);

    System.out.print("Enter your username: ");
    username = scan.next();

    System.out.println("Your name is " + name + ", you are " + age + " years old, and your username is " + username);
}
}*/
}