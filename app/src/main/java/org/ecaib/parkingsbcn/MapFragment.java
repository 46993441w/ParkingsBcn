package org.ecaib.parkingsbcn;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.ecaib.parkingsbcn.R;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.views.MapView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MapFragment extends Fragment {


    private MapView map;

    public MapFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_map, container, false);

        map = (MapView) view.findViewById(R.id.map);
        map.setTileSource(TileSourceFactory.MAPQUESTOSM);
        map.setTilesScaledToDpi(true);

        map.setBuiltInZoomControls(true);
        map.setMultiTouchControls(true);

        return view;
    }

}
