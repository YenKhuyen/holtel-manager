package com.example.knhotel.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.knhotel.Fragment.FragmentDichVu;
import com.example.knhotel.Fragment.FragmentHoaDon;
import com.example.knhotel.Fragment.FragmentSetting;
import com.example.knhotel.Fragment.FragmentTabDichVu;
import com.example.knhotel.Fragment.FragmentTabPhong;
import com.example.knhotel.Fragment.FragmentThongKe;
import com.example.knhotel.Fragment.Fragment_khachhang;

public class viewpagerAdapter extends FragmentStateAdapter {


    public viewpagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new FragmentHoaDon();
                break;
            case 1:
                fragment = new FragmentTabDichVu();
                break;
            case 2:
                fragment = new FragmentTabPhong();
                break;
            case 3:
                fragment = new Fragment_khachhang();
                break;
            case 4:
                fragment = new FragmentSetting();
                break;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
