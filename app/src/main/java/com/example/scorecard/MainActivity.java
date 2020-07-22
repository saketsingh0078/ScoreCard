package com.example.scorecard;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int TeamAScore=0;
    int TeamBScore =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void DisplayScoreOfA(int i){
        TextView scoreA = (TextView)findViewById(R.id.TeamAScore);
        scoreA.setText(String.valueOf(i));
    }

    public void DisplayScoreOfB(int i){
        TextView scoreB = (TextView)findViewById(R.id.TeamBScore);
        scoreB.setText(String.valueOf(i));
    }

    public void threePointOfA(View view){
        TeamAScore = TeamAScore +3 ;
        DisplayScoreOfA(TeamAScore);
    }

    public void twoPointOfA(View view){
        TeamAScore = TeamAScore +2 ;
        DisplayScoreOfA(TeamAScore);
    }

    public void freeThrowPointOfA(View view){
        TeamAScore = TeamAScore +1 ;
        DisplayScoreOfA(TeamAScore);
    }
    public void threePointOfB(View view){
        TeamBScore = TeamBScore +3 ;
        DisplayScoreOfB(TeamBScore);
    }

    public void twoPointOfB(View view){
        TeamBScore = TeamBScore +2 ;
        DisplayScoreOfB(TeamBScore);
    }
    public void freeThrowPointOfB(View view){
        TeamBScore = TeamBScore + 1 ;
        DisplayScoreOfB(TeamBScore);
    }


    public void reset(View view){
        if(TeamAScore > TeamBScore){
            Toast.makeText(this, "Thank for Play Team A Win!", Toast.LENGTH_SHORT).show();
        }

        if(TeamAScore < TeamBScore){
            Toast.makeText(this, "Thank for Play Team B Win!", Toast.LENGTH_SHORT).show();
        }

        if(TeamAScore == TeamBScore){
            Toast.makeText(this, "Thank for Play Match Draw!", Toast.LENGTH_SHORT).show();
        }

        TeamAScore =0;
        TeamBScore =0;
        DisplayScoreOfA(TeamAScore);
        DisplayScoreOfB(TeamBScore);

    }



}
