package JavaSE.SeGUI;

import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class FrameUse {

    public static void main(String[] args) {

        for (Font allfont : GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts()){
            System.out.println(allfont);
        }

        //System.out.println(Arrays.toString(GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts()));

        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setTitle("Frame");

        frame.setLocation(650,330);

        frame.setResizable(false);


        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
    }
}
