import java.util.Arrays;
public class ArrayListImitationRunner{
  public static void main(String[] args){
    ArrayListImitation sans = new ArrayListImitation(5);
    sans.set(0 , 1);
    sans.set(1 , 2);
    sans.set(2 , 3);
    sans.set(3 , 4);
    sans.set(4 , 5);
    System.out.println(sans);
    sans.add(724);
    sans.add(360);
    System.out.println(sans);
    System.out.println(sans.get(3));
    System.out.println(sans.get(5));
  }
}