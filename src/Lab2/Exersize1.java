package Lab2;


import java.util.ArrayList;
import java.util.Collections;

public class Exersize1 {

	  public int getSecondSmallest(int[] arr){
          ArrayList<Integer> intList = new ArrayList<Integer>();
          for(int i: arr){
                 intList.add(i);
          }
          Collections.sort(intList);
          return intList.get(1);
   }
   public static void main(String[] args) {
	   Exersize1 p = new Exersize1();
          int arr[] = {43,54,65,76,32,76,87,43,66,7,32,54,43};
          int i = p.getSecondSmallest(arr);
          System.out.println(i);
   }

}