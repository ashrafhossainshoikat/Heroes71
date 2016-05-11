package com.example.shoikat.birsrestho.ViewPager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.shoikat.birsrestho.R;

import java.util.ArrayList;

public class ViewPagerAdapter extends PagerAdapter {
	// Declare Variables
	Context context;
	String[] rank;
	String[] name;
	ArrayList<String []> listNameArray;





	LayoutInflater inflater;

	public ViewPagerAdapter(Context context, String[] rank, ArrayList<String []> listNameArray ) {
		this.context = context;
		this.rank = rank;
		this.name = name;
		this.listNameArray=listNameArray;


	}

	@Override
	public int getCount() {
		return rank.length;
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		return view == ((RelativeLayout) object);
	}


	public Object instantiateItem(ViewGroup container, int position) {

		// Declare Variables
		TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7,tv8,tv9,tv10;


		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View itemView = inflater.inflate(R.layout.viewpager_item, container,
				false);

        String[] names=listNameArray.get(position);



        tv1 = (TextView) itemView.findViewById(R.id.tv1);
        tv2 = (TextView) itemView.findViewById(R.id.tv2);
        tv3 = (TextView) itemView.findViewById(R.id.tv3);
        tv4 = (TextView) itemView.findViewById(R.id.tv4);
        tv5 = (TextView) itemView.findViewById(R.id.tv5);
        tv6 = (TextView) itemView.findViewById(R.id.tv6);
        tv7 = (TextView) itemView.findViewById(R.id.tv7);
        tv8 = (TextView) itemView.findViewById(R.id.tv8);
        tv9 = (TextView) itemView.findViewById(R.id.tv9);
        tv10 = (TextView) itemView.findViewById(R.id.tv10);

		tv1.setText(names[0]);
		tv2.setText(names[1]);
		tv3.setText(names[2]);
		tv4.setText(names[3]);
		tv5.setText(names[4]);
		tv6.setText(names[5]);
		tv7.setText(names[6]);
		tv8.setText(names[7]);
		tv9.setText(names[8]);
		tv10.setText(names[9]);

		// Add viewpager_item.xml to ViewPager
				((ViewPager) container).addView(itemView);

		return itemView;
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		// Remove viewpager_item.xml from ViewPager
		((ViewPager) container).removeView((RelativeLayout) object);

	}
}
