package com.example.shoikat.birsrestho;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.shoikat.birsrestho.ViewPager.ViewPagerAdapter2;

import java.util.ArrayList;

public class BiruttomActivity extends AppCompatActivity {

    // Declare Variables
    ViewPager viewPager;
    PagerAdapter adapter;

    ArrayList<String []> listNameArray;
    String[] rank;
    String[] name1,name2, name3, name4, name5;

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biruttom);

        listNameArray=new ArrayList<>();


        // Generate sample data
        rank = new String[] { "1", "2", "3", "4", "5"};

        name1= new String[]{
                "১। মোহাম্মদ আবদুর রব" , "২। কাজী মুহাম্মদ সফিউল্লাহ", "৩। জিয়াউর রহমান",
                "৪। চিত্ত রঞ্জন দত্ত", "৫। কাজী নূরুজ্জামান", "৬। মীর শওকত আলী",
                "৭। খালেদ মোশাররফ", "৮। মোহাম্মদ আবুল মঞ্জুর", "৯। আবু তাহের", "১০। এ.এন.এম. নূরুজ্জামান",
                "১১। রফিকুল ইসলাম" , "১২। আবদুস সালেক চৌধুরী", "১৩। এ জে এম আমিনুল হক",
                "১৪। খাজা নিজাম উদ্দিন ভূঁইয়া", "১৫। হারুন আহমেদ চৌধুরী", "১৬। এ.টি.এম. হায়দার",};

        name2= new String[]{"১৭। মোহাম্মদ আবদুল গাফফার হালদার","১৮। শরীফুল হক (ডালিম)", "১৯। মোহাম্মদ শাহজাহান ওমর", "২০। মেহবুবুর রহামান",
                "২১। জিয়াউদ্দিন আহমেদ" , "২২। আফতাবুল কাদের", "২৩। মাহবুবুর রহমান",
                "২৪। সালাহউদ্দিন মমতাজ", "২৫। মোহাম্মদ আজিজুর রহমান", "২৬। এস এম ইমদাদুল হক", "২৭। মোহাম্মদ আনোয়ার হোসেন",
                "২৮। আবু মঈন মোহাম্মদ আশফাকুস সামাদ", "২৯। আফতাব আলী", "৩০। ফয়েজ আহমদ", "৩১। বেলায়েত হোসেন" , "৩২। মঈনুল হোসেন",};




      name3= new String[]{ "৩৩। হাবিবুর রহমান","৩৪। শাহে আলম", "৩৫। মোহাম্মদ নুরুল আমিন", "৩৬। নাসির উদ্দিন ",
              "৩৭। আবদুল মান্নান ","৩৮। আবদুল লতিফ মন্ডল", "৩৯। আবদুস সাত্তার ", "৪০।নূরুল হক ",
              "৪১।শামসুজ্জামান" , "৪২।সাফিল মিয়া", "৪৩।ফজলুর রহমান খন্দকার","৪৪।মজিবুর রহমান",
              "৪৫।শফিকউদ্দিন চৌধুরী", "৪৬।আবু তালেব", "৪৭।সালাহউদ্দিন আহমেদ",
              "৪৮।আনোয়ার হোসেন "};

      name4= new String[]{"৪৯। এরশাদ আলী", "৫০। মোজাহার উল্লাহ", "৫১। মোহাম্মদ জালাল উদ্দিন" , "৫২। আফজাল মিয়া", "৫৩। বদিউল আলম",
              "৫৪। সিরাজুল মওলা", "৫৫। আবদুল ওয়াহেদ চৌধুরী", "৫৬। মতিউর রহমান", "৫৭। মোহাম্মদ শাহ আলম",
              "৫৮। এ. কে. খন্দকার", "৫৯। মোহাম্মদ খাদেমুল বাশার", "৬০। সুলতান মাহমুদ", "৬১।শামসুল আলম" , "৬২।বদরুল আলম",
              "৬৩।লিয়াকত আলী খান ",
              "৬৪।সাহাবউদ্দিন আহমেদ"};



      name5= new String[]{ "৬৫। আকরাম আহমেদ", "৬৬। শরফুদ্দীন আহমেদ", "৬৭। মাসরুর-উল-হক সিদ্দিকী",
              "৬৮। আবদুল কাদের সিদ্দিকী"};

        listNameArray.add(name1);
        listNameArray.add(name2);
        listNameArray.add(name3);
        listNameArray.add(name4);
        listNameArray.add(name5);



       // listNameArray=new ArrayList[]{birBikromList1,birBikromList2,birBikromList3,birBikromList4,birBikromList5, birBikromList6, birBikromList7 };

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter2(BiruttomActivity.this, rank, listNameArray);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

    }

}
