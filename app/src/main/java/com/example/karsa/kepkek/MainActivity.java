package com.example.karsa.kepkek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button Gomb_Alma;
    private Button Gomb_Korte;
    public ImageView Kep;






    public void Nyazsgem(){
        Gomb_Alma=(Button)findViewById(R.id.Gomb_Alma);
        Gomb_Korte=(Button)findViewById(R.id.Gomb_Korte);
        Kep=(ImageView)findViewById(R.id.Kep);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nyazsgem();

        Gomb_Alma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Kep.setBackgroundResource(R.drawable.alma);
            }
        });

        Gomb_Korte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Kep.setBackgroundResource(R.drawable.korte);
            }
        });

    }


}
