package org.ecaib.parkingsbcn;

import android.app.Application;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.client.Firebase;
import com.firebase.ui.FirebaseListAdapter;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private FirebaseListAdapter<Park> adapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        ListView lvParkings = (ListView) view.findViewById(R.id.lvParkings);

        MyApp app = (MyApp) getActivity().getApplication();
        Firebase ref = app.getRef();

        Firebase parkings = ref.child("parkings");

        adapter = new FirebaseListAdapter<Park>(getActivity(), Park.class, R.layout.row, parkings) {
            @Override
            protected void populateView(View view, Park parking, int position) {

                TextView tvName = (TextView) view.findViewById(R.id.tvName);
                tvName.setText(parking.getName());
            }
        };

        lvParkings.setAdapter(adapter);
        return view;

    }
}