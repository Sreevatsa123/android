package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        Word w= new Word("Father","әpә");
        words.add(w);
        words.add(new Word("mother",
                "әṭa"));
        words.add(new Word("son",
                "angsi"));
        words.add(new Word("daughter",
                "tune"));
        words.add(new Word("older brother",
                "taachi"));
        words.add(new Word("younger brother",
                "chalitti"));
        words.add(new Word("older sister",
                "teṭe"));
        words.add(new Word("younger sister",
                "kolliti"));
        words.add(new Word("grand mother",
                "ama"));
        words.add(new Word("grand father",
                "paapa"));
       /*pә
2
mother
әṭa
3
son
angsi
4
daughter
tune
5
older brother
taachi
6
younger brother
chalitti
7
older sister
teṭe
8
younger sister
kolliti
9
grandmother
ama
10
grandfather
paapa*/

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter itemsAdapter =
                new WordAdapter(this,words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);
    }
}