package com.example.android.androidskeletonapp.ui.d2_errors;

import androidx.paging.PagedListAdapter;

import com.example.android.androidskeletonapp.ui.base.DiffByIdItemCallback;
import com.example.android.androidskeletonapp.ui.base.ListItemHolder;

import org.hisp.dhis.android.core.maintenance.D2Error;

public class D2ErrorAdapter extends PagedListAdapter<D2Error, ListItemHolder> {


    D2ErrorAdapter(){ super(new DiffByIdItemCallback<>());}
    


}
