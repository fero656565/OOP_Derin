import java.io.*;

import static java.lang.System.out;

public class BufferedReader {


        public static void bufferReaderMethod() throws IOException
        {
            FileReader fr = new FileReader("C:\\Users\\CC-Student\\Desktop\\abc\\Mappe1.csv");
            BufferedReader br = new BufferedReader();

            String zeile = "";

            while( (zeile = br.readLine()) != null )
            {
                out.println(zeile);
            }

        }


    private String readLine() {
        out.print("");
        return null;
    }


}
