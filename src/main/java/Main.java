import Examinations.BPMeasurement;
import Examinations.MRIScan;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Daphne Von Oram",62, "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg");
        patient1.addExamination(new MRIScan("https://martinh.netfirms.com/BIOE60010/mri1.jpg",2, LocalDate.of(2023,9,4)));
        patient1.addExamination(new BPMeasurement(130,70,LocalDate.of(2023,9,15),"ST"));

        Patient patient2 = new Patient("Sebastian Compton",31,"https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg");
        patient2.addExamination(new MRIScan("https://martinh.netfirms.com/BIOE60010/mri2.jpg",4, LocalDate.of(2023,11,19)));
        patient2.addExamination(new BPMeasurement(150,80,LocalDate.of(2023,11,20),"VST"));

        //Creating a window to display the information
        JFrame frame = new JFrame();
        frame.setSize(450,400);

        JPanel displaypanel = new JPanel();
        JLabel displayLabel1 = new JLabel(patient1.getExaminationDisplay());
        JLabel dispalyLabel2 = new JLabel(patient2.getExaminationDisplay());

        displaypanel.add(displayLabel1);
        displaypanel.add(dispalyLabel2);

        frame.setContentPane(displaypanel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}