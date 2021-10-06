package se.kalle;
import java.util.Scanner;
public class Lab5 {
    public void Execute(){
        Scanner s = new Scanner(System.in);
        System.out.print("Mata in ett heltal: ");
        int num1 = s.nextInt();
        System.out.print("Mata in ytterligare ett heltal: ");
        int num2 = s.nextInt();
        double resultat;
        //num1 upphöjt till num2
        resultat = Math.pow(num1, num2);
        System.out.println(num1 + "^" + num2 + " = "+ (int)resultat);
        //num1 gånger num2
        resultat = num1*num2;
        System.out.println(num1 + " * " + num2 + " = " + (int)resultat);
        //num1 delat med num2
        resultat = (double)num1/(double)num2;
        System.out.println(num1 + " / " + num2 + " = " + resultat);
        //num1 plus num2
        resultat = num1+num2;
        System.out.println(num1 + " + " + num2 + " = " + (int)resultat);
        //num1 minus num2
        resultat = num1-num2;
        System.out.println(num1 + " - " + num2 + " = " + (int)resultat);
        //num1 heltalsdividerat med num2
        resultat = num1/num2;
        System.out.println("(heltalsdivision) " + num1 + " / " + num2 + " = " + (int)resultat);
        //rest efter num1 heltalsdividerat med num2
        resultat = num1%num2;
        System.out.println(num1 + " % " + num2 + " = " + (int)resultat);
        s.close();

        /** 
         Skapa en applikation där användaren matar in två tal (heltal!)
        Fundera kring när du måste typcasta osv osv
        1.  Skriv in Mata in tal 1:
        2. Ta emot detta tal i en variabel
        3. Skriv in Mata in tal 2:
        4. Ta emot värdet på detta tal
        5. Nu ska ni göra massa beräkningar på dessa tal. OBS: lägg resultat i en variabel innan ni skriver ut
        resultat = tal1 * tal2
        1. räkna tal1 upphöjd till tal 2 (tips Math.Pow) och skriv ut 
        2. räkna tal1 gånger tal 2 och skriv ut 
        3. räkna tal1 delat med tal 2 och skriv ut    (OBS! Testa med 12 och 5, ) Vad blir resultatet?  Och HUR kan
        du göra om du vill ha 2.40000  (decimaltal som svar) 
        4. räkna tal1 plus tal 2 och skriv ut 
        5. räkna tal1 minus tal 2 och skriv ut 
        6. räkna tal1  heltalsdividerat   tal 2 och skriv ut 
        7. räkna ut resten från heltalsdivision  mellan tal1 och  tal 2 och skriv ut 
        */
    }
    
}
