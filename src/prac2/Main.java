package prac2;

public class Main {

    public static void main(String[] args) {
        Author a1 = new Author("Andrew", "lart60@yandex.ru", 'M');
        System.out.println(a1);
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        System.out.println(a1.getGender());
    }
}
