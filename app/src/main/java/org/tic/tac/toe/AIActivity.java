package org.tic.tac.toe;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.gitonway.lee.niftymodaldialogeffects.lib.Effectstype;
import com.gitonway.lee.niftymodaldialogeffects.lib.NiftyDialogBuilder;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AIActivity extends AppCompatActivity {
    LinearLayout l1,l2,l3,l4,l5,l6,l7,l8,l9;
    ImageView im1,im2,im3,im4,im5,im6,im7,im8,im9;

    boolean operator=true;  //red
    boolean check1,check2,check3,check4,check5,check6,check7,check8,check9; // true=red    false=blue
    boolean checkFalse1,checkFalse2,checkFalse3,checkFalse4,checkFalse5,checkFalse6,checkFalse7,checkFalse8,checkFalse9;

    private Effectstype effect;
    int win=0;

    int last_move,count=0;
    int[] position = {0,0,0,0,0,0,0,0,0};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_i);

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
                        last_move=1;
                        position[count] = 1;
                        count++;
                        turn();
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
                        last_move=2;
                        position[count] = 2;
                        count++;
                        turn();
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
                        last_move=3;
                        position[count] = 3;
                        count++;
                        turn();
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
                        last_move=4;
                        position[count] = 4;
                        count++;
                        turn();
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
                        last_move=5;
                        position[count] = 5;
                        count++;
                        turn();
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

                        last_move=6;
                        position[count] = 6;
                        count++;
                        turn();
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

                        last_move=7;
                        position[count] = 7;
                        count++;
                        turn();
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

                        last_move=8;
                        position[count] = 8;
                        count++;

                        turn();
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

                        last_move=9;
                        position[count] = 9;
                        count++;

                        turn();
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
            final NiftyDialogBuilder dialogBuilder = NiftyDialogBuilder.getInstance(AIActivity.this);

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
                            count=0;
                            for(int i=0;i>=position.length;i++){
                                position[i]=0;
                            }
                            dialogBuilder.dismiss();
                        }
                    })
                    .show();
        }else if((checkFalse1 && checkFalse2  && checkFalse3 ) || (checkFalse1  && checkFalse4  && checkFalse7 ) || (checkFalse1  && checkFalse5  && checkFalse9 ) || (checkFalse2  && checkFalse5  && checkFalse8 ) || (checkFalse3  && checkFalse5  && checkFalse7 ) || (checkFalse3  && checkFalse6  && checkFalse9 ) || (checkFalse4  && checkFalse5  && checkFalse6 ) || (checkFalse7  && checkFalse8  && checkFalse9 )){
            reset();
            final NiftyDialogBuilder dialogBuilder = NiftyDialogBuilder.getInstance(AIActivity.this);

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
                            count=0;
                            for(int i=0;i>=position.length;i++){
                                position[i]=0;
                            }
                        }
                    })
                    .show();
        }else if(im1.getVisibility() == View.VISIBLE && im2.getVisibility() == View.VISIBLE && im3.getVisibility() == View.VISIBLE && im4.getVisibility() == View.VISIBLE && im5.getVisibility() == View.VISIBLE && im6.getVisibility() == View.VISIBLE && im7.getVisibility()==View.VISIBLE && im8.getVisibility()==View.VISIBLE && im9.getVisibility() == View.VISIBLE){
            reset();
            final NiftyDialogBuilder dialogBuilder = NiftyDialogBuilder.getInstance(AIActivity.this);

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
            count=0;
            for(int i=0;i>=position.length;i++){
                position[i]=0;
            }
        }

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
        im1.setImageResource(0);
        im2.setImageResource(0);
        im3.setImageResource(0);
        im4.setImageResource(0);
        im5.setImageResource(0);
        im6.setImageResource(0);
        im7.setImageResource(0);
        im8.setImageResource(0);
        im9.setImageResource(0);
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
        count=0;
        for(int i=0;i>=position.length;i++){
            position[i]=0;
        }

    }

    private void AIWon(){
        final NiftyDialogBuilder dialogBuilder = NiftyDialogBuilder.getInstance(AIActivity.this);

        dialogBuilder
                .withTitle("Status")                                  //.withTitle(null)  no title
                .withTitleColor("#FFFFFF")                                  //def
                .withDividerColor("#11000000")                              //def
                .withMessage("Robot won")                     //.withMessage(null)  no Msg
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
                        count=0;
                        for(int i=0;i>=position.length;i++){
                            position[i]=0;
                        }
                    }
                })
                .show();
    }

    private void turn(){
        Log.d("COUNT", String.valueOf(count));
        if(count==1) {
            if (last_move == 1 || last_move == 3 || last_move == 7 || last_move == 9) {
                im5.setImageResource(R.drawable.blue_round_circle);
                im5.setVisibility(View.VISIBLE);
            }else if(last_move == 5){
                im7.setImageResource(R.drawable.blue_round_circle);
                im7.setVisibility(View.VISIBLE);
            }else if(last_move == 2){
                im8.setImageResource(R.drawable.blue_round_circle);
                im8.setVisibility(View.VISIBLE);
            }else if(last_move == 4){
                im6.setImageResource(R.drawable.blue_round_circle);
                im6.setVisibility(View.VISIBLE);
            }else if(last_move == 6){
                im4.setImageResource(R.drawable.blue_round_circle);
                im4.setVisibility(View.VISIBLE);
            }else if(last_move == 8){
                im2.setImageResource(R.drawable.blue_round_circle);
                im2.setVisibility(View.VISIBLE);
            }else{
                Toast.makeText(this, "Something went wrong", Toast.LENGTH_SHORT).show();
            }
            operator = true;
        }
        else if(count==2){
            for (int i=0;i>=position.length;i++)
                System.out.println(position[i]);

            if((position[0] == 1 || position[0]==3) && (position[1]==3 || position[1]==1)){
                im2.setImageResource(R.drawable.blue_round_circle);
                im2.setVisibility(View.VISIBLE);
            }else if((position[0] == 1 || position[0]==7) && (position[1] == 1 || position[1]==7)){
                im4.setImageResource(R.drawable.blue_round_circle);
                im4.setVisibility(View.VISIBLE);
            }else if((position[0]==1 || position[0]==2) && (position[1]==1 || position[1]==2)){
                im3.setImageResource(R.drawable.blue_round_circle);
                im3.setVisibility(View.VISIBLE);
            }else if(position[0]==1 && position[1]==9){
                im6.setImageResource(R.drawable.blue_round_circle);
                im6.setVisibility(View.VISIBLE);
            }else if((position[0]==1 && position[1]==8) || (position[0]==1 && position[1]==6)){
                im9.setImageResource(R.drawable.blue_round_circle);
                im9.setVisibility(View.VISIBLE);
            }else if((position[0] == 1 || position[0]==4) && (position[1] == 1 || position[1]==4)){
                im7.setImageResource(R.drawable.blue_round_circle);
                im7.setVisibility(View.VISIBLE);
            }else if((position[0]==2 || position[0]==3) && (position[1]==3 || position[1]==2)){
                im1.setImageResource(R.drawable.blue_round_circle);
                im1.setVisibility(View.VISIBLE);
                if(position[0]==3 && position[1]==2){
                    win=9;
                }
            }else if((position[0]==2 || position[0]==4) && (position[1]==2 || position[1]==4)){
                im1.setImageResource(R.drawable.blue_round_circle);
                im1.setVisibility(View.VISIBLE);
            }else if((position[0]==2 || position[0]==5) && (position[1]==2 || position[1]==5)){
                im3.setImageResource(R.drawable.blue_round_circle);
                im3.setVisibility(View.VISIBLE);
            }else if((position[0]==2 || position[0]==6) && (position[1]==2 || position[1]==6)) {
                im3.setImageResource(R.drawable.blue_round_circle);
                im3.setVisibility(View.VISIBLE);
            }else if((position[0]==2 || position[0]==7) &&(position[1]==2 || position[1]==7)){
                im1.setImageResource(R.drawable.blue_round_circle);
                im1.setVisibility(View.VISIBLE);
            }else if((position[0]==2 || position[0]==9) && (position[1]==2 || position[1]==9)){
                im3.setImageResource(R.drawable.blue_round_circle);
                im3.setVisibility(View.VISIBLE);
            }else if((position[0]==3 || position[0]==4) && (position[1]==3 || position[1]==4)){
                im1.setImageResource(R.drawable.blue_round_circle);
                im1.setVisibility(View.VISIBLE);
            }else if((position[0]==3 || position[0]==6) && (position[1]==3 || position[1]==6)){
                im9.setImageResource(R.drawable.blue_round_circle);
                im9.setVisibility(View.VISIBLE);
                win=1;
            }else if((position[0]==3 || position[0]==7) && (position[1]==3 || position[1]==7)){
                im4.setImageResource(R.drawable.blue_round_circle);
                im4.setVisibility(View.VISIBLE);
                win=6;
            }else if((position[0]==3 || position[0]==8) && (position[1]==3 || position[1]==8)){
                im6.setImageResource(R.drawable.blue_round_circle);
                im6.setVisibility(View.VISIBLE);
                if(position[0]==3 && position[1]==9){
                    win=4;
                }
            }else if((position[0]==3 || position[0]==9) && (position[1]==3 || position[1]==9)){
                im4.setImageResource(R.drawable.blue_round_circle);
                im4.setVisibility(View.VISIBLE);
                win=6;
            }else if((position[0]==4 || position[0]==5) && (position[1]==4 || position[1]==5)){
                im3.setImageResource(R.drawable.blue_round_circle);
                im3.setVisibility(View.VISIBLE);
                if(position[0]==4 && position[1]==5){
                    win=9;
                }
            }else if((position[0]==4 || position[0]==7) && (position[1]==4 || position[1]==7)){
                im1.setImageResource(R.drawable.blue_round_circle);
                im1.setVisibility(View.VISIBLE);
            }else if((position[0]==4 || position[0]==8) && (position[1]==4 || position[1]==8)){
                im9.setImageResource(R.drawable.blue_round_circle);
                im9.setVisibility(View.VISIBLE);
                if(position[0]==4 || position[0]==8){
                    win=3;
                }
            }else if(position[0]==5 && position[1]==6){
                im4.setImageResource(R.drawable.blue_round_circle);
                im4.setVisibility(View.VISIBLE);
                win=1;
            }else if(position[0]==6 && position[1]==5){
                im1.setImageResource(R.drawable.blue_round_circle);
                im1.setVisibility(View.VISIBLE);
                win=7;
            }else if((position[0]==6 || position[0]==7) && (position[1]==6 || position[1]==7)){
                im9.setImageResource(R.drawable.blue_round_circle);
                im9.setVisibility(View.VISIBLE);
            }else if((position[0]==6 || position[0]==8) && (position[1]==8 || position[1]==6)){
                im9.setImageResource(R.drawable.blue_round_circle);
                im9.setVisibility(View.VISIBLE);
            }else if((position[0]==6 || position[0]==9) && (position[1]==6 || position[1]==9)){
                im3.setImageResource(R.drawable.blue_round_circle);
                im3.setVisibility(View.VISIBLE);
            }else if((position[0]==7 || position[0]==8) && (position[1]==7 || position[1]==8)){
                im9.setImageResource(R.drawable.blue_round_circle);
                im9.setVisibility(View.VISIBLE);
            }else if((position[0]==7 || position[0]==9) && (position[1]==7 || position[1]==9)){
                im8.setImageResource(R.drawable.blue_round_circle);
                im8.setVisibility(View.VISIBLE);
            }else if((position[0]==8 || position[0]==9) && (position[1]==9 || position[1]==8)){
                im7.setImageResource(R.drawable.blue_round_circle);
                im7.setVisibility(View.VISIBLE);
                if(position[0]==9 && position[1]==8)
                    win = 3;
            }
            else{
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
            }

            operator = true;
        }
        else if(count==3){
            if(win!=0){
                if(position[2]!=win){
                    if(win==1){
                        im1.setImageResource(R.drawable.blue_round_circle);
                        im1.setVisibility(View.VISIBLE);
                    }else if(win==2){
                        im2.setImageResource(R.drawable.blue_round_circle);
                        im2.setVisibility(View.VISIBLE);
                    }else if(win==3){
                        im3.setImageResource(R.drawable.blue_round_circle);
                        im3.setVisibility(View.VISIBLE);
                    }else if(win==4){
                        im4.setImageResource(R.drawable.blue_round_circle);
                        im4.setVisibility(View.VISIBLE);
                    }else if(win==5){
                        im5.setImageResource(R.drawable.blue_round_circle);
                        im5.setVisibility(View.VISIBLE);
                    }else if(win==6){
                        im6.setImageResource(R.drawable.blue_round_circle);
                        im6.setVisibility(View.VISIBLE);
                    }else if(win==7){
                        im7.setImageResource(R.drawable.blue_round_circle);
                        im7.setVisibility(View.VISIBLE);
                    }else if(win==8){
                        im8.setImageResource(R.drawable.blue_round_circle);
                        im8.setVisibility(View.VISIBLE);
                    }else if(win==9){
                        im9.setImageResource(R.drawable.blue_round_circle);
                        im9.setVisibility(View.VISIBLE);
                    }
                    reset();
                    AIWon();
                }else{
                    win=0;
                }
            }else{
                for(int i=0; i>=3; i++){

                }
                if(position[0]==1 && position[1]==2 && position[2]==7){
                    im4.setImageResource(R.drawable.blue_round_circle);
                }else if(position[0]==1 && position[1]==7 && position[2]==2){
                    im2.setImageResource(R.drawable.blue_round_circle);
                }else if(position[0]==7 && position[1]==1 && position[2]==2){
                    im5.setImageResource(R.drawable.blue_round_circle);
                }else if(position[0]==7 && position[1]==2 && position[2]==1){
                    im3.setImageResource(R.drawable.blue_round_circle);
                }else if(position[0]==2 && position[1]==1 && position[2]==7){
                    im9.setImageResource(R.drawable.blue_round_circle);
                }else if(position[0]==2 && position[1]==7 && position[2]==1){
                    im8.setImageResource(R.drawable.blue_round_circle);
                }
            }
        }
        else{
            Toast.makeText(this, "error"+count, Toast.LENGTH_SHORT).show();
        }
    }
}