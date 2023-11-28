import Examinations.Examination;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Patient {
    private String name;
    private int age;
    private String picture;
    private ArrayList<Examination> examinations = new ArrayList<Examination>();
    public Patient(String name, int age, String picture){
        this.name = name;
        this.age = age;
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public void addExamination(Examination examination){
        examinations.add(examination);
    }
    public String getExaminationDisplay(){
        String display = new String("<html>");
        display += "Name: " + name + "<br>";
        display += "Age: " + age + "<br>";

        for (Examination exam:examinations){
            display += exam.getDisplayText();
            display += "<br>";
        }

        return display + "<br></html>";
    }

}
