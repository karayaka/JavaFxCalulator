package application;

public class Model {
	
	

	public Model() {
		// TODO Auto-generated constructor stub
	}
	public float calculate(long nuber1,long nuber2,String operator) {
		
		switch (operator) {
		case "+":
			
			return nuber1+nuber2;
		case "-":
			
			return nuber1-nuber2;
		case "*":
			
			return nuber1*nuber2;
		case "/":
			if(nuber2==0) {
				return 0;
			}
			return nuber1/nuber2;

		default:
			return 0;
		}
		
		
	}

}
