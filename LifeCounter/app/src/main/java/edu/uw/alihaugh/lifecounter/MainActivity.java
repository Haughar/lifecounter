package edu.uw.alihaugh.lifecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private final int LIFE_JUMP = 5;
    private final int INITIAL_LIVES = 20;
    Button mButton1, mButton2, mButton3, mButton4, aButton1, aButton2, aButton3, aButton4,
            m5Button1, m5Button2, m5Button3, m5Button4, a5Button1, a5Button2, a5Button3, a5Button4;

    int[] minusButtons = new int[] { R.id.minusbutton1, R.id.minusbutton2, R.id.minusbutton3, R.id.minusbutton4 };
    Button[] mButtonObj = new Button[] { mButton1, mButton2, mButton3, mButton4 };
    int[] plusButtons = new int[] { R.id.addbutton1, R.id.addbutton2, R.id.addbutton3, R.id.addbutton4 };
    Button[] aButtonObj = new Button[] { aButton1, aButton2, aButton3, aButton4 };
    int[] minus5Buttons = new int[] { R.id.minusfivebutton1, R.id.minusfivebutton2, R.id.minusfivebutton3, R.id.minusfivebutton4 };
    Button[] m5ButtonObj = new Button[] { m5Button1, m5Button2, m5Button3, m5Button4 };
    int[] plus5Buttons = new int[] { R.id.addfivebutton1, R.id.addfivebutton2, R.id.addfivebutton3, R.id.addfivebutton4 };
    Button[] a5ButtonObj = new Button[] { a5Button1, a5Button2, a5Button3, a5Button4 };
    int[] lifeCounts = new int[] { R.id.lives1, R.id.lives2, R.id.lives3, R.id.lives4 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // player1 buttons
        mButton1 = (Button)findViewById(minusButtons[0]);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView lifeCount = (TextView)findViewById(R.id.lives1);
                int count = Integer.parseInt(lifeCount.getText().toString());
                count = count - 1;
                if (count <= 0) {
                    lifeCount.setText("0");
                    TextView loser = (TextView)findViewById(R.id.loser);
                    loser.setText("PLAYER 1 LOSES!!");
                    loser.setVisibility(View.VISIBLE);
                } else {
                    lifeCount.setText(Integer.toString(count));
                }
            }
        });

        aButton1 = (Button)findViewById(plusButtons[0]);
        aButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView lifeCount = (TextView)findViewById(R.id.lives1);
                int count = Integer.parseInt(lifeCount.getText().toString());
                count = count + 1;
                lifeCount.setText(Integer.toString(count));
            }
        });

        m5Button1 = (Button)findViewById(minus5Buttons[0]);
        m5Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView lifeCount = (TextView)findViewById(R.id.lives1);
                int count = Integer.parseInt(lifeCount.getText().toString());
                count = count - 5;
                if (count <= 0) {
                    lifeCount.setText("0");
                    TextView loser = (TextView)findViewById(R.id.loser);
                    loser.setText("PLAYER 1 LOSES!!");
                    loser.setVisibility(View.VISIBLE);
                } else {
                    lifeCount.setText(Integer.toString(count));
                }
            }
        });

        a5Button1 = (Button)findViewById(plus5Buttons[0]);
        a5Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView lifeCount = (TextView)findViewById(R.id.lives1);
                int count = Integer.parseInt(lifeCount.getText().toString());
                count = count + 5;
                lifeCount.setText(Integer.toString(count));
            }
        });

        // player2 buttons
        mButton2 = (Button)findViewById(minusButtons[1]);
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView lifeCount = (TextView)findViewById(R.id.lives2);
                int count = Integer.parseInt(lifeCount.getText().toString());
                count = count - 1;
                if (count <= 0) {
                    lifeCount.setText("0");
                    TextView loser = (TextView)findViewById(R.id.loser);
                    loser.setText("PLAYER 2 LOSES!!");
                    loser.setVisibility(View.VISIBLE);
                } else {
                    lifeCount.setText(Integer.toString(count));
                }
            }
        });

        aButton2 = (Button)findViewById(plusButtons[1]);
        aButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView lifeCount = (TextView)findViewById(R.id.lives2);
                int count = Integer.parseInt(lifeCount.getText().toString());
                count = count + 1;
                lifeCount.setText(Integer.toString(count));
            }
        });

        m5Button2 = (Button)findViewById(minus5Buttons[1]);
        m5Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView lifeCount = (TextView)findViewById(R.id.lives2);
                int count = Integer.parseInt(lifeCount.getText().toString());
                count = count - 5;
                if (count <= 0) {
                    lifeCount.setText("0");
                    TextView loser = (TextView)findViewById(R.id.loser);
                    loser.setText("PLAYER 2 LOSES!!");
                    loser.setVisibility(View.VISIBLE);
                } else {
                    lifeCount.setText(Integer.toString(count));
                }
            }
        });

        a5Button2 = (Button)findViewById(plus5Buttons[1]);
        a5Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView lifeCount = (TextView)findViewById(R.id.lives2);
                int count = Integer.parseInt(lifeCount.getText().toString());
                count = count + 5;
                lifeCount.setText(Integer.toString(count));
            }
        });

        // player3 buttons
        mButton3 = (Button)findViewById(minusButtons[2]);
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView lifeCount = (TextView)findViewById(R.id.lives3);
                int count = Integer.parseInt(lifeCount.getText().toString());
                count = count - 1;
                if (count <= 0) {
                    lifeCount.setText("0");
                    TextView loser = (TextView)findViewById(R.id.loser);
                    loser.setText("PLAYER 3 LOSES!!");
                    loser.setVisibility(View.VISIBLE);
                } else {
                    lifeCount.setText(Integer.toString(count));
                }
            }
        });

        aButton3 = (Button)findViewById(plusButtons[2]);
        aButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView lifeCount = (TextView)findViewById(R.id.lives3);
                int count = Integer.parseInt(lifeCount.getText().toString());
                count = count + 1;
                lifeCount.setText(Integer.toString(count));
            }
        });

        m5Button3 = (Button)findViewById(minus5Buttons[2]);
        m5Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView lifeCount = (TextView)findViewById(R.id.lives3);
                int count = Integer.parseInt(lifeCount.getText().toString());
                count = count - 5;
                if (count <= 0) {
                    lifeCount.setText("0");
                    TextView loser = (TextView)findViewById(R.id.loser);
                    loser.setText("PLAYER 3 LOSES!!");
                    loser.setVisibility(View.VISIBLE);
                } else {
                    lifeCount.setText(Integer.toString(count));
                }
            }
        });

        a5Button3 = (Button)findViewById(plus5Buttons[2]);
        a5Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView lifeCount = (TextView)findViewById(R.id.lives3);
                int count = Integer.parseInt(lifeCount.getText().toString());
                count = count + 5;
                lifeCount.setText(Integer.toString(count));
            }
        });

        // player4 buttons
        mButton4 = (Button)findViewById(minusButtons[3]);
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView lifeCount = (TextView)findViewById(R.id.lives4);
                int count = Integer.parseInt(lifeCount.getText().toString());
                count = count - 1;
                if (count <= 0) {
                    lifeCount.setText("0");
                    TextView loser = (TextView)findViewById(R.id.loser);
                    loser.setText("PLAYER 4 LOSES!!");
                    loser.setVisibility(View.VISIBLE);
                } else {
                    lifeCount.setText(Integer.toString(count));
                }
            }
        });

        aButton4 = (Button)findViewById(plusButtons[3]);
        aButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView lifeCount = (TextView)findViewById(R.id.lives4);
                int count = Integer.parseInt(lifeCount.getText().toString());
                count = count + 1;
                lifeCount.setText(Integer.toString(count));
            }
        });

        m5Button4 = (Button)findViewById(minus5Buttons[3]);
        m5Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView lifeCount = (TextView)findViewById(R.id.lives4);
                int count = Integer.parseInt(lifeCount.getText().toString());
                count = count - 5;
                if (count <= 0) {
                    lifeCount.setText("0");
                    TextView loser = (TextView)findViewById(R.id.loser);
                    loser.setText("PLAYER 4 LOSES!!");
                    loser.setVisibility(View.VISIBLE);
                } else {
                    lifeCount.setText(Integer.toString(count));
                }
            }
        });

        a5Button4 = (Button)findViewById(plus5Buttons[3]);
        a5Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView lifeCount = (TextView)findViewById(R.id.lives4);
                int count = Integer.parseInt(lifeCount.getText().toString());
                count = count + 5;
                lifeCount.setText(Integer.toString(count));
            }
        });
    }
}
