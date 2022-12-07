package Inheritance;

public class Main {
    public static void main(String[] args) {

        Mouse1 mouse1 = new Mouse1();

        mouse1.leftClick();
        mouse1.rightClick();
        mouse1.scrollUp();
        mouse1.scrollDown();

        Mouse2 mouse2 = new Mouse2();

        mouse2.connect();

        Mouse3 mouse3 = new Mouse3();

        mouse3.leftClick();
        mouse3.rightClick();
        mouse3.scrollUp();
        mouse3.scrollDown();

    }
    }

