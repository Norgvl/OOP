import java.util.ArrayList;
import java.util.Random;

public class main {

    public static void main(String[] args) {
        

        ArrayList <abClass> array1 = new ArrayList<>();
        ArrayList <abClass> array2 = new ArrayList<>();
        String[] names = new String[5];
        names[0] = "a";
        names[1] = "b";
        names[2] = "c";
        names[3] = "d";
        names[4] = "e";

        for (int i = 0; i < 7; i++) {
            
            int r = new Random().nextInt(7);
            int n = new Random().nextInt(5);
            int x = new Random().nextInt(5);
            int y = new Random().nextInt(5);
            switch (r) {
                case 0: {
                    array1.add(new crossbowman(1, 1, 1, 1, names[n],x,y));
                    break;
                }
                case 1: {
                    array1.add(new lancer(i, r, n, names[n],x,y));
                    break;
                }
                case 2: {
                    array1.add(new monk(i, r, n, names[n],x,y));
                    break;
                }
                case 3: {
                    array1.add(new peasant(i, r, n, names[n],x,y));
                    break;
                }
                case 4: {
                    array1.add(new sniper(n, n, i, n, r, names[n],x,y));
                    break;
                }
                case 5: {
                    array1.add(new sorcerer(n, i, r, n, names[n],x,y));
                    break;
                }
                case 6:{
                    array1.add(new thief(i, r, n, names[n],x,y));
                    break;
                }
            }
        }
        
        for (int i = 0; i < 7; i++) {
            
            int r = new Random().nextInt(7);
            int n = new Random().nextInt(5);
            int x = new Random().nextInt(5);
            int y = new Random().nextInt(5);
            switch (r) {
                case 0: {
                    array2.add(new crossbowman(1, 1, 1, 1, names[n],x,y));
                    break;
                }
                case 1: {
                    array2.add(new lancer(i, r, n, names[n],x,y));
                    break;
                }
                case 2: {
                    array2.add(new monk(i, r, n, names[n],x,y));
                    break;
                }
                case 3: {
                    array2.add(new peasant(i, r, n, names[n],x,y));
                    break;
                }
                case 4: {
                    array2.add(new sniper(n, n, i, n, r, names[n],x,y));
                    break;
                }
                case 5: {
                    array2.add(new sorcerer(n, i, r, n, names[n],x,y));
                    break;
                }
                case 6:{
                    array2.add(new thief(i, r, n, names[n],x,y));
                    break;
                }
            }
        }
        for (abClass a : array1) {
            a.getInfo();
            a.getStat();
            System.out.println(a.getCoord()[0]+", "+ a.getCoord()[1]);
        }
        System.out.println(" ");

        for (abClass a : array2) {
            a.getInfo();
            a.getStat();
            System.out.println(a.getCoord()[0]+", "+ a.getCoord()[1]);
            
        }        
        System.out.println("");
        System.out.println("");
        int index = 0;
        int minRange = array1.get(0).getRange(array1.get(0).getCoord(), array2.get(0).getCoord());
        for (int j = 0; j < array1.size(); j++) {
            int sum = array1.get(0).getRange(array1.get(0).getCoord(), array2.get(j).getCoord());
            if (minRange > sum){
                minRange = sum;
                index = j;

            };
            
            
        }
        System.out.println("Closest character: Name: "+array2.get(index).getName()+", Coordinates: ["+array2.get(index).getCoord()[0]+", "+array2.get(index).getCoord()[1]+"], Range: "+minRange);
    }
}