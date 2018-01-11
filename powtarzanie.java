package Tablice;

import java.util.Random;

public class powtarzanie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tab3[]=new int[20];
		Random rd=new Random();
		for(int i=0; i<tab3.length; i++){
			tab3[i]=rd.nextInt(10)+1;
			System.out.println("Wylosowane liczby: "+tab3[i]);
		}
		int licznik=0;
		for(int i=1; i<tab3.length; i++){
		for(int j=0; j<tab3.length; j++){
			if(tab3[i]==j){
				licznik++;
				
			}
			
		}	
		System.out.println("Liczba "+i+" powtarza siê "+tab3[i]+" razy");
		}
	}

}
