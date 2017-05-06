package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /* All var. that i need for the guest and the home Team*/
    int scoreGuestRun = 0;
    int scoreGuestHit = 0;
    int scoreGuestError = 0;
    int scoreHomeRun = 0;
    int scoreHomeHit = 0;
    int scoreHomeError = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Methods to change the scores from run,hit and error */
        /* Guest team */
    public void clickRunGuest (View v) {
        scoreGuestRun = scoreGuestRun + 1;
        TextView scoreView = (TextView) findViewById(R.id.guestScoreRun);
        scoreView.setText(String.valueOf(scoreGuestRun));
    }

    public void clickHitGuest (View v) {
        scoreGuestHit = scoreGuestHit + 1;
        TextView scoreView = (TextView) findViewById(R.id.guestScoreHit);
        scoreView.setText(String.valueOf(scoreGuestHit));
    }
    public void clickErrorGuest (View v) {
        scoreGuestError = scoreGuestError + 1;
        TextView scoreView = (TextView) findViewById(R.id.guestScoreError);
        scoreView.setText(String.valueOf(scoreGuestError));
    }
    /* Home team */
    public void clickRunHome (View v) {
        scoreHomeRun = scoreHomeRun + 1;
        TextView scoreView = (TextView) findViewById(R.id.homeScoreRun);
        scoreView.setText(String.valueOf(scoreHomeRun));
    }

    public void clickHitHome (View v) {
        scoreHomeHit = scoreHomeHit + 1;
        TextView scoreView = (TextView) findViewById(R.id.homeScoreHit);
        scoreView.setText(String.valueOf(scoreHomeHit));
    }
    public void clickErrorHome (View v) {
        scoreHomeError = scoreHomeError + 1;
        TextView scoreView = (TextView) findViewById(R.id.homeScoreError);
        scoreView.setText(String.valueOf(scoreHomeError));
    }
    /* Return - all scores goes on 0 */
    public void reset (View v) {
        scoreGuestRun = 0;
        scoreGuestHit = 0;
        scoreGuestError = 0;
        scoreHomeRun = 0;
        scoreHomeHit = 0;
        scoreHomeError = 0;
        displayScoreScoreGuestRun (scoreGuestRun);
        displayScoreScoreGuestHit (scoreGuestHit);
        displayScoreScoreGuestError (scoreGuestError);
        displayScoreScoreHomeRun (scoreHomeRun);
        displayScoreScoreHomeHit (scoreHomeHit);
        displayScoreScoreHomeError (scoreHomeError);
    }
    public void displayScoreScoreGuestRun(int score) {
        TextView scoreView = (TextView) findViewById(R.id.guestScoreRun);
        scoreView.setText(String.valueOf(score));
    }
   public void displayScoreScoreGuestHit(int score) {
        TextView scoreView = (TextView) findViewById(R.id.guestScoreHit);
        scoreView.setText(String.valueOf(score));
    }
    public void displayScoreScoreGuestError(int score) {
        TextView scoreView = (TextView) findViewById(R.id.guestScoreError);
        scoreView.setText(String.valueOf(score));
    }
    public void displayScoreScoreHomeRun(int score) {
        TextView scoreView = (TextView) findViewById(R.id.homeScoreRun);
        scoreView.setText(String.valueOf(score));
    }
    public void displayScoreScoreHomeHit(int score) {
        TextView scoreView = (TextView) findViewById(R.id.homeScoreHit);
        scoreView.setText(String.valueOf(score));
    }
    public void displayScoreScoreHomeError(int score) {
        TextView scoreView = (TextView) findViewById(R.id.homeScoreError);
        scoreView.setText(String.valueOf(score));
    }
}
