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
    boolean lengthfound = false;
    for (int i = 0; i<n; i++){
      SortableLinkedList[] Buckets = new SortableLinkedList[10];
      for (int k = 0; k < 10; k++){
        SortableLinkedList temp1 = new SortableLinkedList();
        Buckets[k]=temp1;
      }
      for (int j = 0; j < data.size(); j++){
        if (length(data.get(j))>n){
          n = length(data.get(j));
        }
        SortableLinkedList current = new SortableLinkedList();
        int temp = data.get(j);
        current = Buckets[nth(temp,i)];
        current.add(temp);
        Buckets[nth(temp,i)] = current;
      }
      
      for (int j = data.size()-1; j>=0; j--){
        data.remove(j);
      }
      merge(data,Buckets);
    }
  }
  
}