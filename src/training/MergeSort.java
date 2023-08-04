package training;

import java.util.ArrayList;

public class MergeSort {

    public MergeSort(){
    }
    public void mergeSort(ArrayList<Integer> arrayList){
        ArrayList<Integer> firstHalf = new ArrayList<>();
        ArrayList<Integer> secondHalf = new ArrayList<>();

        firstHalf.addAll(arrayList.subList(0,arrayList.size()/2));
        //splitting the list in to two halfes
        secondHalf.addAll(arrayList.subList(arrayList.size()/2,arrayList.size()));

        //condition for the end of the rekursion
        if (secondHalf.size() == 1){
            //call of the connecting metod, and returning a connected list
            comparingAndConnecting(firstHalf,secondHalf, arrayList);
            return;
        }else{
            mergeSort(firstHalf);
        }
        //reusing a once used ArrayList
        //call of the connecting metod, and returning a connected list
        mergeSort(secondHalf);
        comparingAndConnecting(firstHalf,secondHalf,arrayList);
    }
    ArrayList<Integer> comparingAndConnecting (ArrayList<Integer> firstHalf, ArrayList<Integer> secondHalf, ArrayList<Integer> arrayList){
        int x = 0;
        int i = 0;
        while ( i <= firstHalf.size()){
            if (i == firstHalf.size()){
                while (x < secondHalf.size()){
                    //reached the end of the firstHalf
                    arrayList.set((i+x), secondHalf.get(x));
                    x++;
                }
                break;
            } else if (x == secondHalf.size()) {
                //reached the end of the secondHalf
                while (i < firstHalf.size()){
                    arrayList.set((i+x), firstHalf.get(i));
                    i++;
                }
                break;
            }
            if (firstHalf.get(i) < secondHalf.get(x)){
                arrayList.set((i+x),firstHalf.get(i));
                i++;
            }else {
                arrayList.set((i+x),secondHalf.get(x));
                x++;
            }
        }
        return arrayList;
    }
}
