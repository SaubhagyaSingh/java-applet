package appletlul;

import java.applet.*;
import java.awt.*;

public class applet1 extends Applet {
    applet1() {
        setSize(500, 500);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString("Will the exams be held offcampus or oncampus?", 400, 300);
    }

}
