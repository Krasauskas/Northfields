package com.vytautaskrasauskas.northfields;

/**
 * Created by V Krasauskas on 05-Feb-18.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Random;


public class ShedFragment extends Fragment {

    public static final String TITLE = "Shed";
    private MyAdapter adapter = null;

    public static ShedFragment newInstance() {

        return new ShedFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.shed_fragment, container, false);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.shedList);
        rv.setHasFixedSize(true);
        adapter = new MyAdapter(getTrains(), getNumbers(), getPeople());
        rv.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);
        return view;
    }

    public int[] getTrains() {
        int[] trains = new int[19];
        for (int i =0; i < 19; i++) {
            trains[i] = i + 1;
        }
        return trains;
    }

    public String[] getNumbers() {
        String[] numbers = new String[19];
        Random ran = new Random();
        for (int i = 0; i < 19; i++) {
            numbers[i] = String.valueOf(ran.nextInt(899) + 100) + "-" + String.valueOf(ran.nextInt(899) + 100);
        }
        return numbers;
    }

    public String[] getPeople() {
        String [] people = new String[19];
        for (int i = 0; i < 19; i++) {
            people[i] = "PersonsName";
        }
        return people;
    }

}
