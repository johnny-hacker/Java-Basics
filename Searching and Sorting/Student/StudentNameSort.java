/* 
StudentNameSort class sorts array list by name
uses selection sort algorithm
*/

import java.util.ArrayList;

public class StudentNameSort extends Student {
   // Create doSelectionSort method 
   public void doSelectionSort(ArrayList<Student> arr) {
      // for every object in the array list
      for (int i = 0; i < arr.size(); i++) {
          // find position of smallest num between (i + 1)th element and last element
          int pos = i;
          // for every object comepare the object in front of it to see which is greater or smaller
          for (int j = i; j < arr.size(); j++) {
             // use compareTo method for strings
              if (arr.get(j).name.compareTo(arr.get(pos).name) < 0 )
                  // if j compared to pos is < 0 (or -1) switch pos to j
                  pos = j;
          }
          // Swap min (smallest num) to current position on array
          Student min = arr.get(pos);
          arr.set(pos, arr.get(i));
          arr.set(i, min);
      }
  }
}
   
