package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    // ATRIBUTOS DA CLASSE
    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;

    // CONSTRUTOR
    Login() {
        super("Bank Management System");

        ImageIcon iconBankRaiz = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image iconBankRedimensionado = iconBankRaiz.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon iconBankImage = new ImageIcon(iconBankRedimensionado);
        JLabel iconBank = new JLabel(iconBankImage);
        iconBank.setBounds(350, 10, 100, 100);
        add(iconBank);

        ImageIcon iconCreditCardRaiz = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image iconCreditCardDimensionado = iconCreditCardRaiz.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon iconCreditCardImage = new ImageIcon(iconCreditCardDimensionado);
        JLabel iconCreditCard = new JLabel(iconCreditCardImage);
        iconCreditCard.setBounds(630, 350, 100, 100);
        add(iconCreditCard);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(230, 125, 450, 40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setBounds(150, 190, 375, 30);
        add(label2);

        label3 = new JLabel("PIN:");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Ralway", Font.BOLD, 28));
        label3.setBounds(150, 250, 375, 30);
        add(label3);

        textField2 = new JTextField(15);
        textField2.setBounds(325, 190, 230, 30);
        textField2.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField2);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325, 250, 230, 30);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField3);

         ImageIcon backgroundRaiz = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image backgroundDimensionado = backgroundRaiz.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon backgroundImage = new ImageIcon(backgroundDimensionado);
        JLabel background = new JLabel(backgroundImage);
        background.setBounds(0, 0, 850, 480);
        add(background);

        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}