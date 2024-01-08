package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  CheckBox item1,item2,item3;
  Button orderbtn;
  TextView tvresult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       tvresult=findViewById(R.id.tvresult);
       orderbtn=findViewById(R.id.orderbtn);

       item1=findViewById(R.id.item1);
       item2=findViewById(R.id.item2);
       item3=findViewById(R.id.item3);

       orderbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               StringBuilder stringBuilder=new StringBuilder();

               if (item1.isChecked()){
                   String itemtext=item1.getText().toString();
                   stringBuilder.append(itemtext+" is ordered"+"\n");
               }if (item2.isChecked()){
                   String itemtext=item2.getText().toString();
                   stringBuilder.append(itemtext+" is orderd"+"\n");
               }if (item3.isChecked()){
                   String itemtext=item3.getText().toString();
                   stringBuilder.append(itemtext+" is orderd"+"\n");
               }

               tvresult.setText(stringBuilder);
           }
       });

    }
}