package com.example.editfragmentlistview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_list#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_list extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_list() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragment_list.
     */
    // TODO: Rename and change types and number of parameters
    public static fragment_list newInstance(String param1, String param2) {
        fragment_list fragment = new fragment_list();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    ListView lvShoesFragment;
    ArrayList<Shose> shosesArrayList;

    ShoseAdapter shoseAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_list,container,false);

        lvShoesFragment = view.findViewById(R.id.lvshoesfragment);
        shosesArrayList = new ArrayList<>();
        shosesArrayList.
                add(new Shose(1,"Nike shoes-discount 50%",R.drawable.shoes_rm_preview_a,"Pls touch to see detail"));
        shosesArrayList.
                add(new Shose(2,"Nike shoes-discount 50%",R.drawable.shoes_rm_preview_b,"Pls touch to see detail"));


        shoseAdapter= new ShoseAdapter(getActivity(),R.layout.item_shose,shosesArrayList);
        lvShoesFragment.setAdapter(shoseAdapter);

        // Inflate the layout for this fragment
        return view;
    }
}