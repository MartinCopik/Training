package training.algorithms;

import java.util.ArrayList;

public class SelectionSort {

    public SelectionSort() {
    }

    ArrayList<Integer> selectionSortMetod(ArrayList<Integer> arrayList) {
        ArrayList<Integer> pracovnyList = arrayList;
        for (int index = 0; index <= pracovnyList.size() - 1; index++) {
            int najmensieCislo = pracovnyList.get(index); //ulozim si zatial najmensie cislo
            for (int i = index+1; i <= pracovnyList.size() - 1; i++) {
                if (najmensieCislo > pracovnyList.get(i)) { // hlada najmensie
                    najmensieCislo = pracovnyList.get(i);// prepise sa hodnota najmensieho

                }
            } //swapujem iba ak som nasiel mensie nez kontrolovane cislo
            if (pracovnyList.get(index) > najmensieCislo) {
                swapMetod(arrayList, najmensieCislo, index);
            }
        }
        return pracovnyList;
    }

    void swapMetod (ArrayList<Integer> arrayList, int najmensieCislo, int index){
        ArrayList <Integer> pracovnyList = arrayList;
        arrayList.set(arrayList.lastIndexOf(najmensieCislo),arrayList.get(index));
        arrayList.set(index,najmensieCislo);
    }
}