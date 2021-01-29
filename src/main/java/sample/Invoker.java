package sample;

import javafx.scene.input.KeyCode;
import javafx.scene.robot.Robot;

import java.util.concurrent.TimeUnit;

public class Invoker {
    private Robot robot;

    public Invoker(){
        robot = new Robot();
    }

    /**
     * 1
     * Spell SunStrike
     */
    public void SunStrike(){
        delay();
        robot.keyPress(KeyCode.E);
        robot.keyRelease(KeyCode.E);
        delay();
        robot.keyPress(KeyCode.E);
        robot.keyRelease(KeyCode.E);
        delay();
        robot.keyPress(KeyCode.E);
        robot.keyRelease(KeyCode.E);
        delay();
        robot.keyPress(KeyCode.R);
        robot.keyRelease(KeyCode.R);
        delay();
        robot.keyPress(KeyCode.D);
        robot.keyRelease(KeyCode.D);
    }

    /**
     * 2
     * Spell Cold Snap
     */
    public void ColdSnap(){
        delay();
        robot.keyPress(KeyCode.Q);
        robot.keyRelease(KeyCode.Q);
        delay();
        robot.keyPress(KeyCode.Q);
        robot.keyRelease(KeyCode.Q);
        delay();
        robot.keyPress(KeyCode.Q);
        robot.keyRelease(KeyCode.Q);
        delay();
        robot.keyPress(KeyCode.R);
        robot.keyRelease(KeyCode.R);
        delay();
        robot.keyPress(KeyCode.D);
        robot.keyRelease(KeyCode.D);
    }

    /**
     * 3
     * Spell EMP
     */
    public void emp(){
        delay();
        robot.keyPress(KeyCode.W);
        robot.keyRelease(KeyCode.W);
        delay();
        robot.keyPress(KeyCode.W);
        robot.keyRelease(KeyCode.W);
        delay();
        robot.keyPress(KeyCode.W);
        robot.keyRelease(KeyCode.W);
        delay();
        robot.keyPress(KeyCode.R);
        robot.keyRelease(KeyCode.R);
        delay();
        robot.keyPress(KeyCode.D);
        robot.keyRelease(KeyCode.D);
    }

    /**
     * 4
     * Spell IceWall
     */
    public void iceWall(){
        delay();
        robot.keyPress(KeyCode.Q);
        robot.keyRelease(KeyCode.Q);
        delay();
        robot.keyPress(KeyCode.Q);
        robot.keyRelease(KeyCode.Q);
        delay();
        robot.keyPress(KeyCode.E);
        robot.keyRelease(KeyCode.E);
        delay();
        robot.keyPress(KeyCode.R);
        robot.keyRelease(KeyCode.R);
        delay();
        robot.keyPress(KeyCode.D);
        robot.keyRelease(KeyCode.D);
    }

    /**
     * 5
     * Spell Ghost_walk
     */
    public void ghost_Walk(){
        delay();
        robot.keyPress(KeyCode.Q);
        robot.keyRelease(KeyCode.Q);
        delay();
        robot.keyPress(KeyCode.Q);
        robot.keyRelease(KeyCode.Q);
        delay();
        robot.keyPress(KeyCode.W);
        robot.keyRelease(KeyCode.W);
        delay();
        robot.keyPress(KeyCode.R);
        robot.keyRelease(KeyCode.R);
        delay();
        robot.keyPress(KeyCode.D);
        robot.keyRelease(KeyCode.D);
    }

    /**
     * 6
     * Spell Tornado
     */
    public void tornado(){
        delay();
        robot.keyPress(KeyCode.W);
        robot.keyRelease(KeyCode.W);
        delay();
        robot.keyPress(KeyCode.W);
        robot.keyRelease(KeyCode.W);
        delay();
        robot.keyPress(KeyCode.Q);
        robot.keyRelease(KeyCode.Q);
        delay();
        robot.keyPress(KeyCode.R);
        robot.keyRelease(KeyCode.R);
        delay();
        robot.keyPress(KeyCode.D);
        robot.keyRelease(KeyCode.D);

    }

    /**
     * 7
     * Spell Alacrity
     */
    public void alacrity(){
        delay();
        robot.keyPress(KeyCode.W);
        robot.keyRelease(KeyCode.W);
        delay();
        robot.keyPress(KeyCode.W);
        robot.keyRelease(KeyCode.W);
        delay();
        robot.keyPress(KeyCode.E);
        robot.keyRelease(KeyCode.E);
        delay();
        robot.keyPress(KeyCode.R);
        robot.keyRelease(KeyCode.R);
        delay();
        robot.keyPress(KeyCode.D);
        robot.keyRelease(KeyCode.D);
    }

    /**
     * 8
     * Spell Forge Spirit
     */
    public void forge_spirit(){
        delay();
        robot.keyPress(KeyCode.E);
        robot.keyRelease(KeyCode.E);
        delay();
        robot.keyPress(KeyCode.E);
        robot.keyRelease(KeyCode.E);
        delay();
        robot.keyPress(KeyCode.Q);
        robot.keyRelease(KeyCode.Q);
        delay();
        robot.keyPress(KeyCode.R);
        robot.keyRelease(KeyCode.R);
        delay();
        robot.keyPress(KeyCode.D);
        robot.keyRelease(KeyCode.D);
    }

    /**
     * 9
     * Spell Chaos Meteor
     */
    public void chaos_meteor(){
        delay();
        robot.keyPress(KeyCode.E);
        robot.keyRelease(KeyCode.E);
        delay();
        robot.keyPress(KeyCode.E);
        robot.keyRelease(KeyCode.E);
        delay();
        robot.keyPress(KeyCode.W);
        robot.keyRelease(KeyCode.W);
        delay();
        robot.keyPress(KeyCode.R);
        robot.keyRelease(KeyCode.R);
        delay();
        robot.keyPress(KeyCode.D);
        robot.keyRelease(KeyCode.D);
    }

    /**
     * 10
     * Deafening Blast
     */
    public void deafening_blast(){
        delay();
        robot.keyPress(KeyCode.Q);
        robot.keyRelease(KeyCode.Q);
        delay();
        robot.keyPress(KeyCode.W);
        robot.keyRelease(KeyCode.W);
        delay();
        robot.keyPress(KeyCode.E);
        robot.keyRelease(KeyCode.E);
        delay();
        robot.keyPress(KeyCode.R);
        robot.keyRelease(KeyCode.R);
        delay();
        robot.keyPress(KeyCode.D);
        robot.keyRelease(KeyCode.D);
    }

    private void delay() {
        try {
            TimeUnit.MILLISECONDS.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
