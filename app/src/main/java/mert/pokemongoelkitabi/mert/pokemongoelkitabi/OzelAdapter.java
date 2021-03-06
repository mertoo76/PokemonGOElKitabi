package mert.pokemongoelkitabi.mert.pokemongoelkitabi;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import mert.pokemongoelkitabi.mert.pokemongoelkitabi.R;

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


if (convertView==null) {

    convertView = mInflater.inflate(R.layout.satir_layout, null);
}

    TextView textView =
            (TextView) convertView.findViewById(R.id.isim);

    ImageView imageView =
            (ImageView) convertView.findViewById(R.id.simge);

    String kisi = mKisiListesi.get(position);

    textView.setText(kisi);

    switch (position) {

        case 0:
            imageView.setImageResource(R.drawable.bir);
            break;
        case 1:
            imageView.setImageResource(R.drawable.iki);
            break;
        case 2:
            imageView.setImageResource(R.drawable.uc);
            break;
        case 3:
            imageView.setImageResource(R.drawable.dort);
            break;
        case 4:
            imageView.setImageResource(R.drawable.bes);
            break;
        case 5:
            imageView.setImageResource(R.drawable.alti);
            break;
        case 6:
            imageView.setImageResource(R.drawable.yedi);
            break;
        case 7:
            imageView.setImageResource(R.drawable.sekiz);
            break;
        case 8:
            imageView.setImageResource(R.drawable.dokuz);
            break;
        case 9:
            imageView.setImageResource(R.drawable.on);
            break;
        case 10:
            imageView.setImageResource(R.drawable.onbir);
            break;
        case 11:
            imageView.setImageResource(R.drawable.oniki);
            break;
        case 12:
            imageView.setImageResource(R.drawable.onuc);
            break;
        case 13:
            imageView.setImageResource(R.drawable.ondort);
            break;
        case 14:
            imageView.setImageResource(R.drawable.onbes);
            break;
        case 15:
            imageView.setImageResource(R.drawable.onalti);
            break;
        case 16:
            imageView.setImageResource(R.drawable.onyedi);
            break;
        case 17:
            imageView.setImageResource(R.drawable.onsekiz);
            break;
        case 18:
            imageView.setImageResource(R.drawable.ondokuz);
            break;
        case 19:
            imageView.setImageResource(R.drawable.yirmi);
            break;
        case 20:
            imageView.setImageResource(R.drawable.yirmibir);
            break;
        case 21:
            imageView.setImageResource(R.drawable.yirmiki);
            break;
        case 22:
            imageView.setImageResource(R.drawable.yirmiuc);
            break;
        case 23:
            imageView.setImageResource(R.drawable.yirmidort);
            break;
        case 24:
            imageView.setImageResource(R.drawable.yirmibes);
            break;
        case 25:
            imageView.setImageResource(R.drawable.yirmialti);
            break;
        case 26:
            imageView.setImageResource(R.drawable.yirmiyedi);
            break;
        case 27:
            imageView.setImageResource(R.drawable.yirmisekiz);
            break;
        case 28:
            imageView.setImageResource(R.drawable.yirmidokuz);
            break;
        case 29:
            imageView.setImageResource(R.drawable.otuz);
            break;
        case 30:
            imageView.setImageResource(R.drawable.otuzbir);
            break;
        case 31:
            imageView.setImageResource(R.drawable.otuziki);
            break;
        case 32:
            imageView.setImageResource(R.drawable.otuzuc);
            break;
        case 33:
            imageView.setImageResource(R.drawable.otuzdort);
            break;
        case 34:
            imageView.setImageResource(R.drawable.otuzbes);
            break;

        case 35:
            imageView.setImageResource(R.drawable.otuzalti);
            break;
        case 36:
            imageView.setImageResource(R.drawable.otuzyedi);
            break;
        case 37:
            imageView.setImageResource(R.drawable.otuzsekiz);
            break;
        case 38:
            imageView.setImageResource(R.drawable.otuzdokuz);
            break;
        case 39:
            imageView.setImageResource(R.drawable.kirk);
            break;
        case 40:
            imageView.setImageResource(R.drawable.kirkbir);
            break;
        case 41:
            imageView.setImageResource(R.drawable.kirkiki);
            break;
        case 42:
            imageView.setImageResource(R.drawable.kirkuc);
            break;
        case 43:
            imageView.setImageResource(R.drawable.kirkdort);
            break;
        case 44:
            imageView.setImageResource(R.drawable.kirkbes);
            break;
        case 45:
            imageView.setImageResource(R.drawable.kirkalti);
            break;
        case 46:
            imageView.setImageResource(R.drawable.kirkyedi);
            break;
        case 47:
            imageView.setImageResource(R.drawable.kirksekiz);
            break;
        case 48:
            imageView.setImageResource(R.drawable.kirkdokuz);
            break;
        case 49:
            imageView.setImageResource(R.drawable.elli);
            break;
        case 50:
            imageView.setImageResource(R.drawable.ellibir);
            break;
        case 51:
            imageView.setImageResource(R.drawable.elliki);
            break;
        case 52:
            imageView.setImageResource(R.drawable.elliuc);
            break;
        case 53:
            imageView.setImageResource(R.drawable.ellidort);
            break;
        case 54:
            imageView.setImageResource(R.drawable.ellibes);
            break;
        case 55:
            imageView.setImageResource(R.drawable.ellialti);
            break;
        case 56:
            imageView.setImageResource(R.drawable.elliyedi);
            break;
        case 57:
            imageView.setImageResource(R.drawable.ellisekiz);
            break;
        case 58:
            imageView.setImageResource(R.drawable.ellidokuz);
            break;
        case 59:
            imageView.setImageResource(R.drawable.altmis);
            break;
        case 60:
            imageView.setImageResource(R.drawable.altmisbir);
            break;
        case 61:
            imageView.setImageResource(R.drawable.altmisiki);
            break;

        case 62:
            imageView.setImageResource(R.drawable.altmisuc);
            break;
        case 63:
            imageView.setImageResource(R.drawable.altmisdort);
            break;
        case 64:
            imageView.setImageResource(R.drawable.altmisbes);
            break;
        case 65:
            imageView.setImageResource(R.drawable.altmisalti);
            break;
        case 66:
            imageView.setImageResource(R.drawable.altmisyedi);
            break;
        case 67:
            imageView.setImageResource(R.drawable.altmisekiz);
            break;
        case 68:
            imageView.setImageResource(R.drawable.altmisdokuz);
            break;
        case 69:
            imageView.setImageResource(R.drawable.yetmis);
            break;
        case 70:
            imageView.setImageResource(R.drawable.yetmisbir);
            break;
        case 71:
            imageView.setImageResource(R.drawable.yetmisiki);
            break;
        case 72:
            imageView.setImageResource(R.drawable.yetmisuc);
            break;
        case 73:
            imageView.setImageResource(R.drawable.yetmisdort);
            break;
        case 74:
            imageView.setImageResource(R.drawable.yetmisbes);
            break;
        case 75:
            imageView.setImageResource(R.drawable.yetmisalti);
            break;
        case 76:
            imageView.setImageResource(R.drawable.yetmisyedi);
            break;
        case 77:
            imageView.setImageResource(R.drawable.yetmisekiz);
            break;
        case 78:
            imageView.setImageResource(R.drawable.yetmisdokuz);
            break;
        case 79:
            imageView.setImageResource(R.drawable.seksen);
            break;

        case 80:
            imageView.setImageResource(R.drawable.seksenbir);
            break;
        case 81:
            imageView.setImageResource(R.drawable.sekseniki);
            break;
        case 82:
            imageView.setImageResource(R.drawable.seksenuc);
            break;
        case 83:
            imageView.setImageResource(R.drawable.seksendort);
            break;

        case 84:
            imageView.setImageResource(R.drawable.seksenbes);
            break;

        case 85:
            imageView.setImageResource(R.drawable.seksenalti);
            break;

        case 86:
            imageView.setImageResource(R.drawable.seksenyedi);
            break;

        case 87:
            imageView.setImageResource(R.drawable.seksensekiz);
            break;

        case 88:
            imageView.setImageResource(R.drawable.seksendokuz);
            break;

        case 89:
            imageView.setImageResource(R.drawable.doksan);
            break;

        case 90:
            imageView.setImageResource(R.drawable.doksanbir);
            break;

        case 91:
            imageView.setImageResource(R.drawable.doksaniki);
            break;

        case 92:
            imageView.setImageResource(R.drawable.doksanuc);
            break;

        case 93:
            imageView.setImageResource(R.drawable.doksandort);
            break;

        case 94:
            imageView.setImageResource(R.drawable.doksanbes);
            break;
        case 95:
            imageView.setImageResource(R.drawable.doksanalti);
            break;
        case 96:
            imageView.setImageResource(R.drawable.doksanyedi);
            break;
        case 97:
            imageView.setImageResource(R.drawable.doksansekiz);
            break;
        case 98:
            imageView.setImageResource(R.drawable.doksandokuz);
            break;

        case 99:
            imageView.setImageResource(R.drawable.yuz);
            break;

        case 100:
            imageView.setImageResource(R.drawable.yuzbir);
            break;

        case 101:
            imageView.setImageResource(R.drawable.yuziki);
            break;

        case 102:
            imageView.setImageResource(R.drawable.yuzuc);
            break;

        case 103:
            imageView.setImageResource(R.drawable.yuzdort);
            break;

        case 104:
            imageView.setImageResource(R.drawable.yuzbes);
            break;

        case 105:
            imageView.setImageResource(R.drawable.yuzalti);
            break;
        case 106:
            imageView.setImageResource(R.drawable.yuzyedi);
            break;
        case 107:
            imageView.setImageResource(R.drawable.yuzsekiz);
            break;
        case 108:
            imageView.setImageResource(R.drawable.yuzdokuz);
            break;
        case 109:
            imageView.setImageResource(R.drawable.yuzon);
            break;
        case 110:
            imageView.setImageResource(R.drawable.yuzonbir);
            break;
        case 111:
            imageView.setImageResource(R.drawable.yuzoniki);
            break;
        case 112:
            imageView.setImageResource(R.drawable.yuzonuc);
            break;
        case 113:
            imageView.setImageResource(R.drawable.yuzondort);
            break;
        case 114:
            imageView.setImageResource(R.drawable.yuzonbes);
            break;
        case 115:
            imageView.setImageResource(R.drawable.yuzonalti);
            break;
        case 116:
            imageView.setImageResource(R.drawable.yuzonyedi);
            break;
        case 117:
            imageView.setImageResource(R.drawable.yuzonsekiz);
            break;
        case 118:
            imageView.setImageResource(R.drawable.yuzondokuz);
            break;
        case 119:
            imageView.setImageResource(R.drawable.yuzyirmi);
            break;
        case 120:
            imageView.setImageResource(R.drawable.yuzyirmibir);
            break;
        case 121:
            imageView.setImageResource(R.drawable.yuzyirmiki);
            break;
        case 122:
            imageView.setImageResource(R.drawable.yuzyirmiuc);
            break;
        case 123:
            imageView.setImageResource(R.drawable.yuzyirmidort);
            break;
        case 124:
            imageView.setImageResource(R.drawable.yuzyirmibes);
            break;
        case 125:
            imageView.setImageResource(R.drawable.yuzyirmialti);
            break;
        case 126:
            imageView.setImageResource(R.drawable.yuzyirmiyedi);
            break;
        case 127:
            imageView.setImageResource(R.drawable.yuzyirmisekiz);
            break;
        case 128:
            imageView.setImageResource(R.drawable.yuzyirmidokuz);
            break;
        case 129:
            imageView.setImageResource(R.drawable.yuzotuz);
            break;
        case 130:
            imageView.setImageResource(R.drawable.yuzotuzbir);
            break;
        case 131:
            imageView.setImageResource(R.drawable.yuzotuziki);
            break;
        case 132:
            imageView.setImageResource(R.drawable.yuzotuzuc);
            break;
        case 133:
            imageView.setImageResource(R.drawable.yuzotuzdort);
            break;
        case 134:
            imageView.setImageResource(R.drawable.yuzotuzbes);
            break;
        case 135:
            imageView.setImageResource(R.drawable.yuzotuzalti);
            break;


    }



    return convertView;

    }
}
