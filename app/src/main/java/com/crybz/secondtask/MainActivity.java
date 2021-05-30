package com.crybz.secondtask;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,
            btnEquals, btnDel, btnUmn, btnSum, btnDelite,
            btnMinus, btnZap, btnProc, btnNew;

    TextView tvFirst, tvResult;
    String oneNumber = "" ;
    String twoNumber = "" ;
    String notNumber = "" ;

    double result = 0;
    double one = 0 ;
    double two = 0 ;
    String zap = "";

    String oneCount = "";
    String twoCount = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn_0);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn4 = findViewById(R.id.btn_4);
        btn5 = findViewById(R.id.btn_5);
        btn6 = findViewById(R.id.btn_6);
        btn7 = findViewById(R.id.btn_7);
        btn8 = findViewById(R.id.btn_8);
        btn9 = findViewById(R.id.btn_9);
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


        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnSum.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnUmn.setOnClickListener(this);
        btnDel.setOnClickListener(this);
        btnProc.setOnClickListener(this);
        btnZap.setOnClickListener(this);
        btnNew.setOnClickListener(this);
        btnDelite.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_0:
                if(notNumber.equals("")){
                    oneNumber += "0";
                    oneCount +="0";
                    tvFirst.setText(oneNumber);
                }
                else {
                    twoNumber += "0";
                    twoCount += "0";
                    tvFirst.setText(oneNumber+notNumber+twoNumber);
                }
                 break;

            case R.id.btn_1:
                if(notNumber.equals("")){
                    oneNumber += "1";
                    oneCount +="1";
                    tvFirst.setText(oneNumber);
                }
                else {
                    twoNumber += "1";
                    twoCount += "1";
                    tvFirst.setText(oneNumber+notNumber+twoNumber);
                }

                break;

            case R.id.btn_2:

                if(notNumber.equals("")){
                    oneNumber += "2";
                    oneCount +="2";
                    tvFirst.setText(oneNumber);
                }
                else {
                    twoNumber += "2";
                    twoCount += "2";
                    tvFirst.setText(oneNumber+notNumber+twoNumber);
                }

                break;

            case R.id.btn_3:

                if(notNumber.equals("")){
                    oneNumber += "3";
                    oneCount +="3";
                    tvFirst.setText(oneNumber);
                }
                else {
                    twoNumber += "3";
                    twoCount += "3";
                    tvFirst.setText(oneNumber+notNumber+twoNumber);
                }

                break;

            case R.id.btn_4:

                if(notNumber.equals("")){
                    oneNumber += "4";
                    oneCount +="4";
                    tvFirst.setText(oneNumber);
                }
                else {
                    twoNumber += "4";
                    twoCount += "4";
                    tvFirst.setText(oneNumber+notNumber+twoNumber);
                }

                break;

            case R.id.btn_5:

                if(notNumber.equals("")){
                    oneNumber += "5";
                    oneCount +="5";
                    tvFirst.setText(oneNumber);
                }
                else {
                    twoNumber += "5";
                    twoCount += "5";
                    tvFirst.setText(oneNumber+notNumber+twoNumber);
                }

                break;

            case R.id.btn_6:
                if(notNumber.equals("")){
                    oneNumber += "6";
                    oneCount +="6";
                    tvFirst.setText(oneNumber);
                }
                else {
                    twoNumber += "6";
                    twoCount += "6";
                    tvFirst.setText(oneNumber+notNumber+twoNumber);
                }


                break;

            case R.id.btn_7:

                if(notNumber.equals("")){
                    oneNumber += "7";
                    oneCount +="7";
                    tvFirst.setText(oneNumber);
                }
                else {
                    twoNumber += "7";
                    twoCount += "7";
                    tvFirst.setText(oneNumber+notNumber+twoNumber);
                }

                break;

            case R.id.btn_8:

                if(notNumber.equals("")){
                    oneNumber += "8";
                    oneCount +="8";
                    tvFirst.setText(oneNumber);
                }
                else {
                    twoNumber += "8";
                    twoCount += "8";
                    tvFirst.setText(oneNumber+notNumber+twoNumber);
                }

                break;

            case R.id.btn_9:


                if(notNumber.equals("")){
                    oneNumber += "9";
                    oneCount +="9";
                    tvFirst.setText(oneNumber);
                }
                else {
                    twoNumber += "9";
                    twoCount += "9";
                    tvFirst.setText(oneNumber+notNumber+twoNumber);
                }

                break;

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
                if(notNumber.equals("")&&zap.equals("")){
                    oneNumber += ".";
                    oneCount +=".";
                    tvFirst.setText(oneNumber);
                    zap = ".";
                }
                else {
                    if(zap.equals("")) {
                        twoNumber += ".";
                        twoCount += ".";
                        tvFirst.setText(oneNumber+notNumber+twoNumber);
                        zap = ".";
                    }
                }
                break;

            case R.id.btn_delit:
                if(!(oneNumber.equals(""))) {
                    if (!(oneNumber.equals("")) && notNumber.equals("") && twoNumber.equals("")) {
                        oneNumber = oneNumber.substring(0, oneNumber.length() - 1);
                        oneCount = oneNumber;
                        tvFirst.setText(oneNumber);
                    }
                    else if (!(twoNumber.equals(""))) {
                        twoNumber = twoNumber.substring(0, twoNumber.length() - 1);
                        twoCount = twoNumber;
                        tvFirst.setText(oneNumber + notNumber + twoNumber);
                    } else if (twoNumber.equals("") && !(notNumber.equals(""))) {
                        notNumber = notNumber.substring(0, notNumber.length() - 3);
                        tvFirst.setText(oneNumber + notNumber + twoNumber);
                    }
                    else{
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "Нечего удалять!", Toast.LENGTH_SHORT);
                            toast.show();
                        }
                    }
                break;


            case R.id.btn_plus:
                if(notNumber.equals("")||notNumber.equals(" - ")||notNumber.equals(" X ")
                        || notNumber.equals(" / ")||notNumber.equals(" % ")&&!(oneNumber.equals(""))) {

                    notNumber = " + ";
                    tvFirst.setText((oneNumber+notNumber));
                    zap = "";
                }
                else if(notNumber.equals(" + ")||notNumber.equals("")||
                        notNumber.equals(" - ")||notNumber.equals(" X ")
                    || notNumber.equals(" / ")||notNumber.equals(" % ")&& one !=result) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Уже есть знак +!", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else if(one == result){
                    oneNumber = oneNumber + " + ";
                    tvFirst.setText(oneNumber);
                    zap = "";
                }
                break;

            case R.id.btn_min:
                if(notNumber.equals("")||notNumber.equals(" + ")||notNumber.equals(" X ")||
                        notNumber.equals(" / ")||notNumber.equals(" - ")||
                        notNumber.equals(" % ")&&!(oneNumber.equals(""))) {

                    notNumber = " - ";
                    tvFirst.setText((oneNumber+notNumber));
                    zap = "";
                }
                else if(notNumber.equals(" - ")||notNumber.equals(" + ")|| notNumber.equals(" / ")||
                        notNumber.equals(" X ")||notNumber.equals(" % ")&& one !=result) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Уже есть знак -!", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else if(one == result){
                    oneNumber = oneNumber + " - ";
                    tvFirst.setText(oneNumber);
                    zap = "";

                }
                break;

            case R.id.btn_X:
                if(notNumber.equals("")||notNumber.equals(" + ")|| notNumber.equals(" - ")
                        || notNumber.equals(" / ")||notNumber.equals(" % ")&&!(oneNumber.equals(""))) {


                    notNumber = " X ";
                    tvFirst.setText((oneNumber+notNumber));
                    zap = "";
                }
                else if(notNumber.equals(" - ")||notNumber.equals(" + ")||
                        notNumber.equals(" X ")|| notNumber.equals(" / ")||notNumber.equals(" % ")&& one !=result) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Уже есть знак X!", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else if(one == result){
                    oneNumber = oneNumber + " X ";
                    tvFirst.setText(oneNumber);
                    zap = "";

                }
                break;

            case R.id.btn_del:
                if(notNumber.equals("")||notNumber.equals(" - ")||notNumber.equals(" X ")||
                        notNumber.equals(" + ")||notNumber.equals(" % ")&&!(oneNumber.equals(""))) {

                    notNumber = " / ";
                    tvFirst.setText((oneNumber+notNumber));
                    zap = "";
                }
                else if(notNumber.equals(" / ")||notNumber.equals("")||notNumber.equals(" - ")||notNumber.equals(" X ")
                    || notNumber.equals(" + ")||notNumber.equals(" % ")&& one !=result) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Уже есть знак /!", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else if(one == result){
                    oneNumber = oneNumber + " / ";
                    tvFirst.setText(oneNumber);
                    zap = "";

                }
                break;

            case R.id.btn_proc:
                if(notNumber.equals("")||notNumber.equals(" - ")|
                        notNumber.equals(" X ")||notNumber.equals(" + ") ||
                        notNumber.equals(" / ")&&!(oneNumber.equals(""))) {

                    notNumber = " % ";
                    tvFirst.setText((oneNumber+notNumber));
                    zap = "";
                }
                else if(notNumber.equals(" + ")||notNumber.equals("")||
                        notNumber.equals(" - ")||notNumber.equals(" X ")
                        || notNumber.equals(" / ")||notNumber.equals(" % ")&& one !=result) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Уже есть знак +!", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else if(one == result){
                    oneNumber = oneNumber + " % ";
                    tvFirst.setText(oneNumber);
                    zap = "";

                }
                break;


            case R.id.btn_equals:
                if (notNumber.equals(" + ")){
                    one = Double.parseDouble(oneCount);
                    two = Double.parseDouble(twoCount);
                    result = one + two;
                    one = result;
                    oneCount = result+"";
                    twoCount = "";
                    oneNumber = result+"";
                    twoNumber = "";
                    tvFirst.setText(oneNumber);
                    notNumber ="";

                }
                 if(notNumber.equals(" - ")){
                    one = Double.parseDouble(oneCount);
                    two = Double.parseDouble(twoCount);
                    result = one - two;
                    one = result;
                    oneCount = result+"";
                    twoCount = "";
                    oneNumber = result+"";
                    twoNumber = "";
                    tvFirst.setText(oneNumber);
                     notNumber ="";

                }

                if(notNumber.equals(" X ")){
                    one = Double.parseDouble(oneCount);
                    two = Double.parseDouble(twoCount);
                    result = one * two;
                    one = result;
                    oneCount = result+"";
                    twoCount = "";
                    oneNumber = result+"";
                    twoNumber = "";
                    tvFirst.setText(oneNumber);
                    notNumber ="";
                }
                if(notNumber.equals(" / ")){
                    one = Double.parseDouble(oneCount);
                    two = Double.parseDouble(twoCount);
                    result = one / two;
                    one = result;
                    oneCount = result+"";
                    twoCount = "";
                    oneNumber = result+"";
                    twoNumber = "";
                    tvFirst.setText(oneNumber);
                    notNumber ="";

                }
                if (notNumber.equals(" % ")){
                    one = Double.parseDouble(oneCount);
                    two = Double.parseDouble(twoCount);
                    result = (one / 100) * two;
                    one = result;
                    oneCount = result+"";
                    twoCount = "";
                    oneNumber = result+"";
                    twoNumber = "";
                    tvFirst.setText(oneNumber);
                    notNumber ="";

                }

                tvResult.setText(result+" ");
                break;
        }
    }
}
