package com.example.android_num_10_tw_receiptlottery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1B = (Button)findViewById(R.id.btn_1);
        btn1B.setOnClickListener(btn1B_click);

        Button btn2B = (Button)findViewById(R.id.btn_2);
        btn2B.setOnClickListener(btn2B_click);

        Button btn3B = (Button)findViewById(R.id.btn_3);
        btn3B.setOnClickListener(btn3B_click);

        Button btn4B = (Button)findViewById(R.id.AgainChooseMonth);
        btn4B.setOnClickListener(btn4B_click);

        Button btn5B = (Button)findViewById(R.id.AgainInputNumber);
        btn5B.setOnClickListener(btn5B_click);

        Button btn6B = (Button)findViewById(R.id.AgainChooseMonth2);
        btn6B.setOnClickListener(btn6B_click);
    }
    private View.OnClickListener btn1B_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            TextView text = (TextView)findViewById(R.id.click);
            TextView set_num = (TextView)findViewById(R.id.num);
            text.setText("2018/Jun.Feb.Invoice");
            set_num.setText("1");//月份記述數字

        }
    };
    private View.OnClickListener btn2B_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_2 = (TextView)findViewById(R.id.click);
            TextView set_num = (TextView)findViewById(R.id.num);
            text_2.setText("2018/March.April.Invoice");
            set_num.setText("2");//月份記述數字
        }
    };
    private View.OnClickListener btn3B_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_3 = (TextView)findViewById(R.id.click);
            TextView set_num = (TextView)findViewById(R.id.num);
            text_3.setText("2018/May.June.Invoice");
            set_num.setText("3");//月份記述數字
        }
    };
    private View.OnClickListener btn4B_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_4 = (TextView)findViewById(R.id.click);
            TextView set_num = (TextView)findViewById(R.id.num);
            text_4.setText("2018/July.August.Invoice");
            set_num.setText("4");//月份記述數字
        }
    };
    private View.OnClickListener btn5B_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_5 = (TextView)findViewById(R.id.click);
            TextView set_num = (TextView)findViewById(R.id.num);
            text_5.setText("2018/Set.Oct.Invoice");
            set_num.setText("5");//月份記述數字
        }
    };
    private View.OnClickListener btn6B_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView text_6 = (TextView)findViewById(R.id.click);
            TextView set_num = (TextView)findViewById(R.id.num);
            text_6.setText("2018/Nov.Dec.Invoice");
            set_num.setText("6");//月份記述數字
        }
    };

    public void click_AtoB(View v){

        TextView click_btn = (TextView)findViewById(R.id.click);
        TextView set_num = (TextView)findViewById(R.id.num);

        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("mouth", click_btn.getText().toString());
        bundle.putString("numberMouth", set_num.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}