package test;

public class HelloParent {
    public static void main(String[] args) {
        int sec = 5 ;
        int hrs = sec / 3600;

        int min = (sec % 3600) / 60;

        int seconds = (sec % 3600) % 60;

        System.out.println("hrs :: " + String.format("%02d", hrs));
        System.out.println("min :: " + String.format("%02d", min));
        System.out.println("seconds :: " + String.format("%02d", seconds));
    }
}
