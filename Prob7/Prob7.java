public class Prob7{
  public static void main(String[] args)
  {
    int num = 12345;
    int sum = 0;
    while(num != 0)
    {
      int n = num % 10;
      sum += n;
      num /= 10;
    }
    System.out.println("The sum is: " + sum);
  }
}