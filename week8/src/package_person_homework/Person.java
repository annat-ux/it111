package package_person_homework;

public class Person {

    // this file does not have a main method
    // start typing fields (variables)

    String name;
    int age;
    int carYear;

    boolean violations;
    double creditScore;

    public void display() {
        System.out.println("Your name: " +name);
        System.out.println("Your Age: " +age);
        System.out.println("Your Car: " +carYear);
        System.out.println("Your Violations: " +violations);
        System.out.println("Your Credit Score: " +creditScore);
        double totalPremium = totalPremium();
        System.out.println(totalPremium + " dollars");
        System.out.println();
    }

    public double totalPremium() {
        double baseRate;
        if (carYear >= 2015) {
            if (violations && creditScore <= 700) {
                baseRate = 800.00;
            } else {
                baseRate = 500.00;
            }
        } else {
            if (violations && creditScore <= 700) {
                baseRate = 300.00;
            } else {
                baseRate = 200.00;
            }
        }
        return baseRate;
    }




}

