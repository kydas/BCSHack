package model.Ui.growPanel;

import model.Ui.InputBars.InputPlantTypePanel;

import javax.swing.*;
import java.awt.*;

public class GrowOptionsSetterPanel extends JPanel {
    private static InputPlantTypePanel inputPlant;

    public GrowOptionsSetterPanel() {
        setPreferredSize(new Dimension(600, 450));

        inputPlant = new InputPlantTypePanel();
        add(inputPlant);
    }
}
