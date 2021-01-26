package org.tic.tac.toe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.gitonway.lee.niftymodaldialogeffects.lib.Effectstype;
import com.gitonway.lee.niftymodaldialogeffects.lib.NiftyDialogBuilder;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MultiplayerActivity extends AppCompatActivity {

    LinearLayout l1,l2,l3,l4,l5,l6,l7,l8,l9;
    ImageView im1,im2,im3,im4,im5,im6,im7,im8,im9;

    boolean operator=true;  //red
    boolean check1,check2,check3,check4,check5,check6,check7,check8,check9; // true=red    false=blue
    boolean checkFalse1,checkFalse2,checkFalse3,checkFalse4,checkFalse5,checkFalse6,checkFalse7,checkFalse8,checkFalse9;

    private Effectstype effect;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        l1 = findViewById(R.id.l1);
        l2 = findViewById(R.id.l2);
        l3 = findViewById(R.id.l3);
        l4 = findViewById(R.id.l4);
        l5 = findViewById(R.id.l5);
        l6 = findViewById(R.id.l6);
        l7 = findViewById(R.id.l7);
        l8 = findViewById(R.id.l8);
        l9 = findViewById(R.id.l9);

        im1 = findViewById(R.id.img1);
        im2 = findViewById(R.id.img2);
        im3 = findViewById(R.id.img3);
        im4 = findViewById(R.id.img4);
        im5 = findViewById(R.id.img5);
        im6 = findViewById(R.id.img6);
        im7 = findViewById(R.id.img7);
        im8 = findViewById(R.id.img8);
        im9 = findViewById(R.id.img9);



        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }});
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (im1.getVisibility()==View.GONE){
                    if (operator){
                        im1.setBackgroundResource(R.drawable.red_round_circle);
                        operator = false;
                        check1 = true;
                    }else{
                        im1.setBackgroundResource(R.drawable.blue_round_circle);
                        operator = true;
                        checkFalse1 = true;
                    }
                    im1.setVisibility(View.VISIBLE);
                    check();
                }
            }
        });

        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (im2.getVisibility()==View.GONE){
                    if (operator){
                        im2.setBackgroundResource(R.drawable.red_round_circle);
                        operator = false;
                        check2 = true;
                    }else{
                        im2.setBackgroundResource(R.drawable.blue_round_circle);
                        operator = true;
                        checkFalse2 = true;
                    }
                    im2.setVisibility(View.VISIBLE);
                    check();
                }
            }
        });


        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (im3.getVisibility()==View.GONE){
                    if (operator){
                        im3.setBackgroundResource(R.drawable.red_round_circle);
                        operator = false;
                        check3 = true;
                    }else{
                        im3.setBackgroundResource(R.drawable.blue_round_circle);
                        operator = true;
                        checkFalse3 = true;
                    }
                    im3.setVisibility(View.VISIBLE);
                    check();
                }
            }
        });

        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (im4.getVisibility()==View.GONE){
                    if (operator){
                        im4.setBackgroundResource(R.drawable.red_round_circle);
                        operator = false;
                        check4 = true;
                    }else{
                        im4.setBackgroundResource(R.drawable.blue_round_circle);
                        operator = true;
                        checkFalse4 = true;
                    }
                    im4.setVisibility(View.VISIBLE);
                    check();
                }
            }
        });

        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (im5.getVisibility()==View.GONE){
                    if (operator){
                        im5.setBackgroundResource(R.drawable.red_round_circle);
                        operator = false;
                        check5 = true;
                    }else{
                        im5.setBackgroundResource(R.drawable.blue_round_circle);
                        operator = true;
                        checkFalse5 = true;
                    }
                    im5.setVisibility(View.VISIBLE);
                    check();
                }
            }
        });

        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (im6.getVisibility()==View.GONE){
                    if (operator){
                        im6.setBackgroundResource(R.drawable.red_round_circle);
                        operator = false;
                        check6 = true;
                    }else{
                        im6.setBackgroundResource(R.drawable.blue_round_circle);
                        operator = true;
                        checkFalse6 = true;
                    }
                    im6.setVisibility(View.VISIBLE);
                    check();
                }
            }
        });

        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (im7.getVisibility()==View.GONE){
                    if (operator){
                        im7.setBackgroundResource(R.drawable.red_round_circle);
                        operator = false;
                        check7 = true;
                    }else{
                        im7.setBackgroundResource(R.drawable.blue_round_circle);
                        operator = true;
                        checkFalse7 = true;
                    }
                    im7.setVisibility(View.VISIBLE);
                    check();
                }
            }
        });

        l8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (im8.getVisibility()==View.GONE){
                    if (operator){
                        im8.setBackgroundResource(R.drawable.red_round_circle);
                        operator = false;
                        check8 = true;
                    }else{
                        im8.setBackgroundResource(R.drawable.blue_round_circle);
                        operator = true;
                        checkFalse8 = true;
                    }
                    im8.setVisibility(View.VISIBLE);
                    check();
                }
            }
        });

        l9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (im9.getVisibility()==View.GONE){
                    if (operator){
                        im9.setBackgroundResource(R.drawable.red_round_circle);
                        operator = false;
                        check9 = true;
                    }else{
                        im9.setBackgroundResource(R.drawable.blue_round_circle);
                        operator = true;
                        checkFalse9 = true;
                    }
                    im9.setVisibility(View.VISIBLE);
                    check();
                }
            }
        });



    }

    private void check(){
        if((check1 && check2 && check3) || (check1 && check4 && check7) || (check1 && check5 && check9) || (check2 && check5 && check8) || (check3 && check5 && check7) || (check3 && check6 && check9) || (check4 && check5 && check6) || (check7 && check8 && check9)){
            reset();
            final NiftyDialogBuilder dialogBuilder = NiftyDialogBuilder.getInstance(MultiplayerActivity.this);

            dialogBuilder
                    .withTitle("Status")                                  //.withTitle(null)  no title
                    .withTitleColor("#FFFFFF")                                  //def
                    .withDividerColor("#11000000")                              //def
                    .withMessage("Red won")                     //.withMessage(null)  no Msg
                    .withMessageColor("#FFFFFFFF")                              //def  | withMessageColor(int resid)
                    .withDialogColor("#FFE74C3C")                               //def  | withDialogColor(int resid)
                    .withDuration(700)                                          //def
                    .withEffect(effect)                                         //def Effectstype.Slidetop
                    .withButton1Text("Close")                              //def gone
                    .isCancelableOnTouchOutside(false)                           //def    | isCancelable(true)
                    .setButton1Click(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            dialogBuilder.dismiss();
                        }
                    })
                    .show();
        }else if((checkFalse1 && checkFalse2  && checkFalse3 ) || (checkFalse1  && checkFalse4  && checkFalse7 ) || (checkFalse1  && checkFalse5  && checkFalse9 ) || (checkFalse2  && checkFalse5  && checkFalse8 ) || (checkFalse3  && checkFalse5  && checkFalse7 ) || (checkFalse3  && checkFalse6  && checkFalse9 ) || (checkFalse4  && checkFalse5  && checkFalse6 ) || (checkFalse7  && checkFalse8  && checkFalse9 )){
            reset();
            final NiftyDialogBuilder dialogBuilder = NiftyDialogBuilder.getInstance(MultiplayerActivity.this);

            dialogBuilder
                    .withTitle("Status")                                  //.withTitle(null)  no title
                    .withTitleColor("#FFFFFF")                                  //def
                    .withDividerColor("#11000000")                              //def
                    .withMessage("Blue won")                     //.withMessage(null)  no Msg
                    .withMessageColor("#FFFFFFFF")                              //def  | withMessageColor(int resid)
                    .withDialogColor("#FFE74C3C")                               //def  | withDialogColor(int resid)
                    .withDuration(700)                                          //def
                    .withEffect(effect)                                         //def Effectstype.Slidetop
                    .withButton1Text("Close")                              //def gone
                    .isCancelableOnTouchOutside(false)                           //def    | isCancelable(true)
                    .setButton1Click(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            dialogBuilder.dismiss();
                        }
                    })
                    .show();
        }else if(im1.getVisibility() == View.VISIBLE && im2.getVisibility() == View.VISIBLE && im3.getVisibility() == View.VISIBLE && im4.getVisibility() == View.VISIBLE && im5.getVisibility() == View.VISIBLE && im6.getVisibility() == View.VISIBLE && im7.getVisibility()==View.VISIBLE && im8.getVisibility()==View.VISIBLE && im9.getVisibility() == View.VISIBLE){
            reset();
            final NiftyDialogBuilder dialogBuilder = NiftyDialogBuilder.getInstance(MultiplayerActivity.this);

            dialogBuilder
                    .withTitle("Status")                                  //.withTitle(null)  no title
                    .withTitleColor("#FFFFFF")                                  //def
                    .withDividerColor("#11000000")                              //def
                    .withMessage("Tie")                     //.withMessage(null)  no Msg
                    .withMessageColor("#FFFFFFFF")                              //def  | withMessageColor(int resid)
                    .withDialogColor("#FFE74C3C")                               //def  | withDialogColor(int resid)
                    .withDuration(700)                                          //def
                    .withEffect(effect)                                         //def Effectstype.Slidetop
                    .withButton1Text("Close")                              //def gone
                    .isCancelableOnTouchOutside(false)                           //def    | isCancelable(true)
                    .setButton1Click(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            dialogBuilder.dismiss();
                        }
                    })
                    .show();
        }


        turn();
    }


    private void reset(){
            im1.setVisibility(View.GONE);
            im2.setVisibility(View.GONE);
            im3.setVisibility(View.GONE);
            im4.setVisibility(View.GONE);
            im5.setVisibility(View.GONE);
            im6.setVisibility(View.GONE);
            im7.setVisibility(View.GONE);
            im8.setVisibility(View.GONE);
            im9.setVisibility(View.GONE);
            operator=true;
            check1 = false;
            check2 = false;
            check3 = false;
            check4 = false;
            check5 = false;
            check6 = false;
            check7 = false;
            check8 = false;
            check9 = false;
            checkFalse1 = false;
            checkFalse2 = false;
            checkFalse3 = false;
            checkFalse4 = false;
            checkFalse5 = false;
            checkFalse6 = false;
            checkFalse7 = false;
            checkFalse8 = false;
            checkFalse9 = false;

    }

    private void turn(){
        TextView textView = findViewById(R.id.textView);
        if(operator){
            textView.setText("Red's turn");
            textView.setTextColor(Color.parseColor("#ff0000"));
        }else{
            textView.setText("Blue's turn");
            textView.setTextColor(Color.parseColor("#0011ff"));
        }
    }
}