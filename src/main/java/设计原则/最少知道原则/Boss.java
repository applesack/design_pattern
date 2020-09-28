package 设计原则.最少知道原则;

import java.util.ArrayList;
import java.util.List;

public class Boss {

    public void commandCheckNumder(TeamLeader teamLeader) {

        teamLeader.checkNumberOfCourses();
    }
}
