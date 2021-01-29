import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);

    //This will print out the first question
    System.out.println("What is your name?");
    String name = scan.next();
    System.out.println("How many followers do you have?");
    int amountFollowers = scan.nextInt();
    System.out.println("How many followers do you want?");
    int amountFollowers2 = scan.nextInt();

    int followers = getFollowers(amountFollowers, amountFollowers2);
    System.out.println("There has been " + followers + " followers added to your account.");
    System.out.println(thanks(name));
  }

  //getFollowers method caculated how mann followers the person will gain
  static int getFollowers(int amountFollowers, int amountFollowers2)
  {
    int followers = amountFollowers2 - amountFollowers;
    return followers;
  }
  
  //thanks method gives thanks to the person who were on the website
  static String thanks(String name)
  {
    String thanks = "Thanks for using GainFollowers.com, " + name;
    return thanks;
  }
}