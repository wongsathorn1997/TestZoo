package sdu.cs.wongsathorn.testzoo;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView Image1, Image2, Image3;
    MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Image1 = findViewById(R.id.imageView2);
        Image2 = findViewById(R.id.imageView3);
        Image3 = findViewById(R.id.imageView4);


        mediaPlayer1 = MediaPlayer.create(this, R.raw.elephant);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.horse);
        mediaPlayer3 = MediaPlayer.create(this, R.raw.lion);
    }

    public void playSound(View view) {
        mediaPlayer1.start();
    }

    public void playSound2(View view) {
        mediaPlayer2.start();
    }

    public void playSound3(View view) {
        mediaPlayer3.start();
    }
}
