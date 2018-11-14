package com.bignerdranch.android.app.Models;

public class Tops extends Clothing{

    // Color, Pattern, Cut, Style, Fit, Size (XS, S, M, L, XL, etc.), Status (Clean or dirty)

    enum Color
    {
        RED, GREEN, BLUE, WHITE, ORANGE, YELLOW, BLACK, GREY, PURPLE, OTHER
    }

    enum Pattern{
        Solid, Stripe, Plaid, Floral, Polka_Dot, Other
    }

    private String size;
    private boolean status;
    private Color color;

    // Constructor
    public Tops(){
        status = true;          // Top is clean as default
    }
}
