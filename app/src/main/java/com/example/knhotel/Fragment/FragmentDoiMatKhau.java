package com.example.knhotel.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.knhotel.R;


public class FragmentDoiMatKhau extends Fragment {
    public FragmentDoiMatKhau() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(com.example.knhotel.R.layout.fragment_doimatkhau, container, false);
    }
}