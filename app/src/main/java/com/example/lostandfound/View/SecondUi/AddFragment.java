package com.example.lostandfound.View.SecondUi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;

import com.example.lostandfound.R;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;

import de.hdodenhof.circleimageview.CircleImageView;

class AddFragment extends FragmentInterface
{
    View rootView;
    CircleImageView imageView;
    TextView nameText;
    Spinner spinner;
    EditText descriptionOfItem;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        rootView = inflater.inflate(R.layout.add_fragment,container,false);
        init();
               return rootView;
    }

    private void init()
    {   descriptionOfItem=rootView.findViewById(R.id.postWrite);
        imageView = rootView.findViewById(R.id.profile_imageView);
        nameText = rootView.findViewById(R.id.user_name);
        spinner=rootView.findViewById(R.id.spinnerItems);
        SlidingUpPanelLayout slidingUpPanelLayout;
        slidingUpPanelLayout=rootView.findViewById(R.id.sliding_layout);

    }
}
