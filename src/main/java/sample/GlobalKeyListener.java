package sample;

import javafx.application.Platform;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class GlobalKeyListener implements NativeKeyListener {

    public void nativeKeyPressed(NativeKeyEvent e) {
        System.out.println("Key Pressed: " + e.getKeyChar());
        if(Main.isEditing) {
            System.out.println("Calling");
            doAction(e);
        }
    }

    private void doAction(NativeKeyEvent e) {
        Platform.runLater(() ->{
            HotKeys keys = Main.keys;
            String key = NativeKeyEvent.getKeyText(e.getKeyCode());
            Invoker invoker = new Invoker();
            if(keys.getSunStrike().equals(key)){
                invoker.SunStrike();
            }else if(keys.getCold_snap().equals(key)){
                invoker.ColdSnap();
            }else if(keys.getEmp().equals(key)){
                invoker.emp();
            }else if(keys.getIceWall().equals(key)){
                invoker.iceWall();
            }else if(keys.getGhost_walk().equals(key)){
                invoker.ghost_Walk();
            }else if(keys.getTornado().equals(key)){
                invoker.tornado();
            }else if(keys.getAlacrity().equals(key)){
                invoker.alacrity();
            }else if(keys.getForge_spirit().equals(key)){
                invoker.forge_spirit();
            }else if(keys.getChaos_meteor().equals(key)){
                invoker.chaos_meteor();
            }else if(keys.getDeafening_blast().equals(key)){
                invoker.deafening_blast();
            }

        });
    }

    public void nativeKeyReleased(NativeKeyEvent e) {
//        System.out.println("Key Released: " + NativeKeyEvent.getKeyText(e.getKeyCode()));

    }

    public void nativeKeyTyped(NativeKeyEvent e) {
//        System.out.println("Key Typed: " + e.getKeyText(e.getKeyCode()));
    }
}
