package com.mx.tvdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;
import java.util.List;

import reco.frame.tv.view.TvGridView;

public class FragmentA extends Fragment {
	private TvGridView tgv_imagelist;
	//	private TvGridAdapter adapter;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View parent = inflater.inflate(R.layout.frag_a, container, false);

		return parent;
	}

}
