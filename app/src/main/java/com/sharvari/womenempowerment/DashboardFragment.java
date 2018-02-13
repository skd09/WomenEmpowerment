package com.sharvari.womenempowerment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SeekBar;

import com.sharvari.womenempowerment.Adapters.TaskAdapter;
import com.sharvari.womenempowerment.Pojo.Task;

import java.util.ArrayList;

/**
 * Created by sharvari on 12-Feb-18.
 */

public class DashboardFragment extends Fragment{
    private RecyclerView recyclerView;
    private ArrayList<Task> taskList;
    private TaskAdapter adapter;
    private SeekBar seekBar;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_dashboard, container, false);
        recyclerView = v.findViewById(R.id.recycler_view);

        seekBar = v.findViewById(R.id.seekbar);
        taskList = new ArrayList<>();
        taskList.add(new Task());
        taskList.add(new Task());
        taskList.add(new Task());
        taskList.add(new Task());
        taskList.add(new Task());
        taskList.add(new Task());

        adapter = new TaskAdapter(taskList, getContext());

        LinearLayoutManager manager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        return v;
    }
}
