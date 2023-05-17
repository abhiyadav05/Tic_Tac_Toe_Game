package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.animation.content.Content;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   TextView btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
   String b1,b2,b3,b4,b5,b6,b7,b8,b9;

   int winnerDecide=0;
   int playerTurn=0;
   TextView turn_X,turn_O;
   int flag=0;



    @SuppressLint({"MissingInflatedId", "ResourceAsColor"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);

        turn_O=findViewById(R.id.turn0);
        turn_X=findViewById(R.id.turnX);


      // calling the function for Set the turn first for X;
        turnSet();


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);



    }

    // This is the clickListener of the all button to play game, view get the all the reference of the button

    public void onClick(View view){
        TextView currenButton= (TextView) view;

        // when come in the funtion  then color of the turn of player is change to get for new turn




        if (currenButton.getText().equals("")){      /// This is for the only turn for nine or when button is empty
            turn_O.setBackgroundResource(R.drawable.main_box);
            turn_X.setBackgroundResource(R.drawable.main_box);

        playerTurn++;   // count the player turn for every turn


            // It is the swapping the turn of the player
        if(flag==0){
                turn_O.setBackgroundResource(R.drawable.start_button);
                currenButton.setText("X");

                // 0 for win the X
                winnerDecide=0;
                flag=1;
        }
        else {
            turn_X.setBackgroundResource(R.drawable.start_button);
            currenButton.setText("O");

            // 1 for win the O
            winnerDecide=1;
            flag=0;
        }

        // the condition check when player play 4 turn

      if(playerTurn>4){

          // Get the all String to check the Winner ;

          b1=btn1.getText().toString();
          b2=btn2.getText().toString();
          b3=btn3.getText().toString();
          b4=btn4.getText().toString();
          b5=btn5.getText().toString();
          b6=btn6.getText().toString();
          b7=btn7.getText().toString();
          b8=btn8.getText().toString();
          b9=btn9.getText().toString();

                // Condition for checking the winning;

          if(b1.equals(b2) && b2.equals(b3) && !b1.equals("")){
              Toast.makeText(this,"Win",Toast.LENGTH_SHORT).show();
              new Handler().postDelayed(new Runnable() {
                  @Override
                  public void run() {
                      Win();
                      mainWinner();
                  }
              },1000);

              // It Show the Dialog box of the winner ;


          }
          else if(b4.equals(b5) && b5.equals(b6) && !b4.equals("")){
              Toast.makeText(this,"Win",Toast.LENGTH_SHORT).show();
              new Handler().postDelayed(new Runnable() {
                  @Override
                  public void run() {
                      Win();
                      mainWinner();
                  }
              },1000);


          }
          else if(b7.equals(b8) && b8.equals(b9) && !b7.equals("")){
              Toast.makeText(this,"Win",Toast.LENGTH_SHORT).show();
              new Handler().postDelayed(new Runnable() {
                  @Override
                  public void run() {
                      Win();
                      mainWinner();
                  }
              },1000);


          }
          else if(b1.equals(b4) && b4.equals(b7) && !b4.equals("")){
              Toast.makeText(this,"Win",Toast.LENGTH_SHORT).show();
              new Handler().postDelayed(new Runnable() {
                  @Override
                  public void run() {
                      Win();
                      mainWinner();
                  }
              },1000);


          }
          else if(b2.equals(b5) && b5.equals(b8) && !b5.equals("")){
              Toast.makeText(this,"Win",Toast.LENGTH_SHORT).show();
              new Handler().postDelayed(new Runnable() {
                  @Override
                  public void run() {
                      Win();
                      mainWinner();
                  }
              },1000);


          }
          else if(b3.equals(b6) && b6.equals(b9) && !b6.equals("")){
              Toast.makeText(this,"Win",Toast.LENGTH_SHORT).show();
              new Handler().postDelayed(new Runnable() {
                  @Override
                  public void run() {
                      Win();
                      mainWinner();
                  }
              },1000);


          }
          else if(b1.equals(b5) && b5.equals(b9) && !b9.equals("")){
              Toast.makeText(this,"Win",Toast.LENGTH_SHORT).show();
              new Handler().postDelayed(new Runnable() {
                  @Override
                  public void run() {
                      Win();
                      mainWinner();
                  }
              },1000);


          }
          else if(b3.equals(b5) && b5.equals(b7) && !b7.equals("")){
              Toast.makeText(this,"Win",Toast.LENGTH_SHORT).show();
              new Handler().postDelayed(new Runnable() {
                  @Override
                  public void run() {
                      Win();
                      mainWinner();
                  }
              },1000);


          }
          else if(playerTurn==9){
              Toast.makeText(this,"Match Draw",Toast.LENGTH_SHORT).show();
              new Handler().postDelayed(new Runnable() {
                  @Override
                  public void run() {
                      Win();
                      matchDraw();
                  }
              },1000);

              // This is Dialog Box for Match Draw


          }
      }
        }


    }


    // This method set the turn of the X when game is Start;
    public void turnSet(){
        if (playerTurn==0){
            turn_X.setBackgroundResource(R.drawable.start_button);
        }

    }

    // This method for Start the New game to set all button empty;
            public void Win(){
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                turn_O.setBackgroundResource(R.drawable.main_box);
                turn_X.setBackgroundResource(R.drawable.main_box);
                playerTurn=0;
                flag=0;
            }


            // This is Our Dialog Box;
            public void mainWinner(){
        Dialog dialog=new Dialog(this);
        dialog.setContentView(R.layout.winner_dialog);
        dialog.setCancelable(false);

        // This method for set the background of the Dialog Box;

        dialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface abc) {
                dialog.getWindow().setBackgroundDrawableResource(R.color.hint_color);
            }
        });

        TextView winnerName=dialog.findViewById(R.id.winnerName);
        TextView restartBtn=dialog.findViewById(R.id.restartBtn);
        TextView exitBtn=dialog.findViewById(R.id.exitBtn);

        // This condition Decide the winner to show in the Dialog Box;
        if (winnerDecide==0){
            winnerName.setText(R.string.winner_x);
        }
        else if(winnerDecide==1){
            winnerName.setText(R.string.winner_o);
        }

        // This is for Restart the game;
        restartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                turnSet();
            }
        });

        // This is for Exit the game;
        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });
        dialog.show();
    }

    // Match Draw Dialog Box;

    public void matchDraw(){
        Dialog matchDrawDialog=new Dialog(this);
        matchDrawDialog.setCancelable(false);
        matchDrawDialog.setContentView(R.layout.draw_dialog);
        matchDrawDialog.getWindow().setBackgroundDrawableResource(R.color.hint_color);
        TextView tryAgain=matchDrawDialog.findViewById(R.id.restartBtn);
        TextView exitBtn=matchDrawDialog.findViewById(R.id.exitBtn);

        tryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                matchDrawDialog.dismiss();
                turnSet();
            }
        });

        exitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        matchDrawDialog.show();
    }

}