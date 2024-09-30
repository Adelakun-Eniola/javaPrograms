public class pythagoras{
    public static void main(String [] args){
	double num1 = 3;
	double num2 = 4;
	System.out.println(hypotenuse(num1, num2));
    
    }
        public static double hypotenuse(double side1, double side2){
	    double subTotal = Math.sqrt(Math.pow(side1, 2)+ Math.pow(side2, 2));
	    return subTotal;
	}
}
