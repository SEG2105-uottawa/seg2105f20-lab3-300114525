package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private enum Operator {none,add,minus,multiply, divide};
    private double data1 = 0, data2 = 0;
    private Operator optr = Operator.none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn00Click(View view) {
        TextView tText = (TextView)findViewById(R.id.resultEdit);
        tText.setText(tText.getText()+"0");
    }

    public void btn01Click(View view) {
        TextView tText = (TextView)findViewById(R.id.resultEdit);
        tText.setText(tText.getText()+"1");
    }

    public void btn02Click(View view) {
        TextView tText = (TextView)findViewById(R.id.resultEdit);
        tText.setText(tText.getText()+"2");
    }

    public void btn03Click(View view) {
        TextView tText = (TextView)findViewById(R.id.resultEdit);
        tText.setText(tText.getText()+"3");
    }

    public void btn04Click(View view) {
        TextView tText = (TextView)findViewById(R.id.resultEdit);
        tText.setText(tText.getText()+"4");
    }

    public void btn05Click(View view) {
        TextView tText = (TextView)findViewById(R.id.resultEdit);
        tText.setText(tText.getText()+"5");
    }

    public void btn06Click(View view) {
        TextView tText = (TextView)findViewById(R.id.resultEdit);
        tText.setText(tText.getText()+"6");
    }

    public void btn07Click(View view) {
        TextView tText = (TextView)findViewById(R.id.resultEdit);
        tText.setText(tText.getText()+"7");
    }

    public void btn08Click(View view) {
        TextView tText = (TextView)findViewById(R.id.resultEdit);
        tText.setText(tText.getText()+"8");
    }

    public void btn09Click(View view) {
        TextView tText = (TextView)findViewById(R.id.resultEdit);
        tText.setText(tText.getText()+"9");
    }

    public void btnAddClick(View view) {
        optr = Operator.add;
        TextView tText = (TextView)findViewById(R.id.resultEdit);
        data1=Double.parseDouble(tText.getText().toString());
        tText.setText("");
    }

    public void btnMinusClick(View view) {
        optr = Operator.minus;
        TextView tText = (TextView)findViewById(R.id.resultEdit);
        data1=Double.parseDouble(tText.getText().toString());
        tText.setText("");
    }

    public void btnMultiplyClick(View view) {
        optr = Operator.multiply;
        TextView tText = (TextView)findViewById(R.id.resultEdit);
        data1=Double.parseDouble(tText.getText().toString());
        tText.setText("");
    }

    public void btnDivideClick(View view) {
        optr = Operator.divide;
        TextView tText = (TextView)findViewById(R.id.resultEdit);
        data1=Double.parseDouble(tText.getText().toString());
        tText.setText("");
    }

    public void btnClearClick(View view) {
        TextView tText = (TextView)findViewById(R.id.resultEdit);
        tText.setText("");
    }

    public void btnDotClick(View view) {
        TextView tText = (TextView)findViewById(R.id.resultEdit);
        tText.setText(tText.getText()+".");
    }

    public void btnResultClick(View view) {
        if (optr != Operator.none) {
            TextView tText = (TextView)findViewById(R.id.resultEdit);
            data2 = Double.parseDouble(tText.getText().toString());
            double result = 0;
            if (optr == Operator.add) {
                result = data1+data2;
            } else if (optr == Operator.minus) {
                result = data1-data2;
            } else if (optr == Operator.multiply) {
                result = data1*data2;
            } else if (optr == Operator.divide) {
                result = data1/data2;
            }
            optr = Operator.none;
            data1 = result;
            if ((result-(int)result) != 0) {
                tText.setText(String.valueOf(result));
            } else {
                tText.setText(String.valueOf((int)result));
            }
        }
    }
}