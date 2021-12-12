package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class JCustomTextField extends JTextField {
    String hint;
    Font font;
    EmptyBorder margines;
    Color kolorTekstu;
    Color kolorTla;

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
