package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainFormController {
    public TextArea txtOutput;
    public TextArea txtInput;

    public void btnRun_OnAction(ActionEvent actionEvent) throws IOException, InterruptedException {

        /* Step 1 */
        String data = "public class DEP8IDEDemo{\n" +
                "public static void main(String args[]){\n"+
                txtInput.getText() +
                "\n}\n" +
                "}";

        /* Step 2 */
        String tempDir = System.getProperty("java.io.tmpdir");
        Path tempFilePath = Paths.get(tempDir ,  "DEP8IDEDemo.java");
        Files.write(tempFilePath, data.getBytes());

        /* Step 3 */
        Process javac = Runtime.getRuntime().exec("javac " + tempFilePath);
        int exitCode = javac.waitFor();







    }


}
