package day10_collections_framework;

import java.util.*;

public class CollectionOrderDemo {
    public static void main(String[] args) {

        List<Integer> numbersFrom1To10 = Arrays.asList(2,4,6,8,1,3,5,7,10,9,3);

        System.out.println("Printing Origina numbers: " + numbersFrom1To10);

        //hashMap
        Map<Integer, String> hashMap = new HashMap<>();
        for(int num : numbersFrom1To10){
            hashMap.put(num, ", Value: " + num);
        }
        System.out.println("HashMap: " + hashMap);

        //treeMap
        Map<Integer, String> treeMap = new TreeMap<>();
        for(int num : numbersFrom1To10){
            treeMap.put(num, ", Value: " + num);
        }
        System.out.println("TreeMap: " + treeMap);

        //hashSet
        Set<Integer> hashSet = new HashSet<>(numbersFrom1To10);
        System.out.println("HashSet: " + hashSet);

        //treeSet
        Set<Integer> treeSet = new TreeSet<>(numbersFrom1To10);
        System.out.println("TreeSet: " + treeSet);


        //arrayList
        List<Integer> arrayList = new ArrayList<>(numbersFrom1To10);
        System.out.println("ArrayList: " + arrayList);

        //List
        List<Integer> linkedList = new LinkedList<>(numbersFrom1To10);
        System.out.println("LinkedList: " + linkedList);

        Collections.shuffle(numbersFrom1To10);
        System.out.println("After Shuffled: " + numbersFrom1To10);
    }
}
