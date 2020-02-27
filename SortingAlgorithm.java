package com.interviewProgram;

public class SortingAlgorithm {
	int arr[] = {4,2,6,8,9};
	public void bubbleSort(){
		int temp =0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=0; j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		for(int a: arr){
			System.out.println(a);
		}
	}
	
	public void insertionSort(){
		int temp=0, j=0;
		for(int i=1; i<arr.length;i++){
			temp = arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp){
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
		System.out.println("insertion sort");
		for(int a:arr){
			
			System.out.print(a+" ");
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortingAlgorithm s= new SortingAlgorithm();
		s.bubbleSort();
		s.insertionSort();

	}

}
