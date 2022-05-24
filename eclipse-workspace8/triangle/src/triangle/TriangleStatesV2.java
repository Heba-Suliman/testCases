package triangle;

public class TriangleStatesV2{

		public String sc(int a, int b , int c) {
		
			if(a<b+c && b<a+c && c<a+b) //modified
			{
				if(a==b && b==c)
					return "Equilateral triangle";
				else if(a==b || b==c || a==c)
					return "Isosceles triangle";
				else
					return "Scalene triangle";
								
			}
			else
				return "Not a triangle";
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			TriangleStates StatesV2 = new TriangleStates();
			System.out.println(StatesV2.sc(5, 5, 10));  //error test
			
			
		}
		
	}


