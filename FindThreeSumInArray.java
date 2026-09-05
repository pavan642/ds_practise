import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindThreeSumInArray {

    static void findTriplet(List<Integer> input, int sum){
        for(int index = 0; index < input.size(); index++){
            for(int i = index+1; i < input.size(); i++){
                for(int j = i+1; j < input.size(); j++){
                    if(input.get(index) + input.get(i) + input.get(j) == sum){
                        System.out.println("found triplet at index: " + input.get(index) + ","+ input.get(i)+","+ input.get(j) +" and sum: " + sum);
                    }
                }
            }
        }

    }

    static void findTriplet1(List<Integer> input, int sum){
        List<List<Integer>> doubles = new ArrayList<>();
        for(int index = 0; index < input.size(); index++){
            for(int i = index+1; i < input.size(); i++){
                //remove duplies if having i and index values reverse is same
                List<Integer> temp = Arrays.asList(input.get(i), input.get(index));
                doubles.add(temp);
            }
        }
        doubles.stream().forEach(list -> {
            System.out.println(Arrays.toString(list.toArray()));
        });
        for (Integer integer : input) {
            for (List<Integer> aDouble : doubles) {
                if (aDouble.get(0) + aDouble.get(1) + integer == sum) {
                    System.out.println("found triplet at index: " + aDouble.get(0) + "," + aDouble.get(1) + "," + integer + " and sum: " + sum);
                }
            }

        }

    }
    /**
     * given input an sorted array  [1,3,4,5,15,30]
     * find triplet of the sum is equal to 24
     * @param args
     */
    public static void main(String[] args){
//        List<Integer> input = Arrays.asList(1,3,4,5,15,20);
        List<Integer> input = Arrays.asList(1,3);
        int sum = 24;
//        findTriplet(input, sum);
        findTriplet1(input,sum);

    }


}
