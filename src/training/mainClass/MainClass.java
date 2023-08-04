package training.mainClass;

import training.algorithms.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {

        //bubble sort
//        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(6, 0, 6, 9, 3, 1));
//        BubbleSort bubbleSort = new BubbleSort();
//        ArrayList<Integer> list = bubbleSort.bubbleSortMetod(integerArrayList);
//        System.out.println(integerArrayList);
//        System.out.println(list);


//        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(0, 29, 72, 98, 13, 87, 5));
//        SelectionSort selectionSort = new SelectionSort();
//        ArrayList<Integer> list1 = selectionSort.selectionSortMetod(arrayList);
//        System.out.println(list1);
//        list1.add(10);
//        list1.add(11);
//        selectionSort.selectionSortMetod(list1);
//        System.out.println(list1);



        //dalsi sort
        //matoSort selectionSort = matoSort();

        ArrayList<Integer> mergeList = new ArrayList<>(Arrays.asList(3, 20, 9, 4, 1, 6, 3));
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(mergeList);
        System.out.println(mergeList);
    }

}
