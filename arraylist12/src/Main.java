import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

       /* ArrayList<String> liste = new ArrayList();

        liste.add("Hallo");
        liste.add("Welt");
        liste.add("!");
        liste.add("abc");
        liste.add("Alles");
        liste.add("klar?");
        liste.remove(3);

        System.out.println(liste);

        for(int i = 0; i < liste.size(); i++){
            System.out.println(liste.get(i));
        }
*/

        ArrayList<String> namen = new ArrayList<>();
        namen.add("Ali Anani");
        namen.add("Antonio Hägele");
        namen.add("Dawit Ayane");
        namen.add("Ferhat Derin");
        namen.add("Hamza Findik");
        namen.add("Ingo Türke");

    //    for (int j = 0; j < namen.size(); j++) {
    //        System.out.println(namen.get(j));


        for (int i = 0; i < namen.size(); i++) {
            if (namen.get(i) == "Ferhat Derin") {

                System.out.println(namen.get(i));
                break;
            } else ;
        }

    }
}
