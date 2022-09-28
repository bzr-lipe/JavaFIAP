package application;

import java.util.Scanner;

public class ExercicioPropostoMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insert Lines and Columns: ");
		int n=sc.nextInt();
		int c=sc.nextInt();
		
		int[][] mat= new int[c][n];
		
		for (int i=0; i<mat[n].length; i++) {
			for (int j=0; j<c; j++) {
				mat[j][i]=sc.nextInt();
			}
		}
		
		System.out.println("Número desejado:");
		int number=sc.nextInt();
		
		for (int i=0; i<n;i++) {
			for (int j=0; j<i; j++) {
				if (mat[i][j]==number) {
					System.out.println("Position " +j +", " +i);
					if (i>=0) {
					System.out.println("Left: " +mat[(i-1)][(j)]);
					}
					System.out.println("Right: " +mat[(i+1)][(j)]);
					System.out.println("Down: " +mat[(i)][(j+1)]);
					if (j>0) {
					System.out.println("Up: " +mat[(i)][(j-1)]);
					}
					
				}
			}
		}
		
		sc.close();
	}

}
