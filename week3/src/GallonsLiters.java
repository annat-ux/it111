import java.text.DecimalFormat;

public class GallonsLiters {

    public static void main(String[] args) {

        // 3.79 liters = 1 gallon
        // liters
        // Gallons = 0.264172 × liters


        double liters;
        int counter = 0;
        int gallon;

        DecimalFormat df = new DecimalFormat("#.##");

        for (liters = 3.79; liters <= 300; liters += 4) {

            gallon = (int) (liters / 3.79);
            if (counter % 5 == 0) {
                if (counter != 0) {
                    System.out.println();
                }
                counter = 0;
            }
            if (counter == 0) {
                System.out.println(df.format(liters) + " liters = " + gallon + " gallon");
            } else {
                System.out.println(df.format(liters) + " liters = " + gallon + " gallons");
            }
            counter++;
            if (gallon >= 1 && gallon <= 100) {
                counter++;
            }
        }

        System.out.println();
        System.out.println("All done!!!");
    }

}


