package taschenrechner.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class TaschenrechnerGUI {

    private final JFrame frame = new JFrame("Taschenrechner");

    public TaschenrechnerGUI() {
        init();
    }

    private void init() {
        JPanel panel = new JPanel();
        JButton exampleButton = new JButton();

        // ToDo: Text auf dem Button ändern
        exampleButton.setText("Klick mich");

        exampleButton.addActionListener(this::buttonClicked);
        panel.add(exampleButton);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void buttonClicked(ActionEvent actionEvent) {
        // ToDo: Text im Dialog ändern zu einer eigenen Nachricht
        JOptionPane.showMessageDialog(frame, "Sehr gut gemacht");
    }
}
