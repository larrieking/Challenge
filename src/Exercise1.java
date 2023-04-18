import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public int getSmallestInteger(int[]numberArray){
       return Arrays.stream(numberArray).min().getAsInt();
    }

}