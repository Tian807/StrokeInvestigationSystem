package Examinations;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Currency;

public class MRIScan extends Examination {
    private int fieldStrength;
    private String scanImage;
    public MRIScan(String scanImage,int fieldStrength,LocalDate dateOfTest) {
        super("MRI examination",dateOfTest);
        this.scanImage = scanImage;
        this.fieldStrength = fieldStrength;
    }
    @Override
    public String getDisplayText(){
        return examinationType + "<br> Image: " + scanImage + "<br> Field strength: " + fieldStrength + " Tesla <br>Scan date: " + dateOfTest.toString();
    }

}
