import java.util.Scanner;

public class TestPersonWeight  {

    public static String classifyBMI(double x){
    if (x < 18.5){return "Underweight";}
    if (x >= 18.5 && x <= 25){return "Normal Weight";}
    if (x > 25 && x <= 30){return "Overweight";}
    else {return "Obese";}

    }
    public static void main(String[] args){
        //object 1
        PersonWeight Person1 = new PersonWeight();

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter Person's name: ");
       String EnterName = input.nextLine();
       Person1.setName(EnterName);
        System.out.printf("Enter Person's year of birth: ");
        int b = input.nextInt();
        Person1.setBirthYear(b);
        System.out.printf("Enter Person's height in meters: ");
       double h = input.nextDouble();
       Person1.setHeight(h);
        System.out.printf("Enter Person's Weight in kilograms: ");
       double w = input.nextDouble();
       Person1.setWeight(w);


        //object 2
        PersonWeight Person = new PersonWeight(Person1.getName(),Person1.getBirthYear(),Person1.getHeight(),Person1.getWeight());
        System.out.printf("Full Name: %s%n",Person1.getName());
        System.out.printf("Age: %d%n",Person1.computeAge());
        System.out.printf("Height: %.2f%n",Person1.getHeight());
        System.out.printf("Weight: %.2f%n",Person1.getWeight());
        System.out.printf("Classification: %s%n",classifyBMI(Person1.computeBMI(Person1.getHeight(),Person1.getWeight())));




    }
}

