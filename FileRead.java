import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.sql.SQLOutput;

public class FileRead {
        public static void main(String a[]){
            File file = new File("/home/niit/workspace/FileDemo.txt");
            InputStream is = null;
            try {
                is = new FileInputStream(file);
                byte content[] = new byte[2*1024];
                int readCount = 0;
                while((readCount = is.read(content)) > 0){
                    System.out.println(new String(content, 0, readCount-1));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try{
                    if(is != null) is.close();
                } catch(Exception ex){

                }
            }
                }
            }


