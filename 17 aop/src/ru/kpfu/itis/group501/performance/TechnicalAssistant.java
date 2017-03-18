package ru.kpfu.itis.group501.performance;

/**
 * Created by ma on 15.03.2017.
 */
public class TechnicalAssistant {
    public void checkMic(){
        System.out.println("Mic is working, really working.");
    }

    public boolean smartCheckMic() {
        return Math.random() > 0.67;
    }
}
