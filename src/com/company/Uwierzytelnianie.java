package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/********************************************************
 * nazwa klasy: Uwierzytelnianie
 * parametry wejściowe: brak
 * wartość zwracana: brak
 * opis: główna klasa uruchomieniowa
 * autor: 90123456789
 ******************************************************/
public class Uwierzytelnianie {

    /********************************************************
     * nazwa funkcji: main
     * parametry wejściowe: args - tablica parametrów uruchomieniowych
     * wartość zwracana: brak
     * opis: główna funkcja uruchomieniowa
     * autor: 90123456789
     ******************************************************/
    public static void main(String[] args) {
        JFrame okno = new JFrame("Dane logowania");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setSize(300, 600);
        JPanel glownyPanel = new JPanel();
        glownyPanel.setLayout(new GridLayout(9, 1));
        Font fontTytul = new Font("Arial", Font.BOLD, 32);
        Font fontLabel = new Font("Dialog", Font.ITALIC, 18);
        Font fontEdit = new Font("Serif", Font.PLAIN, 18);
        Font fontMaly = new Font("SansSerif", Font.PLAIN, 14);
        EmptyBorder margines = new EmptyBorder(0, 5, 0, 0);
        JCustomLabel lblTytul = new JCustomLabel("Uwierzytelnianie", fontTytul, margines, Color.WHITE, Color.GREEN);
        JCustomLabel lblLogin = new JCustomLabel("Login", fontLabel, margines);
        JCustomTextField txtLogin = new JCustomTextField("Wprowadź login", fontEdit, margines);
        JCustomLabel lblEmail = new JCustomLabel("E-mail", fontLabel, margines);
        JCustomTextField txtEmail = new JCustomTextField("Wprowadź email", fontEdit, margines);
        JCustomLabel lblhaslo = new JCustomLabel("Hasło", fontLabel, margines);
        JCustomPasswordField txtHaslo = new JCustomPasswordField("Wprowadz haslo", fontEdit, margines);
        JPanel panelPrzycisku = new JPanel();
        JButton zatwierdz = new JButton("ZATWIERDZ");
        panelPrzycisku.add(zatwierdz);
        JPanel panelKomunikatu = new JPanel();
        JCustomLabel lblKomunikat = new JCustomLabel("Autor 90123456789", fontMaly, margines);
        panelKomunikatu.add(lblKomunikat);

        zatwierdz.addActionListener(e -> {
            String loginStr = txtLogin.getText();
            String emailStr = txtEmail.getText();
            String hasloStr = txtHaslo.getText();
            String komunikatStr = "";

            //jeżeli nie wypełniono zarówno lognu jak i emaila
            if (loginStr.length() == 0 && emailStr.length() == 0) {
                komunikatStr = "Wymagany login lub email. ";
            }
            if (hasloStr.length() == 0) {
                komunikatStr += "Wymagane hasło. ";
            }
            if (loginStr.length() > 0 && loginStr.indexOf(" ") >= 0) {
                komunikatStr += "Nieprawidłowy login. ";
            }
            if (emailStr.length() > 0 && emailStr.indexOf("@") < 0) {
                komunikatStr += "Nieprawidłowy email. ";
            }
            if (
                    !((loginStr.equals("leszek") || emailStr.equals("leszek@wp.pl")) && (hasloStr.equals("tajne1"))) &&
                            !((loginStr.equals("maria") || emailStr.equals("maria@interia.pl")) && (hasloStr.equals("tajne2"))) &&
                            !((loginStr.equals("zenek") || emailStr.equals("zenek@onet.pl")) && (hasloStr.equals("tajne3")))
            ) {
                komunikatStr += "Błąd uwierzytelniania";
            }
            if (komunikatStr.length() == 0) {
                komunikatStr = "Witaj " + loginStr + " " + emailStr;
            }
            lblKomunikat.setText(komunikatStr);
        });

        glownyPanel.add(lblTytul);
        glownyPanel.add(lblLogin);
        glownyPanel.add(txtLogin);
        glownyPanel.add(lblEmail);
        glownyPanel.add(txtEmail);
        glownyPanel.add(lblhaslo);
        glownyPanel.add(txtHaslo);
        glownyPanel.add(panelPrzycisku);
        glownyPanel.add(panelKomunikatu);
        okno.add(glownyPanel);
        okno.setVisible(true);
    }
}
