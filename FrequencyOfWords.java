import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FrequencyOfWords {
    public static String readFileAsString(String fileName) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        data=data.replace(",","").replace(".","").trim();
        return data;
    }

}
      /*      public static void main(String[] args) throws Exception
            {
                String data = readFileAsString("/home/niit/workspace/FileDemo.txt");
                data=data.replace(","," ");
                data=data.replace("."," ");
                String[] s=data.split(" ");



            }







    */
