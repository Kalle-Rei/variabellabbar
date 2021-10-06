package se.kalle;
import java.util.Scanner;
public class Lab4 {
    
    public void Execute(){
        Scanner s = new Scanner(System.in);
        System.out.print("Mata in en temperatur angiven i Fahrenheit: ");
        double temperatureFahrenheit = s.nextDouble();
        double temperatureCelsius = (temperatureFahrenheit-30)/2;
        System.out.println(temperatureFahrenheit + " grader Fahrenheit motsvarar " + temperatureCelsius + " grader Celsius.");
        s.close();
        /*
        Uppgift:
        Skriv ett program där man får mata in en temperatur i Fahrenheit
        Omvandla temperatur till Celsius (hur?? Googla)


        Skriv ut: 

        <f> grader Fahrenheit motsvarar <c> grader Celsius 

        */
    }
    
}
