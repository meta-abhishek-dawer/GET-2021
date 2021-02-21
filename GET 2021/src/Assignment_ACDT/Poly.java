package Assignment_ACDT;

import java.util.Scanner;

public class Poly {

	static Scanner scanner = new Scanner(System.in);
		private int degree;
		private int[] cofficient;
		private int[] exponential;
		
		private Poly(){
			degree = scanner.nextInt();
			cofficient = new int[degree+1];
			exponential = new int[degree+1];
			
			for(int i=0;i<degree+1;i++)
				cofficient[i] = scanner.nextInt();
			
			for(int i=0;i<degree+1;i++)
				exponential[i] = scanner.nextInt();
			
		}
		
		private void showPolynomial()
		{
			for(int i=0;i<=degree;i++)
			{
				if(i== degree)
					System.out.print(cofficient[i]);
				else
					System.out.print(cofficient[i]+"X"+exponential[i]+"+");
			}
			System.out.println();
			
			
		}
		private int degree()
		{
			return degree;
		}
		
		/*public static void addPolynomial(Poly obj1,Poly obj2)
		{
			if(obj1.degree>obj2.degree)
			{
				for(int i=obj2.degree;i>=obj1.degree-obj2.degree;i++)
				{
					obj1.degree+= obj2.degree;
				}
				
			}
			else
			{
				for(int i= obj1.degree;i>= obj2.degree-obj1.degree;i++)
				{
					obj2.degree+= obj1.degree;
				}
			
			}
		}*/
		
		public int evaluatePolynomial(Poly obj,int n)
		{
		int result = obj.cofficient[0];
		for(int i=1;i<obj.cofficient.length;i++)
		{
			result = result*n+ obj.cofficient[i];
		}
		
		return result;
		}
		
	public static void main(String[] args) {
		
		Poly obj1 = new Poly();
		obj1.showPolynomial();
		
		int degree = obj1.degree();
		System.out.println(degree);
	
		//addPolynomial(obj1,obj2);
		
		int valueForEvaluation = scanner.nextInt();
		int evaluationResult=    obj1.evaluatePolynomial(obj1,valueForEvaluation);
		System.out.println("ëvaluation of polynomial:- "+ evaluationResult );
	}

}

