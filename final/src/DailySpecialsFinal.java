import java.util.Scanner;

public class DailySpecialsFinal {

    public static void main(String[] args) {

        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday-Friday only!)");

        specials = input.next();
// in the world of coffee, I need a name of a coffee beverage and a price

        String coffee = null;
        double price = 0.0;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if (saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();
        }

        switch (specials) {

            // my cases will be the day of the week

            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            case "Tuesday" -> {
                coffee = "Frapp";
                price = 5.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            case "Wednesday" -> {
                coffee = "Cappuccino";
                price = 4.35;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
            }
            default -> System.out.println("Please enter a valid day, or check your spelling");
        }


        System.out.println("How many " + coffee + "s would you like to order?");
        int quantity = input.nextInt();

        if (quantity == 0) {
            System.out.println("Looks like you don't like " + coffee + "s, so sad!");
        } else {
            double totalPrice = price * quantity;
            double discountedPrice = totalPrice;

            if (quantity >= 10) {
                discountedPrice = totalPrice * 0.80;
                System.out.println("Looks like you qualify for a group discount! Your regular price is $" + String.format("%.2f", totalPrice));
                System.out.println("You have ordered " + quantity + " " + coffee + "s but will only be charged $" + String.format("%.2f", discountedPrice));
            } else if (quantity >= 5) {
                discountedPrice = totalPrice * 0.90;
                System.out.println("Looks like you qualify for a group discount! Your regular price is $" + String.format("%.2f", totalPrice));
                System.out.println("You have ordered " + quantity + " " + coffee + "s but will only be charged $" + String.format("%.2f", discountedPrice));
            } else {
                System.out.println("Looks like you will be ordering " + quantity + " " + coffee + "s. Your total is $" +String.format("%.2f", totalPrice));
            }

            if (quantity < 5) {
                System.out.println("Looks like you will be ordering " + quantity + " " + coffee + "s. Your total is $" +String.format("%.2f", totalPrice));
            }
        }
        input.close(); // Close the scanner when the loop ends


    }
}
