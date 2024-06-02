package package_person_homework;

public class PersonDetails {
    // this file will have a main method
    public static void main(String[] args) {

        package_person_homework.Person firstPerson;
        package_person_homework.Person secondPerson;
        // in the process of creating an object from my person class

        firstPerson = new package_person_homework.Person();
        secondPerson = new package_person_homework.Person();
        
        // we will be entering the info, assigning values to our fields

        firstPerson.name = "Cathy Jones";
        firstPerson.age = 33;
        firstPerson.carYear = 2010;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall Black";
        secondPerson.age = 22;
        secondPerson.carYear = 2019;
        secondPerson.violations = true;
        secondPerson.creditScore = 570;


        firstPerson.display();

        System.out.println();

        secondPerson.display();



    }

}


