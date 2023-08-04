package training;

import java.util.ArrayList;

public class BubbleSort {
    //matoSort selectionSort = new matoSort();

    public BubbleSort() {
    }

    //metoda na kontrolovanie podmienky
    void kontrolovaniePodmienky (ArrayList<Integer> integerArrayList, int index){
        for (index=0; index<integerArrayList.size()-1; index++){
            if (integerArrayList.get(index)>integerArrayList.get(index+1)){
                //zavolaj metodu na swap
                swapMetoda(integerArrayList, index);
            }
        }
    }
    //metoda na prehodenie values
    void swapMetoda (ArrayList<Integer> integerArrayList,int index){
        int x = integerArrayList.get(index);
        integerArrayList.set(index,integerArrayList.get(index+1));
        integerArrayList.set(index+1,x);
    }
    //metoda volajuca kontrolujucu metodu
    ArrayList<Integer> bubbleSortMetod (ArrayList<Integer> list){
        ArrayList<Integer> integerArrayList = list;
        for (int index = 0; index < integerArrayList.size()-1; index++ ){
            kontrolovaniePodmienky(integerArrayList,index);
        }
        return integerArrayList;
    }
}
