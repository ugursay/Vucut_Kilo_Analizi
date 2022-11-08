package com.example.kilo_olcer_uygulamasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buton;
    TextView kilo;
    TextView boy;
    TextView cikti_1;
    TextView cikti_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buton=findViewById(R.id.button);
        kilo=findViewById(R.id.editText);
        boy=findViewById(R.id.editText2);
        cikti_1=findViewById(R.id.textView5);
        cikti_2=findViewById(R.id.textView6);

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hesapla(
                        Double.valueOf(kilo.getText().toString())
                        ,
                        Double.valueOf(boy.getText().toString())
                );
            }
        });

    }

    private void hesapla(Double kilo,Double boy)
    {
        Double sonuc=(kilo*10000)/(boy*boy);
        if (sonuc>=0 && sonuc<=18.4)
        {
            cikti_1.setText("ZAYIF");
            cikti_2.setText("gün içerisinde bol bol protein alın");
        }
       else if (sonuc>=18.5 && sonuc<=24.9)
        {
            cikti_1.setText("İDEAL KİLO");
            cikti_2.setText("AYNEN BÖYLE DEVAM EDİN");
        }
        else if (sonuc>=25.0 && sonuc<=29.9)
        {
            cikti_1.setText("FAZLA KİLOLU");
            cikti_2.setText("BOL BOL SPOR YAPIP PROTEİN ALIN");
        }
        else if (sonuc>=30.0 && sonuc<=34.9)
        {
            cikti_1.setText("OBEZ");
            cikti_2.setText("BOL BOL SPOR YAPIP ÇOĞUNLUKLA SEBZE AĞIRLIKLI BESLENİP PROTEİN ALIN");
        }
        else if (sonuc>=35)
        {
            cikti_1.setText("ACİLEN HASTANEYE GİTMELİSİNİZ");
            cikti_2.setText("*************");
        }
    }

}
