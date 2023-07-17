import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class main {
        public static ArrayList <abClass> array1 = new ArrayList<>();
        public static ArrayList <abClass> array2 = new ArrayList<>();
        public static ArrayList <abClass> allTeam = new ArrayList<>();
    public static void main(String[] args) {
        
        String[] names = new String[5];
        names[0] = "a";
        names[1] = "b";
        names[2] = "c";
        names[3] = "d";
        names[4] = "e";

        for (int i = 0; i < 10; i++) {
            
            int r = ThreadLocalRandom.current().nextInt(1,7);
            int n = ThreadLocalRandom.current().nextInt(1,5);
            int y = ThreadLocalRandom.current().nextInt(1,5);
            int a = ThreadLocalRandom.current().nextInt(0,7);
            switch (a) {
                case 0: {
                    array1.add(new crossbowman(y, y, 6, n, r, names[n], 1, i));
                    break;
                }
                case 1: {
                    array1.add(new lancer(i, r, 6, names[n],1,i));
                    break;
                }
                case 2: {
                    array1.add(new monk(i, r, 6, names[n],1,i));
                    break;
                }
                case 3: {
                    array1.add(new peasant(i, r, 6, names[n],1,i));
                    break;
                }
                case 4: {
                    array1.add(new sniper(n, n, 6, n, r, names[n],1,i));
                    break;
                }
                case 5: {
                    array1.add(new sorcerer(n, i, 6, n, names[n],1,i));
                    break;
                }
                case 6:{
                    array1.add(new thief(i, r, 6, names[n],1,i));
                    break;
                }
            }
        }
        
        for (int i = 0; i < 10; i++) {
            
            int r = ThreadLocalRandom.current().nextInt(1,7);
            int n = ThreadLocalRandom.current().nextInt(1,5);
            int y = ThreadLocalRandom.current().nextInt(1,5);
            int a = ThreadLocalRandom.current().nextInt(0,7);
            switch (a) {
                case 0: {
                    array2.add(new crossbowman(y, y, 6, n, r, names[n], 10, i));
                    break;
                }
                case 1: {
                    array2.add(new lancer(i, r, 6, names[n],10,i));
                    break;
                }
                case 2: {
                    array2.add(new monk(i, r, 6, names[n],10,i));
                    break;
                }
                case 3: {
                    array2.add(new peasant(i, r, 6, names[n],10,i));
                    break;
                }
                case 4: {
                    array2.add(new sniper(n, n, 6, n, r, names[n],10,i));
                    break;
                }
                case 5: {
                    array2.add(new sorcerer(n, i, 6, n, names[n],10,i));
                    break;
                }
                case 6:{
                    array2.add(new thief(i, r, 6, names[n],10,i));
                    break;
                }
            }
        }
        allTeam.addAll(array1);
        allTeam.addAll(array2);

        
        // array1.set(0, new crossbowman(1, 1, 2, 2, 2,"cr1", 1, 2));
        // for (abClass a : array1) {
        //     a.getInfo();
        //     a.getStat();
        //     System.out.println(a.getCoord()[0]+", "+ a.getCoord()[1]);
        // }
        // System.out.println(" ");

        // for (abClass a : array2) {
        //     a.getInfo();
        //     a.getStat();
        //     System.out.println(a.getCoord()[0]+", "+ a.getCoord()[1]);
            
        // }        
        
        // array1.get(0).step(array1.get(0), array2, array1);

        Scanner in = new Scanner(System.in);
        while (true){
            View.view();
            in.nextLine();

            for (abClass a : allTeam) {
                if (array2.contains(a)){
                    a.step(a, array1, array2);
                } else a.step(a, array2, array1);
                
            }
        }
    }
}