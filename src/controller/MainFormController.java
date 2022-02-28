package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.io.InputStream;

public class MainFormController {
    public TextArea txtOutput;
    public TextArea txtInput;

    public void btnRun_OnAction(ActionEvent actionEvent) {

        /* Step 1 */
        String data = "public class DEP8IDEDemo{\n" +
                "public static void main(String args[]){\n"+
                txtInput.getText() +
                "\n}\n" +
                "}";



    }


}
