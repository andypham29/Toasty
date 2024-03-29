package com.example.ToastyLib;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ToastyToast {


    public static void make(Context mContext, String message){

        Toast toast = Toast.makeText(mContext,message, Toast.LENGTH_SHORT);
        //Gets the actual oval background of the Toast then sets the colour filter
        View view = toast.getView();
        TextView text = (TextView) view.findViewById(android.R.id.message);

        Random rand = new Random();
        int n = rand.nextInt(2);

        int color = n != 0 ? Color.BLACK : Color.GRAY;

        view.getBackground().setColorFilter(color, PorterDuff.Mode.SRC_IN);
        text.setTextColor(Color.WHITE);

        toast.show();
    }

    public static void makeRandom(Context mContext, String message){

        Toast toast = Toast.makeText(mContext,message, Toast.LENGTH_SHORT);
        //Gets the actual oval background of the Toast then sets the colour filter
        View view = toast.getView();
        TextView text = (TextView) view.findViewById(android.R.id.message);

        view.getBackground().setColorFilter(randomColor(), PorterDuff.Mode.SRC_IN);
        text.setTextColor(randomColor());

        toast.show();
    }

    private static int randomColor() {

        Random rand = new Random();
        int R = rand.nextInt(255);
        int G = rand.nextInt(255);
        int B = rand.nextInt(255);

        return Color.rgb(R, G, B);
    }
}
