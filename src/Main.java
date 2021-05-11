import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        CurrencyCalculator c = new CurrencyCalculator();

        JFrame frame = new JFrame("Currency converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        String[] listOfCurrencies = {"Euro", "Swedish crown", "Yen", "USD"};
        String[] listOfCurrencies1 = {"Euro", "Swedish crown", "Yen", "USD"};
        JComboBox list = new JComboBox(listOfCurrencies);
        JComboBox list1 = new JComboBox(listOfCurrencies1);
        list.setSelectedIndex(0);
        list1.setSelectedIndex(0);
        list.setBounds(20,50,100,20);
        list1.setBounds(180,50,100,20);

        JButton button = new JButton("Press to convert currency");
        button.setBounds(60,130,200,30);

        JLabel label = new JLabel();
        JLabel label1 = new JLabel();
        JLabel label2 = new JLabel();
        label.setBounds(10,200,370,20);
        label.setText("");
        label1.setBounds(140,50,30,20);
        label1.setText("to: ");
        label2.setBounds(10,100,60,30);
        label2.setText("Amount:");

        JTextField textField = new JTextField();
        textField.setBounds(60,100,200,30);
        textField.setText("0");

        panel.add(label);
        panel.add(label1);
        panel.add(label2);
        panel.add(textField);
        panel.add(button);
        panel.add(list);
        panel.add(list1);

        frame.add(panel);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = textField.getText();
                double d = Double.parseDouble(s);
                Double result = c.getCurrency(list.getSelectedItem().toString(),list1.getSelectedItem().toString(),d);
                String s1 = String.valueOf(result);
                label.setText(d + " " + list.getSelectedItem().toString() + "s is " + s1 + " " + list1.getSelectedItem().toString() + "s after conversion");
            }
        });
    }
}
