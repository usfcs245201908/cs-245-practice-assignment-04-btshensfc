public class SelectionSort implements SortingAlgorithm{

	public void sort(int [] a){
		int n = a.length;
		for (int i = 0; i < n-1; i++){
			int indexS = i;
			for (int j= i+1; j<n; j++){
				if (a[j] < a[indexS]){
					indexS = j;
				}
			}
			int temp = a[indexS];
            a[indexS] = a[i]; 
            a[i] = temp; 
		}
	}

}