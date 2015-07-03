package lth.debt.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import lth.debt.R;

/**
 * Created by Carl on 2015-06-29.
 */
public class DebtFragment extends Fragment {
    private static final int PICK_CONTACT = 1001;


    public static DebtFragment newInstance() {
        DebtFragment fragment = new DebtFragment();
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.debt_fragment, container, false);
        Button b = (Button) rootView.findViewById(R.id.add_recipient);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it= new Intent(Intent.ACTION_PICK,  Contacts.CONTENT_URI);
                int i =0;
                startActivityForResult(it, PICK_CONTACT);

            }
        });



        return rootView;
    }

}
