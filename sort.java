public class sort {
	public static void main(String[] args) {
		int arr[] = new int[5];
		for(int i = 0; i < 5; i++) 
		arr[i] = ConsoleInput.getInteger();
		for(int i = 0; i < 5; i++) {
		System.out.print(arr[i] +" ");}
		System.out.print("\n");
		for(int i = 0; i < 5; i++) {
			for(int j = i + 1; j < 5 ; j++) {
				if(arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
			}
		}	
	}
		System.out.println("Sorted Array:");
		for(int i = 0; i < 5 ; i++)
		System.out.print(arr[i] +" ");
	}
}