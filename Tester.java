import java.util.*;
public class Tester{
  public static void main( String[]args ){
    // System.out.println(Radix.nth(1234,0));
    // System.out.println(Radix.nth(1234,1));
    // System.out.println(Radix.nth(1234,2));
    // System.out.println(Radix.nth(1234,3));
    // System.out.println(Radix.nth(1234,4));
    
    //System.out.println(Radix.length(1234));
    
    SortableLinkedList test1 = new SortableLinkedList();
    test1.add(59880000);
    test1.add(4000);
    test1.add(38880);
    SortableLinkedList test2 = new SortableLinkedList();
    test2.add(20);
    SortableLinkedList test3 = new SortableLinkedList();
    test3.add(3494);
    test3.add(5);
    test3.add(4);
    test3.add(49595);
    test3.add(7);
    test3.add(1);
    SortableLinkedList[] Buckets = new SortableLinkedList[2];
    Buckets[0]=test2;
    Buckets[1]=test3;
    Radix.merge(test1,Buckets);
    
    System.out.println(test1.toString());
    // 
    // for (int i = 0; i < Buckets.length; i++){
    //   System.out.println(Buckets[i]);
    // }
    
    Radix.radixSortSimple(test1);
    System.out.println(test1.toString());
  }
}