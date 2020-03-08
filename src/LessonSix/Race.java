package LessonSix;

import java.util.ArrayList;
import java.util.Arrays;

public class Race {
    private  boolean isCheckWin; // флаг для опеределения есть победитель в гонки или нет
    private ArrayList<Stage> stages;
    public ArrayList<Stage> getStages() { return stages; }
    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
        isCheckWin = false;
    }


    public boolean isCheckWin() {
        return isCheckWin;
    }

    public void setCheckWin(boolean checkWin) {
        isCheckWin = checkWin;
    }
}
