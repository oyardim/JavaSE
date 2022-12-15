import java.util.Scanner;

public class IO {
    private static Scanner scan = new Scanner(System.in);

    public IO() {
    }

    public static Scanner getScan() {
        return scan;
    }

    public static void closeIO() {
        scan.close();
    }
}

