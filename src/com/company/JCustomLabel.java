package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class JCustomLabel extends JLabel {
    Font font;
    EmptyBorder margines;
    Color kolorTekstu;
    Color kolorTla;

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

    public JCustomLabel(String text, Font font, EmptyBorder margines) {
        super(text);
        this.font = font;
        this.margines = margines;
        this.setFont(font);
        this.setBorder(margines);
        this.setOpaque(true);
    }
}
