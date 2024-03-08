import java.util.Scanner;
public class DosStringhe {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Inserire una stringa");
        String s=in.nextLine();
        s=s.toLowerCase();
        System.out.println("La stringa di consonanti è: "+consonanti(s));
        System.out.println("La stringa di vocali è: "+vocali(s));

    }
    private static String vocali(String s){
        String vocali="";
        for (int i=0;i<s.length();i++){
            if (isVocal(s.charAt(i)))
                vocali=vocali+s.charAt(i);
        }
        return vocali;
    }
    private static String consonanti(String s){
        String consonanti="";
        for (int i=0;i<s.length();i++){
            if (isConsonant(s.charAt(i)))
                consonanti=consonanti+s.charAt(i);
        }
        return consonanti;
    }
    private static boolean isVocal(char t){
        if (Character.isLetter(t) && !isConsonant(t))
            return true;
        else
            return false;
    }
    private static boolean isConsonant(char t){
        if (Character.isLetter(t)){
            switch (t){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    return false;
                default:
                    return true;
            }
        }else
            return false;
    }
}
