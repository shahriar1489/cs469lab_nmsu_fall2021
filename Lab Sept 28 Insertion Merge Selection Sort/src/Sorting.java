import java.util.Random;

class Sort{
	int[] A; 
	
	Sort(){
		int[] a = new int[10]; 
		
		Random rand = new Random(); 
		for(int i =0; i< 10; i++) {
			a[i] = rand.nextInt(); 
		}
		A = a; 
	}
	
	Sort(int[] a){
		A = a; 
	}
	
	public void insertion_sort() {
		int key; 
		
		for(int j=1; j<A.length; j++) {
			key = A[j];
			
			// insert A[j] into the sorted sequence
			int i = j-1; 
			
			while(i>-1 && A[i]>key) {
				A[i+1] = A[i]; 
				i=i-1; 
			}A[i+1]=key; 
		}
	}
/*	
	public void selection_sort() {
		// find the smalllet in the array 
		// exchange it with the element in the current index- in a loop 
		
		for(int i=0; i< A.length-1; i++) {
			int min = A[i]; 
			int min_index, new_min;
			
			for(int j = i+1; j<A.length; j++) {
				if(A[j] < min) {
					//temp = A[j]; 
					min = A[j]; 
					min_index=j; 
				}
			}
		}
		A[min_index] = A[i]; 
		A[i] = min; 
	}
*/
	void selectionSort() // by Fuad Bhaia
    {
        for(int j = 0; j < A.length - 1; j++) {
            int min = A[j];
            int minIndex = j;
            int i = j + 1;
            while( i < A.length ) {
                if(min > A[i]){
                    min = A[i];
                    minIndex = i;
                }
                i = i + 1;
            }
            A[minIndex] = A[j];
            A[j] = min;
        }
    }
	
	public void print() {
		System.out.println("Array length: "+ A.length);
		if(A.length>0) {
			for(int i=0; i<A.length; i++) {
				System.out.print(A[i]+ ", ");
			}System.out.println(); 
		}
	}
}




public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {10, 2, 33, 4, 50, 7, 25}; 
		Sort s = new Sort(A); 
		//Sort s = new Sort(); 
		
		s.print(); 
		//s.insertion_sort();
		s.selectionSort();
		s.print(); 
	}

}
