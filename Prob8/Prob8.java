public class Prob8{
  public static void main(String[] args)
  {
    int population = 80000;
    int totalMen = (52*population) / 100;
    int totalWomen = (48 * population) / 100;
    int literateMen = (35 * population) / 100;
    int iliterateMen = totalMen - literateMen;
    int literateWomen = (13 * population) / 100;
    int iliterateWomen = totalWomen - literateWomen;
    System.out.println("Total literate men: " + literateMen);
    System.out.println("Total iliterate men: " + iliterateMen);
    System.out.println("Total literate women: " + literateWomen);
    System.out.println("Total iliterate women: " + iliterateWomen);
  }
}