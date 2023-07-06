package driver;

import java.util.Scanner;

import service.DenominationCount;
import service.MergeSort;

public class Driver {
	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
        DenominationCount dc = new DenominationCount();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denomination");
		
		int totalDenominations = sc.nextInt();
		System.out.println("enter the currency denomintion value");
		
		int[] notes = new int[totalDenominations];
		for(int i=0; i<totalDenominations; i++) {
			notes[i]=sc.nextInt();
			
		}
		System.out.println("enter the amount you want to paY");
		int amount = sc.nextInt();
		mergeSort.sort(notes,0,notes.length-1);
		dc.notesCountImplentation(notes, amount);
		}

}
