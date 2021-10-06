package se.kalle;
import java.util.Scanner;
public class Lab3 {
    public void Execute(){
        /*  
        Uppgift:
            Skapa en applikation där användaren matar in för och efternamn.
            1. Skriv ut Skriv in ditt förnamn: . Ta emot värdet i en variabel
            2. Låt markören vänta på din inmatning på samma rad.
            3. Gör på samma sätt med efternamnet.
            4. Skriv sedan ut namnen i omvänd ordning.
            5. Se till att resultatet ser ut så här.

        */
        Scanner s = new Scanner(System.in);
        System.out.print("Vänligen mata in ditt förnamn: ");
        String firstName = s.nextLine();
        System.out.print("Vänligen mata in ditt efternamn: ");
        String lastName = s.nextLine();
        System.out.print(reverseString(firstName) + ", " + reverseString(lastName));
        s.close();
    }
    public static String reverseString(String reverseThis){
        String output = "";
        for(int i = reverseThis.length(); i > 0; i--){
            output += reverseThis.charAt(i-1);
        }
        return output;
    }
    
}
