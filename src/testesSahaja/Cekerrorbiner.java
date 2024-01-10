package testesSahaja;
import java.util.Scanner;
import tesGUIguy.methoduntukuapbilangankomputer;
public class Cekerrorbiner {

    public static void main(String[] args) {
    	methoduntukuapbilangankomputer bantu = new methoduntukuapbilangankomputer();
    	Scanner mput = new Scanner(System.in);
        String desimal = mput.next();
        int des = bantu.H2D(desimal);
        System.out.println(des);
        int a = 12;
        String akjfs= Integer.toOctalString(a);
        System.out.println(akjfs);
        mput.close();
    }
}