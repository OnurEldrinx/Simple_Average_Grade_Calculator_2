import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        double mathGrade,physicsGrade,turkishGrade,chemistryGrade,musicGrade;
        final int passGrade = 55;
        double total = 0,average;
        int counter = 0;

        System.out.print("Your Mathematics Grade: ");
        mathGrade = keyboard.nextDouble();
        if (mathGrade>=0 && mathGrade<=100) { total += mathGrade; counter++; }
        System.out.print("Your Physics Grade: ");
        physicsGrade = keyboard.nextDouble();
        if (physicsGrade>=0 && physicsGrade<=100) { total += physicsGrade; counter++; }
        System.out.print("Your Turkish Grade: ");
        turkishGrade = keyboard.nextDouble();
        if (turkishGrade>=0 && turkishGrade<=100) { total += turkishGrade; counter++; }
        System.out.print("Your Chemistry Grade: ");
        chemistryGrade = keyboard.nextDouble();
        if (chemistryGrade>=0 && chemistryGrade<=100) { total += chemistryGrade; counter++; }
        System.out.print("Your Music Grade: ");
        musicGrade = keyboard.nextDouble();
        if (musicGrade>=0 && musicGrade<=100) { total += musicGrade; counter++; }

        average = total / counter;

        System.out.println("------------------------");
        System.out.println("Total Score   : " + total);
        System.out.println("Class Counter : " + counter);
        System.out.println("Your Average  : " + average);
        System.out.println("Pass Grade    : " + passGrade);
        System.out.println("------------------------");

        if (average >= 55){

            System.out.println("You passed!");

        }else{

            System.out.println("You failed!");

        }
    }
}
