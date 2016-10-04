package com.example.oleg.calc.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.oleg.calc.Config;
import com.example.oleg.calc.R;

/**
 * Created by Oleg on 04.10.2016.
 */

public class CalcFragment extends Fragment implements View.OnClickListener {


    EditText input;
    //----------------------------------------
    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnZero;
    //    --------------------------------------------
    Button btnPoint;
    Button btnMul;
    Button btnDiv;
    Button btnPlus;
    Button btnMinus;
    Button btnClear;
    Button btnEquals;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.calc, container, false);

        input = (EditText) v.findViewById(R.id.input);

        btnZero = (Button) v.findViewById(R.id.btnZero);
        btnZero.setOnClickListener(this);


        btnOne = (Button) v.findViewById(R.id.btnOne);
        btnOne.setOnClickListener(this);

        btnTwo = (Button) v.findViewById(R.id.btnTwo);
        btnTwo.setOnClickListener(this);

        btnThree = (Button) v.findViewById(R.id.btnThree);
        btnThree.setOnClickListener(this);

        btnFour = (Button) v.findViewById(R.id.btnFour);
        btnFour.setOnClickListener(this);

        btnFive = (Button) v.findViewById(R.id.btnFive);
        btnFive.setOnClickListener(this);

        btnSix = (Button) v.findViewById(R.id.btnSix);
        btnSix.setOnClickListener(this);

        btnSeven = (Button) v.findViewById(R.id.btnSeven);
        btnSeven.setOnClickListener(this);

        btnEight = (Button) v.findViewById(R.id.btnEight);
        btnEight.setOnClickListener(this);

        btnNine = (Button) v.findViewById(R.id.btnNine);
        btnNine.setOnClickListener(this);

        btnPoint = (Button) v.findViewById(R.id.btnPoint);
        btnPoint.setOnClickListener(this);

        btnPlus = (Button) v.findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(this);

        btnMinus = (Button) v.findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(this);

        btnMul = (Button) v.findViewById(R.id.btnMulti);
        btnMul.setOnClickListener(this);

        btnDiv = (Button) v.findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(this);


        btnClear = (Button) v.findViewById(R.id.btnClear);
        btnClear.setOnClickListener(this);

        btnEquals = (Button) v.findViewById(R.id.btnEquals);
        btnEquals.setOnClickListener(this);

        Log.d(Config.TAG, "CalcFragment - onCreateView");
        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOne:
                Log.d(Config.TAG, "one clicked: " + btnOne.getId());
                break;

            case R.id.btnTwo:
                Log.d(Config.TAG, "two clicked: " + btnTwo.getId());
                break;

            case R.id.btnThree:
                Log.d(Config.TAG, "three clicked: " + btnThree.getId());
                break;

            case R.id.btnFour:
                Log.d(Config.TAG, "four clicked: " + btnFour.getId());
                break;

            case R.id.btnFive:
                Log.d(Config.TAG, "five clicked: " + btnFive.getId());
                break;

            case R.id.btnSix:
                Log.d(Config.TAG, "six clicked: " + btnSix.getId());
                break;

            case R.id.btnSeven:
                Log.d(Config.TAG, "seven clicked: " + btnSeven.getId());
                break;

            case R.id.btnEight:
                Log.d(Config.TAG, "eight clicked: " + btnEight.getId());
                break;

            case R.id.btnNine:
                Log.d(Config.TAG, "nine clicked: " + btnNine.getId());
                break;

            case R.id.btnZero:
                Log.d(Config.TAG, "zero clicked: " + btnZero.getId());
                break;


            case R.id.btnMulti:
                Log.d(Config.TAG, "* clicked: " + btnMul.getId());
                break;


            case R.id.btnDiv:
                Log.d(Config.TAG, "div clicked: " + btnDiv.getId());
                break;

            case R.id.btnPlus:
                Log.d(Config.TAG, "plus clicked: " + btnPlus.getId());
                break;


            case R.id.btnMinus:
                Log.d(Config.TAG, "Minus clicked: " + btnMinus.getId());
                break;

            case R.id.btnClear:
                Log.d(Config.TAG, "clear clicked: " + btnClear.getId());
                break;

            case R.id.btnPoint:
                Log.d(Config.TAG, "point clicked: " + btnPoint.getId());
                break;

            case R.id.btnEquals:
                Log.d(Config.TAG, "= clicked: " + btnEquals.getId());
                break;
        }
    }
}
