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
		tgv_imagelist = (TvGridView) parent.findViewById(R.id.tgv_imagelist);
		
//		List<AppInfo> appList = new ArrayList<AppInfo>();
//		for (int i = 0; i < 45; i++) {
//			AppInfo app = new AppInfo();
//			app.title = "全家盒框架" + i;
//			appList.add(app);
//
//		}
//		adapter = new TvGridAdapter(getActivity(), appList);
//		tgv_imagelist.setAdapter(adapter);
		return parent;
	}

}
