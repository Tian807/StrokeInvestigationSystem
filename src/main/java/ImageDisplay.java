import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageDisplay extends JPanel {
    private JLabel imageLabel;
    private String pictureURL;
    public ImageDisplay(String pictureURL){
        JLabel label = new JLabel();

        URL imageURL=null;
        try {
            imageURL = new URL(pictureURL);
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }

        ImageIcon thisImageIcon = new ImageIcon(imageURL);
        label.setIcon(thisImageIcon);
        add(label);
    }

}
