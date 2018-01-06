package com.example.android.quidditchgamecounter;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int griffindorScore = 0;
    int slytherinScore = 0;
    int griffindorFouls = 0;    int slytherinFouls = 0;
    int griffindorPlayers = 7;
    int slytherinPlayers = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View bgImageGriff = findViewById(R.id.bg_griffindor);
        View bgImageSlyth = findViewById(R.id.bg_slytherin);
        Drawable bgGriff = bgImageGriff.getBackground();
        Drawable bgSlyth = bgImageSlyth.getBackground();
        bgGriff.setAlpha(150);
        bgSlyth.setAlpha(150);

        displayScoreForGriffindor(griffindorScore);
        displaySlytherinScore(slytherinScore);
        displayPlayersForGriffindor(griffindorPlayers);
        displayPlayersForSlytherin(slytherinPlayers);
        displayFoulsForGriffindor(griffindorFouls);
        displayFoulsForSlytherin(slytherinFouls);
    }

    /**
     * This method displays the given score value on the screen
     */
    public void displayScoreForGriffindor (int score) {
        TextView scoreView = (TextView)findViewById(R.id.griffindor_score);
        scoreView.setText("" + score);
    }
    /**
     * This method displays the given quantity value on the screen
     */
    public void displayPlayersForGriffindor (int quantity) {
        TextView playersQuantity = (TextView)findViewById(R.id.players_guantity_griffindor);
        playersQuantity.setText("Players: " + quantity);
    }
    /**
     * This method displays the given value on the screen
     */
    public void displayFoulsForGriffindor (int fouls) {
        TextView foulsQuantity = (TextView)findViewById(R.id.fouls_griffindor);
        foulsQuantity.setText("Fouls: " + griffindorFouls);
    }
    /**
     * This method displays the given score value on the screen
     */
    public void displaySlytherinScore (int score) {
        TextView scoreView = (TextView)findViewById(R.id.slytherin_score);
        scoreView.setText("" + score);
    }
    /**
     * This method displays the given quantity value on the screen
     */
    public void displayPlayersForSlytherin (int quantity) {
        TextView playersQuantity = (TextView)findViewById(R.id.players_guantity_slytherin);
        playersQuantity.setText("Players: " + quantity);
    }
    /**
     * This method displays the given value on the screen
     */
    public void displayFoulsForSlytherin (int fouls) {
        TextView foulsQuantity = (TextView)findViewById(R.id.fouls_slytherin);
        foulsQuantity.setText("Fouls: " + slytherinFouls);
    }
    /**
     * This mwthod called when the GOAL button is clicked
     */
    public void griffindorGoal (View view) {
        griffindorScore = griffindorScore + 10;
        displayScoreForGriffindor(griffindorScore);
    }
    /**
     * This mwthod called when the GOAL button is clicked
     */
    public void slytherinGoal (View view) {
        slytherinScore = slytherinScore + 10;
        displaySlytherinScore(slytherinScore);
    }
    /**
     * This mwthod called when the GOLDEN SNITCH button is clicked
     */
    public void griffindorCaughtTheSnitch (View view) {
        griffindorScore = griffindorScore + 150;
        displayScoreForGriffindor(griffindorScore);
        finishTheGame();
    }
    /**
     * This mwthod called when the GOLDEN SNITCH button is clicked
     */
     public void slytherinCaughtTheSnitch (View view) {
        slytherinScore = slytherinScore + 150;
        displaySlytherinScore(slytherinScore);
        finishTheGame();
     }
    /**
     * This mwthod called when the FOUL button is clicked
     */
     public void griffindorGetFoul (View view) {
         griffindorFouls++;
         displayFoulsForGriffindor(griffindorFouls);
     }
    /**
     * This mwthod called when the FOUL button is clicked
     */
    public void slytherinGetFoul (View view) {
        slytherinFouls++;
        displayFoulsForSlytherin(slytherinFouls);
    }
    /**
     * This mwthod called when the PLAYER LOSS button is clicked
     */
     public void griffindorPlayerLoss (View view) {
        griffindorPlayers--;
        displayPlayersForGriffindor(griffindorPlayers);
     }
    /**
     * This mwthod called when the PLAYER LOSS button is clicked
     */
    public void slytherinPlayerLoss (View view) {
        slytherinPlayers--;
        displayPlayersForSlytherin(slytherinPlayers);
    }
    /**
     * This mwthod called when the RESET button is clicked
     */
    public void reset (View view){
        griffindorScore = 0;
        slytherinScore = 0;
        griffindorFouls = 0;
        slytherinFouls = 0;
        griffindorPlayers = 7;
        slytherinPlayers = 7;

        displayScoreForGriffindor(griffindorScore);
        displaySlytherinScore(slytherinScore);
        displayPlayersForGriffindor(griffindorPlayers);
        displayPlayersForSlytherin(slytherinPlayers);
        displayFoulsForGriffindor(griffindorFouls);
        displayFoulsForSlytherin(slytherinFouls);

        TextView congrats = (TextView)findViewById(R.id.congrats);
        congrats.setText("");
    }
    /**
     * This mwthod called when the GOLDEN SNITCH button is clicked
     */
    public void finishTheGame () {
        TextView congrats = (TextView)findViewById(R.id.congrats);
        if (griffindorScore > slytherinScore){
            congrats.setText("Griffindor " + griffindorScore + " : " + slytherinScore +
                                                    " Slytherin\nGriffindor win! Congratulations!");
        }
        else {
            congrats.setText("Griffindor " + griffindorScore + " : " + slytherinScore +
                    " Slytherin\nSlytherin win! Congratulations!");
        }
    }
}
