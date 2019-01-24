package com.sumupur.miwok_language_app;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
class WordAdapter extends ArrayAdapter<word> {
    WordAdapter(Activity context, ArrayList<word> words) {
        super(context, 0, words);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listViewItem = convertView;
        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        word currentWord = getItem(position);
        TextView miwokWord = listViewItem.findViewById(R.id.miwok_text_view);
        TextView defaultWord = listViewItem.findViewById(R.id.default_text_view);
        assert currentWord != null;
        miwokWord.setText(currentWord.getMiwokTranslation());
        defaultWord.setText(currentWord.getDefaultTranslation());
        ImageView img = listViewItem.findViewById(R.id.imageview);
        if (currentWord.getImageResourceId() == 0) {
            img.setVisibility(View.GONE);
        } else {
            img.setVisibility(View.VISIBLE);
            img.setImageResource(currentWord.getImageResourceId());
        }
        return listViewItem;
    }
}
