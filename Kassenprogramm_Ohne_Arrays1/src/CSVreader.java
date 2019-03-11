import java.util.StringTokenizer;

public class CSVreader {





    public void CSVreader111() {
        try {
            java.io.BufferedReader FileReader =                      //ein Reader um die Datei Zeilenweise auszulesen
                    new java.io.BufferedReader(
                            new java.io.FileReader(
                                    new java.io.File("C:\\Users\\CC-Student\\Desktop\\abc\\Mappe1.csv")
                            )
                    );

            String zeile = "";

            while (null != (zeile = FileReader.readLine())) {         //lesen jeder Zeile

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static boolean printZerlegt(final String data){
        final StringTokenizer st = new StringTokenizer(data, ";|");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        return false;
    }
        /*
            public static void main(final String[] args) {

            printZerlegt("Name;Vorname;Geburtsdatum;Geburtsort");
            printZerlegt("Name|Vorname|Geburtsdatum|Geburtsort");
            printZerlegt("Name|Vorname;Geburtsdatum;Geburtsort");
        }

        */

    }


