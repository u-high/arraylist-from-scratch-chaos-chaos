import java.util.Arrays;
public class ArrayListImitation{
  private int[] array;
  public ArrayListImitation(){
    array = new int[10];
  }
  public ArrayListImitation(int sizeIn){
    array = new int[sizeIn];
  }
  public int get(int indexIn){
    return array[indexIn];
  }
  public void add(int intIn){
    int[] tempArray = new int[array.length + 1];
    for(int i = 0; i < array.length; i++){
      tempArray[i] = array[i];
    }
    tempArray[tempArray.length - 1] = intIn;
    array = tempArray;
  }
  public int set(int index, int intIn){
    int temp = array[index];
    array[index] = intIn;
    return temp;
  }
  public String toString(){
    return Arrays.toString(array);
  }
}