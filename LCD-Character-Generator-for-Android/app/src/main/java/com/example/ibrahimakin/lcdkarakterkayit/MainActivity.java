package com.example.ibrahimakin.lcdkarakterkayit;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity{

    public int t1=0;
    TextView tv1,tv01;

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;

    boolean tik1=false;
    boolean tik2=false;
    boolean tik3=false;
    boolean tik4=false;
    boolean tik5=false;


    public int t2=0;
    TextView tv2,tv02;

    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn10;

    boolean tik6=false;
    boolean tik7=false;
    boolean tik8=false;
    boolean tik9=false;
    boolean tik10=false;


    public int t3=0;
    TextView tv3,tv03;

    private Button btn11;
    private Button btn12;
    private Button btn13;
    private Button btn14;
    private Button btn15;

    boolean tik11=false;
    boolean tik12=false;
    boolean tik13=false;
    boolean tik14=false;
    boolean tik15=false;


    public int t4=0;
    TextView tv4,tv04;

    private Button btn16;
    private Button btn17;
    private Button btn18;
    private Button btn19;
    private Button btn20;

    boolean tik16=false;
    boolean tik17=false;
    boolean tik18=false;
    boolean tik19=false;
    boolean tik20=false;


    public int t5=0;
    TextView tv5,tv05;

    private Button btn21;
    private Button btn22;
    private Button btn23;
    private Button btn24;
    private Button btn25;

    boolean tik21=false;
    boolean tik22=false;
    boolean tik23=false;
    boolean tik24=false;
    boolean tik25=false;


    public int t6=0;
    TextView tv6,tv06;

    private Button btn26;
    private Button btn27;
    private Button btn28;
    private Button btn29;
    private Button btn30;

    boolean tik26=false;
    boolean tik27=false;
    boolean tik28=false;
    boolean tik29=false;
    boolean tik30=false;


    public int t7=0;
    TextView tv7,tv07;

    private Button btn31;
    private Button btn32;
    private Button btn33;
    private Button btn34;
    private Button btn35;

    boolean tik31=false;
    boolean tik32=false;
    boolean tik33=false;
    boolean tik34=false;
    boolean tik35=false;


    public int t8=0;
    TextView tv8,tv08;

    private Button btn36;
    private Button btn37;
    private Button btn38;
    private Button btn39;
    private Button btn40;

    boolean tik36=false;
    boolean tik37=false;
    boolean tik38=false;
    boolean tik39=false;
    boolean tik40=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureDisplayButton();

        Button clr=(Button)findViewById(R.id.btnclear);
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setBackgroundColor(Color.rgb(214,215,215));tik1=false;
                btn2.setBackgroundColor(Color.rgb(214,215,215));tik2=false;
                btn3.setBackgroundColor(Color.rgb(214,215,215));tik3=false;
                btn4.setBackgroundColor(Color.rgb(214,215,215));tik4=false;
                btn5.setBackgroundColor(Color.rgb(214,215,215));tik5=false;
                t1=0;
                tv1.setText("0");
                tv01.setText("0,");

                btn6.setBackgroundColor(Color.rgb(214,215,215));tik6=false;
                btn7.setBackgroundColor(Color.rgb(214,215,215));tik7=false;
                btn8.setBackgroundColor(Color.rgb(214,215,215));tik8=false;
                btn9.setBackgroundColor(Color.rgb(214,215,215));tik9=false;
                btn10.setBackgroundColor(Color.rgb(214,215,215));tik10=false;
                t2=0;
                tv2.setText("0");
                tv02.setText("0,");

                btn11.setBackgroundColor(Color.rgb(214,215,215));tik11=false;
                btn12.setBackgroundColor(Color.rgb(214,215,215));tik12=false;
                btn13.setBackgroundColor(Color.rgb(214,215,215));tik13=false;
                btn14.setBackgroundColor(Color.rgb(214,215,215));tik14=false;
                btn15.setBackgroundColor(Color.rgb(214,215,215));tik15=false;
                t3=0;
                tv3.setText("0");
                tv03.setText("0,");

                btn16.setBackgroundColor(Color.rgb(214,215,215));tik16=false;
                btn17.setBackgroundColor(Color.rgb(214,215,215));tik17=false;
                btn18.setBackgroundColor(Color.rgb(214,215,215));tik18=false;
                btn19.setBackgroundColor(Color.rgb(214,215,215));tik19=false;
                btn20.setBackgroundColor(Color.rgb(214,215,215));tik20=false;
                t4=0;
                tv4.setText("0");
                tv04.setText("0,");

                btn21.setBackgroundColor(Color.rgb(214,215,215));tik21=false;
                btn22.setBackgroundColor(Color.rgb(214,215,215));tik22=false;
                btn23.setBackgroundColor(Color.rgb(214,215,215));tik23=false;
                btn24.setBackgroundColor(Color.rgb(214,215,215));tik24=false;
                btn25.setBackgroundColor(Color.rgb(214,215,215));tik25=false;
                t5=0;
                tv5.setText("0");
                tv05.setText("0,");

                btn26.setBackgroundColor(Color.rgb(214,215,215));tik26=false;
                btn27.setBackgroundColor(Color.rgb(214,215,215));tik27=false;
                btn28.setBackgroundColor(Color.rgb(214,215,215));tik28=false;
                btn29.setBackgroundColor(Color.rgb(214,215,215));tik29=false;
                btn30.setBackgroundColor(Color.rgb(214,215,215));tik30=false;
                t6=0;
                tv6.setText("0");
                tv06.setText("0,");

                btn31.setBackgroundColor(Color.rgb(214,215,215));tik31=false;
                btn32.setBackgroundColor(Color.rgb(214,215,215));tik32=false;
                btn33.setBackgroundColor(Color.rgb(214,215,215));tik33=false;
                btn34.setBackgroundColor(Color.rgb(214,215,215));tik34=false;
                btn35.setBackgroundColor(Color.rgb(214,215,215));tik35=false;
                t7=0;
                tv7.setText("0");
                tv07.setText("0,");

                btn36.setBackgroundColor(Color.rgb(214,215,215));tik36=false;
                btn37.setBackgroundColor(Color.rgb(214,215,215));tik37=false;
                btn38.setBackgroundColor(Color.rgb(214,215,215));tik38=false;
                btn39.setBackgroundColor(Color.rgb(214,215,215));tik39=false;
                btn40.setBackgroundColor(Color.rgb(214,215,215));tik40=false;
                t8=0;
                tv8.setText("0");
                tv08.setText("0");
            }
        });


        TextView link=(TextView)findViewById(R.id.linklabel);
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri label=Uri.parse("https://github.com/ibrahimAKIN");
                Intent a=new Intent(Intent.ACTION_VIEW,label);
                startActivity(a);
            }
        });

        tv1=(TextView) findViewById(R.id.textView01);
        tv01=(TextView) findViewById(R.id.textView001);

        btn1=(Button)findViewById(R.id.button01);
        btn2=(Button)findViewById(R.id.button02);
        btn3=(Button)findViewById(R.id.button03);
        btn4=(Button)findViewById(R.id.button04);
        btn5=(Button)findViewById(R.id.button05);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!tik1) {
                    btn1.setBackgroundColor(Color.BLACK);
                    t1=t1+16;
                    tv1.setText(""+t1);
                    tv01.setText(t1+",");
                    tik1=true;
                } else {
                    btn1.setBackgroundColor(Color.rgb(214,215,215));
                    t1=t1-16;
                    tv1.setText(""+t1);
                    tv01.setText(t1+",");
                    tik1=false;
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik2) {
                    btn2.setBackgroundColor(Color.BLACK);
                    t1 = t1 + 8;
                    tv1.setText("" + t1);
                    tv01.setText(t1+",");
                    tik2 = true;
                } else {
                    btn2.setBackgroundColor(Color.rgb(214,215,215));
                    t1 = t1 - 8;
                    tv1.setText("" + t1);
                    tv01.setText(t1+",");
                    tik2 = false;
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik3) {
                    btn3.setBackgroundColor(Color.BLACK);
                    t1 = t1 + 4;
                    tv1.setText("" + t1);
                    tv01.setText(t1+",");
                    tik3 = true;
                } else {
                    btn3.setBackgroundColor(Color.rgb(214,215,215));
                    t1 = t1 - 4;
                    tv1.setText("" + t1);
                    tv01.setText(t1+",");
                    tik3 = false;
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik4) {
                    btn4.setBackgroundColor(Color.BLACK);
                    t1 = t1 + 2;
                    tv1.setText("" + t1);
                    tv01.setText(t1+",");
                    tik4 = true;
                } else {
                    btn4.setBackgroundColor(Color.rgb(214,215,215));
                    t1 = t1 - 2;
                    tv1.setText("" + t1);
                    tv01.setText(t1+",");
                    tik4 = false;
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik5) {
                    btn5.setBackgroundColor(Color.BLACK);
                    t1 = t1 + 1;
                    tv1.setText(""+t1);
                    tv01.setText(t1+",");
                    tik5 = true;
                } else {
                    btn5.setBackgroundColor(Color.rgb(214,215,215));
                    t1 = t1 - 1;
                    tv1.setText(""+t1);
                    tv01.setText(t1+",");
                    tik5 = false;
                }
            }
        });

        tv2=(TextView) findViewById(R.id.textView02);
        tv02=(TextView) findViewById(R.id.textView002);

        btn6=(Button)findViewById(R.id.button06);
        btn7=(Button)findViewById(R.id.button07);
        btn8=(Button)findViewById(R.id.button08);
        btn9=(Button)findViewById(R.id.button09);
        btn10=(Button)findViewById(R.id.button10);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik6) {
                    btn6.setBackgroundColor(Color.BLACK);
                    t2 = t2 + 16;
                    tv2.setText(""+t2);
                    tv02.setText(t2+",");
                    tik6 = true;
                } else {
                    btn6.setBackgroundColor(Color.rgb(214,215,215));
                    t2 = t2 - 16;
                    tv2.setText(""+t2);
                    tv02.setText(t2+",");
                    tik6 = false;
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik7) {
                    btn7.setBackgroundColor(Color.BLACK);
                    t2 = t2 + 8;
                    tv2.setText("" + t2);
                    tv02.setText(t2+",");
                    tik7 = true;
                } else {
                    btn7.setBackgroundColor(Color.rgb(214,215,215));
                    t2 = t2 - 8;
                    tv2.setText("" + t2);
                    tv02.setText(t2+",");
                    tik7 = false;
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik8) {
                    btn8.setBackgroundColor(Color.BLACK);
                    t2 = t2 + 4;
                    tv2.setText("" + t2);
                    tv02.setText(t2+",");
                    tik8 = true;
                } else {
                    btn8.setBackgroundColor(Color.rgb(214,215,215));
                    t2 = t2 - 4;
                    tv2.setText("" + t2);
                    tv02.setText(t2+",");
                    tik8 = false;
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik9) {
                    btn9.setBackgroundColor(Color.BLACK);
                    t2 = t2 + 2;
                    tv2.setText("" + t2);
                    tv02.setText(t2+",");
                    tik9 = true;
                } else {
                    btn9.setBackgroundColor(Color.rgb(214,215,215));
                    t2 = t2 - 2;
                    tv2.setText("" + t2);
                    tv02.setText(t2+",");
                    tik9 = false;
                }
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik10) {
                    btn10.setBackgroundColor(Color.BLACK);
                    t2 = t2 + 1;
                    tv2.setText("" + t2);
                    tv02.setText(t2+",");
                    tik10 = true;
                } else {
                    btn10.setBackgroundColor(Color.rgb(214,215,215));
                    t2 = t2 - 1;
                    tv2.setText("" + t2);
                    tv02.setText(t2+",");
                    tik10 = false;
                }
            }
        });


        tv3=(TextView) findViewById(R.id.textView03);
        tv03=(TextView) findViewById(R.id.textView003);

        btn11=(Button)findViewById(R.id.button11);
        btn12=(Button)findViewById(R.id.button12);
        btn13=(Button)findViewById(R.id.button13);
        btn14=(Button)findViewById(R.id.button14);
        btn15=(Button)findViewById(R.id.button15);

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik11) {
                    btn11.setBackgroundColor(Color.BLACK);
                    t3 = t3 + 16;
                    tv3.setText("" + t3);
                    tv03.setText(t3+",");
                    tik11 = true;
                } else {
                    btn11.setBackgroundColor(Color.rgb(214,215,215));
                    t3 = t3 - 16;
                    tv3.setText("" + t3);
                    tv03.setText(t3+",");
                    tik11 = false;
                }
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik12) {
                    btn12.setBackgroundColor(Color.BLACK);
                    t3 = t3 + 8;
                    tv3.setText("" + t3);
                    tv03.setText(t3+",");
                    tik12 = true;
                } else {
                    btn12.setBackgroundColor(Color.rgb(214,215,215));
                    t3 = t3 - 8;
                    tv3.setText("" + t3);
                    tv03.setText(t3+",");
                    tik12 = false;
                }
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik13) {
                    btn13.setBackgroundColor(Color.BLACK);
                    t3 = t3 + 4;
                    tv3.setText("" + t3);
                    tv03.setText(t3+",");
                    tik13 = true;
                } else {
                    btn13.setBackgroundColor(Color.rgb(214,215,215));
                    t3 = t3 - 4;
                    tv3.setText("" + t3);
                    tv03.setText(t3+",");
                    tik13 = false;
                }
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik14) {
                    btn14.setBackgroundColor(Color.BLACK);
                    t3 = t3 + 2;
                    tv3.setText("" + t3);
                    tv03.setText(t3+",");
                    tik14 = true;
                } else {
                    btn14.setBackgroundColor(Color.rgb(214,215,215));
                    t3 = t3 - 2;
                    tv3.setText("" + t3);
                    tv03.setText(t3+",");
                    tik14 = false;
                }
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik15) {
                    btn15.setBackgroundColor(Color.BLACK);
                    t3 = t3 + 1;
                    tv3.setText("" + t3);
                    tv03.setText(t3+",");
                    tik15 = true;
                } else {
                    btn15.setBackgroundColor(Color.rgb(214,215,215));
                    t3 = t3 - 1;
                    tv3.setText("" + t3);
                    tv03.setText(t3+",");
                    tik15 = false;
                }
            }
        });


        tv4=(TextView) findViewById(R.id.textView04);
        tv04=(TextView) findViewById(R.id.textView004);

        btn16=(Button)findViewById(R.id.button16);
        btn17=(Button)findViewById(R.id.button17);
        btn18=(Button)findViewById(R.id.button18);
        btn19=(Button)findViewById(R.id.button19);
        btn20=(Button)findViewById(R.id.button20);

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik16) {
                    btn16.setBackgroundColor(Color.BLACK);
                    t4 = t4 + 16;
                    tv4.setText("" + t4);
                    tv04.setText(t4+",");
                    tik16 = true;
                } else {
                    btn16.setBackgroundColor(Color.rgb(214,215,215));
                    t4 = t4 - 16;
                    tv4.setText("" + t4);
                    tv04.setText(t4+",");
                    tik16 = false;
                }
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik17) {
                    btn17.setBackgroundColor(Color.BLACK);
                    t4 = t4 + 8;
                    tv4.setText("" + t4);
                    tv04.setText(t4+",");
                    tik17 = true;
                } else {
                    btn17.setBackgroundColor(Color.rgb(214,215,215));
                    t4 = t4 - 8;
                    tv4.setText("" + t4);
                    tv04.setText(t4+",");
                    tik17 = false;
                }
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik18) {
                    btn18.setBackgroundColor(Color.BLACK);
                    t4 = t4 + 4;
                    tv4.setText("" + t4);
                    tv04.setText(t4+",");
                    tik18 = true;
                } else {
                    btn18.setBackgroundColor(Color.rgb(214,215,215));
                    t4 = t4 - 4;
                    tv4.setText("" + t4);
                    tv04.setText(t4+",");
                    tik18 = false;
                }
            }
        });
        btn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik19) {
                    btn19.setBackgroundColor(Color.BLACK);
                    t4 = t4 + 2;
                    tv4.setText("" + t4);
                    tv04.setText(t4+",");
                    tik19 = true;
                } else {
                    btn19.setBackgroundColor(Color.rgb(214,215,215));
                    t4 = t4 - 2;
                    tv4.setText("" + t4);
                    tv04.setText(t4+",");
                    tik19 = false;
                }
            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik20) {
                    btn20.setBackgroundColor(Color.BLACK);
                    t4 = t4 + 1;
                    tv4.setText("" + t4);
                    tv04.setText(t4+",");
                    tik20 = true;
                } else {
                    btn20.setBackgroundColor(Color.rgb(214,215,215));
                    t4 = t4 - 1;
                    tv4.setText("" + t4);
                    tv04.setText(t4+",");
                    tik20 = false;
                }
            }
        });


        tv5=(TextView) findViewById(R.id.textView05);
        tv05=(TextView) findViewById(R.id.textView005);

        btn21=(Button)findViewById(R.id.button21);
        btn22=(Button)findViewById(R.id.button22);
        btn23=(Button)findViewById(R.id.button23);
        btn24=(Button)findViewById(R.id.button24);
        btn25=(Button)findViewById(R.id.button25);

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik21) {
                    btn21.setBackgroundColor(Color.BLACK);
                    t5 = t5 + 16;
                    tv5.setText("" + t5);
                    tv05.setText(t5+",");
                    tik21 = true;
                } else {
                    btn21.setBackgroundColor(Color.rgb(214,215,215));
                    t5 = t5 - 16;
                    tv5.setText("" + t5);
                    tv05.setText(t5+",");
                    tik21 = false;
                }
            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik22) {
                    btn22.setBackgroundColor(Color.BLACK);
                    t5 = t5 + 8;
                    tv5.setText("" + t5);
                    tv05.setText(t5+",");
                    tik22 = true;
                } else {
                    btn22.setBackgroundColor(Color.rgb(214,215,215));
                    t5 = t5 - 8;
                    tv5.setText("" + t5);
                    tv05.setText(t5+",");
                    tik22 = false;
                }
            }
        });
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik23) {
                    btn23.setBackgroundColor(Color.BLACK);
                    t5 = t5 + 4;
                    tv5.setText("" + t5);
                    tv05.setText(t5+",");
                    tik23 = true;
                } else {
                    btn23.setBackgroundColor(Color.rgb(214,215,215));
                    t5 = t5 - 4;
                    tv5.setText("" + t5);
                    tv05.setText(t5+",");
                    tik23 = false;
                }
            }
        });
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik24) {
                    btn24.setBackgroundColor(Color.BLACK);
                    t5 = t5 + 2;
                    tv5.setText("" + t5);
                    tv05.setText(t5+",");
                    tik24 = true;
                } else {
                    btn24.setBackgroundColor(Color.rgb(214,215,215));
                    t5 = t5 - 2;
                    tv5.setText("" + t5);
                    tv05.setText(t5+",");
                    tik24 = false;
                }
            }
        });
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik25) {
                    btn25.setBackgroundColor(Color.BLACK);
                    t5 = t5 + 1;
                    tv5.setText("" + t5);
                    tv05.setText(t5+",");
                    tik25 = true;
                } else {
                    btn25.setBackgroundColor(Color.rgb(214,215,215));
                    t5 = t5 - 1;
                    tv5.setText("" + t5);
                    tv05.setText(t5+",");
                    tik25 = false;
                }
            }
        });


        tv6=(TextView) findViewById(R.id.textView06);
        tv06=(TextView) findViewById(R.id.textView006);

        btn26=(Button)findViewById(R.id.button26);
        btn27=(Button)findViewById(R.id.button27);
        btn28=(Button)findViewById(R.id.button28);
        btn29=(Button)findViewById(R.id.button29);
        btn30=(Button)findViewById(R.id.button30);

        btn26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik26) {
                    btn26.setBackgroundColor(Color.BLACK);
                    t6 = t6 + 16;
                    tv6.setText("" + t6);
                    tv06.setText(t6+",");
                    tik26 = true;
                } else {
                    btn26.setBackgroundColor(Color.rgb(214,215,215));
                    t6 = t6 - 16;
                    tv6.setText("" + t6);
                    tv06.setText(t6+",");
                    tik26 = false;
                }
            }
        });
        btn27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik27) {
                    btn27.setBackgroundColor(Color.BLACK);
                    t6 = t6 + 8;
                    tv6.setText("" + t6);
                    tv06.setText(t6+",");
                    tik27 = true;
                } else {
                    btn27.setBackgroundColor(Color.rgb(214,215,215));
                    t6 = t6 - 8;
                    tv6.setText("" + t6);
                    tv06.setText(t6+",");
                    tik27 = false;
                }
            }
        });
        btn28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik28) {
                    btn28.setBackgroundColor(Color.BLACK);
                    t6 = t6 + 4;
                    tv6.setText("" + t6);
                    tv06.setText(t6+",");
                    tik28 = true;
                } else {
                    btn28.setBackgroundColor(Color.rgb(214,215,215));
                    t6 = t6 - 4;
                    tv6.setText("" + t6);
                    tv06.setText(t6+",");
                    tik28 = false;
                }
            }
        });
        btn29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik29) {
                    btn29.setBackgroundColor(Color.BLACK);
                    t6 = t6 + 2;
                    tv6.setText("" + t6);
                    tv06.setText(t6+",");
                    tik29 = true;
                } else {
                    btn29.setBackgroundColor(Color.rgb(214,215,215));
                    t6 = t6 - 2;
                    tv6.setText("" + t6);
                    tv06.setText(t6+",");
                    tik29 = false;
                }
            }
        });
        btn30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik30) {
                    btn30.setBackgroundColor(Color.BLACK);
                    t6 = t6 + 1;
                    tv6.setText("" + t6);
                    tv06.setText(t6+",");
                    tik30 = true;
                } else {
                    btn30.setBackgroundColor(Color.rgb(214,215,215));
                    t6 = t6 - 1;
                    tv6.setText("" + t6);
                    tv06.setText(t6+",");
                    tik30 = false;
                }
            }
        });


        tv7=(TextView) findViewById(R.id.textView07);
        tv07=(TextView) findViewById(R.id.textView007);

        btn31=(Button)findViewById(R.id.button31);
        btn32=(Button)findViewById(R.id.button32);
        btn33=(Button)findViewById(R.id.button33);
        btn34=(Button)findViewById(R.id.button34);
        btn35=(Button)findViewById(R.id.button35);

        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik31) {
                    btn31.setBackgroundColor(Color.BLACK);
                    t7 = t7 + 16;
                    tv7.setText("" + t7);
                    tv07.setText(t7+",");
                    tik31 = true;
                } else {
                    btn31.setBackgroundColor(Color.rgb(214,215,215));
                    t7 = t7 - 16;
                    tv7.setText("" + t7);
                    tv07.setText(t7+",");
                    tik31 = false;
                }
            }
        });
        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik32) {
                    btn32.setBackgroundColor(Color.BLACK);
                    t7 = t7 + 8;
                    tv7.setText("" + t7);
                    tv07.setText(t7+",");
                    tik32 = true;
                } else {
                    btn32.setBackgroundColor(Color.rgb(214,215,215));
                    t7 = t7 - 8;
                    tv7.setText("" + t7);
                    tv07.setText(t7+",");
                    tik32 = false;
                }
            }
        });
        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik33) {
                    btn33.setBackgroundColor(Color.BLACK);
                    t7 = t7 + 4;
                    tv7.setText("" + t7);
                    tv07.setText(t7+",");
                    tik33 = true;
                } else {
                    btn33.setBackgroundColor(Color.rgb(214,215,215));
                    t7 = t7 - 4;
                    tv7.setText("" + t7);
                    tv07.setText(t7+",");
                    tik33 = false;
                }
            }
        });
        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik34) {
                    btn34.setBackgroundColor(Color.BLACK);
                    t7 = t7 + 2;
                    tv7.setText("" + t7);
                    tv07.setText(t7+",");
                    tik34 = true;
                } else {
                    btn34.setBackgroundColor(Color.rgb(214,215,215));
                    t7 = t7 - 2;
                    tv7.setText("" + t7);
                    tv07.setText(t7+",");
                    tik34 = false;
                }
            }
        });
        btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik35) {
                    btn35.setBackgroundColor(Color.BLACK);
                    t7 = t7 + 1;
                    tv7.setText("" + t7);
                    tv07.setText(t7+",");
                    tik35 = true;
                } else {
                    btn35.setBackgroundColor(Color.rgb(214,215,215));
                    t7 = t7 - 1;
                    tv7.setText("" + t7);
                    tv07.setText(t7+",");
                    tik35 = false;
                }
            }
        });


        tv8=(TextView) findViewById(R.id.textView08);
        tv08=(TextView) findViewById(R.id.textView008);

        btn36=(Button)findViewById(R.id.button36);
        btn37=(Button)findViewById(R.id.button37);
        btn38=(Button)findViewById(R.id.button38);
        btn39=(Button)findViewById(R.id.button39);
        btn40=(Button)findViewById(R.id.button40);

        btn36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik36) {
                    btn36.setBackgroundColor(Color.BLACK);
                    t8 = t8 + 16;
                    tv8.setText("" + t8);
                    tv08.setText(t8+"");
                    tik36 = true;
                } else {
                    btn36.setBackgroundColor(Color.rgb(214,215,215));
                    t8 = t8 - 16;
                    tv8.setText("" + t8);
                    tv08.setText(t8+"");
                    tik36 = false;
                }
            }
        });
        btn37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik37) {
                    btn37.setBackgroundColor(Color.BLACK);
                    t8 = t8 + 8;
                    tv8.setText("" + t8);
                    tv08.setText(t8+"");
                    tik37 = true;
                } else {
                    btn37.setBackgroundColor(Color.rgb(214,215,215));
                    t8 = t8 - 8;
                    tv8.setText("" + t8);
                    tv08.setText(t8+"");
                    tik37 = false;
                }
            }
        });
        btn38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik38) {
                    btn38.setBackgroundColor(Color.BLACK);
                    t8 = t8 + 4;
                    tv8.setText("" + t8);
                    tv08.setText(t8+"");
                    tik38 = true;
                } else {
                    btn38.setBackgroundColor(Color.rgb(214,215,215));
                    t8 = t8 - 4;
                    tv8.setText("" + t8);
                    tv08.setText(t8+"");
                    tik38 = false;
                }
            }
        });
        btn39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik39) {
                    btn39.setBackgroundColor(Color.BLACK);
                    t8 = t8 + 2;
                    tv8.setText("" + t8);
                    tv08.setText(t8+"");
                    tik39 = true;
                } else {
                    btn39.setBackgroundColor(Color.rgb(214,215,215));
                    t8 = t8 - 2;
                    tv8.setText("" + t8);
                    tv08.setText(t8+"");
                    tik39 = false;
                }
            }
        });
        btn40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!tik40) {
                    btn40.setBackgroundColor(Color.BLACK);
                    t8 = t8 + 1;
                    tv8.setText("" + t8);
                    tv08.setText(t8+"");
                    tik40 = true;
                } else {
                    btn40.setBackgroundColor(Color.rgb(214,215,215));
                    t8 = t8 - 1;
                    tv8.setText("" + t8);
                    tv08.setText(t8+"");
                    tik40 = false;
                }
            }
        });
    }

    private void configureDisplayButton(){
        Button btndisplay = (Button) findViewById(R.id.btndisplay);
        btndisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DisplayActivity.class));
                //Layout geçiş efekti
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}
