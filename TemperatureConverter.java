import java.util.Scanner;

public class TemmperatureConverter {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in)
        
        //Display the menu
        System.out.println("TemmperatureConverter");
        System.out.println("1.Convert Celsius to Fahrenheit");
        System.out.print("2.Convert Fahrenheit to Celsius);
        System.out.print("Choose) an option(1 or 2):");

          int option = scanner.nextlnt();

          if(option ==1){
            //Convert Celsius to Fahrenheit
            System.out.print("Enter temperature in Celsius:");
            double celsius = scanner.nextDouble();
            double fahrenheit =(celsius* 9/5)+32;
            System.out.println(celsius + "Celsius is "+ fahrenheit+ "Fahrenheit.");
            double fahrenheit=scanner.nextDouble();
            double celsius =(fahrenheit-32)*5/9;
            System.out.println(fahrenheit + "Fahrenheit is" + celsius + "Celsius.");
            } else{
            System.out.println("Invalid option. Please run the program again and choose either 1 or 2.");
                scanner.close();
                }
            }
               private static double
              celsiusToFahrenheit(double celsius) {
                  return (celsius * 9/5) + 32;
                  }

                  private static double
                fahrenheitToCelsius(double fahrenheit) {
                  return (fahrenheit-32) * 5/9;