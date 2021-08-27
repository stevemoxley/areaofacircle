package org.launchcode.java.studios.areaofacircle;


import java.util.Scanner;

public class Area {

    public static void main (String[] args){
        double radius = 0;

        Boolean validNumber = false;
        while(!validNumber) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a radius:");
            try {
                String inputString = input.next();
                radius = Double.parseDouble(inputString);

                if (radius < 0) {
                    System.out.println("Please enter a valid number");
                    validNumber = false;
                }
                else{
                    validNumber = true;
                }
            } catch (Exception exception) {
                System.out.println("Please enter a valid number");
                validNumber = false;
            }
        }

        Circle circle = new Circle();
        double area = circle.getArea(radius);
        System.out.println("The area of a circle of radius: "+radius+ " is: "+area);

    }

}
