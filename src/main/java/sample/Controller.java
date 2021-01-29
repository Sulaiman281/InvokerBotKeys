package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class Controller {

    @FXML
    private ToggleButton enable_keys;

    @FXML
    private TextField sunStrike;

    @FXML
    private TextField cold_snap;

    @FXML
    private TextField emp;

    @FXML
    private TextField ice_wall;

    @FXML
    private TextField ghost_walk;

    @FXML
    private TextField tornado;

    @FXML
    private TextField alacrity;

    @FXML
    private TextField forge_spirit;

    @FXML
    private TextField chaos_meteor;

    @FXML
    private TextField deafening_blast;

    @FXML
    void initialize(){
        // set default keys
        sunStrike.setText(Main.keys.getSunStrike());
        cold_snap.setText(Main.keys.getCold_snap());
        emp.setText(Main.keys.getEmp());
        ice_wall.setText(Main.keys.getIceWall());
        ghost_walk.setText(Main.keys.getGhost_walk());
        tornado.setText(Main.keys.getTornado());
        alacrity.setText(Main.keys.getAlacrity());
        forge_spirit.setText(Main.keys.getForge_spirit());
        chaos_meteor.setText(Main.keys.getChaos_meteor());
        deafening_blast.setText(Main.keys.getDeafening_blast());

        // set on key pressed
        setOnKeyPressed(sunStrike);
        setOnKeyPressed(cold_snap);
        setOnKeyPressed(emp);
        setOnKeyPressed(ice_wall);
        setOnKeyPressed(ghost_walk);
        setOnKeyPressed(tornado);
        setOnKeyPressed(alacrity);
        setOnKeyPressed(forge_spirit);
        setOnKeyPressed(chaos_meteor);
        setOnKeyPressed(deafening_blast);

        enable_keys.setOnAction(e-> {
            Main.isEditing = enable_keys.isSelected();
            System.out.println(Main.isEditing);
            if(Main.isEditing)
                enable_keys.setText("Enable");
            else
                enable_keys.setText("Disable");
        });


    }
    private void setOnKeyPressed(TextField _textField){
        _textField.isFocused();
        _textField.setOnKeyPressed(e->{
            TextField textField = (TextField) e.getSource();
            textField.setText(e.getCharacter());
        });
    }

    @FXML
    void update_alacrity_key(ActionEvent event) {
        Main.keys.setAlacrity(alacrity.getText());
    }

    @FXML
    void update_chaosMeteor_key(ActionEvent event) {
        Main.keys.setChaos_meteor(chaos_meteor.getText());
    }

    @FXML
    void update_codeSnap_key(ActionEvent event) {
        Main.keys.setCold_snap(cold_snap.getText());
    }

    @FXML
    void update_deafeningBlast_key(ActionEvent event) {
        Main.keys.setDeafening_blast(deafening_blast.getText());
    }

    @FXML
    void update_emp_key(ActionEvent event) {
        Main.keys.setEmp(emp.getText());
    }

    @FXML
    void update_forgeSpirit_key(ActionEvent event) {
        Main.keys.setForge_spirit(forge_spirit.getText());
    }

    @FXML
    void update_ghostWalk_key(ActionEvent event) {
        Main.keys.setGhost_walk(ghost_walk.getText());
    }

    @FXML
    void update_iceWall_key(ActionEvent event) {
        Main.keys.setIceWall(ice_wall.getText());
    }

    @FXML
    void update_sunStrike_key(ActionEvent event) {
        Main.keys.setSunStrike(sunStrike.getText());
    }

    @FXML
    void update_tornado_key(ActionEvent event) {
        Main.keys.setTornado(tornado.getText());
    }

}
