package Examinations;

import java.time.LocalDate;
import java.util.ArrayList;

public class BPMeasurement extends Examination{
    private int systolic;
    private int diastolic;
    private String duration;
    public BPMeasurement(int systolic, int diastolic, LocalDate dateOfTest, String duration){
        super("BP measurement",dateOfTest);
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.duration = duration;
    }
    @Override
    public String getDisplayText(){
        return examinationType + "<br> Systolic:" + systolic + " mmHg <br> Diastolic: "
                + diastolic+ " mmHg <br>Measurement date: " + dateOfTest.toString()
                + "Duration: " + duration;
    }
}
