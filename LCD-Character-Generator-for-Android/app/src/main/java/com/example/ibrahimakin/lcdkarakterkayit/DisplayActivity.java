package com.example.ibrahimakin.lcdkarakterkayit;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.r0adkll.slidr.Slidr;

public class DisplayActivity extends AppCompatActivity {

    public int toplam=0;
    TextView esittir,a,b,c,d,e,f,g,dot;

    private Button btna;
    private Button btnb;
    private Button btnc;
    private Button btnd;
    private Button btne;
    private Button btnf;
    private Button btng;
    private Button btndot;

    boolean tika=false;
    boolean tikb=false;
    boolean tikc=false;
    boolean tikd=false;
    boolean tike=false;
    boolean tikf=false;
    boolean tikg=false;
    boolean tikdot=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        //sadece geri dönerken
        Slidr.attach(this);

        configureLcdButton();

        TextView link=(TextView)findViewById(R.id.linklabel2);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri label=Uri.parse("https://github.com/ibrahimAKIN");
                Intent a=new Intent(Intent.ACTION_VIEW,label);
                startActivity(a);
            }
        });

        esittir=(TextView)findViewById(R.id.textesittir);

        a=(TextView)findViewById(R.id.textdota);
        btna=(Button)findViewById(R.id.buttona);
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tika) {
                    btna.setBackgroundColor(Color.BLACK);
                    toplam = toplam + 1;
                    a.setText("1");
                    esittir.setText("   =   "+toplam);
                    tika = true;
                } else {
                    btna.setBackgroundColor(Color.rgb(214,215,215));
                    toplam = toplam - 1;
                    a.setText("0");
                    esittir.setText("   =   "+toplam);
                    tika = false;
                }
            }
        });

        b=(TextView)findViewById(R.id.textdotb);
        btnb=(Button)findViewById(R.id.buttonb);
        btnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tikb) {
                    btnb.setBackgroundColor(Color.BLACK);
                    toplam = toplam + 2;
                    b.setText("1");
                    esittir.setText("   =   "+toplam);
                    tikb = true;
                } else {
                    btnb.setBackgroundColor(Color.rgb(214,215,215));
                    toplam = toplam - 2;
                    b.setText("0");
                    esittir.setText("   =   "+toplam);
                    tikb = false;
                }
            }
        });

        c=(TextView)findViewById(R.id.textdotc);
        btnc=(Button)findViewById(R.id.buttonc);
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tikc) {
                    btnc.setBackgroundColor(Color.BLACK);
                    toplam = toplam + 4;
                    c.setText("1");
                    esittir.setText("   =   "+toplam);
                    tikc = true;
                } else {
                    btnc.setBackgroundColor(Color.rgb(214,215,215));
                    toplam = toplam - 4;
                    c.setText("0");
                    esittir.setText("   =   "+toplam);
                    tikc = false;
                }
            }
        });

        d=(TextView)findViewById(R.id.textdotd);
        btnd=(Button)findViewById(R.id.buttond);
        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tikd) {
                    btnd.setBackgroundColor(Color.BLACK);
                    toplam = toplam + 8;
                    d.setText("1");
                    esittir.setText("   =   "+toplam);
                    tikd = true;
                } else {
                    btnd.setBackgroundColor(Color.rgb(214,215,215));
                    toplam = toplam - 8;
                    d.setText("0");
                    esittir.setText("   =   "+toplam);
                    tikd = false;
                }
            }
        });

        e=(TextView)findViewById(R.id.textdote);
        btne=(Button)findViewById(R.id.buttone);
        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tike) {
                    btne.setBackgroundColor(Color.BLACK);
                    toplam = toplam + 16;
                    e.setText("1");
                    esittir.setText("   =   "+toplam);
                    tike = true;
                } else {
                    btne.setBackgroundColor(Color.rgb(214,215,215));
                    toplam = toplam - 16;
                    e.setText("0");
                    esittir.setText("   =   "+toplam);
                    tike = false;
                }
            }
        });

        f=(TextView)findViewById(R.id.textdotf);
        btnf=(Button)findViewById(R.id.buttonf);
        btnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tikf) {
                    btnf.setBackgroundColor(Color.BLACK);
                    toplam = toplam + 32;
                    f.setText("1");
                    esittir.setText("   =   "+toplam);
                    tikf = true;
                } else {
                    btnf.setBackgroundColor(Color.rgb(214,215,215));
                    toplam = toplam - 32;
                    f.setText("0");
                    esittir.setText("   =   "+toplam);
                    tikf = false;
                }
            }
        });

        g=(TextView)findViewById(R.id.textdotg);
        btng=(Button)findViewById(R.id.buttong);
        btng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tikg) {
                    btng.setBackgroundColor(Color.BLACK);
                    toplam = toplam + 64;
                    g.setText("1");
                    esittir.setText("   =   "+toplam);
                    tikg = true;
                } else {
                    btng.setBackgroundColor(Color.rgb(214,215,215));
                    toplam = toplam - 64;
                    g.setText("0");
                    esittir.setText("   =   "+toplam);
                    tikg = false;
                }
            }
        });

        dot=(TextView)findViewById(R.id.textdot);
        btndot=(Button)findViewById(R.id.buttondot);
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tikdot) {
                    btndot.setBackgroundColor(Color.BLACK);
                    toplam = toplam + 128;
                    dot.setText("1");
                    esittir.setText("   =   "+toplam);
                    tikdot = true;
                } else {
                    btndot.setBackgroundColor(Color.rgb(214,215,215));
                    toplam = toplam - 128;
                    dot.setText("0");
                    esittir.setText("   =   "+toplam);
                    tikdot = false;
                }
            }
        });
    }

    private void configureLcdButton(){
        Button btnlcd=(Button)findViewById(R.id.btnlcd);
        btnlcd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                //startActivity(new Intent(DisplayActivity.this, MainActivity.class));
            }
        });
    }

    @Override
    public void finish() {
        super.finish();
        //Layout geçiş efekti
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
