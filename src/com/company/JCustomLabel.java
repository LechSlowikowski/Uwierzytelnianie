package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/********************************************************
 * nazwa klasy: JCustomLabel
 * atrybuty: font - zdefiniowna czcionka etykiety
 *           margines - zdefiniowny margines etykiety
 *           kolorTekstu - zdefiniowany kolor tekstu etykiety
 *           kolorTla - zdefiniowany kolor tla etykiety
 * wartość zwracana: brak
 * opis: Klasa etykiety pozwalająca na ustalenie fontu, marginesu,
 *       koloru tekstu i koloru tła
 * autor: 90123456789
 ******************************************************/
public class JCustomLabel extends JLabel {
    Font font;
    EmptyBorder margines;
    Color kolorTekstu;
    Color kolorTla;

    /********************************************************
     * nazwa funkcji: JCustomLabel
     * parametry wejściowe: text - tekst etykiety
     *                      font - zdefiniowna czcionka etykiety
     *                      margines - zdefiniowny margines etykiety
     *                      kolorTekstu - zdefiniowany kolor tekstu etykiety
     *                       kolorTla - zdefiniowany kolor tla etykiety
     * wartość zwracana: brak
     * opis: konstruktor klasy
     * autor: 90123456789
     ******************************************************/
    public JCustomLabel(String text, Font font, EmptyBorder margines, Color kolorTekstu, Color kolorTla) {
        super(text);
        this.font = font;
        this.margines = margines;
        this.kolorTekstu = kolorTekstu;
        this.kolorTla = kolorTla;
        this.setFont(font);
        this.setBorder(margines);
        this.setForeground(kolorTekstu);
        this.setBackground(kolorTla);
        this.setOpaque(true);
    }

    /********************************************************
     * nazwa funkcji: JCustomLabel
     * parametry wejściowe: text - tekst etykiety
     *                      font - zdefiniowna czcionka etykiety
     *                      margines - zdefiniowny margines etykiety
     * wartość zwracana: brak
     * opis: konstruktor klasy
     * autor: 90123456789
     ******************************************************/
    public JCustomLabel(String text, Font font, EmptyBorder margines) {
        super(text);
        this.font = font;
        this.margines = margines;
        this.setFont(font);
        this.setBorder(margines);
        this.setOpaque(true);
    }
}
