package sdu.cs.wongsathorn.testzoo;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView Image1, Image2, Image3,Image4,Image5;
    MediaPlayer mediaPlayer1, mediaPlayer2, mediaPlayer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Image1 = findViewById(R.id.imageView2);
        Image2 = findViewById(R.id.imageView3);
        Image3 = findViewById(R.id.imageView4);
        Image4 = findViewById(R.id.imageView5);
        Image5 = findViewById(R.id.imageView6);
    }

    public void playSound(View view) {
        mediaPlayer1.start();

        mediaPlayer1 = MediaPlayer.create(this, R.raw.elephant);
    }

    public void playSound2(View view) {
        mediaPlayer2.start();

        mediaPlayer2 = MediaPlayer.create(this, R.raw.horse);
    }

    public void playSound3(View view) {
        mediaPlayer3.start();

        mediaPlayer3 = MediaPlayer.create(this, R.raw.lion);
    }

    public void clickMobile(View view) {
        Intent mobileIntent = new Intent(Intent.ACTION_DIAL);
        mobileIntent.setData(Uri.parse("tel:0805714197"));
        startActivity(mobileIntent);
    }
    public void clickMap(View view) {
        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:13.216298,101.056642(สวนสัตว์เปิดเขาเขียว)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

    }

