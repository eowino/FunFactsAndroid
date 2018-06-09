package com.evansowino.funfacts;

import android.graphics.Color;

import java.util.Random;

public class ColourPicker {
    private Random randomGen = new Random();
    private int[] mColors = {
        Color.rgb(9,17,45),
        Color.rgb(18,34,102),
        Color.rgb(133, 25, 52),
        Color.rgb(30, 125, 158),
        Color.rgb(57, 165, 217),
        Color.rgb(140, 136, 30),
        Color.rgb(1, 132, 152),
        Color.rgb(47, 149, 164),
        Color.rgb(127, 0, 0),
        Color.rgb(255, 76, 76)
    };

    public int getColor() {
        int randNumber = randomGen.nextInt(mColors.length);
        return mColors[randNumber];
    };

}
