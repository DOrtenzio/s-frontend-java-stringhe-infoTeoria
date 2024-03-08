import java.util.Scanner;
public class DosStringheConMetodos {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Inserire una stringa");
        String s=in.nextLine();
        System.out.println("La stringa di consonanti è: "+isConsonantes(s));
        System.out.println("La stringa di vocali è: "+isVocales(s));

    }
    private static String isVocales(String s){
        String vocali="";
        for (int i=0;i<s.length();i++){
            s=s.toLowerCase();
            if (Character.isLetter(s.charAt(i))){
                switch (s.charAt(i)){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'y':
                        vocali=vocali+s.charAt(i);
                        break;
                }
            }
        }
        return vocali;
    }
   private static String isConsonantes(String s){
        String consonanti="";
        for (int i=0;i<s.length();i++){
            s=s.toLowerCase();
            if (Character.isLetter(s.charAt(i))){
                switch (s.charAt(i)){
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'y':
                        break;
                    default:
                        consonanti=consonanti+s.charAt(i);
                }
            }
        }
        return consonanti;
    }
}
