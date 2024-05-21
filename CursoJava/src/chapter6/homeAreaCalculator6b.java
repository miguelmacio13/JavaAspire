package chapter6;

public class homeAreaCalculator6b {
	 public static void main(String args[]){

	        /*******************
	         * RECTANGLE 1
	         ********************/

	        //Create instance of Rectangle class
	        Rectangle6a room1 = new Rectangle6a();
	        room1.setWidth(10);
	        room1.setLength(50);
	        double areaOfRoom1 = room1.calculateArea();

	        /*******************
	         * RECTANGLE 2
	         ********************/

	        //Create instance of Rectangle class
	        Rectangle6a room2 = new Rectangle6a(10, 30);
	        double areaOfRoom2 = room2.calculateArea();

	        double totalArea = areaOfRoom1 + areaOfRoom2;

	        System.out.println("Area of both rooms: " + totalArea);
	    }
}
