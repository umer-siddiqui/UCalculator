package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine;
    private Button btnAc, btnPlusMinus, btnDivide, btnMultiply, btnPlus, btnMinus, btnEqual, btnPercent, btnDot;

    private TextView tvResult, tvDisplay;

    private double firstNumber, secondNumber, result;

    private String operation;

    private boolean isFirstNumber = true;
    private boolean isDotPressed = false;

    private ToggleButton btnToggle;

    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //make translucent statusBar on kitkat devices
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21) {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, true);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        //make fully Android Transparent Status bar
        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);

        firstNumber = 0;
        secondNumber = 0;
        result = 0;

        tvResult = (TextView) findViewById(R.id.tvResult);
        tvResult.setText("0");

        tvDisplay = (TextView) findViewById(R.id.tvDisplay);
        tvDisplay.setText("");

        btnZero = (Button) findViewById(R.id.btnZero);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);

        btnAc = (Button) findViewById(R.id.btnAc);
        btnPlusMinus = (Button) findViewById(R.id.btnPlusMinus);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnPercent = (Button) findViewById(R.id.btnPercent);
        btnDot = (Button) findViewById(R.id.btnDot);

        btnToggle = (ToggleButton) findViewById(R.id.btnToggle);

        btnZero.setOnClickListener(MainActivity.this);
        btnOne.setOnClickListener(MainActivity.this);
        btnTwo.setOnClickListener(MainActivity.this);
        btnThree.setOnClickListener(MainActivity.this);
        btnFour.setOnClickListener(MainActivity.this);
        btnFive.setOnClickListener(MainActivity.this);
        btnSix.setOnClickListener(MainActivity.this);
        btnSeven.setOnClickListener(MainActivity.this);
        btnEight.setOnClickListener(MainActivity.this);
        btnNine.setOnClickListener(MainActivity.this);

        btnAc.setOnClickListener(MainActivity.this);
        btnPlusMinus.setOnClickListener(MainActivity.this);
        btnDivide.setOnClickListener(MainActivity.this);
        btnMultiply.setOnClickListener(MainActivity.this);
        btnPlus.setOnClickListener(MainActivity.this);
        btnMinus.setOnClickListener(MainActivity.this);
        btnEqual.setOnClickListener(MainActivity.this);
        btnPercent.setOnClickListener(MainActivity.this);
        btnDot.setOnClickListener(MainActivity.this);

        btnToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    blueTheme();
                }
                else{
                    orangeTheme();
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        switch(viewId){
            case R.id.btnZero:
                if(!tvResult.getText().toString().trim().equals("0")){
                    tvResult.setText(tvResult.getText() + "0");
                }
                break;
            case R.id.btnOne:
                if(tvResult.getText().toString().trim().equals("0")){
                    tvResult.setText("");
                }
                tvResult.setText(tvResult.getText() + "1");
                break;
            case R.id.btnTwo:
                if(tvResult.getText().toString().trim().equals("0")){
                    tvResult.setText("");
                }
                tvResult.setText(tvResult.getText() + "2");
                break;
            case R.id.btnThree:
                if(tvResult.getText().toString().trim().equals("0")){
                    tvResult.setText("");
                }
                tvResult.setText(tvResult.getText() + "3");
                break;
            case R.id.btnFour:
                if(tvResult.getText().toString().trim().equals("0")){
                    tvResult.setText("");
                }
                tvResult.setText(tvResult.getText() + "4");
                break;
            case R.id.btnFive:
                if(tvResult.getText().toString().trim().equals("0")){
                    tvResult.setText("");
                }
                tvResult.setText(tvResult.getText() + "5");
                break;
            case R.id.btnSix:
                if(tvResult.getText().toString().trim().equals("0")){
                    tvResult.setText("");
                }
                tvResult.setText(tvResult.getText() + "6");
                break;
            case R.id.btnSeven:
                if(tvResult.getText().toString().trim().equals("0")){
                    tvResult.setText("");
                }
                tvResult.setText(tvResult.getText() + "7");
                break;
            case R.id.btnEight:
                if(tvResult.getText().toString().trim().equals("0")){
                    tvResult.setText("");
                }
                tvResult.setText(tvResult.getText() + "8");
                break;
            case R.id.btnNine:
                if(tvResult.getText().toString().trim().equals("0")){
                    tvResult.setText("");
                }
                tvResult.setText(tvResult.getText() + "9");
                break;
            case R.id.btnDot:
                if(!isDotPressed){
                    tvResult.setText(tvResult.getText() + ".");
                    isDotPressed = true;
                }
                break;
            case R.id.btnAc:
                tvResult.setText("0");
                tvDisplay.setText("");
                firstNumber = 0;
                secondNumber = 0;
                result = 0;
                isFirstNumber = true;
                isDotPressed = false;
                break;
            case R.id.btnPlusMinus:
                if(!tvResult.getText().toString().equals("0")){
                    double d = Double.parseDouble(tvResult.getText().toString().trim());
                    d = d*-1;

                    String[] arr = Double.toString(d).split("\\.");

                    if(arr[1].length() == 1 && arr[1].startsWith("0")){
                        tvResult.setText(arr[0]);
                    }
                    else{
                        tvResult.setText(Double.toString(d));
                    }

                    if(isFirstNumber){

                    }
                }
                break;
            case R.id.btnDivide:
                if(isFirstNumber == true && !tvResult.getText().toString().equals("0")){
                    operation = "/";
                    firstNumber = Double.parseDouble(tvResult.getText().toString().trim());
                    tvResult.setText("0");

                    String[] arr = String.valueOf(Double.toString(firstNumber)).split("\\.");

                    if(arr[1].length() == 1 && arr[1].startsWith("0")){
                        tvDisplay.setText(arr[0] + " / ");
                    }
                    else{
                        tvDisplay.setText(Double.toString(firstNumber) + " / ");
                    }

                    isDotPressed = false;
                    isFirstNumber = false;
                }
                break;
            case R.id.btnMultiply:
                if(isFirstNumber == true && !tvResult.getText().toString().equals("0")){
                    operation = "X";
                    firstNumber = Double.parseDouble(tvResult.getText().toString().trim());
                    tvResult.setText("0");

                    String[] arr = String.valueOf(Double.toString(firstNumber)).split("\\.");

                    if(arr[1].length() == 1 && arr[1].startsWith("0")){
                        tvDisplay.setText(arr[0] + " X ");
                    }
                    else{
                        tvDisplay.setText(Double.toString(firstNumber) + " X ");
                    }

                    isDotPressed = false;
                    isFirstNumber = false;
                }
                break;
            case R.id.btnPlus:
                if(isFirstNumber == true && !tvResult.getText().toString().equals("0")){
                    operation = "+";
                    firstNumber = Double.parseDouble(tvResult.getText().toString().trim());
                    tvResult.setText("0");

                    String[] arr = String.valueOf(Double.toString(firstNumber)).split("\\.");

                    if(arr[1].length() == 1 && arr[1].startsWith("0")){
                        tvDisplay.setText(arr[0] + " + ");
                    }
                    else{
                        tvDisplay.setText(Double.toString(firstNumber) + " + ");
                    }

                    isDotPressed = false;
                    isFirstNumber = false;
                }
                break;
            case R.id.btnMinus:
                if(isFirstNumber == true && !tvResult.getText().toString().equals("0")){
                    operation = "-";
                    firstNumber = Double.parseDouble(tvResult.getText().toString().trim());
                    tvResult.setText("0");

                    String[] arr = String.valueOf(Double.toString(firstNumber)).split("\\.");

                    if(arr[1].length() == 1 && arr[1].startsWith("0")){
                        tvDisplay.setText(arr[0] + " - ");
                    }
                    else{
                        tvDisplay.setText(Double.toString(firstNumber) + " - ");
                    }

                    isDotPressed = false;
                    isFirstNumber = false;
                }
                break;
            case R.id.btnPercent:
                if(isFirstNumber == true && !tvResult.getText().toString().equals("0")){
                    operation = "%";
                    firstNumber = Double.parseDouble(tvResult.getText().toString().trim());
                    tvResult.setText("0");

                    String[] arr = String.valueOf(Double.toString(firstNumber)).split("\\.");

                    if(arr[1].length() == 1 && arr[1].startsWith("0")){
                        tvDisplay.setText(arr[0] + " % ");
                    }
                    else{
                        tvDisplay.setText(Double.toString(firstNumber) + " % ");
                    }

                    isDotPressed = false;
                    isFirstNumber = false;
                }
                break;
            case R.id.btnEqual:
                if(!isFirstNumber){
                    secondNumber = Double.parseDouble(tvResult.getText().toString().trim());
                    if(operation.equals("/")){
                        if(secondNumber != 0){
                            result = firstNumber/secondNumber;
                        }
                        else{
                            result = 0;
                        }
                    }
                    else if(operation.equals("X")){
                        result = firstNumber*secondNumber;
                    }
                    else if(operation.equals("+")){
                        result = firstNumber+secondNumber;
                    }
                    else if(operation.equals("-")){
                        result = firstNumber-secondNumber;
                    }
                    else if(operation.equals("%")){
                        result = firstNumber%secondNumber;
                    }

                    String[] arr = String.valueOf(result).split("\\.");

                    if(arr[1].length() == 1 && arr[1].startsWith("0")){
                        tvResult.setText(arr[0]);
                    }
                    else{
                        tvResult.setText(Double.toString(result));
                    }

                    String[] a = String.valueOf(Double.toString(secondNumber)).split("\\.");

                    if(a[1].length() == 1 && a[1].startsWith("0")){
                        if(secondNumber == 0){
                            tvDisplay.setText(tvDisplay.getText().toString().trim() + " ");
                        }
                        else{
                            tvDisplay.setText(tvDisplay.getText().toString().trim() + " " + a[0] + " = ");
                        }
                    }
                    else{
                        if(secondNumber == 0){
                            tvDisplay.setText(tvDisplay.getText().toString() + " ");
                        }
                        else{
                            tvDisplay.setText(tvDisplay.getText().toString() + " " + secondNumber + " = ");
                        }
                    }

                    isFirstNumber = true;
                }
                break;
        }
    }

    public void orangeTheme(){
        constraintLayout.setBackgroundColor(getResources().getColor(R.color.colorTextBrown));
        tvResult.setBackground(getDrawable(R.drawable.back_view_off));

        btnZero.setTextColor(getResources().getColor(R.color.colorTextBrown));
        btnOne.setTextColor(getResources().getColor(R.color.colorTextBrown));
        btnTwo.setTextColor(getResources().getColor(R.color.colorTextBrown));
        btnThree.setTextColor(getResources().getColor(R.color.colorTextBrown));
        btnFour.setTextColor(getResources().getColor(R.color.colorTextBrown));
        btnFive.setTextColor(getResources().getColor(R.color.colorTextBrown));
        btnSix.setTextColor(getResources().getColor(R.color.colorTextBrown));
        btnSeven.setTextColor(getResources().getColor(R.color.colorTextBrown));
        btnEight.setTextColor(getResources().getColor(R.color.colorTextBrown));
        btnNine.setTextColor(getResources().getColor(R.color.colorTextBrown));

        btnAc.setTextColor(getResources().getColor(R.color.colorTextBrown));
        btnPlusMinus.setTextColor(getResources().getColor(R.color.colorTextBrown));
        btnDivide.setTextColor(getResources().getColor(R.color.colorTextBrown));
        btnMultiply.setTextColor(getResources().getColor(R.color.colorTextBrown));
        btnPlus.setTextColor(getResources().getColor(R.color.colorTextBrown));
        btnMinus.setTextColor(getResources().getColor(R.color.colorTextBrown));
        btnEqual.setBackground(getDrawable(R.drawable.back_view_off));
        btnPercent.setTextColor(getResources().getColor(R.color.colorTextBrown));
        btnDot.setTextColor(getResources().getColor(R.color.colorTextBrown));

        btnZero.setBackground(getDrawable(R.drawable.btn_light));
        btnOne.setBackground(getDrawable(R.drawable.btn_light));
        btnTwo.setBackground(getDrawable(R.drawable.btn_light));
        btnThree.setBackground(getDrawable(R.drawable.btn_light));
        btnFour.setBackground(getDrawable(R.drawable.btn_light));
        btnFive.setBackground(getDrawable(R.drawable.btn_light));
        btnSix.setBackground(getDrawable(R.drawable.btn_light));
        btnSeven.setBackground(getDrawable(R.drawable.btn_light));
        btnEight.setBackground(getDrawable(R.drawable.btn_light));
        btnNine.setBackground(getDrawable(R.drawable.btn_light));

        btnAc.setBackground(getDrawable(R.drawable.btn_light));
        btnPlusMinus.setBackground(getDrawable(R.drawable.btn_light));
        btnDivide.setBackground(getDrawable(R.drawable.btn_light));
        btnMultiply.setBackground(getDrawable(R.drawable.btn_light));
        btnPlus.setBackground(getDrawable(R.drawable.btn_light));
        btnMinus.setBackground(getDrawable(R.drawable.btn_light));
        btnEqual.setBackground(getDrawable(R.drawable.back_view_off));
        btnPercent.setBackground(getDrawable(R.drawable.btn_light));
        btnDot.setBackground(getDrawable(R.drawable.btn_light));
    }

    public void blueTheme(){
        constraintLayout.setBackgroundColor(getResources().getColor(R.color.btnColorDivider));
        tvResult.setBackground(getDrawable(R.drawable.back_view));

        btnZero.setTextColor(getResources().getColor(R.color.colorWhite));
        btnOne.setTextColor(getResources().getColor(R.color.colorWhite));
        btnTwo.setTextColor(getResources().getColor(R.color.colorWhite));
        btnThree.setTextColor(getResources().getColor(R.color.colorWhite));
        btnFour.setTextColor(getResources().getColor(R.color.colorWhite));
        btnFive.setTextColor(getResources().getColor(R.color.colorWhite));
        btnSix.setTextColor(getResources().getColor(R.color.colorWhite));
        btnSeven.setTextColor(getResources().getColor(R.color.colorWhite));
        btnEight.setTextColor(getResources().getColor(R.color.colorWhite));
        btnNine.setTextColor(getResources().getColor(R.color.colorWhite));

        btnAc.setTextColor(getResources().getColor(R.color.colorWhite));
        btnPlusMinus.setTextColor(getResources().getColor(R.color.colorWhite));
        btnDivide.setTextColor(getResources().getColor(R.color.colorWhite));
        btnMultiply.setTextColor(getResources().getColor(R.color.colorWhite));
        btnPlus.setTextColor(getResources().getColor(R.color.colorWhite));
        btnMinus.setTextColor(getResources().getColor(R.color.colorWhite));
        btnEqual.setBackground(getDrawable(R.drawable.back_view));
        btnPercent.setTextColor(getResources().getColor(R.color.colorWhite));
        btnDot.setTextColor(getResources().getColor(R.color.colorWhite));

        btnZero.setBackground(getDrawable(R.drawable.btn_dark));
        btnOne.setBackground(getDrawable(R.drawable.btn_dark));
        btnTwo.setBackground(getDrawable(R.drawable.btn_dark));
        btnThree.setBackground(getDrawable(R.drawable.btn_dark));
        btnFour.setBackground(getDrawable(R.drawable.btn_dark));
        btnFive.setBackground(getDrawable(R.drawable.btn_dark));
        btnSix.setBackground(getDrawable(R.drawable.btn_dark));
        btnSeven.setBackground(getDrawable(R.drawable.btn_dark));
        btnEight.setBackground(getDrawable(R.drawable.btn_dark));
        btnNine.setBackground(getDrawable(R.drawable.btn_dark));

        btnAc.setBackground(getDrawable(R.drawable.btn_dark));
        btnPlusMinus.setBackground(getDrawable(R.drawable.btn_dark));
        btnDivide.setBackground(getDrawable(R.drawable.btn_dark));
        btnMultiply.setBackground(getDrawable(R.drawable.btn_dark));
        btnPlus.setBackground(getDrawable(R.drawable.btn_dark));
        btnMinus.setBackground(getDrawable(R.drawable.btn_dark));
        btnEqual.setBackground(getDrawable(R.drawable.back_view));
        btnPercent.setBackground(getDrawable(R.drawable.btn_dark));
        btnDot.setBackground(getDrawable(R.drawable.btn_dark));
    }

    public static void setWindowFlag(Activity activity, final int bits, boolean on) {
        Window win = activity.getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }
}