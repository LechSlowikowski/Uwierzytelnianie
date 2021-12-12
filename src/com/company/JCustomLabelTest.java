package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.border.EmptyBorder;
import java.awt.*;


class JCustomLabelTest {

    @Test
    public void testFontu() {
        Font font = new Font("Arial", Font.PLAIN, 16);
        EmptyBorder margines = new EmptyBorder(0, 10, 0, 10);
        Color kolorTekstu = Color.BLACK;
        Color kolorTla = Color.WHITE;
        JCustomLabel jCustomLabel = new JCustomLabel("Testowy tekst", font, margines, kolorTekstu, kolorTla);
        Assertions.assertEquals(jCustomLabel.getFont(), font);
    }

    @Test
    void testMarginesu() {
        Font font = new Font("Arial", Font.PLAIN, 16);
        EmptyBorder margines = new EmptyBorder(0, 10, 0, 10);
        Color kolorTekstu = Color.BLACK;
        Color kolorTla = Color.WHITE;
        JCustomLabel jCustomLabel = new JCustomLabel("Testowy tekst", font, margines, kolorTekstu, kolorTla);
        Assertions.assertEquals(jCustomLabel.getBorder(), margines);
    }

    @Test
    void testKoloruTekstu() {
        Font font = new Font("Arial", Font.PLAIN, 16);
        EmptyBorder margines = new EmptyBorder(0, 10, 0, 10);
        Color kolorTekstu = Color.BLACK;
        Color kolorTla = Color.WHITE;
        JCustomLabel jCustomLabel = new JCustomLabel("Testowy tekst", font, margines, kolorTekstu, kolorTla);
        Assertions.assertEquals(jCustomLabel.getForeground(), kolorTekstu);
    }

    @Test
    void testKoloruTla() {
        Font font = new Font("Arial", Font.PLAIN, 16);
        EmptyBorder margines = new EmptyBorder(0, 10, 0, 10);
        Color kolorTekstu = Color.BLACK;
        Color kolorTla = Color.WHITE;
        JCustomLabel jCustomLabel = new JCustomLabel("Testowy tekst", font, margines, kolorTekstu, kolorTla);
        Assertions.assertEquals(jCustomLabel.getBackground(), kolorTla);
    }
}