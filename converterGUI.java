import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class converterGUI extends JFrame {

    private JComboBox<String> comboBox;
    private JLabel inputLabel;
    private JTextField inputField;
    private JLabel resultLabel;
    private JButton convertButton;

    public converterGUI() {
        // Set up the JFrame
        setTitle("Temperature Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create the components
        comboBox = new JComboBox<>(new String[]{"Celsius to Fahrenheit", "Fahrenheit to Celsius"});
        inputLabel = new JLabel("Enter temperature in Celsius:");
        inputField = new JTextField(10);
        resultLabel = new JLabel("Result:");
        convertButton = new JButton("Convert");

        // Add action listener to the convertButton
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertTemperature();
            }
        });

        // Add action listener to inputField for Enter key press
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertTemperature();
            }
        });

        // Add components to the JFrame
        add(comboBox);
        add(inputLabel);
        add(inputField);
        add(resultLabel);
        add(convertButton);

        // Set the size and make the JFrame visible
        setSize(300, 200);
        setVisible(true);
    }

    private void convertTemperature() {
        String inputText = inputField.getText();
        double temperature;
        try {
            temperature = Double.parseDouble(inputText);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input");
            return;
        }

        String conversion = (String) comboBox.getSelectedItem();
        double convertedTemperature;
        if (conversion.equals("Celsius to Fahrenheit")) {
            convertedTemperature = (temperature * 9 / 5) + 32;
            resultLabel.setText("Result: " + String.valueOf(convertedTemperature) + "°F");
        } else {
            convertedTemperature = (temperature - 32) * 5 / 9;
            resultLabel.setText("Result: " + String.valueOf(convertedTemperature) + "°C");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new converterGUI();
            }
        });
    }
}
