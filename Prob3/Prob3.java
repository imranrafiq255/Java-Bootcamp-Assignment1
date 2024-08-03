public class Prob3
{
  public static void main(String[] args){
    int[] marks = new int[] {80,90,75,60,100};
    for(int i = 0; i<marks.length; i++)
    {
      System.out.println("Subject " + (i+1) + " marks: " + marks[i]);
      System.out.println("Subject " + (i+1) + " marks percenage out of 100 is : " + ((marks[i]*100)/100) + "%");
    }
  }
}