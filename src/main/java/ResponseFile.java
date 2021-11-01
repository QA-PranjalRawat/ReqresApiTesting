import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ResponseFile {
    public void responseMethod(String response) throws IOException {
        File fileObj = new File("response.json");
        if (fileObj.exists()){
            fileObj.delete();
        }
        if(fileObj.createNewFile()) {
            FileWriter myWriter = new FileWriter("response.json");
            myWriter.write(response);
            myWriter.close();
        }else {
            System.out.println("Failed");
        }
    }
}
