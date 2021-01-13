public class Radix{
  public static int nth(int n, int col){
    return (int)((n/(Math.pow(10,col)))%10);
  }
  
  public static int length(int n){
    String x = String.valueOf(n);
    return x.length();
  }
  
  public static void merge(SortableLinkedList original, SortableLinkedList[]buckets){
    for (int i = 0; i < buckets.length; i++){
      original.extend(buckets[i]);
    }
  }
  
  public static void radixSortSimple(SortableLinkedList data){
    int n = 1;
    for (int i = 0; i<n; i++){
      SortableLinkedList[] Buckets = new SortableLinkedList[10];
      for (int k = 0; k < 10; k++){
        SortableLinkedList temp1 = new SortableLinkedList();
        Buckets[k]=temp1;
      }
      int size = data.size();
      for (int j = 0; j < size; j++){
        if (length(data.get(0))>n){
          n = length(data.get(0));
        }
        SortableLinkedList current = new SortableLinkedList();
        int temp = data.get(0);
        current = Buckets[nth(temp,i)];
        current.add(temp);
        Buckets[nth(temp,i)] = current;
        data.remove(0);
      }
      
      for (int j = data.size()-1; j>=0; j--){
        data.remove(0);
      }
      merge(data,Buckets);
    }
  }
  
  public static void radixSort(SortableLinkedList data){
    
  }
}