package com.cfox.jetnavigation.my;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavGraph;
import androidx.navigation.fragment.NavHostFragment;

import com.cfox.jetnavigation.R;

public class MyNavHost extends NavHostFragment {

    NavGraph graph;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        graph = getNavController().getGraph();
        graph.setStartDestination(R.id.my_self);
        getNavController().setGraph(graph);
    }
}
