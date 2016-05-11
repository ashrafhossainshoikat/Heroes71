package com.example.shoikat.birsrestho.ViewPager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.shoikat.birsrestho.R;

import java.util.ArrayList;
import java.util.Arrays;

public class ViewPagerAdapter2 extends PagerAdapter {
	// Declare Variables
	Context context;
	String[] rank;
	String[] name;
	ArrayList<String []> listNameArray;





	LayoutInflater inflater;

	public ViewPagerAdapter2(Context context, String[] rank, ArrayList<String[]> listNameArray) {
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
		return view == ((LinearLayout) object);
	}


	public Object instantiateItem(ViewGroup container, int position) {

         ListView mainListView ;
         ArrayAdapter<String> listAdapter ;

        // Declare Variables
       	inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View itemView = inflater.inflate(R.layout.viewpager_item2, container,
				false);

        mainListView = (ListView) itemView.findViewById(R.id.mainListView);

        String[] names=listNameArray.get(position);
        ArrayList<String> planetList = new ArrayList<String>();
        planetList.addAll( Arrays.asList(names) );


        listAdapter = new ArrayAdapter<String>(context, R.layout.listviewitem, planetList);
        ListView listView = (ListView)itemView.findViewById(R.id.mainListView);
        // Set the ArrayAdapter as the ListView's adapter.
        mainListView.setAdapter( listAdapter );

        // Add viewpager_item.xml to ViewPager
				((ViewPager) container).addView(itemView);

		return itemView;
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		// Remove viewpager_item.xml from ViewPager
		((ViewPager) container).removeView((LinearLayout) object);

	}
}
