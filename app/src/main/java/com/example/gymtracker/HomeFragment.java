package com.example.gymtracker;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.time.LocalDate;

import CalendarJava.CalendarDate;


public class HomeFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onStart() {
        //Setting HomeFragment values

        //Setting date TextView
        TextView dateTV = (TextView) getView().findViewById(R.id.date_TV);
        LocalDate date = LocalDate.now();
        dateTV.setText((date.getMonthValue()<10?"0"+date.getMonthValue():date.getMonthValue()) + "." + (date.getDayOfMonth()<10?"0"+date.getDayOfMonth():date.getDayOfMonth()));

        //CalendarDate.displayText(MainActivity.this, R.id.calendarMonthTv, "August");
        CalendarDate.setMonth(HomeFragment.this, R.id.calendar_month_TV);

        super.onStart();
    }
}