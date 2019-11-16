package tr.com.mertkolgu.simpsonbook.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import tr.com.mertkolgu.simpsonbook.Model.Simpson;
import tr.com.mertkolgu.simpsonbook.R;

public class CustomAdapter extends ArrayAdapter<Simpson> {

    private ArrayList<Simpson> simpsons;
    private Activity context;

    public CustomAdapter(ArrayList<Simpson> simpsons, Activity context) {
        super(context, R.layout.custom_view, simpsons);
        this.simpsons = simpsons;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View customView = layoutInflater.inflate(R.layout.custom_view, null, true);
        TextView nameView = customView.findViewById(R.id.textViewCustom);
        nameView.setText(simpsons.get(position).getName());
        return customView;
    }
}
