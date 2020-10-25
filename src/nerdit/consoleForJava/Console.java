package nerdit.consoleForJava;

import java.util.*;
import java.io.*;


public class Console {
    public static void WriteLine(String str)
    {
        System.out.println(str);
    }
    public static void Write(String str)
    {
        System.out.print(str);
    }
    public static void Clear() throws IOException, InterruptedException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    public static void Exit() throws IOException, InterruptedException
    {
        new ProcessBuilder("cmd", "/c", "exit").inheritIO().start().waitFor();
    }

    public static String ReadLine()
    {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
