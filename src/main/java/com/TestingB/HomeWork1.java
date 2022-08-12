package com.TestingB;



public class HomeWork1 {

	
		
		public void get1() {
			
		}
		
		public void get2() {
			int a=20;
			System.out.println("I am return type method"+ a);
		}
		
		
		public static boolean getNumber3() {
			boolean a=true;
			boolean b= false;
			return a;
		}
		public void get4(int a) {
			
		}
		
	public void get5(String a,String b) {
		
	}

	public void get6(int a,String b) {
		
	}

	public void get7(int a,String b,boolean c) {
		
	}

	public int get8(int a,int b) {
		return (a+b);
		
	}
	public static boolean get9(String a1,String b2) {
		boolean a=a1.equals(b2);
		return a;
	}

	public static void get10() {
		int a=1;
				while(a<=10) {
					System.out.println(a);
					a++;
				}
				
	}		
	public static String get11(String m,int a) {
		String newone="";
		for(int i=0; i<a; i++) {
			newone=newone+m;
		}
		return newone;
				
				
				
	}
		

	public static void main(String[] args) {
	HomeWork1.getNumber3();		
	HomeWork1.get9("Mosammat", "Begum");
	System.out.println(HomeWork1.get9("Mosammat", "Taslima"));
	HomeWork1.get10();
	HomeWork1.get11("Mosammat", 3);
	System.out.println(HomeWork1.get11("Mosammat ", 3));
	

		}		

}		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	


