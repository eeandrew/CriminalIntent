package eeandrew.com.criminalintent;


import android.os.Bundle;
import android.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import eeandrew.com.criminalintent.Crime;

/**
 * A simple {@link Fragment} subclass.
 */
public class CrimeFragment extends Fragment {

    private EditText editTxt;
    private Button crimeDateBtn;
    private CheckBox crimeSolvedCheckbox;
    private Crime mCrime;
    private static String TAG = "CRIME_FRAGME";

    public CrimeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mCrime = new Crime();
        View view = inflater.inflate(R.layout.fragment_layout,container,false);
        populateComponent(view);
        return  view;
    }

    private void populateComponent(View group) {
        editTxt = (EditText)group.findViewById(R.id.crime_title);
        crimeDateBtn = (Button)group.findViewById(R.id.crime_date);
        crimeSolvedCheckbox = (CheckBox)group.findViewById(R.id.crime_solved);

        crimeDateBtn.setText("Test");
        crimeDateBtn.setEnabled(false);
        editTxt.addTextChangedListener(new TextListener());
        crimeSolvedCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                mCrime.setSolved(b);
                Log.d(TAG,String.valueOf(b));
            }
        });
    }

    private class TextListener implements TextWatcher {
        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            Log.d(TAG,charSequence.toString());
            mCrime.setTitle(charSequence.toString());
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }
    }


}
