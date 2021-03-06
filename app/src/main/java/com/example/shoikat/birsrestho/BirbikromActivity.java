package com.example.shoikat.birsrestho;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.shoikat.birsrestho.ViewPager.ViewPagerAdapter2;

import java.util.ArrayList;

public class BirbikromActivity extends AppCompatActivity {

    // Declare Variables
    ViewPager viewPager;
    PagerAdapter adapter;

    ArrayList<String []> listNameArray;
    String[] rank;
    String[] name1,name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12, name13, name14, name15, name16, name17, name18, name19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birbikrom);


        listNameArray=new ArrayList<String[]>();


        // Generate sample data
        rank = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};

        name1= new String[]{
                "১। খন্দকার নাজমুল হুদা" , "২। আবু সালেহ মোঃ নাসিম ", "৩। শাফায়াত জামিল",
                "৪। মইনুল হোসেন চৌধুরী", "৫। গিয়াস উদ্দিন আহমেদ চৌধুরী ", "৬। মহসীন উদ্দিন আহমেদ ",
                "৭। আমীন আহম্মেদ চৌধুরী", "৮। এম.এ.আর আজম চৌধুরী ", "৯। মোস্তাফিজুর রহমান ", "১০। হাফিজ উদ্দিন আহমেদ ",
                "১১। অলি আহমেদ" , "১২। জাফর ইমাম ", "১৩। এ.ওয়াই. মাহফুজুর রহমান ",
                "১৪। মেহেদী আলী ইমাম", "১৫। এস.এইচ.এম.বি. নূর চৌধুরী", "১৬।ইমামুজ্জামান ",};

        name2= new String[]{"১৭। এস.আই.বি নুরুন্নবী খান ", "১৮। মতিউর রহমান", "১৯।আবদুল মান্নান ", "২০। গোলাম হেলাল মোর্শেদ খান",
                "২১। শমসের মবিন চৌধুরী" , "২২। আবদুর রউফ ", "২৩। খন্দকার আজিজুল ইসলাম ",
                "২৪। মেজাবাহ উদ্দিন আহমেদ ", "২৫। আবদুল জব্বার পাটোয়ারী  ", "২৬। আবদুল ওহাব ",
                "২৭। আবদুস শুকুর ", "২৮। আব্দুল করিম ", "২৯। ওয়ালিউল্লাহ  ", "৩০। মোহাম্মদ আমানুল্লাহ",
                "৩১। মোহাম্মদ ইব্রাহীম " , "৩২। ভুলু মিঞা  "};

        name3= new String[]{
                "৩৩। আবদুস সালাম","৩৪। এম.এ.মান্নান ", "৩৫। আবদুল হক ভুঁইয়া  ", "৩৬। ইয়ার আহমেদ",
                "৩৭। আবদুল মালেক", "৩৮। শহীদুল্লাহ ভুঁইয়া  ", "৩৯। আবদুল হাসেম  ", "৪০। আবদুল হক",
                "৪১। নূর আহমেদ গাজী" , "৪২। আশরাফ আলী খান ", "৪৩। শামসুল হক",
                "৪৪। জনাব আলী", "৪৫। নূরুল হক ", "৪৬। আবদুল হালিম  ",
                "৪৭। নূরুল ইসলাম ", "৪৮। রফিকুল ইসলাম "};

        name4= new String[]{
                "৪৯। রুহুল আমিন ", "৫০। আফজাল হোসেন (সৈয়দ) ", "৫১। রাঙ্গা মিয়া " , "৫২। সকিম উদ্দিন", "৫৩। গোলাম রসূল ",
                "৫৪। তাহের", "৫৫। আফসার আলী ","৫৬। আবদুল হক ", "৫৭। আবদুল মোতালেব  ",
                "৫৮। নূরুজ্জামান  ","৫৯। তৌহিদুল্লাহ ", "৬০। আবদুর রহমান ",  "৬১। মোহর আলী  " , "৬২। আবদুল খালেক", "৬৩। আবদুর রব চৌধুরী ",
                "৬৪। মোহাম্মদ মোস্তাফা" };

        name5= new String[]{ "৬৫। সিরাজুল ইসলাম","৬৬। আবদুল বারেক  ", "৬৭। আবুল কালাম আজাদ ","৬৮। দেলোয়ার হোসেন ",
                "৬৯। তারা উদ্দিন  ", "৭০। আবদুল আজিজ",  "৭১। মোহাম্মদ সানাউল্লাহ " , "৭২। গোলাম মোস্তফা কামাল ",
                "৭৩। খন্দকার রেজানুর হোসেন","৭৪। হায়দার আলী ", "৭৫। আবুল কালাম আজাদ","৭৬। জামাল উদ্দিন  ", "৭৭। আবদুর রহিম  ",
                "৭৮। নূরুল ইসলাম ভূঁইয়া  ","৭৯। আবদুল মান্নান  ", "৮০। আলী আশরাফ" };


        name6= new String[]{"৮১। মজিবুর রহমান " , "৮২। আবদুল হক ", "৮৩। রমজান আলী",
                "৮৪। হেমায়েত উদ্দিন ", "৮৫। নূরুল ইসলাম ","৮৬। আবদুল খালেক  ", "৮৭। সিরাজুল হক ",
                "৮৮। রমিজ উদ্দিন  ","৮৯। তমিজ উদ্দিন  ", "৯০। এলাহী বক্স পাটোয়ারী ", "৯১। ফকরুদ্দিন আহমেদ চৌধুরী " ,
                "৯২। খন্দকার মতিয়ার রহমান  ", "৯৩। মনিরুজ্জামান ","৯৪। সুলতান আহমেদ ", "৯৫। সৈয়দ আমিরুজ্জামান ","৯৬। আবদুল হাকিম "};

        name7= new String[]{
                 "৯৭। জামান মিয়া  ","৯৮। আবদুস সালাম","৯৯। নাজিমুদ্দিন  ", "১০০। ইউ কে সিং ",
                "১০১। আনিস মোল্লা" , "১০২। কামরুজ্জামান খলিফা  ", "১০৩। আরব আলী ",
                "১০৪। নূরুল ইসলাম   ", "১০৫। তারিক উল্লাহ  ","১০৬। দেলোয়ার হোসেন ", "১০৭| আজিজুল হক ",
                "১০৮| মোজাফ্ফর আহমেদ ","১০৯| আবুল কাশেম   ", "১১০| আবদুল মালেক ", "১১১| শাহ আলী" , "১১২| মফিজ উদ্দিন আহমেদ "};

        name8= new String[]{"১১৩| জিল্লুর রহমান ","১১৪| লিলু মিঞা  ", "১১৫| নিজাম উদ্দিন  ","১১৬| আবুল খায়ের", "১১৭| আবদুস ছাত্তার",
                "১১৮| আবুল বাসার ","১১৯| আবদুল মজিদ  ", "১২০| আনসার আলী",    "১২১| মোহাম্মদ উল্লাহ" , "১২২| আতাহার আলী মল্লিক ", "১২৩| আবদুল মোতালিব ",
                "১২৪| সেরাজ মিঞা ", "১২৫| আবদুল আজিম  ","১২৬| মোহাম্মদ মহসীন", "১২৭| আমিনউল্লাহ্ শেখ",
                "১২৮| এম. এইচ. মোল্লা "};

        name9= new String[]{
                "১২৯| মহিবুল্লাহ ", "১৩০| ফরিদ উদ্দিন আহমেদ",  "১৩১| মোহাম্মদ আবদুল মালেক" , "১৩২| মোহাম্মদ আব্দুর রহমান ",
                "১৩৩| এ. ডব্লিউ. চৌধুরী","১৩৪| আবদুর রকিব মিঞা", "১৩৫| সৈয়দ মনসুর আলী","১৩৬| আবদুল মান্নান", "১৩৭| তৌহিদ",
                "১৩৮| মাহবুব উদ্দিন আহমেদ","১৩৯| মোহাম্মদ শাহজাহান সিদ্দিকী", "১৪০| কবিরুজ্জামান",
                "১৪১| মোফাজ্জল হোসেন চৌধুরী মায়া" , "১৪২| আবুল কাশেম ভূঁইয়া", "১৪৩| আব্দুস সালাম",
                "১৪৪| আবদুস সবুর খান"};


        name10= new String[]{"১৪৫| কামরুল হক (স্বপন)","১৪৬| কাজী কামাল উদ্দিন", "১৪৭| শাফী ইমাম (রুমী)",
                "১৪৮| আবদুল হালিম চৌধুরী জুয়েল","১৪৯| বদিউল আলম (বদি)", "১৫০| মোহাম্মদ আবু বকর",
                "১৫১| মোহাম্মদ শাহাবুদ্দিন" , "১৫২| মাহ্মুদ হোসেন", "১৫৩| নিলমণি সরকার",
                "১৫৪| জগত জ্যোতি দাস", "১৫৫| সিরাজুল ইসলাম","১৫৬| ইয়ামিন চৌধুরী", "১৫৭| মতিউর রহমান",
                "১৫৮| আব্দুস সামাদ","১৫৯| এ.টি.এম হামিদুল হোসাইন", "১৬০| আবুবকর সিদ্দিকী"};



        name11= new String[]{"১৬১| মোহাম্মদ ইদ্রিস আলী খান" , "১৬২| মোহাম্মদ খালিদ সাইফুদ্দিন", "১৬৩| এম.এ. মান্নান",
                "১৬৪| তৌফিক এলাহী চৌধুরী", "১৬৫| খিজির আলী","১৬৬| আলতাফ হোসাইন", "১৬৭| মোহাম্মদ ইউসুফ",
                "১৬৮| মোহাম্মদ খুররাম","১৬৯| মোহাম্মদ জালাল উদ্দিন", "১৭০| আমানুল্লাহ কবির",  "১৭১| নূর ইসলাম" ,
                "১৭২| শওকত আলী সরকার", "১৭৩| আবুল কালাম আজাদ",
                "১৭৪| মোহাম্মদ শাহ্জাহান", "১৭৫| মোহাম্মদ হাবিবুর রহমান" };

        listNameArray.add(name1);
        listNameArray.add(name2);
        listNameArray.add(name3);
        listNameArray.add(name4);
        listNameArray.add(name5);
        listNameArray.add(name6);
        listNameArray.add(name7);
        listNameArray.add(name8);
        listNameArray.add(name9);
        listNameArray.add(name10);
        listNameArray.add(name11);


        // listNameArray=new ArrayList[]{birBikromList1,birBikromList2,birBikromList3,birBikromList4,birBikromList5, birBikromList6, birBikromList7 };

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ViewPagerAdapter2(BirbikromActivity.this, rank, listNameArray);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);



    }

}
