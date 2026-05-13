import java.awt.*;

public class AWTImageText extends Frame {

    Image img;

    AWTImageText() {

        setTitle("AWT Example");
        setSize(400,300);
        setVisible(true);

        img = Toolkit.getDefaultToolkit().getImage("image.jpg");
    }

    public void paint(Graphics g) {

        g.drawString("Hello AWT Application",150,80);

        g.drawImage(img,120,120,100,100,this);
    }

    public static void main(String args[]) {

        new AWTImageText();
    }
}
