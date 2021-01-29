package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.robot.Robot;
import javafx.stage.Stage;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

public class Main extends Application {

    public Robot robot = new Robot();

    public static HotKeys keys = new HotKeys();
    public static boolean isEditing = false;

    @Override
    public void start(Stage primaryStage) throws Exception{
        setDefaultKeys();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("View.fxml"));
        Parent root = loader.load();
        try {
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException e) {
//                    e.printStackTrace();
        }
        GlobalScreen.addNativeKeyListener(new GlobalKeyListener());

        primaryStage.setTitle("KeyBinds");
        primaryStage.setScene(new Scene(root,600,400));
        primaryStage.show();
        primaryStage.setOnCloseRequest(e->{
            System.exit(0);
        });
    }

    private void setDefaultKeys() {
        keys.setSunStrike("Equals");
        keys.setCold_snap("Minus");
        keys.setEmp("0");
        keys.setIceWall("9");
        keys.setGhost_walk("8");
        keys.setTornado("7");
        keys.setAlacrity("6");
        keys.setForge_spirit("5");
        keys.setChaos_meteor("4");
        keys.setDeafening_blast("3");
    }


    public static void main(String[] args) {
        launch(args);
    }
}
