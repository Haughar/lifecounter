package edu.uw.alihaugh.lifecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

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

        for(int i = 1; i < 5; i++) {
            mButtonObj[i - 1] = (Button)findViewById(minusButtons[i - 1]);
            mButtonObj[i - 1].setOnClickListener(new myListener(-1, i));

            aButtonObj[i - 1] = (Button)findViewById(plusButtons[i - 1]);
            aButtonObj[i - 1].setOnClickListener(new myListener(1, i));

            m5ButtonObj[i - 1] = (Button)findViewById(minus5Buttons[i - 1]);
            m5ButtonObj[i - 1].setOnClickListener(new myListener(-5, i));

            a5ButtonObj[i - 1] = (Button)findViewById(plus5Buttons[i - 1]);
            a5ButtonObj[i - 1].setOnClickListener(new myListener(5, i));
        }
    }

    public class myListener implements View.OnClickListener {
        public int change, playerNum;

        public myListener(int lifeChange, int player) {
            change = lifeChange;
            playerNum = player;
        }

        @Override
        public void onClick(View v) {
            TextView lifeCount = (TextView)findViewById(lifeCounts[playerNum - 1]);
            int count = Integer.parseInt(lifeCount.getText().toString());
            count = count + change;
            if (count <= 0) {
                lifeCount.setText("0");
                TextView loser = (TextView)findViewById(R.id.loser);
                loser.setText("PLAYER " + playerNum + " LOSES!!");
                loser.setVisibility(View.VISIBLE);
            } else {
                lifeCount.setText(Integer.toString(count));
            }
        }

    }
}
