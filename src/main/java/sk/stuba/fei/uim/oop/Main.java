package sk.stuba.fei.uim.oop;

public class Main {

    static void Checknumber(int num) {
        if (num > 10) {
            System.out.println("1");
        } else if (num == 10) {
            System.out.println("0");
        } else {
            System.out.println("-1");
        }
    }

    public static void main(String[] args) {
        Checknumber(15);
    }
}

