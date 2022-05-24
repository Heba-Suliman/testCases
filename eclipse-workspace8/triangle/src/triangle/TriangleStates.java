package triangle;

public class TriangleStates{

		public String sc(int a, int b , int c) {
		
			if(a<b+c && b<a+c && c<=a+b) //error in code
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
		
	}


