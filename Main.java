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
    
    System.out.println("There are " + followers + " followers ready to be added to your account.");
    System.out.println(where(name));
    String where = scan.next();
    System.out.println(thanks(followers, where));
  }

  //getFollowers method caculated how mann followers the person will gain
  static int getFollowers(int amountFollowers, int amountFollowers2)
  {
    int followers = amountFollowers2 - amountFollowers;
    return followers;
  }
  
  //where method takes in info on what platform to give the followers on.
  static String where(String name)
  {
    String where = ("On what Social media platform would you like us to add your followers " + name + "?");
    return where;
  }
  
  //thanks method gives thanks to the person using the website.
  static String thanks(int followers, String where)
  {
    String thanks = ("Perfect! " + followers + " followers have been added to your " + where + " account. Thanks for using our website!");return thanks;
  }
}