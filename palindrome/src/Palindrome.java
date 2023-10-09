import java.util.Scanner;

/**
 * @author Новолодская Елена
 */
public class Palindrome {
    /**
     * Детектор палиндрома (метод, который используется для того, чтобы проверить является ли введённая строка
     * палиндромом без учёета каких-либо знаков препинания)
     * @param s проверяемая строка
     * @return Если встретились разные символы с двух сторон, то возвращается значение {@code false}
     * Если же все символы одинаковые, то возвращаетя значение {@code true}
     */
    public static boolean detector(String s) {
        s = s.toLowerCase();                                   // преобразование символов всей строки в нижний регистр
        s = s.replaceAll(" ","");              // удаление всех пробелов из строки
        s = s.replaceAll("\\p{Punct}","");     // удаление всех знаков пунктуации из строки
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if(s.charAt(i) != s.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = in.nextLine();
        if(detector(s)){
            System.out.println("Строка является палиндромом");
        }
        else {
            System.out.println("Строка не является палиндромом");
        }
    }
}