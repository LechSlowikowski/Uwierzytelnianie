package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.border.EmptyBorder;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class JCustomTextFieldTest {
    @Test
    public void testPodpowiedzi() {
        String podpowiedz = "Podpowiedź testowa";
        Font font = new Font("Verdana", Font.PLAIN, 10);
        EmptyBorder margines = new EmptyBorder(10, 0, 10, 0);
        Color kolorTekstu = Color.BLACK;
        Color kolorTla = Color.YELLOW;
        JCustomTextField jCustomTextField = new JCustomTextField(podpowiedz, font, margines, kolorTekstu, kolorTla);
        Assertions.assertEquals(jCustomTextField.getToolTipText(), podpowiedz);
    }

    @Test
    public void testFontu() {
        String podpowiedz = "Podpowiedź testowa";
        Font font = new Font("Verdana", Font.PLAIN, 10);
        EmptyBorder margines = new EmptyBorder(10, 0, 10, 0);
        Color kolorTekstu = Color.BLACK;
        Color kolorTla = Color.YELLOW;
        JCustomTextField jCustomTextField = new JCustomTextField(podpowiedz, font, margines, kolorTekstu, kolorTla);
        Assertions.assertEquals(jCustomTextField.getFont(), font);
    }

    @Test
    public void testMarginesu() {
        String podpowiedz = "Podpowiedź testowa";
        Font font = new Font("Verdana", Font.PLAIN, 10);
        EmptyBorder margines = new EmptyBorder(10, 0, 10, 0);
        Color kolorTekstu = Color.BLACK;
        Color kolorTla = Color.YELLOW;
        JCustomTextField jCustomTextField = new JCustomTextField(podpowiedz, font, margines, kolorTekstu, kolorTla);
        Assertions.assertEquals(jCustomTextField.getBorder(), margines);
    }

    @Test
    public void testKoloruTeksu() {
        String podpowiedz = "Podpowiedź testowa";
        Font font = new Font("Verdana", Font.PLAIN, 10);
        EmptyBorder margines = new EmptyBorder(10, 0, 10, 0);
        Color kolorTekstu = Color.BLACK;
        Color kolorTla = Color.YELLOW;
        JCustomTextField jCustomTextField = new JCustomTextField(podpowiedz, font, margines, kolorTekstu, kolorTla);
        Assertions.assertEquals(jCustomTextField.getForeground(), kolorTekstu);
    }

    @Test
    public void testKoloruTla() {
        String podpowiedz = "Podpowiedź testowa";
        Font font = new Font("Verdana", Font.PLAIN, 10);
        EmptyBorder margines = new EmptyBorder(10, 0, 10, 0);
        Color kolorTekstu = Color.BLACK;
        Color kolorTla = Color.YELLOW;
        JCustomTextField jCustomTextField = new JCustomTextField(podpowiedz, font, margines, kolorTekstu, kolorTla);
        Assertions.assertEquals(jCustomTextField.getBackground(), kolorTla);
    }
}