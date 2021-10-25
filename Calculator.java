package assignment;



class Calculator {

   public static int add(int number,int number1) {
	   return number + number1;
	   
   }
   public static int sub(int number,int number1) {
	   return number - number1;
  }
   public static int multiply(int number,int number1) {
	   return number * number1;
   }
   public static double div(double number,double number1) {
	   if(number1 ==0) {
		   throw new IllegalArgumentException("Number can not be divided by 0");
	   }
	   return number / number1;
   }

}