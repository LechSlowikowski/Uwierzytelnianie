package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/********************************************************
 * nazwa klasy: JCustomTextField
 * atrybuty: hint - tekst podpowiedzi
 *           font - zdefiniowna czcionka
 *           margines - zdefiniowny margines
 *           kolorTekstu - zdefiniowany kolor tekstu
 *           kolorTla - zdefiniowany kolor tla
 * wartość zwracana: brak
 * opis: Klasa pola tekstowego pozwalająca na ustalenie fontu, marginesu,
 *       koloru tekstu i koloru tła
 * autor: 90123456789
 ******************************************************/
public class JCustomTextField extends JTextField {
    String hint;
    Font font;
    EmptyBorder margines;
    Color kolorTekstu;
    Color kolorTla;

    /********************************************************
     * nazwa funkcji: JCustomTextField
     * parametry wejściowe: hint - tekst podpowiedzi
     *                      font - zdefiniowna czcionka
     *                      margines - zdefiniowny margines
     *                      kolorTekstu - zdefiniowany kolor tekstu
     *                       kolorTla - zdefiniowany kolor tla
     * wartość zwracana: brak
     * opis: konstruktor klasy
     * autor: 90123456789
     ******************************************************/
    public JCustomTextField(String hint, Font font, EmptyBorder margines, Color kolorTekstu, Color kolorTla) {
        this.hint = hint;
        this.font = font;
        this.margines = margines;
        this.kolorTekstu = kolorTekstu;
        this.kolorTla = kolorTla;
        this.setToolTipText(hint);
        this.setFont(font);
        this.setBorder(margines);
        this.setForeground(kolorTekstu);
        this.setBackground(kolorTla);
        this.setOpaque(true);
    }

    /********************************************************
     * nazwa funkcji: JCustomTextField
     * parametry wejściowe: hint - tekst podpowiedzi
     *                      font - zdefiniowna czcionka
     *                      margines - zdefiniowny margines
     * wartość zwracana: brak
     * opis: konstruktor klasy
     * autor: 90123456789
     ******************************************************/
    public JCustomTextField(String hint, Font font, EmptyBorder margines) {
        this.hint = hint;
        this.font = font;
        this.margines = margines;
        this.setToolTipText(hint);
        this.setFont(font);
        this.setBorder(margines);
        this.setOpaque(true);
    }
}
