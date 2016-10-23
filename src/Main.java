import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String args[]) {
        System.out.println("Alustame arvutamisega!");
        System.out.println("Autor: Piret");
        System.out.println("Aasta: 2016");

        //Sõnade arvu leidmine
        Scanner klaviatuur = new Scanner(in);
        System.out.println("Sisestage tekst:");
        String tekst = klaviatuur.nextLine();
        String[] sõnad = tekst.split(" ");
        System.out.println("Sõnade arv sisestatud tekstis: " + sõnad.length);

        //Lausete arvu leidmine
        String[] laused = tekst.split("[.!?]");
        System.out.println("Lausete arv sisestatud tekstis: " + laused.length);

        //Lause keskmise pikkuse leidmine
        int lausetearv = laused.length;
        double sõnadearv = (double)sõnad.length;
        double LKP = sõnadearv/lausetearv;
        DecimalFormat df = new DecimalFormat("###.00");
        System.out.println("Lausete keskmine pikkus on " + df.format(LKP) + " sõna.");

    }
}
