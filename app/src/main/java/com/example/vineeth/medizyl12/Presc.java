package com.example.vineeth.medizyl12;

import android.content.pm.ActivityInfo;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


public class Presc extends AppCompatActivity {

    CheckBox cb1,cb2,cb3,cb4,cb5,cb6;
    TextView tv1,tv2,tv,q1,q2,q3,q4,tv3,tv4,tv5,tv6,tv7,tv8,tv9;
    String text1,text2,text3,text4,text5,text6,result,com11,com12,com13,com14,com15,com23,com24,com25,com26,com34,com35,com36,
            com45,com46,com56,tri11,tri12,tri13,tri14,tri21,tri22,tri23,tri31,tri32,tri41,four1,four2,four3,fr22,fr23,fr31,fr41,fr42,fr51,fr61;

    String a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19;

    Button btn,btn3,btn4,btn5,btn6;
    int first,sec,third,four,five,six,total;
    RadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8,rb9,rb10,rb11,rb12,rb13,rb14,rb15,rb16,rb17,rb18,rb19;

    ProgressBar pb;
    int Pstatus = 0;

    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presc);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        pb = (ProgressBar) findViewById(R.id.progressBar2);

        cb1 = (CheckBox) findViewById(R.id.checkBox);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);
        cb4 = (CheckBox) findViewById(R.id.checkBox4);
        cb5 = (CheckBox) findViewById(R.id.checkBox5);
        cb6 = (CheckBox) findViewById(R.id.checkBox6);


        tv1 = (TextView) findViewById(R.id.textView);// first question
        tv2 = (TextView) findViewById(R.id.textView3);// generated
        tv  = (TextView) findViewById(R.id.textView2);//prescription
        tv3 = (TextView) findViewById(R.id.const1);//const1
        tv4 = (TextView) findViewById(R.id.const2);//const2
        tv5 = (TextView) findViewById(R.id.mg);//mg
        tv6 = (TextView) findViewById(R.id.Medicine);
        tv7 = (TextView) findViewById(R.id.med);
        tv8 = (TextView) findViewById(R.id.Duration);
        tv9 = (TextView) findViewById(R.id.dur);



        tv1.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv4.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        tv7.setVisibility(View.INVISIBLE);
        tv8.setVisibility(View.INVISIBLE);
        tv9.setVisibility(View.INVISIBLE);


        btn = (Button) findViewById(R.id.button);
        btn3 = (Button) findViewById(R.id.button2);
        btn4 = (Button) findViewById(R.id.button3);
        btn5 = (Button) findViewById(R.id.button4);
        btn6 = (Button) findViewById(R.id.button5);

        btn.setVisibility(View.VISIBLE);

        //Second Question
        q1 = (TextView) findViewById(R.id.Q2);
        rb1 =(RadioButton) findViewById(R.id.rb21);
        rb2 =(RadioButton) findViewById(R.id.rb22);
        rb3 =(RadioButton) findViewById(R.id.rb23);
        rb4 =(RadioButton) findViewById(R.id.rb24);
        rb5 =(RadioButton) findViewById(R.id.rb25);


        //thirdQueston
        q2 = (TextView) findViewById(R.id.Q3);
        rb6 =(RadioButton) findViewById(R.id.rb31);
        rb7 =(RadioButton) findViewById(R.id.rb32);
        rb8 =(RadioButton) findViewById(R.id.rb33);
        rb9 =(RadioButton) findViewById(R.id.rb34);
        rb10 =(RadioButton) findViewById(R.id.rb35);
        rb11 = (RadioButton) findViewById(R.id.rb36);


        //Fourth Question
        q3 = (TextView) findViewById(R.id.Q4);
        rb12 =(RadioButton) findViewById(R.id.rb41);
        rb13 =(RadioButton) findViewById(R.id.rb42);
        rb14 =(RadioButton) findViewById(R.id.rb43);
        rb15 =(RadioButton) findViewById(R.id.rb44);
        rb16 =(RadioButton) findViewById(R.id.rb45);
        rb17=(RadioButton) findViewById(R.id.rb46);

        //Fifth Question
        q4 = (TextView) findViewById(R.id.Q5);
        rb18 = (RadioButton) findViewById(R.id.rb51);
        rb19 = (RadioButton) findViewById(R.id.rb52);


        //Visibility status-2ndQ
        q1.setVisibility(View.INVISIBLE);
        rb1.setVisibility(View.INVISIBLE);
        rb2.setVisibility(View.INVISIBLE);
        rb3.setVisibility(View.INVISIBLE);
        rb4.setVisibility(View.INVISIBLE);
        rb5.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        //Visibility status-3rd Question
        q2.setVisibility(View.INVISIBLE);
        rb6.setVisibility(View.INVISIBLE);
        rb7.setVisibility(View.INVISIBLE);
        rb8.setVisibility(View.INVISIBLE);
        rb9.setVisibility(View.INVISIBLE);
        rb10.setVisibility(View.INVISIBLE);
        rb11.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);


        //Visibilitystatus-4th Question
        q3.setVisibility(View.INVISIBLE);
        rb12.setVisibility(View.INVISIBLE);
        rb13.setVisibility(View.INVISIBLE);
        rb14.setVisibility(View.INVISIBLE);
        rb15.setVisibility(View.INVISIBLE);
        rb16.setVisibility(View.INVISIBLE);
        rb17.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);

        //visibility status -5th question
        q4.setVisibility(View.INVISIBLE);
        rb18.setVisibility(View.INVISIBLE);
        rb19.setVisibility(View.INVISIBLE);
        btn6.setVisibility(View.INVISIBLE);

        //progress bar
        pb.setVisibility(View.INVISIBLE);
    }

    public void Ques2(View view)
    {
        //disabling first question
        cb1.setVisibility(View.INVISIBLE);
        cb2.setVisibility(View.INVISIBLE);
        cb3.setVisibility(View.INVISIBLE);
        cb4.setVisibility(View.INVISIBLE);
        cb5.setVisibility(View.INVISIBLE);
        cb6.setVisibility(View.INVISIBLE);
        tv.setVisibility(View.INVISIBLE);
        btn.setVisibility(View.INVISIBLE);



        //secondquestion
        q1.setVisibility(View.VISIBLE);
        rb1.setVisibility(View.VISIBLE);
        rb2.setVisibility(View.VISIBLE);
        rb3.setVisibility(View.VISIBLE);
        rb4.setVisibility(View.VISIBLE);
        rb5.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);


        //disabling third question
        q2.setVisibility(View.INVISIBLE);
        rb6.setVisibility(View.INVISIBLE);
        rb7.setVisibility(View.INVISIBLE);
        rb8.setVisibility(View.INVISIBLE);
        rb9.setVisibility(View.INVISIBLE);
        rb10.setVisibility(View.INVISIBLE);
        rb11.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        //diabling fourth queston
        q3.setVisibility(View.INVISIBLE);
        rb12.setVisibility(View.INVISIBLE);
        rb13.setVisibility(View.INVISIBLE);
        rb14.setVisibility(View.INVISIBLE);
        rb15.setVisibility(View.INVISIBLE);
        rb16.setVisibility(View.INVISIBLE);
        rb17.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);

        //disabling 5th ques
        q4.setVisibility(View.INVISIBLE);
        rb18.setVisibility(View.INVISIBLE);
        rb19.setVisibility(View.INVISIBLE);
        btn6.setVisibility(View.INVISIBLE);


        //Generate
        tv1.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv4.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        tv7.setVisibility(View.INVISIBLE);
        tv8.setVisibility(View.INVISIBLE);
        tv9.setVisibility(View.INVISIBLE);

        //
        pb.setVisibility(View.INVISIBLE);

    }

    public void Ques3(View view)
    {
        //disabling first question
        cb1.setVisibility(View.INVISIBLE);
        cb2.setVisibility(View.INVISIBLE);
        cb3.setVisibility(View.INVISIBLE);
        cb4.setVisibility(View.INVISIBLE);
        cb5.setVisibility(View.INVISIBLE);
        cb6.setVisibility(View.INVISIBLE);
        tv.setVisibility(View.INVISIBLE);
        btn.setVisibility(View.INVISIBLE);

        //diabling secondquestion
        q1.setVisibility(View.INVISIBLE);
        rb1.setVisibility(View.INVISIBLE);
        rb2.setVisibility(View.INVISIBLE);
        rb3.setVisibility(View.INVISIBLE);
        rb4.setVisibility(View.INVISIBLE);
        rb5.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);


        //disabling third question
        q2.setVisibility(View.VISIBLE);
        rb6.setVisibility(View.VISIBLE);
        rb7.setVisibility(View.VISIBLE);
        rb8.setVisibility(View.VISIBLE);
        rb9.setVisibility(View.VISIBLE);
        rb10.setVisibility(View.VISIBLE);
        rb11.setVisibility(View.VISIBLE);
        btn4.setVisibility(View.VISIBLE);

        //diabling fourth queston
        q3.setVisibility(View.INVISIBLE);
        rb12.setVisibility(View.INVISIBLE);
        rb13.setVisibility(View.INVISIBLE);
        rb14.setVisibility(View.INVISIBLE);
        rb15.setVisibility(View.INVISIBLE);
        rb16.setVisibility(View.INVISIBLE);
        rb17.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);

        //disabling 5th ques
        q4.setVisibility(View.INVISIBLE);
        rb18.setVisibility(View.INVISIBLE);
        rb19.setVisibility(View.INVISIBLE);
        btn6.setVisibility(View.INVISIBLE);


        //Generate
        tv1.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv4.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        tv7.setVisibility(View.INVISIBLE);
        tv8.setVisibility(View.INVISIBLE);
        tv9.setVisibility(View.INVISIBLE);

        //
        pb.setVisibility(View.INVISIBLE);
    }

    public void Ques4(View view)
    {

        // first q
        cb1.setVisibility(View.INVISIBLE);
        cb2.setVisibility(View.INVISIBLE);
        cb3.setVisibility(View.INVISIBLE);
        cb4.setVisibility(View.INVISIBLE);
        cb5.setVisibility(View.INVISIBLE);
        cb6.setVisibility(View.INVISIBLE);
        tv.setVisibility(View.INVISIBLE);
        btn.setVisibility(View.INVISIBLE);

        //diabling secondquestion
        q1.setVisibility(View.INVISIBLE);
        rb1.setVisibility(View.INVISIBLE);
        rb2.setVisibility(View.INVISIBLE);
        rb3.setVisibility(View.INVISIBLE);
        rb4.setVisibility(View.INVISIBLE);
        rb5.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        //Third ques
        q2.setVisibility(View.INVISIBLE);
        rb6.setVisibility(View.INVISIBLE);
        rb7.setVisibility(View.INVISIBLE);
        rb8.setVisibility(View.INVISIBLE);
        rb9.setVisibility(View.INVISIBLE);
        rb10.setVisibility(View.INVISIBLE);
        rb11.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        //diabling fourth queston
        q3.setVisibility(View.VISIBLE);
        rb12.setVisibility(View.VISIBLE);
        rb13.setVisibility(View.VISIBLE);
        rb14.setVisibility(View.VISIBLE);
        rb15.setVisibility(View.VISIBLE);
        rb16.setVisibility(View.VISIBLE);
        rb17.setVisibility(View.VISIBLE);
        btn5.setVisibility(View.VISIBLE);

        //disabling 5th ques
        q4.setVisibility(View.INVISIBLE);
        rb18.setVisibility(View.INVISIBLE);
        rb19.setVisibility(View.INVISIBLE);
        btn6.setVisibility(View.INVISIBLE);


        //Generate
        tv1.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv4.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        tv7.setVisibility(View.INVISIBLE);
        tv8.setVisibility(View.INVISIBLE);
        tv9.setVisibility(View.INVISIBLE);

        //
        pb.setVisibility(View.INVISIBLE);
    }

    public void Ques5(View view)
    {
        // first q
        cb1.setVisibility(View.INVISIBLE);
        cb2.setVisibility(View.INVISIBLE);
        cb3.setVisibility(View.INVISIBLE);
        cb4.setVisibility(View.INVISIBLE);
        cb5.setVisibility(View.INVISIBLE);
        cb6.setVisibility(View.INVISIBLE);
        tv.setVisibility(View.INVISIBLE);
        btn.setVisibility(View.INVISIBLE);

        //diabling secondquestion
        q1.setVisibility(View.INVISIBLE);
        rb1.setVisibility(View.INVISIBLE);
        rb2.setVisibility(View.INVISIBLE);
        rb3.setVisibility(View.INVISIBLE);
        rb4.setVisibility(View.INVISIBLE);
        rb5.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        //Third ques
        q2.setVisibility(View.INVISIBLE);
        rb6.setVisibility(View.INVISIBLE);
        rb7.setVisibility(View.INVISIBLE);
        rb8.setVisibility(View.INVISIBLE);
        rb9.setVisibility(View.INVISIBLE);
        rb10.setVisibility(View.INVISIBLE);
        rb11.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        //diabling fourth queston
        q3.setVisibility(View.INVISIBLE);
        rb12.setVisibility(View.INVISIBLE);
        rb13.setVisibility(View.INVISIBLE);
        rb14.setVisibility(View.INVISIBLE);
        rb15.setVisibility(View.INVISIBLE);
        rb16.setVisibility(View.INVISIBLE);
        rb17.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);


        //disabling 5th ques
        q4.setVisibility(View.VISIBLE);
        rb18.setVisibility(View.VISIBLE);
        rb19.setVisibility(View.VISIBLE);
        btn6.setVisibility(View.VISIBLE);


        //Generate
        tv1.setVisibility(View.INVISIBLE);
        tv2.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);
        tv4.setVisibility(View.INVISIBLE);
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);
        tv7.setVisibility(View.INVISIBLE);
        tv8.setVisibility(View.INVISIBLE);
        tv9.setVisibility(View.INVISIBLE);

        //
        pb.setVisibility(View.INVISIBLE);
    }


    public void Generate(View view)
    {
        // first q
        cb1.setVisibility(View.INVISIBLE);
        cb2.setVisibility(View.INVISIBLE);
        cb3.setVisibility(View.INVISIBLE);
        cb4.setVisibility(View.INVISIBLE);
        cb5.setVisibility(View.INVISIBLE);
        cb6.setVisibility(View.INVISIBLE);
        tv.setVisibility(View.INVISIBLE);

        //diabling secondquestion
        q1.setVisibility(View.INVISIBLE);
        rb1.setVisibility(View.INVISIBLE);
        rb2.setVisibility(View.INVISIBLE);
        rb3.setVisibility(View.INVISIBLE);
        rb4.setVisibility(View.INVISIBLE);
        rb5.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);

        //Third ques
        q2.setVisibility(View.INVISIBLE);
        rb6.setVisibility(View.INVISIBLE);
        rb7.setVisibility(View.INVISIBLE);
        rb8.setVisibility(View.INVISIBLE);
        rb9.setVisibility(View.INVISIBLE);
        rb10.setVisibility(View.INVISIBLE);
        rb11.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);

        //diabling fourth queston
        q3.setVisibility(View.INVISIBLE);
        rb12.setVisibility(View.INVISIBLE);
        rb13.setVisibility(View.INVISIBLE);
        rb14.setVisibility(View.INVISIBLE);
        rb15.setVisibility(View.INVISIBLE);
        rb16.setVisibility(View.INVISIBLE);
        rb17.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);


        //disabling 5th ques
        q4.setVisibility(View.INVISIBLE);
        rb18.setVisibility(View.INVISIBLE);
        rb19.setVisibility(View.INVISIBLE);
        btn6.setVisibility(View.INVISIBLE);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(Pstatus <100){
                    Pstatus +=1;

                    // Try to sleep the thread for 20 milliseconds
                    try{
                        Thread.sleep(200);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }

                    // Update the progress bar

                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            pb.setProgress(Pstatus);
                            // Show the progress on TextView
                            //tv.setText(progressStatus+"");
                        }
                    });
                }

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(20100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                handler.post(new Runnable() {

                    @Override
                    public void run() {
                        pb.setVisibility(View.INVISIBLE);
                        tv1.setVisibility(View.VISIBLE);
                        tv2.setVisibility(View.VISIBLE);
                        tv3.setVisibility(View.VISIBLE);
                        tv4.setVisibility(View.VISIBLE);
                        tv5.setVisibility(View.VISIBLE);
                        tv6.setVisibility(View.VISIBLE);
                        tv7.setVisibility(View.VISIBLE);
                        tv8.setVisibility(View.VISIBLE);
                        tv9.setVisibility(View.VISIBLE);

                    }
                });

            }
        }).start();



        /*Generate
        tv1.setVisibility(View.VISIBLE);
        tv2.setVisibility(View.VISIBLE);
        tv3.setVisibility(View.VISIBLE);
        tv4.setVisibility(View.VISIBLE);
        tv5.setVisibility(View.VISIBLE);
        tv6.setVisibility(View.VISIBLE);
        tv7.setVisibility(View.VISIBLE);
        tv8.setVisibility(View.VISIBLE);
        tv9.setVisibility(View.VISIBLE);*/



    }

    public void click(View view)
    {
        if(cb1.isChecked())
        {
            text1 = cb1.getText().toString();
            tv2.setText(text1+"");
            tv7.setText("PARACETAMOL");

        }
        if(cb2.isChecked())
        {
            text2 = cb2.getText().toString();
            tv2.setText(text2+"");
            tv7.setText("Vertigon");
        }
        if(cb3.isChecked())
        {
            text3 = cb3.getText().toString();
            tv2.setText(text3+"");
            tv7.setText("Cyclopalm");
        }
        if(cb4.isChecked())
        {
            text4 = cb4.getText().toString();
            tv2.setText(text4+"");
            tv7.setText("Coughx");
        }
        if(cb5.isChecked())
        {
            text5 = cb5.getText().toString();
            tv2.setText(text5+"");
            tv7.setText("citrizen");
        }
        if(cb6.isChecked())
        {
            text6 = cb6.getText().toString();
            tv2.setText(text6+"");
            tv7.setText("Eldofer");
        }

        //

        if((cb1.isChecked() && cb2.isChecked()) || (cb2.isChecked() && cb1.isChecked()))
        {

            com11 = cb1.getText().toString()+ "" + cb2.getText().toString();
            tv2.setText(com11+"");
        }
        if((cb1.isChecked() && cb3.isChecked()) || (cb3.isChecked() && cb1.isChecked()))
        {
            com12 = cb1.getText().toString() + "" + cb3.getText().toString();
            tv2.setText(com12+"");
        }
        if((cb1.isChecked() && cb4.isChecked())||(cb4.isChecked()&& cb1.isChecked()))
        {
            com13 = cb1.getText().toString()+""+cb4.getText().toString();
            tv2.setText(com13+"");
        }
        if((cb1.isChecked() && cb5.isChecked())||(cb5.isChecked() && cb1.isChecked()))
        {
            com14 = cb1.getText().toString()+""+cb5.getText().toString();
            tv2.setText(com14+"");
        }
        if((cb1.isChecked() && cb6.isChecked()) || (cb6.isChecked() && cb1.isChecked()))
        {
            com15 = cb1.getText().toString() +""+cb6.getText().toString();
            tv2.setText(com15+"");
        }
        //Double COndition
        if((cb2.isChecked() && cb3.isChecked()) || (cb3.isChecked() && cb2.isChecked()))
        {
            com23 = cb2.getText().toString() + "" + cb3.getText().toString();
            tv2.setText(com23+"");
        }
        if((cb2.isChecked() && cb4.isChecked()) || (cb4.isChecked()&&cb2.isChecked()))
        {
            com24 = cb2.getText().toString() +""+cb4.getText().toString();
            tv2.setText(com24+"");
        }
        if((cb2.isChecked() && cb5.isChecked())||(cb5.isChecked()&&cb2.isChecked()))
        {
            com25 = cb2.getText().toString() +""+cb5.getText().toString();
            tv2.setText(com25+"");
        }
        if((cb2.isChecked() && cb6.isChecked())||(cb6.isChecked() && cb2.isChecked()))
        {
            com26 = cb2.getText().toString() + " " + cb6.getText().toString();
            tv2.setText(com26+"");
        }

        //
        if((cb3.isChecked() && cb4.isChecked())||(cb4.isChecked() && cb3.isChecked()))
        {
            com34 = cb3.getText().toString()+""+cb4.getText().toString();
            tv2.setText(com34+"");
        }
        if((cb3.isChecked() && cb5.isChecked())&&(cb5.isChecked()&&cb3.isChecked()))
        {
            com35 = cb3.getText().toString()+""+cb5.getText().toString();
            tv2.setText(com35+"");
        }
        if((cb3.isChecked() && cb6.isChecked())||(cb6.isChecked()&&cb3.isChecked()))
        {
            com36 = cb3.getText().toString()+""+cb6.getText().toString();
            tv2.setText(com36+"");
        }

        //

        if((cb4.isChecked() && cb5.isChecked()) || (cb5.isChecked()&&cb4.isChecked()))
        {
            com45 = cb4.getText().toString()+""+cb5.getText().toString();
            tv2.setText(com45+"");
        }
        if((cb4.isChecked() && cb6.isChecked()) || (cb6.isChecked()&&cb4.isChecked()))
        {
            com46 = cb4.getText().toString()+""+cb6.getText().toString();
            tv2.setText(com46+"");
        }

        if((cb5.isChecked() && cb6.isChecked())||(cb6.isChecked()&&cb5.isChecked()))
        {
            com56 = cb5.getText().toString()+""+cb6.getText().toString();
            tv2.setText(com56+"");
        }


        //

        if((cb1.isChecked()&&cb2.isChecked())&&cb3.isChecked())
        {
            tri11 = cb1.getText().toString()+ ""+cb2.getText().toString()+""+cb3.getText().toString();
            tv2.setText(tri11+"");
        }
        if((cb1.isChecked()&&cb3.isChecked())&&cb4.isChecked())
        {
            tri12 = cb1.getText().toString()+ ""+cb3.getText().toString()+""+cb4.getText().toString();
            tv2.setText(tri12+"");
        }
        if((cb1.isChecked()&&cb4.isChecked())&&cb5.isChecked())
        {
            tri13 = cb1.getText().toString()+ ""+ cb4.getText().toString()+""+cb5.getText().toString();
            tv2.setText(tri13+"");
        }
        if((cb1.isChecked()&&cb5.isChecked())&&cb6.isChecked())
        {
            tri14 = cb1.getText().toString()+ ""+cb5.getText().toString()+""+cb6.getText().toString();
            tv2.setText(tri14+"");
        }

        //
        if((cb2.isChecked()&&cb3.isChecked())&&cb4.isChecked())
        {
            tri21 = cb2.getText().toString()+ ""+cb3.getText().toString()+""+cb4.getText().toString();
            tv2.setText(tri21+"");
        }
        if((cb2.isChecked()&&cb4.isChecked())&&cb5.isChecked())
        {
            tri22 = cb2.getText().toString()+ ""+ cb4.getText().toString()+""+cb5.getText().toString();
            tv2.setText(tri22+"");
        }
        if((cb2.isChecked()&&cb5.isChecked())&&cb6.isChecked())
        {
            tri23 = cb2.getText().toString()+ ""+cb5.getText().toString()+""+cb6.getText().toString();
            tv2.setText(tri23+"");
        }

        //
        if((cb3.isChecked()&&cb4.isChecked())&&cb5.isChecked())
        {
            tri31 = cb3.getText().toString()+ ""+ cb4.getText().toString()+""+cb5.getText().toString();
            tv2.setText(tri31+"");
        }
        if((cb3.isChecked()&&cb5.isChecked())&&cb6.isChecked())
        {
            tri32 =  cb3.getText().toString()+ ""+cb5.getText().toString()+""+cb6.getText().toString();
            tv2.setText(tri32+"");
        }
        //

        if((cb4.isChecked()&&cb5.isChecked())&&cb6.isChecked())
        {
            tri41 =  cb4.getText().toString()+ ""+cb5.getText().toString()+""+cb6.getText().toString();
            tv2.setText(tri41+"");
        }

        //

        if(((cb1.isChecked()&&cb2.isChecked())&&cb3.isChecked())&&cb4.isChecked())
        {
            four1 =  cb1.getText().toString()+ ""+cb2.getText().toString()+""+cb3.getText().toString()+""+cb4.getText().toString();
            tv2.setText(four1+"");
        }
        if(((cb1.isChecked()&&cb3.isChecked())&&cb4.isChecked()) && cb5.isChecked())
        {
            four2 =  cb1.getText().toString()+ ""+cb3.getText().toString()+""+cb4.getText().toString()+""+cb5.getText().toString();
            tv2.setText(four2+"");
        }
        if(((cb1.isChecked()&&cb4.isChecked())&&cb5.isChecked()) && cb6.isChecked())
        {
            four3 = cb1.getText().toString()+ ""+ cb4.getText().toString()+""+cb5.getText().toString()+""+cb6.getText().toString();
            tv2.setText(four3+"");
        }

        //

        if(((cb2.isChecked()&&cb3.isChecked())&&cb4.isChecked()) && cb5.isChecked())
        {
            fr22 = cb2.getText().toString()+ ""+cb3.getText().toString()+""+cb4.getText().toString()+""+cb5.getText().toString();
            tv2.setText(fr22+"");

        }
        if(((cb2.isChecked()&&cb4.isChecked())&&cb5.isChecked()) && cb6.isChecked())
        {
            fr23 = cb2.getText().toString()+ ""+ cb4.getText().toString()+""+cb5.getText().toString()+""+cb6.getText().toString();
            tv2.setText(fr23+"");
        }
        //

        if(((cb3.isChecked()&&cb4.isChecked())&&cb5.isChecked()) && cb6.isChecked())
        {
            fr31 = cb3.getText().toString()+ ""+ cb4.getText().toString()+""+cb5.getText().toString()+""+cb6.getText().toString();
            tv2.setText(fr31+"");
        }
        //

        if((((cb1.isChecked()&&cb2.isChecked())&&cb3.isChecked())&&cb4.isChecked())&&cb5.isChecked())
        {
            fr41 =  cb1.getText().toString()+ ""+cb2.getText().toString()+""+cb3.getText().toString()+""+cb4.getText().toString()+""+cb5.getText().toString();
            tv2.setText(fr41+"");
        }
        if((((cb1.isChecked()&&cb3.isChecked())&&cb4.isChecked()) && cb5.isChecked())&&cb6.isChecked())
        {
            fr42 =  cb1.getText().toString()+ ""+cb3.getText().toString()+""+cb4.getText().toString()+""+cb5.getText().toString()+""+cb6.getText().toString();
            tv2.setText(fr42+"");
        }

        //

        if((((cb2.isChecked()&&cb3.isChecked())&&cb4.isChecked()) && cb5.isChecked())&&cb6.isChecked())
        {
            fr51 = cb2.getText().toString()+ ""+cb3.getText().toString()+""+cb4.getText().toString()+""+cb5.getText().toString()+""+cb6.getText().toString();
            tv2.setText(fr51+"");
        }

        //

        if(((((cb1.isChecked()&&cb2.isChecked())&&cb3.isChecked())&&cb4.isChecked())&&cb5.isChecked())&&cb6.isChecked())
        {
            fr61 = cb1.getText().toString()+ ""+cb2.getText().toString()+""+cb3.getText().toString()+""+cb4.getText().toString()+""+cb5.getText().toString()+""+cb6.getText().toString();
            tv2.setText(fr61+"");
        }

    }

    public void onRadioButtonClicked(View view)
    {
        if(rb1.isSelected())
        {
            //a1 = rb1.getText().toString();

        }

        if(rb2.isChecked())
        {
            //a2 = rb2.getText().toString();
        }

        if(rb3.isChecked())
        {
            //a3 = rb3.getText().toString();
        }

        if(rb4.isChecked())
        {
            //a4 = rb4.getText().toString();
        }

        if(rb5.isChecked())
        {
            //a5 = rb5.getText().toString();
            tv9.setText("10days,preffered to meet doctor!");
        }

        if(rb6.isChecked())
        {
            //a6 = rb6.getText().toString();
        }

        if(rb7.isChecked())
        {
            //a7 = rb7.getText().toString();
        }

        if(rb8.isChecked())
        {
            //a8 = rb8.getText().toString();
            tv5.setText("500mg");
        }

        if(rb9.isChecked())
        {
            //a9 = rb9.getText().toString();
        }
        if(rb10.isChecked())
        {
            //a10 = rb10.getText().toString();
        }

        if(rb11.isChecked())
        {
            // a11 = rb11.getText().toString();
        }

        if(rb12.isChecked())
        {
            //a12 = rb12.getText().toString();
        }

        if(rb13.isChecked())
        {
            //a13 = rb13.getText().toString();
        }

        if(rb14.isChecked())
        {
            //a14 = rb14.getText().toString();
        }
        if(rb15.isChecked())
        {
            //a15 = rb15.getText().toString();
        }

        if(rb16.isChecked())
        {
            //a16 = rb16.getText().toString();
        }

        if(rb17.isChecked())
        {
            //a17 = rb17.getText().toString();
        }

        if(rb18.isChecked())
        {
            //a18 = rb18.getText().toString();
        }

        if(rb19.isChecked())
        {
            //a19 = rb19.getText().toString();
        }
        if(rb6.isChecked()||rb7.isChecked())
        {
            tv5.setText("250mg"+"");
        }
        if((rb9.isChecked()||rb10.isChecked())||rb11.isChecked())
        {
            tv5.setText("500mg"+"");
        }
        if(rb1.isChecked()||rb2.isChecked())
        {
            tv9.setText("2 days");
        }
        if(rb3.isChecked()||rb4.isChecked())
        {
            tv9.setText("7-days,preffered to meet doctor");
        }

        /*else {
            Toast.makeText(getApplicationContext(), "Select Options!",Toast.LENGTH_LONG).show();
        }*/

    }


}

