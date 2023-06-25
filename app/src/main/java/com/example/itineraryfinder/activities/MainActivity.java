package com.example.itineraryfinder.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.itineraryfinder.Adapter.ItemsAdapter;
import com.example.itineraryfinder.Domain.ItemsDomain;
import com.example.itineraryfinder.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPopular, adapterNew;
    private RecyclerView recyclerViewPopular, recyclerViewNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerview();
    }

    private void initRecyclerview() {
        ArrayList<ItemsDomain> ItemsArrayList=new ArrayList<>();

        ItemsArrayList.add(new ItemsDomain("Goa is Calling You!", "Goa, India", "Wondering how to plan a 5 days trip to Goa? Be it a family holiday, vaction with friends. Goa packs the punch for all kind of travelers.\n"+"DAY 1: Arrival in Goa. Transfer to hotel and Leisure Day\n"+"Once you reach the hotel, finish all the check-in formalities so that you can rest for some time after your tiring journey. After a brief rest, you have the entire day at your disposal to do as you please. You can start off by visiting the near-by beaches and enjoy the sandy beaches and scenic beauty of Goa. The swaying coconut trees and laidback fishing villages will definitely set the tone of your vacation. Have dinner exploring there local food. End your Day 1 by heading back to the hotel and getting a good night’s sleep.\n"+"DAY 2: North Goa Tour\n"+"Start your Day 2 by enjoying a Dolphin sightseeing tour. Wake up early in the morning and head out to watch some beautiful dolphins entertaining you with their amazing somersaults on the majestic Arabian Sea. Then, return to your hotel for a hearty breakfast. After you are done with your breakfast, it’s time to explore all the popular tourist spots of North Goa. We begin by visiting Fort Aguada and then hitting all the popular beaches of North Goa which include the Coco Beach, Baga Beach, Anjuna Beach and Calangute Beach. You can spend some time at the Calangute Annexe as well.\n" +
                "\n" +
                "Your Day 2 itinerary ends here. You can head back to the hotel to relax and get a good night’s sleep so that you are bright and ready for your Day 3 of the tour.\n" +
                "\n" +
                "If you love and are excited about water sports, then make sure that you ask our representative to customize your tour package so that you can experience parasailing, banana ride, scuba diving, Jet Ski, and other water sport activities.\n"+"DAY 3: South Goa Tour\n"+"Begin your Day 3 with a scrumptious and heart breakfast as you would need all your energy for this full day tour of South Goa’s famous tourist spots. The colonial structures and the charming, laidback attitude of South Goa will make this entire day a joyful one. We start off by visiting the Shri Shantadurga Temple in Kavlem and then the Shri Maguesh Temple in Priol.\n" +
                "\n" +
                "From here we move on to Old Goa’s famous churches which include Basilicas of Bom Jesus and Se Cathedral. The colonial architecture of these churches will leave you spellbound! The next stop is the Dona Paula Bay where you can spend some time relaxing and then finish off your Day 3 at the Miramar Beach. After this fun-filled and exciting day, it’s time to return to your hotel for your overnight stay.\n"+"DAY 4: Goa- Leisure Day\n"+"Your Day 4 of this itinerary is designed as a day-off where you can explore Goa on your own. With the whole day at your disposal, we are sure you wouldn’t find it difficult to get the best out of Goa. After indulging in some of the yummy delicacies from the breakfast buffet, you can either relax and spend your day at the hotel or you can check out the street markets and flea markets. You will definitely find some good souvenirs to take back home.\n" +
                "\n" +
                "Do try out the delicious Goan delicacies which will definitely leave you wanting for more. Once your day has completed, return back to the hotel and unwind.\n"+"DAY 5: Goodbye Goa\n"+"Your last day in Goa is here and after having a delicious breakfast, it’s time to finish all check-out from the hotel for your journey home", "India",  "goa"));

        ItemsArrayList.add(new ItemsDomain("Heaven on Earth", "Kashmir, India",  "Embark on a vacation with this 4 nights, 5 days Kashmir tour package to Heaven on Earth, Kashmir. This 5-day Kashmir holiday will take you to Srinagar, where you will spend your evening in a shikara. Our Kashmir tour itinerary for 5 days covers Sonmarg, Gulmarg, and Pahalgam. Throughout your vacation, you will be enjoying several activities and amazing sightseeing. From glaciers to river valleys, this Kashmir holiday brings you time to treasure.\n"+"DAY 1: Arrival in Srinagar\n"+"Your arrival in Srinagar, the Summer Capital of Kashmir, is marked by an assisted transfer to the hotel from the airport/railway station. Once reached, check in to the hotel and unwind. Then, enjoy a shikara ride in Dal Lake in the evening.\n" +
                "\n" +
               "You can also stroll in the majestic Mughal Garden that outlines the lovely Dal Lake. The splendid garden includes Chashmi-e Shahi, Shalimar Bagh, and Nishat Bagh. These gardens are blessed with unique charm, further enhanced by spectacular details and Persian garden themes.\n" +
                "\n" +
                "After an enjoyable day, return to the hotel for a restful sleep.\n"+"DAY 2: Srinagar - Sonamarg (80 km/ 2.5 hours approx.)\n"+"After breakfast, checkout from the hotel. Proceed to Gulmarg as a part of your 5 days Kashmir tour package. As declared by CNN, Gulmarg is among the best ski destinations in Asia and is also the Heartland of Winter Sports in India. In addition, the town has been a shooting spot for various Bollywood movies such as Bobby, Jab Tak Hai Jaan, Haider, and Highway.\n" +
                "\n" +
                "Marvel at the scenic charm as you ride a ropeway to Khilanmarg. A pony ride also takes you across the picturesque expanses. Don’t miss out on enjoying the Gulmarg Gondola, which is the highest and longest cable car ropeway in Asia. Apart from this, indulge in adventure activities such as trekking, rock climbing, and skiing. To add to your sporting delight, here is one of the world’s highest golf courses, having 18 holes.\n" +
                "\n" +
                "Later, return to the hotel for an overnight stay.\n"+"DAY 3: Sonmarg - Gulmarg (125 km/ 3 hours approx.)\n"+"After breakfast, checkout from the hotel. Proceed to Gulmarg as a part of your 5 days Kashmir tour package. As declared by CNN, Gulmarg is among the best ski destinations in Asia and is also the Heartland of Winter Sports in India. In addition, the town has been a shooting spot for various Bollywood movies such as Bobby, Jab Tak Hai Jaan, Haider, and Highway.\n" +
                "\n" +
                "Marvel at the scenic charm as you ride a ropeway to Khilanmarg. A pony ride also takes you across the picturesque expanses. Don’t miss out on enjoying the Gulmarg Gondola, which is the highest and longest cable car ropeway in Asia. Apart from this, indulge in adventure activities such as trekking, rock climbing, and skiing. To add to your sporting delight, here is one of the world’s highest golf courses, having 18 holes.\n" +
                "\n" +
               "Later, return to the hotel for an overnight stay.\n"+"DAY 4: Gulmarg - Pahalgam (142 km/ 3.5 hours approx.)\n"+"Arise to a nutritious breakfast and checkout from the hotel. Then, get ready to proceed to Pahalgam on the day of your 5 days Kashmir tour. Standing on the banks of the Lidder River, this is a famous hill town in the valley. This is not only a visual treat, but for trekkers, this is a base for various trekking circuits. Additionally, you can get a dose of adrenaline rush by rafting in River Lidder or go for angling.\n" +
                "\n" +
                "Being wrapped by dense woods and foliage, Pahalgam offers proximity to attractions such as Betaab Valley, Anantnag, and Avantipur ruins. If time allows, go shopping to your heart’s content and buy home woolens, Pashmina shawls, wooden objects, handicrafts, and other souvenirs.\n" +
                "\n" +
                "After an eventful day, come back to the hotel for a comfortable sleep.\n"+"DAY 5: Departure from Srinagar\n"+"After breakfast, check the hotel and drive to Srinagar (approximately 90 km from Pahalgam). Get transferred to the Srinagar Airport/ Railway Station for your journey home.", "India",  "pic1"));

        ItemsArrayList.add(new ItemsDomain("God's Own Country", "Kerala, India", "Kerala is a land that is richly endowed with the best of nature. Be it its fine beaches, gorgeous hills, graceful lagoons or awe-inspiring art and culture, this southern state on the western coast of India has something for every kind of traveller. If you only have five days to spare, here is the ideal itinerary to get you started on your wanderlust-worthy trip to ‘God’s Own Country’.\n"+" DAY 1:Familiarise Yourself With Kerala At Kochi\n"+"Arrive in Kerala via Kochi by booking your tickets at the Cochin International Airport. Explore the city of Kochi and its most famous suburb, Fort Kochi, which is a treasure trove of art, culture and history. Begin by leaning all you can about Kerala through a visit to its museums, such as the Kerala Museum, the Kerala Folklore Theatre and Museum, the Hill Palace Museum and the Indo-Portuguese Museum. Move on to Fort Kochi and Mattancherry, where you can explore the Mattancherry Palace, the Paradesi Synagogue, the ancient curios and artifacts at Jew Town and waft through the Spice Bazaar, which is infused with the aromas of spices that have been traded across the world for centuries. Spend the evening watching the sunset at the Chinese Fishing Nets.\n"+"DAY 2: The Bewitching Hill Station Of Munnar\n"+"Travel to Munnar, the land of verdant hills and tea plantations. You can take an early morning bus at 5:20 am from Kerala State Road Transport Corporation (KSRTC) bus station in Kochi, which reaches Munnar by 9:30 am. Visit the Tea Museum, where you can learn all about the picking and processing of tea leaves. Move on to the actual tea plantations that surround the place. Take a trip to Eravikulam National Park to catch a sight of the indigenous Nilgiri Tahr. Head over to the Top Station for magnificent views of the surrounding hills and the villages far below. Don’t forget to buy different varieties of tea and original spices and honey.\n"+"DAY 3: Idle At The Divine Backwaters Of Alappuzha\n"+"Travel to the backwaters of Alappuzha, for which you will have to book a houseboat in advance. Take the 6:20 am bus from Munnar that reaches Alappuzha at 12:50 pm or drive down, which takes a little over five hours. Hop into your houseboat and cruise over the splendid lagoons. Known as the ‘Venice of the East’, the voyage via houseboat will take you through the sights and sounds of everyday village life. Relish in authentic delicacies, such as karimeen fry (pearl spot fish), and the local alcohol, toddy. To extend the experience, stay overnight on the houseboat. This is also an apt break that will give you some rest between your journeys.\n"+"DAY 4: Saunter Around At The Enticing Varkala Beach\n"+"Take the 8:15 am KSRTC bus, which reaches Varkala, the hippie hangout, at noon. Alternatively, driving down will be faster at less than three hours. This is another destination to relax in as you can laze by the famous Varkala Beach, drinking in the superb sights of the admirable cliffs that line it. Indulge in watersports and adventure activities, such as paragliding. Hang out at the cafes on top of the cliffs and catch a beautiful sunset as you bid adieu to the day.\n"+"DAY 5: Explore History And Culture In Kerala’s Capital, Thiruvananthapuram\n"+"At a distance of just 44 kilometres, there are constant buses from Varkala to Thiruvananthapuram that take about two hours to reach, so choose any bus in the morning, according to your convenience. Visit the richest temple in the world, the Sree Padmanabhaswamy Temple. Move on to the Kuthiramalika Palace (Mansion of Horses), a remnant of the rich royal history of Kerala. Spend the evening at Shankumugham Beach, marvelling at the beautiful sculpture of the mermaid, Sagarakanyaka. Conclude your trip in the capital of Kerala by booking your return flight from Trivandrum International Airport." ,"India", "pic2"));


        recyclerViewPopular=findViewById(R.id.viewPopular);
        recyclerViewNew=findViewById(R.id.viewNew);

        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
        recyclerViewNew.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterNew=new ItemsAdapter(ItemsArrayList);
        adapterPopular=new ItemsAdapter(ItemsArrayList);

        recyclerViewNew.setAdapter(adapterNew);
        recyclerViewPopular.setAdapter(adapterPopular);

    }
}