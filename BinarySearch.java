import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args){
        /*
         * Binary search
         * Given an input of the array 1, 3,5,8,11,19,22,23,34,36,93,99
         * input : 10
         * input : 11
         * input : 34
         * */

        List<Integer> inputList = new ArrayList<Integer>();
        inputList.add(1);
        inputList.add(3);
        inputList.add(5);
        inputList.add(8);
        inputList.add(11);
        inputList.add(19);
        inputList.add(22);
        inputList.add(23);
        inputList.add(34);
        inputList.add(36);
        inputList.add(50);
        inputList.add(93);
        inputList.add(99);
        Integer input = 5;
        Boolean response = binarySearch(inputList, input);
        System.out.println("input : "+ input + " Response is :" + response);
        input = 8;
        response = binarySearch(inputList, input);
        System.out.println("input : "+ input + " Response is :" + response);
        input = 18;
        response = binarySearch(inputList, input);
        System.out.println("input : "+ input + " Response is :" + response);
        input = 20;
        response = binarySearch(inputList, input);
        System.out.println("input : "+ input + " Response is :" + response);
        input = 34;
        response = binarySearch(inputList, input);
        System.out.println("input : "+ input + " Response is :" + response);

    }

    static boolean binarySearch(List<Integer> inputList, int input) {
        int low = 0;
        int high = inputList.size()-1;
//       System.out.println("input : "+ input + " low :" + low + " high :" + high);
//       System.out.println(input);
//       System.out.println(inputList.toString());
        while(low <= high){
            int mid = (low+high)/2;
            if (inputList.get(mid).equals(input)) {
                return true;
            }  else if (inputList.get(mid) < input) {
                low = mid+1;
            } else   if (inputList.get(mid) > input) {
                high = mid-1;
            }
        }
        return false;
    }
}
