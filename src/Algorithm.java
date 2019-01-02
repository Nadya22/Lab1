import java.util.Scanner;
public class Algorithm {

    public String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    public String str1 = "";

    public void Alg()
    {
        System.out.println("Введите текст:");
        Scanner sc1 = new Scanner(System.in);
        str1 = sc1.nextLine();
        char[] charArray = str1.toCharArray();
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(charArray[i] + "  ");
        }
        System.out.println("");
        for (char x : charArray) {
            if (x == ' ') {
                System.out.print("");
            } else {
                int i = alphabet.lastIndexOf(x);
                i += 1;
                System.out.print(i + "  ");
            }
        }
    }
}


