import java.util.Scanner;
public class DosStringhe {
    public static void main(String[] args) {
        String vocali="",consonanti="";
        Scanner in=new Scanner(System.in);
        System.out.println("Inserire una stringa");
        String s=in.nextLine();
        for (int i=0;i<s.length();i++){
            s=s.toLowerCase();
            if (isVocal(s.charAt(i)))
                vocali=vocali+s.charAt(i);
            else if (isConsonant(s.charAt(i)))
                consonanti=consonanti+s.charAt(i);
        }
        System.out.println("La stringa di consonanti è: "+consonanti);
        System.out.println("La stringa di vocali è: "+vocali);

    }
    private static boolean isVocal(char t){
        if (Character.isLetter(t)){
            switch (t){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    return true;
                default:
                    return false;
            }
        }else
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
