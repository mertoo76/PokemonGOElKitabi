package com.example.mert.pokemongoelkitabi;

/**
 * pokemon bilgilerini burda tutuyorum. tıklanan positiona göre diziden bilgiyi çekiyorum
 * Created by mert on 19.07.2016.
 */
public class yazi {

    private String[] bilgi={"  Bulbasaur parlak güneş ışığında uyurken görülebilir. Sırtında bir tohum vardır. Güneş ışınlarını emerek sırtındaki tohum büyür.\n" +
            "Type (Tip): Grass (Çimen), Poison (Zehir)\n" +
            "Weaknesses (Zayıflıklar): Fire(Ateş), Flying (Uçan), İce (Buz), Psychic (Psişik)\n" +
            "Evolution (Evrimleşmiş Hali): Ivysaur\n","  Sırtında bir tomurcuk vardır. Vücut ağırlığını taşıyabilmek için bacakları ve gövdesi kalın ve güçlü şekilde büyür. Güneşte uzun zaman geçirmeye başlaması sırtındaki tomurcuğun çiçek açacağının göstergesidir. \n" +
            "Type (Tip): Grass (Çimen), Poison (Zehir)\n" +
            "Weaknesses (Zayıflıklar): Fire(Ateş), Flying (Uçan), İce (Buz), Psychic (Psişik)\n" +
            "Evolution (Evrimleşmiş Hali): Venusaur\n","  Venusaur’un sırtında büyük bir çiçek vardır. Çiçek iyi besin ve bol güneş ışığı alırsa canlı renkler aldığı bilinir. Çiçeğin kokusu insanların sinirlerini yatıştırır.\n" +
            "Type (Tip): Grass (Çimen), Poison (Zehir)\n" +
            "Weaknesses (Zayıflıklar): Fire(Ateş), Flying (Uçan), İce (Buz), Psychic (Psişik)\n","  Kuyruğunun ucunda yanan alev duygularının göstergesidir. Bir şeyden mutlu olduğunda bu alev titrer. Eğer pokemon sinirlenirse alev şiddetli bir şekilde yanar ve yakıcıdır. \n" +
            "Type (Tip): Fire (Ateş)\n" +
            "Weaknesses (Zayıflıklar): Ground (Toprak), Rock (Kaya), Water (Su)\n" +
            "Evolution (Evrimleşmiş Hali):Charmeleon\n","  Charmeleon düşmanlarını pençelerini kullanarak acımasızca yok eder. Güçlü bir düşmanla karşılaştığında sinirlenir. Bu durumda kuyruğunun ucundaki alev mavimsi beyaz bir renk alır.\n" +
            "Type (Tip):Fire (Ateş)\n" +
            "Weaknesses (Zayıflıklar): Ground (Toprak), Rock (Kaya), Water (Su)\n" +
            "Evolution (Evrimleşmiş Hali) :Charizard\n","  Charizard uçarak güçlü rakipler arar. Nefesinde her şeyi eriten güçlü bir alev vardır, ancak bu alevi kendinden güçsüz bir rakip için kullanmaz. \n" +
            "Type (Tip): Fire (Ateş), Flying (Uçan)\n" +
            "Weaknesses (Zayıflıklar): Rock (Kaya), Electric (Elektrik), Water (Su)\n","  Squirtle'ın kabuğu yalnızca korunma amaçlı değildir. Kabuğunun yuvarlak şekli ve yüzeyindeki oluklar suyun direncini en aza indirger ve çok hızlı yüzmesini sağlar. \n" +
            "Type (Tip): Water (Su) \n" +
            "Weaknesses (Zayıflıklar): Electric (Elektrik), Grass (Çimen)\n" +
            "Evolution (Evrimleşmiş Hali): Wartortle\n","  Kuyruğu büyüktür, sık ve kalın bir kürkle kaplıdır. Wartortle yaşlandıkça kuyruğunun rengi koyulaşır. Kabuğundaki çizikler ne kadar güçlü bir savaşçı olduğunu gösterir. \n" +
            "Type (Tip): Water (Su)\n" +
            "Weaknesses (Zayıflıklar): Electric (Elektrik), Grass (Çimen)\n" +
            "Evolution (Evrimleşmiş Hali): Blastoise\n","  Kabuğunda su fışkırtan fıskiyeler vardır. Bu fıskiyeler hedefe uygun atış yaparlar. Boş kutuları 160 feet (50 Metre) mesafeden vurabilecek kesinlikte su mermileri atar.\n" +
            "Type (Tip): Water (Su)\n" +
            "Weaknesses (Zayıflıklar): Electric (Elektrik), Grass (Çimen)\n","  Caterpie çok oburdur. Kendi cüssesinden büyük yaprakları yiyebilir. Kafasındaki anteninden çok güçlü bir koku yayar. \n" +
            "Type (Tip): Bug (Böcek)\n" +
            "Weaknesses (Zayıflıklar): Fire (Ateş), Flying (Uçan), Rock (Kaya)\n" +
            "Evolution (Evrimleşmiş Hali): Metapod\n","  Kabuğu metal bir levha kadar serttir. Fazla hareket eden bir pokemon değildir. Yumuşak bağırsaklarını sert kabuğunun içinde evrimleşmek için hazırlamak üzere sabit durur. \n" +
            "Type (Tip): Bug (Böcek)\n" +
            "Weaknesses (Zayıflıklar): Fire (Ateş), Flying (Uçan), Rock (Kaya)\n" +
            "Evolution (Evrimleşmiş Hali): Butterfree\n","  Butterfree’nin çiçeklerden lezzetli bal bulmak üzere gelişmiş bir yeteneği vardır. Yuvasından 6 mil uzaktaki çiçeklerden bal bulup, toplayıp, taşıyabilir. \n" +
            "Type (Tip): Bug (Böcek), Flying (Uçan)\n" +
            "Weaknesses (Zayıflıklar): Rock (Kaya), Electric (Elektrik), Fire (Ateş), Flying (Uçan), İce (Buz)\n","  Weedle’ın koku alma duyusu çok güçlüdür. Büyük kırmızı hortum şeklindeki burnu ile sevdiği yaprakları sevmediklerinden yalnızca koklayarak ayırt edebilir. \n" +
            "Type (Tip): Bug (Böcek), Poison (Zehir)\n" +
            "Weaknesses (Zayıflıklar): Fire (Ateş), Flying (Uçan), Psychic (Psişik), Rock (Kaya)\n" +
            "Evolution (Evrimleşmiş Hali): Kakuna\n","  Kakuna hareketsiz bir şekilde, ağaca tutunur halde durur, ancak gelecek evrimi için hazırlık yapmak üzere çok meşguldür. Bu durum, kabuğunun sıcaklığından anlaşılabilir.\n" +
            "Type (Tip): Bug (Böcek), Poison (Zehir)\n" +
            "Weaknesses (Zayıflıklar): Fire (Ateş), Flying (Uçan), Psychic (Psişik), Rock (Kaya)\n" +
            "Evolution (Evrimleşmiş Hali): Beedril\n","   Beedrill çok bölgeseldir. Kimse, kendi güvenliği için, yuvasına yaklaşmamalıdır. Kızdığı zaman büyük bir öfkeyle saldırır. \n" +
            "Type (Tip): Bug (Böcek), Poison (Zehir)\n" +
            "Weaknesse(Zayıflıkları): Fire (Ateş), Flying (Uçan), Psychic (Psişik), Rock (Kaya)\n","   Pidgey’nın yön duygusu çok gelişmiştir. Yakın çevresinden ayırılsa da yuvasına hatasız bir şekilde dönebilir. \n" +
            "Type (Tip): Normal (Normal), Flying (Uçan)\n" +
            "Weaknesses (Zayıflıklar): Electric (Elektrik), İce (Buz), Rock (Kaya)\n" +
            "Evolution (Evrimleşmiş Hali): Pidgeotto\n","   Bu pokemon geniş bir alanı kendi bölgesi olarak iddia eder. Uçarak kendi bölgesini kontrol eder. Eğer bölgesine girilirse düşmenina pençeleriyle acımadan saldırır. \n" +
            "Type (Tip): Normal (Normal), Flying (Uçan)\n" +
            "Weaknesses (Zayıflıklar): Electric (Elektrik), İce (Buz), Rock (Kaya)\n" +
            "Evolution (Evrimleşmiş Hali): Pidgeot\n","   Pidgeot’un parlak ve güzel tüyleri vardır. Birçok eğitmen Pidgeot’un kafasındaki tüylerin güzelliğinden etkilenerek pokemonları olarak onu seçmek zorunda kalır. \n" +
            "Type (Tip): Normal (Normal), Flying (Uçan)\n" +
            "Weaknesses (Zayıflıklar): Electric (Elektrik), İce (Buz), Rock (Kaya)\n","   Rattata oldukça tedbirlidir. Uyurken bile kulaklarını oynatarak etrafını dinler. Yaşadığı yer konusunda seçici değildir.\n" +
            "Type (Tip): Normal (Normal)\n" +
            "Weaknesses (Zayıflıklar): Fighting (Savaşmak)\n" +
            "Evolution (Evrimleşmiş Hali): Raticate\n","   Dişleri sağlamlaşarak büyür. Dişlerine düzgün bakmak için kayaları ısırır. \n" +
            "Type (Tip): Normal (Normal)\n" +
            "Weaknesses (Zayıflıklar): Fighting (Savaşmak)\n","  Spearow’un bağırması yarım mil uzaklıktan bile duyulabilecek kadar yüksektir. Yüksek sesle bağırmaları birbirlerini tehlikeye karşı uyardıklarının göstergesidir.  \n" +
            "Type (Tip): Normal (Normal), Flying (Uçan)\n" +
            "Weaknesses (Zayıflıklar): Electric (Elektrik), İce (Buz), Rock (Kaya)\n" +
            "Evolution (Evrimleşmiş Hali): Fearow\n","  Fearow’u uzun boynu ve gagasından tanıyabiliriz. Boynu ve gagası toprakta veya suda av yakalamak üzere şekillenmiştir. Avlanmak için uzun ve ince gagasını kullanır. \n" +
            "Type (Tip): Normal (Normal), Flying (Uçan)\n" +
            "Weaknesses (Zayıflıklar): Electric (Elektrik), İce (Buz), Rock (Kaya)\n","  Ekans dinlenirken kıvrılarak yatar. Bu yatış pozisyonu herhangi bir yönden gelebilecek bir tehdidi kaldırdığı kafasıyla hızlıca algılamasına olanak sağar. \n" +
            "Type (Tip): Poison (Zehir)\n" +
            "Weaknesses (Zayıflıklar): Ground (Toprak), Psychic (Psişik)\n" +
            "Evolution (Evrimleşmiş Hali): Arbok\n","  Bu pokemonun vücudu bir şeyleri sıkabilmek için oldukça güçlüdür. Düşmanını vücuduyla sardığı anda kaçmak imkansızdır. \n" +
            "Type (Tip): Poison (Zehir)\n" +
            "Weaknesses(Zayıflıklar): Ground (Toprak), Psychic (Psişik)\n","  Pikachu yeni bir şeyle karşılaştığında elektrik kıvılcımı çıkarır. Eğer kararmış bir Berry (Dut/Böğürtlen) görürseniz, Pikachu istemeden patlatmış olabilir. \n" +
            "Type (Tip): Electric (Elektrik)\n" +
            "Weaknesses (Zayıflıklar): Ground (Toprak)\n" +
            "Evolution (Evrimleşmiş Hali): Raichu\n","   Elektrik keseleri aşırı yüklenirse kuyruğunu toprağa sokarak deşarj olur. Yuvasının yakınlarında yerlerde hasarlar bulunur. \n" +
            "Type (Tip): Electric (Elektrik)\n" +
            "Weaknesses (Zayıflıklar): Ground (Toprak)\n","   Sandshrew’un bedeni suyu atıksız emmesine ve kurak çöllerde hayatta kalmasına olanak sağlayacak şekilde tasarlanmıştır. Düşmanlarından korunmak için kıvrılır.\n" +
            "Type (Tip): Ground (Toprak)\n" +
            "Weaknesses (Zayıflıklar): Grass (Çimen), İce (Buz), Water (Su)\n" +
            "Evolution (Evrimleşmiş Hali): Sandslash\n","   Vücudu katı sivriliklerle kaplıdır. Her yıl bir kere eski dikenleri dökülür ve alttan gelen yenileriyle kaplanır.\n" +
            "Type (Tip): Ground (Toprak)\n" +
            "Weaknesses (Zayıflıklar): Grass (Çimen), İce (Buz), Water (Su)\n","   Kuvvetli bir zehir salgılayan dikenleri vardır. Bu küçük cüsseli pokemonu korumak üzere geliştikleri söylenir. Sinirlendiğinde boynuzundan bir toksin salgılar. \n" +
            "Type (Tip): Poison (Zehir)\n" +
            "Weaknesses (Zayıflıkları): Ground (Toprak), Psychic (Psişik)\n" +
            "Evolution (Evrimleşmiş Hali): Nidorina\n","   Ailesi veya arkadaşları ile birlikteyken birbirlerini incitmemek için dikenlerini saklarlar. Çevresinden ayrılırsa tedirgin olur. \n" +
            "Type (Tip): Poison (Zehir)\n" +
            "Weaknesses (Zayıflıkları): Ground (Toprak), Psychic (Psişik)\n" +
            "Evolution (Evrimleşmiş Hali): Nidoqueen\n","  Vücudu sert ortamlara dayanıklıdır. Nidoqueen's body is encased in extremely hard scales. Düşmanlarını sert bir şekilde fırlatır. En güçlü halini yavrusunu savunurken alır.\n" +
            "Type (Tip): Poison (Zehir), Ground (Toprak)\n" +
            "Weaknesses (Zayıflıkları): Ground (Toprak), Ice (Buz), Psychic (Psişik), Water (Su)\n" +
            "\n","  Kulaklarını oynatabilmek için kasları gelişmiştir. Bu sayede kulakları her yönde oynayabilir. Bu pokemon hiçbir sesi kaçırmaz.\n" +
            "Type (Tip): Poison (Zehir)\n" +
            "Weaknesses (Zayıflıkları): Ground (Toprak), Psychic (Psişik)\n" +
            "Evolution (Evrimleşmiş Hali): Nidorino\n","  Nidorino’nun elmastan daha sert bir boynuzu vardır. Düşmanının varlığını hissettiğinde sırtındaki dikenler kalkar ve düşmanına hazır hale gelir. \n" +
            "Type (Tip): Poison (Zehir)\n" +
            "Weaknesses (Zayıflıkları): Ground (Toprak), Psychic (Psişik)\n" +
            "Evolution (Evrimleşmiş Hali): Nidoking\n","  Kalın kuyruğu yıkıcı güçtedir. Bir hamlesiyle metal bir kuleyi bile devirebilir. Öfkesi geri dönülmezdir. \n" +
            "Type (Tip): Poison (Zehir), Ground (Toprak)\n" +
            "Weaknesses (Zayıflıkları): Ground (Toprak), İce (Buz), Psychic (Psişik), Water (Su)\n","  Her dolunay gecesi bir grup Clefairy oynamaya çıkar. Şafak söktüğünde sessiz dağlarındaki yuvalarına gider ve beraber uyurlar.\n" +
            "Type (Tip): Fairy (Peri)\n" +
            "Weaknesses (Zayıflıkları): Steel (Çelik), Poison (Zehir)\n" +
            "Evolution (Evrimleşmiş Hali): Clefable\n","  Kanatlarını uçuyormul gibi hafifçe çırpar. Zıplayan adımları suda yürümesine olanak sağlar. Sessiz ve mehtaplı gecelerde göllerin üzerinde yürüyüş yapar. \n" +
            "Type (Tip): Fairy (Peri)\n" +
            "Weaknesses (Zayıflıkları): Steel (Çelik), Poison (Zehir)\n","   Doğduğunda bir tane beyaz kuyruğu vardır. Eğitmeninden sevgi görürse kuyruğu altı parçaya ayrılır. Altı kuyruğu da kıvrık bir şekil alır. \n" +
            "Type (Tip): Fire (Ateş)\n" +
            "Weaknesses (Zayıflıkları): Ground (Toprak), Rock (Kaya), Water (Su)\n" +
            "Evolution (Evrimleşmiş Hali): Ninetales\n","  Ninetales düşmanının zihnini ele geçirmek için kırmızı \n" +
            "Type (Tip): Fire (Ateş)\n" +
            "Weaknesses (Zayıflıkları): Ground (Toprak), Rock (Kaya), Water (Su)\n","   Jigglypuff’ın ses telleri sesinin dalga boyuna göre ayarlanabilir. Bu özelliğini düşmanlarını uyutacak dalga boyunda şarkı söylemek için kullanır.\n" +
            "Type (Tip): Normal (Normal), Fairy (Peri)\n" +
            "Weaknesses (Zayıflıkları): Steel (Çelik), Poison (Zehir)\n" +
            "Evolution (Evrimleşmiş Hali): Wigglytuff\n","  Büyük gözleri vardır. Gözlerinin yüzeyi ince bir tabaka gözyaşı ile kaplıdır. Gözüne giren tozları kolayca akıtır.  \n" +
            "Type (Tip): Normal (Normal), Fairy (Peri)\n" +
            "Weaknesses (Zayıflıkları): Steel (Çelik), Poison (Zehir)\n","   Zubat aydınlık saatlerde karanlık bir noktada sabit ve sessizce durur. Bunun sebebi uzun süre güneş ışığına maruz kalmanın cildini yakmasıdır.  \n" +
            "Type (Tip): Poison (Zehir), Flying (Uçan)\n" +
            "Weaknesses (Zayıflıklar): Electric (Elektrik), Rock (Kaya), Psychic (Psişik), İce (Buz)\n" +
            "Evolution (Evrimleşmiş Hali): Golbat\n","  Canlıların kanını içmeyi çok sever. Özellikle gece karanlığında aktiftir, gökyüzünde uçarak taze kan arar.\n" +
            "Type (Tip): Poison (Zehir), Flying (Uçan)\n" +
            "Weaknesses (Zayıflıklar): Electric (Elektrik), Rock (Kaya), Psychic (Psişik), İce (Buz)\n","  Gündüz saatlerinde kendini toprağa gömerek besinleri emer. Toprak ne kadar verimliyse yaprakları o kadar parlaktır. \n" +
            "Type (Tip): Grass (Çimen), Poison (Zehir)\n" +
            "Weaknesses (Zayıflıklar): Fire (Ateş), Flying (Uçan), İce (Buz), Psychic (Psişik)\n" +
            "Evolution (Evrimleşmiş Hali): Gloom\n","   Çiçeğinin pistil’inden (dişi organ) kötü bir koku salar. Tehlike karşısında koku kötüleşir. Sakin ve güvendeyken normal, kötü kokusunu salmaz. \n" +
            "Type (Tip): Grass (Çimen), Poison (Zehir)\n" +
            "Weaknesses (Zayıflıklar): Fire (Ateş), Flying (Uçan), İce (Buz), Psychic (Psişik)\n" +
            "Evolution (Evrimleşmiş Hali): Vileplume\n","  Vileplume'un toksik poleni alerji ataklarına yol açar. Bu yüzden ormandaki hiçbir çiçeğe yaklaşmamak önerilir. Flower Pokemon\n" +
            "Type (Tip): Grass (Çimen), Poison (Zehir)\n" +
            "Weaknesses (Zayıflıklar): Fire (Ateş), Flying (Uçan), İce (Buz), Psychic (Psişik)\n","  Paras’ın sırtında büyüyen “Tochukaso” adında parazit mantarlar vardır. Besinlerini paras’tan emerek büyürler. Ömrü uzatmak için ilaç olarak kullanılmak adına oldukça değerlidirler. \n" +
            "Type (Tip): Bug (Böcek), Grass (Çimen)\n" +
            "Weaknesses (Zayıflıklar): Fire (Ateş), Flying (Uçan), Bug (Böcek), İce (Buz), Poison (Zehir), Rock (Kaya)\n" +
            "Evolution (Evrimleşmiş Hali): Parasect\n","  Parasect ağaçları istila ederek alt gövdeleri ve köklerinden besin emmesiyle bilinir. İstila ettikleri ağaç öldüğünde birlikte sonraki ağaca geçerler.\n" +
            "Type (Tip): Bug (Böcek), Grass (Çimen)\n" +
            "Weaknesses (Zayıflıklar): Fire (Ateş), Flying (Uçan), Bug (Böcek), İce (Buz), Poison (Zehir), Rock (Kaya)\n","  Bu pokemonun korunma amaçlı olarak ince ve sert tüylerle kaplı olarak evrimleştiği söylenir. Büyük gözleri sayesinde en küçük avları bile kaçırmazlar.  \n" +
            "Type (Tip): Bug (Böcek), Poison (Zehir)\n" +
            "Weaknesses (Zayıflık): Fire (Ateş), Flying (Uçan), Psychic (Psişik), Rock (Kaya)\n" +
            "Evolution (Evrimleşmiş Hali): Venomoth\n","  Gececidir, yalnızca geceleri aktiftir. En sevdiği avı karanlıktaki sokak ışıklarının etrafında toplanan küçük böceklerdir. \n" +
            "Type (Tip): Bug (Böcek), Poison (Zehir)\n" +
            "Weaknesses (Zayıflık): Fire (Ateş), Flying (Uçan), Psychic (Psişik), Rock (Kaya)\n","  Diglett birçok çiftlikte yetiştirilir, çünkü bu pokemonun yuvaları toprağı sürmek ve lezzetli sebzeler ekmek için için ideal hale getirir.  \n" +
            "Type (Tip): Ground (Toprak)\n" +
            "Weaknesses (Zayıflıkları): Grass (Çimen), İce (Buz), Water (Su)\n" +
            "Evolution (Evrimleşmiş Hali): Dugtrio\n","  Dugtrio aynı vücuttan çıkan üçüzlerdir. Her biri diğer ikisiyle aynı düşünür. Yuva yapmak üzere işbirliğiyle çalışırlar. \n" +
            "Type (Tip): Ground (Toprak)\n" +
            "Weaknesses (Zayıflıkları): Grass (Çimen), İce (Buz), Water (Su)\n","  Meowth keskin tırnaklarını pençelerinin içine alarak ayak izi bırakmadan hareket eder. Bu pokemon parlak paraları çok sever. \n" +
            "Type (Tip): Normal (Normal)\n" +
            "Weaknesses (Zayıflıkları): Fighting (Savaşmak)\n" +
            "Evolution (Evrimleşmiş Hali): Persian\n","  Persian’ın altı tane kalın bıyığı ona sert bir görünüm verir.  has six bold whiskers that give it a look of toughness. Bu bıyıklar pokemonun çevresinde olanları anlamak için hava hareketlerini algılar. Bıyıklarından tutulduğunda uysallaşır. \n" +
            "Type (Tip): Normal (Normal)\n" +
            "Weaknesses (Zayıflıklar): Fighting (Savaşmak)\n","  Psyduck gizemli bir güç kullanır. Sadece uyuyanlar tarafından görülen beyin dalgaları üretir. Bu, bilim adamları arasında tartışmalara yol açan bir keşiftir.  \n" +
            "Type(Tip): Water (Su)\n" +
            "Weaknesses (Zayıflıklar): Electric (Elektrik), Grass (Çimen)\n" +
            "Evolution (Evrimleşmiş Hali): Golduck\n","  Ön ve arka ayakları perdeli ve palet gibidir. Bu sayede çok hızlı yüzer. \n" +
            "Type(Tip): Water (Su)\n" +
            "Weaknesses (Zayıflıklar): Electric (Elektrik), Grass (Çimen)\n","  Titremesi ve burnundan şiddetle nefes alması sinirlenme göstergesidir. Çok hızlı sinirlendiği için öfkesinden kaçmak imkansızdır. \n" +
            "Type (Tip): Fighting (Savaşmak)\n" +
            "Weaknesses (Zayıflıklar): Flying (Uçan), Psychic (Psişik), Fairy (Peri)\n" +
            "Evolution (Evrimleşmiş Hali): Primeape\n","  Primeape sinirlendiğinde kan dolaşımı hızlanır, kasları güçlenir ama daha az zeki bir hale gelir.\n" +
            "Type (Tip): Fighting (Savaşmak)\n" +
            "Weaknesses (Zayıflıklar): Flying (Uçan), Psychic (Psişik), Fairy (Peri)\n","  Growlithe’ın koku duyusu çok gelişmiştir. Kokladığı hiçbir şeyin kokusunu unutmaz. Bu gücünü canlıların duygularını anlamak için kullanır.  \n" +
            "Type (Tip): Fire (Ateş)\n" +
            "Weaknesses (Zayıflıklar): Ground (Toprak), Rock (Kaya), Water (Su)\n" +
            "Evolution (Evrimleşmiş Hali): Arcanine\n","   Arcanine’in çok yüksek bir hızı vardır. Bir gün ve gecede 6,200 mil koşabilecek kapasitesi vardır. İçinde yanan şiddetli ateş güç kaynağıdır.  \n" +
            "Legendary Pokemon (Efsanevi Pokemon)\n" +
            "Type (Tip): Fire (Ateş)\n" +
            "Weaknesses (Zayıflıklar): Ground (Toprak), Rock (Kaya), Water (Su)\n","  Poliwag çok ince bir deriye sahiptir. Kıvrılmış bağırsaklarını dışarıdan görmek mümkündür. Derisi inceliğine rağmen çok esnektir. Sivri dikenler bile yüzeyinden sekebilir. \n" +
            "Type (Tip): Water (Su)\n" +
            "Weaknesses (Zayıflıkları): Electric (Elektrik), Grass (Çimen)\n" +
            "Evolution (Evrimleşmiş Hali): Poliwhirl\n","  Vücudunun yüzeyi sümüksü bir sıvıyla her zaman ıslak be kaygandır. Bu yapısı sayesinde savaşta düşmanın elinden kolayca kurtulabilir.  \n" +
            "Type (Tip): Water (Su)\n" +
            "Weaknesses (Zayıflıkları): Electric (Elektrik), Grass (Çimen)\n" +
            "Evolution (Evrimleşmiş Hali): Poliwrath\n","  Poliwrath’ın gelişmiş kasları hiçbir zaman yorulmaz. O kadar güçlü ve yorulmazdır ki okyanusta düz ve ters olarak zorluk çekmeden yüzebilir.  \n" +
            "Type (Tip): Water (Su), Fighting (Savaşmak)\n" +
            "Weaknesses (Zayıflıklar): Electric (Elektrik), Flying (Uçan), Grass (Çimen), Psychic (Psişik), Fairy (Peri)\n","   Abra günde on sekiz saat uyur, ancak uykusunda düşmanlarının varlığınu sezebilir. Böyle durumlarda güvenli bir yere ışınlanır. \n" +
            "Type (Tip): Psychic (Psişik)\n" +
            "Weaknesses (Zayıflıklar): Bug (Böcek), Dark (Karanlık), Ghost (Hayalet)\n" +
            "Evolution (Evrimleşmiş Hali): Kadabra\n","  Kadabra baş ağrısına yol açan bir alfa dalgası yayar. Yalnızca güçlü bir ruhu olan eğitmenler bu pokemonu eğitebilir.\n" +
            "Type (Tip): Psychic (Psişik)\n" +
            "Weaknesses (Zayıflıklar): Bug (Böcek), Dark (Karanlık), Ghost (Hayalet)\n" +
            "Evolution (Evrimleşmiş Hali): Alakazam\n","  Alakazam'ın beyni sürekli büyür ve boynuyla taşıyamayacağı kadar büyük bir kafası olur. Kafasını havada tutmak için psikokinetik güçlerini kullanır. \n" +
            "Type (Tip): Psychic (Psişik)\n" +
            "Weaknesses (Zayıflıklar): Bug (Böcek), Dark (Karanlık), Ghost (Hayalet)\n","  Machop'un kasları özeldir. Ne kadar çalışırlarsa çalışsınlar hasar almazlar. \n" +
            "Type (Tip): Fighting (Savaşmak)\n" +
            "Weaknesses (Zayıflıklar): Flying (Uçan), Psychic (Psişik), Fairy (Peri)\n" +
            "Evolution (Evrimleşmiş Hali): Machoke\n","   Machoke'un kasları çelik kadar serttir. Aşırı güçlü bir pokemondur.  \n" +
            "Type (Tip): Fighting (Savaşmak)\n" +
            "Weaknesses (Zayıflıklar): Flying (Uçan), Psychic (Psişik), Fairy (Peri)\n" +
            "Evolution (Evrimleşmiş Hali): Machamp\n","   Machamp kendisine hamle yapan her şeyi savurabilir, ama el becerisi gerektiren işleri yapmaya çalıştığında elleri karışır. Machamp düşünmeden harekete geçer. \n" +
            "Type (Tip): Fighting (Savaşmak)\n" +
            "Weaknesses (Zayıflıklar): Flying (Uçan), Psychic (Psişik), Fairy (Peri)\n","   Bellsprout'un ince ve esnek vücudu karşılaştığı saldırı ne kadar güçlü olursa olsun kaçmasını sağlar. Demiri bile eritebilecek bir tükürüğü vardır. \n" +
            "Type (Tip): Grass (Çimen), Poison (Zehir)\n" +
            "Weaknesses (Zayıflıklar): Fire (Ateş), Flying (Uçan), İce (Buz), Psychic (Psişik)\n" +
            "Evolution (Evrimleşmiş Hali): Weepinbell\n","  Weepinbell’in arkasında büyük bir kanca vardır. Geceleri bir ağaç dalına takılır ve uyur. Hareket ederse düşüp yerde uyanabilir. \n" +
            "Type (Tip): Grass (Çimen), Poison (Zehir)\n" +
            "Weaknesses (Zayıflıklar): Fire (Ateş), Flying (Uçan), İce (Buz), Psychic (Psişik)\n" +
            "Evolution (Evrimleşmiş Hali): Victreebel\n","   Victreebel’ın başından çıkan uzun bir asma vardır. Bu asma avını yakalayacak bir hayvan gibi dalgalanmıştır. Beklenmedik bir av yaklaştığında bu pokemon onu bütün olarak yutar.  \n" +
            "Type (Tip): Grass (Çimen), Poison (Zehir)\n" +
            "Weaknesses (Zayıflıklar): Fire (Ateş), Flying (Uçan), İce (Buz), Psychic (Psişik)\n","  Deniz anası şeklindeki Tentacool'un vücudu büyük oranda sudan oluşur. Denizdan çıkarılırsa vücudu kurur. Eğer susuz kalırsa suyun içine geri koyulmalıdır. \n" +
            "Type (Tip): Water (Su), Poison (Zehir)\n" +
            "Weaknesses (Zayıflıklar): Electric (Elektrik), Ground (Toprak), Psychic (Psişik)\n" +
            "Evolution (Evrimleşmiş Hali): Tentacruel\n","   Kafasında kırmızı ve büyük küreler vardır. Bu küreler şiddetle ultrasonik bir şekilde patlamadan önce parlamaya başlar. Bu pokemonun patlaması şiddetli dalgalara yol açar.  \n" +
            "Type (Tip): Water (Su), Poison (Zehir)\n" +
            "Weaknesses (Zayıflıklar): Electric (Elektrik), Ground (Toprak), Psychic (Psişik)\n","   Bu pokemon ne kadar yaşarsa köşeleri o kadar körelir ve yuvarlak bir şekil alır. Kalbi her zaman sert ve taş gibidir. \n" +
            "Type (Tip): Rock (Kaya), Ground (Toprak)\n" +
            "Weaknesses (Zayıflıklar): Grass (Çimen), Water (Su), Fighting (Savaşmak), Ground (Toprak), Ice (Buz), Steel (Çelik)\n" +
            "Evolution (Evrimleşmiş Hali): Graveler\n","   Graveler kayaları yiyerek beslenir. Yosun kaplı kayaları yemekten hoşlanır.  \n" +
            "Type (Tip): Rock (Kaya), Ground (Toprak)\n" +
            "Weaknesses (Zayıflıklar): Grass (Çimen), Water (Su), Fighting (Savaşmak), Ground (Toprak), Ice (Buz), Steel (Çelik)\n" +
            "Evolution (Evrimleşmiş Hali): Golem\n","  Golem dağlarda yaşar. Büyük bir deprem olduğunda bu pokemon yuvarlanarak dağın eteklerine iner.  \n" +
            "Type (Tip): Rock (Kaya), Ground (Toprak)\n" +
            "Weaknesses (Zayıflıklar): Grass (Çimen), Water (Su), Fighting (Savaşmak), Ground (Toprak), Ice (Buz), Steel (Çelik)\n","  Ponyta doğduğunda çok güçsüzdür. Bu pokemon ailesinin yanında düşe kalka güçlenir.\n" +
            "Type (Tip): Fire (Ateş)\n" +
            "Weaknesses (Zayıflıklar): Ground (Toprak), Rock (Kaya), Water (Su)\n" +
            "Evolution (Evrimleşmiş Hali): Rapidash\n","  Rapidash vadi ve ovalarda koşarken görülebilir. Bu pokemon sinirlendiğinde ateşi parlar ve saatte 240 kilometre hızla koşar. \n" +
            "Type (Tip): Fire (Ateş)\n" +
            "Weaknesses (Zayıflıklar): Ground (Toprak), Rock (Kaya), Water (Su)\n","  Slowpoke nehit kenarlarında kuyruğunu suya batırarak avını yakalar. Bu pokemon genellikle ne yaptığını unutur ve suyun kenarında boş boş gezinir.  \n" +
            "Type (Tip): Water (Su), Psychic (Psişik)\n" +
            "Weaknesses (Zayıflıklar): Bug (Böcek), Dark (Karanlık), Electric (Elektrik), Ghost (Hayalet), Grass (Çimen)\n" +
            "Evolution (Evrimleşmiş Hali): Slowbro\n","   Slowbro'nun kuyruğuna Shellder pokemonu ısırmış bir şekilde takılıdır. Bu yüzden bu pokemon kuyruğunu balık tutmak için kullanamaz. Bu pokemon isteksizce yüzer ve avlanır. \n" +
            "Type (Tip): Water (Su), Psychic (Psişik)\n" +
            "Weaknesses (Zayıflıklar): Bug (Böcek), Dark (Karanlık), Electric (Elektrik), Ghost (Hayalet), Grass (Çimen)\n"
    };
    public yazi(){


    }

    public String getBilgi(int i){
        return bilgi[i];
    }


}
