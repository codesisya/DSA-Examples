import java.util.Scanner;

public class ReadSTDIn {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String s1 = s.nextLine();
    System.out.println(s1);
    Integer i = s.nextInt();
    System.out.println(i);
    for(int j = 0; j<i ;j++){
      String p =s.next();
      System.out.println(p);
    }
  }
}
