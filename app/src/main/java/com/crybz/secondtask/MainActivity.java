package com.crybz.secondtask;

/*Переделайте все кнопки на материал.
        Все размеры и строки сделайте ресурсами.
        Создайте стиль для своего приложения.
        * Создайте светлую и тёмную тему для приложения.*/


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MaterialButton
            btnEquals, btnDel, btnUmn, btnSum, btnDelite,
            btnMinus, btnZap, btnProc, btnNew;

    TextView tvFirst, tvResult;
    String oneNumber = "";
    String twoNumber = "";
    String notNumber = "";

    double result = 0;
    double one = 0;
    double two = 0;
    String zap = "";

    String oneCount = "";
    String twoCount = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnEquals = findViewById(R.id.btn_equals);
        btnDel = findViewById(R.id.btn_del);
        btnSum = findViewById(R.id.btn_plus);
        btnMinus = findViewById(R.id.btn_min);
        btnUmn = findViewById(R.id.btn_X);
        btnZap = findViewById(R.id.btn_zap);
        btnProc = findViewById(R.id.btn_proc);
        btnNew = findViewById(R.id.btn_C);
        btnDelite = findViewById(R.id.btn_delit);
        tvFirst = findViewById(R.id.tv_first);
        tvResult = findViewById(R.id.tv_result);


        tvResult.setText("");
        tvFirst.setText("");

        btnSum.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnUmn.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btnProc.setOnClickListener(this);
        btnZap.setOnClickListener(this);
        btnNew.setOnClickListener(this);
        btnDelite.setOnClickListener(this);
        setNumberButtonListeners();


    }


    final int[] numberButtonIds = new int[]{R.id.btn_0, R.id.btn_1, R.id.btn_2, R.id.btn_3,
            R.id.btn_4, R.id.btn_5, R.id.btn_6, R.id.btn_7, R.id.btn_8, R.id.btn_9};

    private void setNumberButtonListeners() {
        for (int i = 0; i < numberButtonIds.length; i++) {
            int index = i;

            findViewById(numberButtonIds[i]).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Button btn = (Button) v;
                    String buttonText = btn.getText().toString();
                    if (notNumber.equals("")) {
                        oneNumber += buttonText;
                        oneCount += buttonText;
                        tvFirst.setText(oneNumber);
                    } else {
                        twoNumber += buttonText;
                        twoCount += buttonText;
                        tvFirst.setText(oneNumber + notNumber + twoNumber);
                    }

                }


            });
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_C:
                one = 0;
                two = 0;
                oneNumber = "";
                twoNumber = "";
                oneCount = "";
                twoCount = "";
                tvFirst.setText("");
                tvResult.setText("");
                result = 0;
                zap = "";
                notNumber = "";

                break;

            case R.id.btn_zap:
                if (notNumber.equals("") && zap.equals("")) {
                    oneNumber += ".";
                    oneCount += ".";
                    tvFirst.setText(oneNumber);
                    zap = ".";
                } else {
                    if (zap.equals("")) {
                        twoNumber += ".";
                        twoCount += ".";
                        tvFirst.setText(oneNumber + notNumber + twoNumber);
                        zap = ".";
                    }
                }
                break;

            case R.id.btn_delit:
                if (!(oneNumber.equals(""))) {
                    if (!(oneNumber.equals("")) && notNumber.equals("") && twoNumber.equals("")) {
                        oneNumber = oneNumber.substring(0, oneNumber.length() - 1);
                        oneCount = oneNumber;
                        tvFirst.setText(oneNumber);
                    } else if (!(twoNumber.equals(""))) {
                        twoNumber = twoNumber.substring(0, twoNumber.length() - 1);
                        twoCount = twoNumber;
                        tvFirst.setText(oneNumber + notNumber + twoNumber);
                    } else if (twoNumber.equals("") && !(notNumber.equals(""))) {
                        notNumber = notNumber.substring(0, notNumber.length() - 3);
                        tvFirst.setText(oneNumber + notNumber + twoNumber);
                    } else {
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Нечего удалять!", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                }
                break;


            case R.id.btn_plus:
                if (notNumber.equals("") || notNumber.equals(" - ") || notNumber.equals(" X ")
                        || notNumber.equals(" / ") || notNumber.equals(" % ") && !(oneNumber.equals(""))) {

                    notNumber = " + ";
                    tvFirst.setText((oneNumber + notNumber));
                    zap = "";
                } else if (notNumber.equals(" + ") || notNumber.equals("") ||
                        notNumber.equals(" - ") || notNumber.equals(" X ")
                        || notNumber.equals(" / ") || notNumber.equals(" % ") && one != result) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Уже есть знак +!", Toast.LENGTH_SHORT);
                    toast.show();
                } else if (one == result) {
                    oneNumber = oneNumber + " + ";
                    tvFirst.setText(oneNumber);
                    zap = "";
                }
                break;

            case R.id.btn_min:
                if (notNumber.equals("") || notNumber.equals(" + ") || notNumber.equals(" X ") ||
                        notNumber.equals(" / ") || notNumber.equals(" - ") ||
                        notNumber.equals(" % ") && !(oneNumber.equals(""))) {

                    notNumber = " - ";
                    tvFirst.setText((oneNumber + notNumber));
                    zap = "";
                } else if (notNumber.equals(" - ") || notNumber.equals(" + ") || notNumber.equals(" / ") ||
                        notNumber.equals(" X ") || notNumber.equals(" % ") && one != result) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Уже есть знак -!", Toast.LENGTH_SHORT);
                    toast.show();
                } else if (one == result) {
                    oneNumber = oneNumber + " - ";
                    tvFirst.setText(oneNumber);
                    zap = "";

                }
                break;

            case R.id.btn_X:
                if (notNumber.equals("") || notNumber.equals(" + ") || notNumber.equals(" - ")
                        || notNumber.equals(" / ") || notNumber.equals(" % ") && !(oneNumber.equals(""))) {


                    notNumber = " X ";
                    tvFirst.setText((oneNumber + notNumber));
                    zap = "";
                } else if (notNumber.equals(" - ") || notNumber.equals(" + ") ||
                        notNumber.equals(" X ") || notNumber.equals(" / ") || notNumber.equals(" % ") && one != result) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Уже есть знак X!", Toast.LENGTH_SHORT);
                    toast.show();
                } else if (one == result) {
                    oneNumber = oneNumber + " X ";
                    tvFirst.setText(oneNumber);
                    zap = "";

                }
                break;

            case R.id.btn_del:
                if (notNumber.equals("") || notNumber.equals(" - ") || notNumber.equals(" X ") ||
                        notNumber.equals(" + ") || notNumber.equals(" % ") && !(oneNumber.equals(""))) {

                    notNumber = " / ";
                    tvFirst.setText((oneNumber + notNumber));
                    zap = "";
                } else if (notNumber.equals(" / ") || notNumber.equals("") || notNumber.equals(" - ") || notNumber.equals(" X ")
                        || notNumber.equals(" + ") || notNumber.equals(" % ") && one != result) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Уже есть знак /!", Toast.LENGTH_SHORT);
                    toast.show();
                } else if (one == result) {
                    oneNumber = oneNumber + " / ";
                    tvFirst.setText(oneNumber);
                    zap = "";

                }
                break;

            case R.id.btn_proc:
                if (notNumber.equals("") || notNumber.equals(" - ") |
                        notNumber.equals(" X ") || notNumber.equals(" + ") ||
                        notNumber.equals(" / ") && !(oneNumber.equals(""))) {

                    notNumber = " % ";
                    tvFirst.setText((oneNumber + notNumber));
                    zap = "";
                } else if (notNumber.equals(" + ") || notNumber.equals("") ||
                        notNumber.equals(" - ") || notNumber.equals(" X ")
                        || notNumber.equals(" / ") || notNumber.equals(" % ") && one != result) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Уже есть знак +!", Toast.LENGTH_SHORT);
                    toast.show();
                } else if (one == result) {
                    oneNumber = oneNumber + " % ";
                    tvFirst.setText(oneNumber);
                    zap = "";

                }
                break;


            case R.id.btn_equals:
                if (notNumber.equals(" + ")) {
                    one = Double.parseDouble(oneCount);
                    two = Double.parseDouble(twoCount);
                    result = one + two;
                    one = result;
                    oneCount = result + "";
                    twoCount = "";
                    oneNumber = result + "";
                    twoNumber = "";
                    tvFirst.setText(oneNumber);
                    notNumber = "";
                    zap = ".";

                }
                if (notNumber.equals(" - ")) {
                    one = Double.parseDouble(oneCount);
                    two = Double.parseDouble(twoCount);
                    result = one - two;
                    one = result;
                    oneCount = result + "";
                    twoCount = "";
                    oneNumber = result + "";
                    twoNumber = "";
                    tvFirst.setText(oneNumber);
                    notNumber = "";
                    zap = ".";


                }

                if (notNumber.equals(" X ")) {
                    one = Double.parseDouble(oneCount);
                    two = Double.parseDouble(twoCount);
                    result = one * two;
                    one = result;
                    oneCount = result + "";
                    twoCount = "";
                    oneNumber = result + "";
                    twoNumber = "";
                    tvFirst.setText(oneNumber);
                    notNumber = "";
                    zap = ".";
                }
                if (notNumber.equals(" / ")) {
                    one = Double.parseDouble(oneCount);
                    two = Double.parseDouble(twoCount);
                    result = one / two;
                    one = result;
                    oneCount = result + "";
                    twoCount = "";
                    oneNumber = result + "";
                    twoNumber = "";
                    tvFirst.setText(oneNumber);
                    notNumber = "";
                    zap = ".";

                }
                if (notNumber.equals(" % ")) {
                    one = Double.parseDouble(oneCount);
                    two = Double.parseDouble(twoCount);
                    result = (one / 100) * two;
                    one = result;
                    oneCount = result + "";
                    twoCount = "";
                    oneNumber = result + "";
                    twoNumber = "";
                    tvFirst.setText(oneNumber);
                    notNumber = "";
                    zap = ".";

                }

                tvResult.setText(result + " ");
                break;
        }
    }
}

