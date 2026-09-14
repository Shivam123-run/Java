public class sum {
public static void main(String arg[]) {
	int sum = 0;
	int arr[] = {12,5,8,34,91};
	int arr1[] = {14,5,6,34,96};
	
	for(int i = 0; i < 5; i++) {
		sum += arr[i]; 
	}
	int average = sum / 5;
		System.out.println("Sum of Elements : " + sum); 
		System.out.println("Average of Elements : " + average); 
	int arrcopy[] = new int[5];
	for(int i = 0; i < 5; i++) {
		arrcopy[i] = arr[i];
	}
	System.out.print("Copy Array : ");
	for(int i = 0; i < 5; i++)
	System.out.print(arrcopy[i] + " ");
	System.out.println("");
	for(int i = 0; i <= 0; i++) {
		for(int j = 1; j < 5 ; j++) {
			if(arr[j] > arr[i]) {
				arr[i] = arr[j];	
		}
	}	
		System.out.println("Highest value : "+ arr[i]);
}
	for(int i = 0; i <= 0; i++) {
		for(int j = 1; j < 5 ; j++) {
			if(arr[j] < arr[i]) {
				arr[i] = arr[j];	
		}
	}	
		System.out.println("Minimum value : "+ arr[i]);
}
	int rev[] = new int[5];
	int j = 0;
	for(int i = 4; i >=0; i--) {
		rev[j] = arr[i];
		j++;
}
	System.out.print("Reverse Array : ");
for(int p = 0 ; p < 5; p++)
	System.out.print(rev[p]+ " ");
System.out.println("");
for(int i = 0; i <= 0; i++) {
	for(int r = 1; r < 5 ; r++) {
		if(arr[r] == arr[i]) 
			System.out.println("Found duplicate value : " + arr[r]);	
}	
}
System.out.print("Found duplicate value between two array : ");
	for(int i = 0; i < 5 ; i++) {
		if(arr[i] == arr1[i]) 
			System.out.print(arr[i]+"  " );	
}	
	System.out.println("");	
int odd = 0;
for(int i = 1; i <= 1000; i = i+2) {
	odd = i; 
	System.out.print(odd+"  " );
}
System.out.println("");
int even = 2;
for(int i = 2; i <= 500; ) {
	even = i; 
	System.out.print(even+"  " );
	i = i + 2;
}
System.out.println("");
for(int i = 7; i <= 200; ) { 
	System.out.print(i +"  " );
	i = i + 7;
}
System.out.println("");
for(int r = 0; r < 5; r++) {
	for(int c = 0; c <= r ; c++) {
		
			System.out.print("*");	
}	
	System.out.println("");
}
for(int r = 0; r < 5; r++) {
	for(int c = 0; c < 5 - r ; c++) {
		
			System.out.print("*");	
}	
	System.out.println("");
}
int num = 1;
for(int r = 0; r < 5; r++) {
	for(int c = 0; c <= r ; c++) {
			System.out.print(num+" ");	
		num = num + 1;
}	
	System.out.println("");
}
for(int r = 1; r <= 6; r++) {
	for(int c = 1; c <= r ; c++) {
			System.out.print(c+" ");	
}	
	System.out.println("");
}
for(int r = 0; r < 6 ; r++) {
	for(int c = 1; c <= 6 - r ; c++) {
			System.out.print(c+" ");	
}	
	System.out.println("");
}
}
}