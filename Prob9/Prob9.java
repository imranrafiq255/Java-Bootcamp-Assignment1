public class Prob9{
  public static void main(String[] args)
  {
    int amount = 593;
    int numberOfHundreds = amount / 100;
    amount = amount % (numberOfHundreds * 100);
    int numberOfFifties = amount / 50;
    amount = amount % (numberOfFifties * 50);
    int numberOfTens = amount / 10;
    amount = amount % (numberOfTens * 10);
    System.out.println("Number of 10s are: " + numberOfTens);
    System.out.println("Number of 50s are: " + numberOfFifties);
    System.out.println("Number of 100s are: " + numberOfHundreds);
    System.out.println("Remaining amount is: " + amount);
  }
}