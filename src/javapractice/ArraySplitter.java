package javapractice;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ArraySplitter {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int indexToSplit = 2;

        int[] part1 = Arrays.copyOfRange(myArray, 0, indexToSplit);
        int[] part2 = Arrays.copyOfRange(myArray, indexToSplit, myArray.length);

        System.out.println("Part 1: " + Arrays.toString(part1));
        System.out.println("Part 2: " + Arrays.toString(part2));
        
        int[] myArrays = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int chunkSize = 3;

        List<int[]> chunks = new ArrayList<>();
        for (int i = 0; i < myArrays.length; i += chunkSize) {
            int[] chunk = Arrays.copyOfRange(myArrays, i, Math.min(i + chunkSize, myArrays.length));
            chunks.add(chunk);
        }

        System.out.println("Chunks: " + chunks);
    }
}