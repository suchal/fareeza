package com.example.suchal.quiz.View;

/**
 * Created by Hashim Ali Khan on 1/4/2018.
 */
        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.Spinner;
        import android.widget.Toast;

        import com.example.suchal.quiz.R;
        import java.util.ArrayList;
        import java.util.List;
/**
 * Created by User on 2/28/2017.
 */
public class Tab1Fragment extends Fragment {
    private static final String TAG = "Make a Donation";
    private Button proceed;
    private Spinner type;
    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_fragment,container,false);
        proceed = (Button) view.findViewById(R.id.proceed);
        type=(Spinner) view.findViewById(R.id.donation_type);
        spinner_values();
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selected_type=type.getSelectedItem().toString();
                Toast.makeText(getActivity(), "You have selected "+selected_type,Toast.LENGTH_SHORT).show();
        }
        });
        return view;
    }
    public void spinner_values(){
        List list = new ArrayList();
        list.add("General");
        list.add("Normal");
        ArrayAdapter dataAdapter = new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_item,list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        type.setAdapter(dataAdapter);
    }
}

