import java.util.Scanner;
public class DosStringhe {
    public static void main(String[] args) {
        String vocali="",consonanti="";
        Scanner in=new Scanner(System.in);
        System.out.println("Inserire una stringa");
        String s=in.nextLine();
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
                    default:
                        consonanti=consonanti+s.charAt(i);
                }
            }
        }
        System.out.println("La stringa di consonanti è: "+consonanti);
        System.out.println("La stringa di vocali è: "+vocali);

    }
}