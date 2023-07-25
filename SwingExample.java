import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame();
        
        // Set width and height
        frame.setSize(330, 330);
        
        // Set layout manager to null
        frame.setLayout(null);
        
        // Set visibility to true
        frame.setVisible(true);
        
        // Create a new JLabel
        JLabel labelWorld = new JLabel("Hello, World!");
        
        // Set the position of the label
        labelWorld.setBounds(50, 50, 200, 30);
        
        // Add the label to the frame
        frame.add(labelWorld);
        
        // Create a new JButton
        JButton button = new JButton("Click Me!");
        
        // Set the position of the button
        button.setBounds(50, 100, 100, 30);
        
        // Add an ActionListener to the button
        button.addActionListener(e -> {
            // Swap the text between "Hello, World!" and "Goodbye, World!"
            if (labelWorld.getText().equals("Hello, World!")) {
                labelWorld.setText("Goodbye, World!");
            } else {
                labelWorld.setText("Hello, World!");
            }
        });
        
        // Add the button to the frame
        frame.add(button);
    }
}
