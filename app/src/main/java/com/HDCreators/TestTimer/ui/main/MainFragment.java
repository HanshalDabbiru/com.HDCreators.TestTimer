package com.HDCreators.TestTimer.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.HDCreators.TestTimer.MainActivity;
import com.HDCreators.TestTimer.R;
import com.HDCreators.TestTimer.SecondFragment;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.main_fragment, container, false);
        View satButton = rootView.findViewById(R.id.SATButton);
        satButton.setOnClickListener(v -> onSATClick(v));
        View actButton = rootView.findViewById(R.id.ACTButton);
        actButton.setOnClickListener(v -> onACTClick(v));
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
    }

    public void onSATClick(View view)
    {
        view.findViewById(R.id.SATButton);
        Intent intent = new Intent(MainFragment.this.getContext(), SecondFragment.class);
        MainFragment.this.startActivity(intent);
    }
    public void onACTClick(View view)
    {
        view.findViewById(R.id.SATButton);
        Intent intent = new Intent(MainFragment.this.getContext(), SecondFragment.class);
        MainFragment.this.startActivity(intent);
    }

}