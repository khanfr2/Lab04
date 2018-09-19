public class Lab4{

	public static void main(String[] args){
		System.out.println("This is the main method!"); 
      
      int[] array1 = {1, 2, 3, 4, 5}; 
      int[] array2 = {100, 99, 98, 97, 96}; 
      int[] array3 = {2, 4, 6, 8, 10};
      int[] array4 = {0, 0, 0, 1, 0}; 
      int[] array5 = {-1, -2, -3, -4, -5}; 
      
      System.out.println("Array 1"); 
		method(array1);
      System.out.print("Array 2\n");
      method(array2);
      System.out.print("Array 3\n"); 
      method(array3);
      System.out.print("Array 4\n");
      method(array4);
      System.out.print("Array 5\n"); 
      method(array5);
		
	}

	public static void method(int[] x){
      int[] newArray = new int[x.length]; 
      int temp = 0; 
		for(int i=0; i<newArray.length-1; i++){
			for(int j=i+1; j<newArray.length; j++){
            if(newArray[i] < newArray[j]){
               temp = newArray[j]; 
               newArray[j] = newArray[i]; 
               newArray[i] = temp; 
            }
			}
		}	
		//print out new array
      for(int item: newArray){
         System.out.println(item); 
      }
	}
}
