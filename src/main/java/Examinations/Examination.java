package Examinations;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Examination {
    protected String examinationType;
    protected LocalDate dateOfTest;

    public Examination(String examinationType,LocalDate dateOfTest) {
        this.examinationType = examinationType;
        this.dateOfTest = dateOfTest;
    }

    public abstract String getDisplayText();
}
