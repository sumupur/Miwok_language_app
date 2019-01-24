package com.sumupur.miwok_language_app;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);final ArrayList<word> words = new ArrayList<>();
        words.add (new word("one","lutti",R.drawable.number_one,R.raw.number_one));
        words.add (new word("two","otiiko",R.drawable.number_two,R.raw.number_two));
        words.add (new word("three","tolookosu",R.drawable.number_three,R.raw.number_three));
        words.add (new word("four","oyyisa",R.drawable.number_four,R.raw.number_four));
        words.add (new word("five","massokka",R.drawable.number_five,R.raw.number_five));
        words.add (new word("six","temmokka",R.drawable.number_six,R.raw.number_six));
        words.add (new word("seven","kenekaku",R.drawable.number_seven,R.raw.number_seven));
        words.add (new word("eight","kawinta",R.drawable.number_eight,R.raw.number_eight));
        words.add (new word("nine","wo'e",R.drawable.number_nine,R.raw.number_nine));
        words.add (new word("ten","na'aacha",R.drawable.number_ten,R.raw.number_ten));
        WordAdapter adapter= new WordAdapter(this,words);
        ListView listView=findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                releaseMediaPlayer();
                word word=words.get(position);
                mMediaPlayer=MediaPlayer.create(NumbersActivity.this,word.getAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
    protected void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }
}
