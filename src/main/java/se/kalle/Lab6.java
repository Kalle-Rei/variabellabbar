package se.kalle;
import java.util.Scanner;
public class Lab6 {
    public void Execute(){
        Scanner s = new Scanner(System.in);
        System.out.print("Mata in ett flyttal: ");
        double num1 = s.nextDouble();
        System.out.print("Mata in ytterligare ett flyttal: ");
        double num2 = s.nextDouble();
        double resultat = 0;
        //num1 upphöjt till num2
        resultat = Math.pow(num1, num2);
        System.out.println(num1 + "^" + num2 + " = "+ resultat);
        //num1 gånger num2
        resultat = num1*num2;
        System.out.println(num1 + " * " + num2 + " = " + resultat);
        //num1 delat med num2
        resultat = num1/num2;
        System.out.println(num1 + " / " + num2 + " = " + resultat);
        //num1 plus num2
        resultat = num1+num2;
        System.out.println(num1 + " + " + num2 + " = " + resultat);
        //num1 minus num2
        resultat = num1-num2;
        System.out.println(num1 + " - " + num2 + " = " + resultat);
        //num1 heltalsdividerat med num2
        resultat = (int)num1/(int)num2;
        System.out.println("(heltalsdivision) " + (int)num1 + " / " + (int)num2 + " = " + (int)resultat);
        //rest efter num1 heltalsdividerat med num2
        resultat = (int)num1%(int)num2;
        System.out.println((int)num1 + " % " + (int)num2 + " = " + (int)resultat);
        s.close();

    }
    
}
