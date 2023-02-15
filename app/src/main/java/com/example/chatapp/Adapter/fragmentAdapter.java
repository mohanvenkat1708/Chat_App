package com.example.chatapp.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chatapp.Fragments.CallsFragment;
import com.example.chatapp.Fragments.ChatFragment;
import com.example.chatapp.Fragments.StoriesFragment;

public class fragmentAdapter extends FragmentPagerAdapter {
    public fragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0: return new ChatFragment();

            case 1: return new CallsFragment();

            case 2: return new StoriesFragment();

            default: return new ChatFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position){

        String title=null;
        if(position==0)
        {
            title="CHAT";
        }
        if(position==1)
        {
            title="STORIES";
        }
        if(position==0)
        {
            title="CALLS";
        }

        return title;
    }
}
