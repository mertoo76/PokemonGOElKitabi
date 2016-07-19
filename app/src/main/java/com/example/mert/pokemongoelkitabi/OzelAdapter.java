package com.example.mert.pokemongoelkitabi;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mert on 19.07.2016.
 */
public class OzelAdapter extends BaseAdapter {



    private LayoutInflater mInflater;
    private List<String> mKisiListesi;

    public OzelAdapter(Activity activity, List<String> kisiler) {
        //XML'i alıp View'a çevirecek inflater'ı örnekleyelim
        mInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        //gösterilecek listeyi de alalım
        mKisiListesi = kisiler;
    }

    @Override
    public int getCount() {
        return mKisiListesi.size();
    }

    @Override
    public String getItem(int position) {
        //şöyle de olabilir: public Object getItem(int position)
        return mKisiListesi.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View satirView;



        satirView = mInflater.inflate(R.layout.satir_layout, null);
        TextView textView =
                (TextView) satirView.findViewById(R.id.isim);
        ImageView imageView =
                (ImageView) satirView.findViewById(R.id.simge);

        String kisi = mKisiListesi.get(position);

        textView.setText(kisi);

        switch (position){

            case 0:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 1:
                imageView.setImageResource(R.drawable.oniki);
                break;
            case 2:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 3:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 4:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 5:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 6:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 7:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 8:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 9:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 10:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 11:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 12:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 13:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 14:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 15:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 16:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 17:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 18:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 19:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 20:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 21:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 22:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 23:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 24:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 25:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 26:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 27:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 28:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 29:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 30:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 31:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 32:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 33:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 34:
                imageView.setImageResource(R.drawable.bir);
                break;

            case 35:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 36:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 37:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 38:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 39:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 40:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 41:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 42:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 43:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 44:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 45:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 46:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 47:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 48:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 49:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 50:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 51:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 52:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 53:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 54:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 55:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 56:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 57:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 58:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 59:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 60:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 61:
                imageView.setImageResource(R.drawable.bir);
                break;

            case 62:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 63:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 64:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 65:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 66:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 67:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 68:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 69:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 70:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 71:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 72:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 73:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 74:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 75:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 76:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 77:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 78:
                imageView.setImageResource(R.drawable.bir);
                break;
            case 79:
                imageView.setImageResource(R.drawable.bir);
                break;


        }


        return satirView;
    }
}
