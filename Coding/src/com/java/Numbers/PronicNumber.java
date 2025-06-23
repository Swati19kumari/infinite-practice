package com.java.Numbers;

public class PronicNumber {
	
	public static boolean Pronic(int num ) {
		for(int i=1; i<=(int)(Math.sqrt(num));i++) { 
			if(num == i*(i+1)) {
				return true;
			}
	}
		return false;
		
	}
	
	public static void main(String[] args) {
		for(int i=1;i<=200;i++) {
			if( Pronic(i)) {
				System.out.print(i+" ");
			}
		}
		
	}
	

}
