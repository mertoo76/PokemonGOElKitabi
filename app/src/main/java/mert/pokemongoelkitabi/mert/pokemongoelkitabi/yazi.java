package mert.pokemongoelkitabi.mert.pokemongoelkitabi;

/**
 * pokemon bilgilerini burda tutuyorum. tıklanan positiona göre diziden bilgiyi çekiyorum
 * Created by mert on 19.07.2016.
 */
public class yazi {

    private String[] bilgi={"  Bulbasaur parlak güneş ışığında uyurken görülebilir. Sırtında bir tohum vardır. Güneş ışınlarını emerek sırtındaki tohum büyür.\n" +
            "\nType (Tip) : Grass (Çimen), Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) : Fire(Ateş), Flying (Uçan), İce (Buz), Psychic (Psişik)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Ivysaur\n","  Sırtında bir tomurcuk vardır. Vücut ağırlığını taşıyabilmek için bacakları ve gövdesi kalın ve güçlü şekilde büyür. Güneşte uzun zaman geçirmeye başlaması sırtındaki tomurcuğun çiçek açacağının göstergesidir. \n" +
            "\nType (Tip) : Grass (Çimen), Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) : Fire(Ateş), Flying (Uçan), İce (Buz), Psychic (Psişik)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Venusaur\n","  Venusaur’un sırtında büyük bir çiçek vardır. Çiçek iyi besin ve bol güneş ışığı alırsa canlı renkler aldığı bilinir. Çiçeğin kokusu insanların sinirlerini yatıştırır.\n" +
            "\nType (Tip) : Grass (Çimen), Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) : Fire(Ateş), Flying (Uçan), İce (Buz), Psychic (Psişik)\n","  Kuyruğunun ucunda yanan alev duygularının göstergesidir. Bir şeyden mutlu olduğunda bu alev titrer. Eğer pokemon sinirlenirse alev şiddetli bir şekilde yanar ve yakıcıdır. \n" +
            "\nType (Tip) : Fire (Ateş)\n" +
            "\nWeaknesses (Zayıflık) : Ground (Toprak), Rock (Kaya), Water (Su)\n" +
            "\nEvolution (Evrimleşmiş Hali) :Charmeleon\n","  Charmeleon düşmanlarını pençelerini kullanarak acımasızca yok eder. Güçlü bir düşmanla karşılaştığında sinirlenir. Bu durumda kuyruğunun ucundaki alev mavimsi beyaz bir renk alır.\n" +
            "\nType (Tip) :Fire (Ateş)\n" +
            "\nWeaknesses (Zayıflık) : Ground (Toprak), Rock (Kaya), Water (Su)\n" +
            "\nEvolution (Evrimleşmiş Hali)  :Charizard\n","  Charizard uçarak güçlü rakipler arar. Nefesinde her şeyi eriten güçlü bir alev vardır, ancak bu alevi kendinden güçsüz bir rakip için kullanmaz. \n" +
            "\nType (Tip) : Fire (Ateş), Flying (Uçan)\n" +
            "\nWeaknesses (Zayıflık) : Rock (Kaya), Electric (Elektrik), Water (Su)\n","  Squirtle'ın kabuğu yalnızca korunma amaçlı değildir. Kabuğunun yuvarlak şekli ve yüzeyindeki oluklar suyun direncini en aza indirger ve çok hızlı yüzmesini sağlar. \n" +
            "\nType (Tip) : Water (Su) \n" +
            "\nWeaknesses (Zayıflık) : Electric (Elektrik), Grass (Çimen)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Wartortle\n","  Kuyruğu büyüktür, sık ve kalın bir kürkle kaplıdır. Wartortle yaşlandıkça kuyruğunun rengi koyulaşır. Kabuğundaki çizikler ne kadar güçlü bir savaşçı olduğunu gösterir. \n" +
            "\nType (Tip) : Water (Su)\n" +
            "\nWeaknesses (Zayıflık) : Electric (Elektrik), Grass (Çimen)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Blastoise\n","  Kabuğunda su fışkırtan fıskiyeler vardır. Bu fıskiyeler hedefe uygun atış yaparlar. Boş kutuları 160 feet (50 Metre) mesafeden vurabilecek kesinlikte su mermileri atar.\n" +
            "\nType (Tip) : Water (Su)\n" +
            "\nWeaknesses (Zayıflık) : Electric (Elektrik), Grass (Çimen)\n","  Caterpie çok oburdur. Kendi cüssesinden büyük yaprakları yiyebilir. Kafasındaki anteninden çok güçlü bir koku yayar. \n" +
            "\nType (Tip) : Bug (Böcek)\n" +
            "\nWeaknesses (Zayıflık) : Fire (Ateş), Flying (Uçan), Rock (Kaya)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Metapod\n","  Kabuğu metal bir levha kadar serttir. Fazla hareket eden bir pokemon değildir. Yumuşak bağırsaklarını sert kabuğunun içinde evrimleşmek için hazırlamak üzere sabit durur. \n" +
            "\nType (Tip) : Bug (Böcek)\n" +
            "\nWeaknesses (Zayıflık) : Fire (Ateş), Flying (Uçan), Rock (Kaya)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Butterfree\n","  Butterfree’nin çiçeklerden lezzetli bal bulmak üzere gelişmiş bir yeteneği vardır. Yuvasından 6 mil uzaktaki çiçeklerden bal bulup, toplayıp, taşıyabilir. \n" +
            "\nType (Tip) : Bug (Böcek), Flying (Uçan)\n" +
            "\nWeaknesses (Zayıflık) : Rock (Kaya), Electric (Elektrik), Fire (Ateş), Flying (Uçan), İce (Buz)\n","  Weedle’ın koku alma duyusu çok güçlüdür. Büyük kırmızı hortum şeklindeki burnu ile sevdiği yaprakları sevmediklerinden yalnızca koklayarak ayırt edebilir. \n" +
            "\nType (Tip) : Bug (Böcek), Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) : Fire (Ateş), Flying (Uçan), Psychic (Psişik), Rock (Kaya)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Kakuna\n","  Kakuna hareketsiz bir şekilde, ağaca tutunur halde durur, ancak gelecek evrimi için hazırlık yapmak üzere çok meşguldür. Bu durum, kabuğunun sıcaklığından anlaşılabilir.\n" +
            "\nType (Tip) : Bug (Böcek), Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) : Fire (Ateş), Flying (Uçan), Psychic (Psişik), Rock (Kaya)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Beedril\n","   Beedrill çok bölgeseldir. Kimse, kendi güvenliği için, yuvasına yaklaşmamalıdır. Kızdığı zaman büyük bir öfkeyle saldırır. \n" +
            "\nType (Tip) : Bug (Böcek), Poison (Zehir)\n" +
            "\nWeaknesse(Zayıflıkları): Fire (Ateş), Flying (Uçan), Psychic (Psişik), Rock (Kaya)\n","   Pidgey’nın yön duygusu çok gelişmiştir. Yakın çevresinden ayırılsa da yuvasına hatasız bir şekilde dönebilir. \n" +
            "\nType (Tip) : Normal (Normal), Flying (Uçan)\n" +
            "\nWeaknesses (Zayıflık) : Electric (Elektrik), İce (Buz), Rock (Kaya)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Pidgeotto\n","   Bu pokemon geniş bir alanı kendi bölgesi olarak iddia eder. Uçarak kendi bölgesini kontrol eder. Eğer bölgesine girilirse düşmenina pençeleriyle acımadan saldırır. \n" +
            "\nType (Tip) : Normal (Normal), Flying (Uçan)\n" +
            "\nWeaknesses (Zayıflık) : Electric (Elektrik), İce (Buz), Rock (Kaya)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Pidgeot\n","   Pidgeot’un parlak ve güzel tüyleri vardır. Birçok eğitmen Pidgeot’un kafasındaki tüylerin güzelliğinden etkilenerek pokemonları olarak onu seçmek zorunda kalır. \n" +
            "\nType (Tip) : Normal (Normal), Flying (Uçan)\n" +
            "\nWeaknesses (Zayıflık) : Electric (Elektrik), İce (Buz), Rock (Kaya)\n","   Rattata oldukça tedbirlidir. Uyurken bile kulaklarını oynatarak etrafını dinler. Yaşadığı yer konusunda seçici değildir.\n" +
            "\nType (Tip) : Normal (Normal)\n" +
            "\nWeaknesses (Zayıflık) : Fighting (Savaşmak)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Raticate\n","   Dişleri sağlamlaşarak büyür. Dişlerine düzgün bakmak için kayaları ısırır. \n" +
            "\nType (Tip) : Normal (Normal)\n" +
            "\nWeaknesses (Zayıflık) : Fighting (Savaşmak)\n","  Spearow’un bağırması yarım mil uzaklıktan bile duyulabilecek kadar yüksektir. Yüksek sesle bağırmaları birbirlerini tehlikeye karşı uyardıklarının göstergesidir.  \n" +
            "\nType (Tip) : Normal (Normal), Flying (Uçan)\n" +
            "\nWeaknesses (Zayıflık) : Electric (Elektrik), İce (Buz), Rock (Kaya)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Fearow\n","  Fearow’u uzun boynu ve gagasından tanıyabiliriz. Boynu ve gagası toprakta veya suda av yakalamak üzere şekillenmiştir. Avlanmak için uzun ve ince gagasını kullanır. \n" +
            "\nType (Tip) : Normal (Normal), Flying (Uçan)\n" +
            "\nWeaknesses (Zayıflık) : Electric (Elektrik), İce (Buz), Rock (Kaya)\n","  Ekans dinlenirken kıvrılarak yatar. Bu yatış pozisyonu herhangi bir yönden gelebilecek bir tehdidi kaldırdığı kafasıyla hızlıca algılamasına olanak sağar. \n" +
            "\nType (Tip) : Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) : Ground (Toprak), Psychic (Psişik)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Arbok\n","  Bu pokemonun vücudu bir şeyleri sıkabilmek için oldukça güçlüdür. Düşmanını vücuduyla sardığı anda kaçmak imkansızdır. \n" +
            "\nType (Tip) : Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık): Ground (Toprak), Psychic (Psişik)\n","  Pikachu yeni bir şeyle karşılaştığında elektrik kıvılcımı çıkarır. Eğer kararmış bir Berry (Dut/Böğürtlen) görürseniz, Pikachu istemeden patlatmış olabilir. \n" +
            "\nType (Tip) : Electric (Elektrik)\n" +
            "\nWeaknesses (Zayıflık) : Ground (Toprak)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Raichu\n","   Elektrik keseleri aşırı yüklenirse kuyruğunu toprağa sokarak deşarj olur. Yuvasının yakınlarında yerlerde hasarlar bulunur. \n" +
            "\nType (Tip) : Electric (Elektrik)\n" +
            "\nWeaknesses (Zayıflık) : Ground (Toprak)\n","   Sandshrew’un bedeni suyu atıksız emmesine ve kurak çöllerde hayatta kalmasına olanak sağlayacak şekilde tasarlanmıştır. Düşmanlarından korunmak için kıvrılır.\n" +
            "\nType (Tip) : Ground (Toprak)\n" +
            "\nWeaknesses (Zayıflık) : Grass (Çimen), İce (Buz), Water (Su)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Sandslash\n","   Vücudu katı sivriliklerle kaplıdır. Her yıl bir kere eski dikenleri dökülür ve alttan gelen yenileriyle kaplanır.\n" +
            "\nType (Tip) : Ground (Toprak)\n" +
            "\nWeaknesses (Zayıflık) : Grass (Çimen), İce (Buz), Water (Su)\n","   Kuvvetli bir zehir salgılayan dikenleri vardır. Bu küçük cüsseli pokemonu korumak üzere geliştikleri söylenir. Sinirlendiğinde boynuzundan bir toksin salgılar. \n" +
            "\nType (Tip) : Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) (Zayıflıkları): Ground (Toprak), Psychic (Psişik)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Nidorina\n","   Ailesi veya arkadaşları ile birlikteyken birbirlerini incitmemek için dikenlerini saklarlar. Çevresinden ayrılırsa tedirgin olur. \n" +
            "\nType (Tip) : Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) (Zayıflıkları): Ground (Toprak), Psychic (Psişik)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Nidoqueen\n","  Vücudu sert ortamlara dayanıklıdır. Nidoqueen's body is encased in extremely hard scales. Düşmanlarını sert bir şekilde fırlatır. En güçlü halini yavrusunu savunurken alır.\n" +
            "\nType (Tip) : Poison (Zehir), Ground (Toprak)\n" +
            "\nWeaknesses (Zayıflık) (Zayıflıkları): Ground (Toprak), Ice (Buz), Psychic (Psişik), Water (Su)\n" +
            "\n","  Kulaklarını oynatabilmek için kasları gelişmiştir. Bu sayede kulakları her yönde oynayabilir. Bu pokemon hiçbir sesi kaçırmaz.\n" +
            "\nType (Tip) : Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) (Zayıflıkları): Ground (Toprak), Psychic (Psişik)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Nidorino\n","  Nidorino’nun elmastan daha sert bir boynuzu vardır. Düşmanının varlığını hissettiğinde sırtındaki dikenler kalkar ve düşmanına hazır hale gelir. \n" +
            "\nType (Tip) : Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) (Zayıflıkları): Ground (Toprak), Psychic (Psişik)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Nidoking\n","  Kalın kuyruğu yıkıcı güçtedir. Bir hamlesiyle metal bir kuleyi bile devirebilir. Öfkesi geri dönülmezdir. \n" +
            "\nType (Tip) : Poison (Zehir), Ground (Toprak)\n" +
            "\nWeaknesses (Zayıflık) (Zayıflıkları): Ground (Toprak), İce (Buz), Psychic (Psişik), Water (Su)\n","  Her dolunay gecesi bir grup Clefairy oynamaya çıkar. Şafak söktüğünde sessiz dağlarındaki yuvalarına gider ve beraber uyurlar.\n" +
            "\nType (Tip) : Fairy (Peri)\n" +
            "\nWeaknesses (Zayıflık) (Zayıflıkları): Steel (Çelik), Poison (Zehir)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Clefable\n","  Kanatlarını uçuyormul gibi hafifçe çırpar. Zıplayan adımları suda yürümesine olanak sağlar. Sessiz ve mehtaplı gecelerde göllerin üzerinde yürüyüş yapar. \n" +
            "\nType (Tip) : Fairy (Peri)\n" +
            "\nWeaknesses (Zayıflık) (Zayıflıkları): Steel (Çelik), Poison (Zehir)\n","   Doğduğunda bir tane beyaz kuyruğu vardır. Eğitmeninden sevgi görürse kuyruğu altı parçaya ayrılır. Altı kuyruğu da kıvrık bir şekil alır. \n" +
            "\nType (Tip) : Fire (Ateş)\n" +
            "\nWeaknesses (Zayıflık) (Zayıflıkları): Ground (Toprak), Rock (Kaya), Water (Su)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Ninetales\n","  Ninetales düşmanının zihnini ele geçirmek için kırmızı \n" +
            "\nType (Tip) : Fire (Ateş)\n" +
            "\nWeaknesses (Zayıflık) (Zayıflıkları): Ground (Toprak), Rock (Kaya), Water (Su)\n","   Jigglypuff’ın ses telleri sesinin dalga boyuna göre ayarlanabilir. Bu özelliğini düşmanlarını uyutacak dalga boyunda şarkı söylemek için kullanır.\n" +
            "\nType (Tip) : Normal (Normal), Fairy (Peri)\n" +
            "\nWeaknesses (Zayıflık) (Zayıflıkları): Steel (Çelik), Poison (Zehir)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Wigglytuff\n","  Büyük gözleri vardır. Gözlerinin yüzeyi ince bir tabaka gözyaşı ile kaplıdır. Gözüne giren tozları kolayca akıtır.  \n" +
            "\nType (Tip) : Normal (Normal), Fairy (Peri)\n" +
            "\nWeaknesses (Zayıflık) (Zayıflıkları): Steel (Çelik), Poison (Zehir)\n","   Zubat aydınlık saatlerde karanlık bir noktada sabit ve sessizce durur. Bunun sebebi uzun süre güneş ışığına maruz kalmanın cildini yakmasıdır.  \n" +
            "\nType (Tip) : Poison (Zehir), Flying (Uçan)\n" +
            "\nWeaknesses (Zayıflık) : Electric (Elektrik), Rock (Kaya), Psychic (Psişik), İce (Buz)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Golbat\n","  Canlıların kanını içmeyi çok sever. Özellikle gece karanlığında aktiftir, gökyüzünde uçarak taze kan arar.\n" +
            "\nType (Tip) : Poison (Zehir), Flying (Uçan)\n" +
            "\nWeaknesses (Zayıflık) : Electric (Elektrik), Rock (Kaya), Psychic (Psişik), İce (Buz)\n","  Gündüz saatlerinde kendini toprağa gömerek besinleri emer. Toprak ne kadar verimliyse yaprakları o kadar parlaktır. \n" +
            "\nType (Tip) : Grass (Çimen), Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) : Fire (Ateş), Flying (Uçan), İce (Buz), Psychic (Psişik)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Gloom\n","   Çiçeğinin pistil’inden (dişi organ) kötü bir koku salar. Tehlike karşısında koku kötüleşir. Sakin ve güvendeyken normal, kötü kokusunu salmaz. \n" +
            "\nType (Tip) : Grass (Çimen), Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) : Fire (Ateş), Flying (Uçan), İce (Buz), Psychic (Psişik)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Vileplume\n","  Vileplume'un toksik poleni alerji ataklarına yol açar. Bu yüzden ormandaki hiçbir çiçeğe yaklaşmamak önerilir. Flower Pokemon\n" +
            "\nType (Tip) : Grass (Çimen), Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) : Fire (Ateş), Flying (Uçan), İce (Buz), Psychic (Psişik)\n","  Paras’ın sırtında büyüyen “Tochukaso” adında parazit mantarlar vardır. Besinlerini paras’tan emerek büyürler. Ömrü uzatmak için ilaç olarak kullanılmak adına oldukça değerlidirler. \n" +
            "\nType (Tip) : Bug (Böcek), Grass (Çimen)\n" +
            "\nWeaknesses (Zayıflık) : Fire (Ateş), Flying (Uçan), Bug (Böcek), İce (Buz), Poison (Zehir), Rock (Kaya)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Parasect\n","  Parasect ağaçları istila ederek alt gövdeleri ve köklerinden besin emmesiyle bilinir. İstila ettikleri ağaç öldüğünde birlikte sonraki ağaca geçerler.\n" +
            "\nType (Tip) : Bug (Böcek), Grass (Çimen)\n" +
            "\nWeaknesses (Zayıflık) : Fire (Ateş), Flying (Uçan), Bug (Böcek), İce (Buz), Poison (Zehir), Rock (Kaya)\n","  Bu pokemonun korunma amaçlı olarak ince ve sert tüylerle kaplı olarak evrimleştiği söylenir. Büyük gözleri sayesinde en küçük avları bile kaçırmazlar.  \n" +
            "\nType (Tip) : Bug (Böcek), Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) (Zayıflık): Fire (Ateş), Flying (Uçan), Psychic (Psişik), Rock (Kaya)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Venomoth\n","  Gececidir, yalnızca geceleri aktiftir. En sevdiği avı karanlıktaki sokak ışıklarının etrafında toplanan küçük böceklerdir. \n" +
            "\nType (Tip) : Bug (Böcek), Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) (Zayıflık): Fire (Ateş), Flying (Uçan), Psychic (Psişik), Rock (Kaya)\n","  Diglett birçok çiftlikte yetiştirilir, çünkü bu pokemonun yuvaları toprağı sürmek ve lezzetli sebzeler ekmek için için ideal hale getirir.  \n" +
            "\nType (Tip) : Ground (Toprak)\n" +
            "\nWeaknesses (Zayıflık) (Zayıflıkları): Grass (Çimen), İce (Buz), Water (Su)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Dugtrio\n","  Dugtrio aynı vücuttan çıkan üçüzlerdir. Her biri diğer ikisiyle aynı düşünür. Yuva yapmak üzere işbirliğiyle çalışırlar. \n" +
            "\nType (Tip) : Ground (Toprak)\n" +
            "\nWeaknesses (Zayıflık) (Zayıflıkları): Grass (Çimen), İce (Buz), Water (Su)\n","  Meowth keskin tırnaklarını pençelerinin içine alarak ayak izi bırakmadan hareket eder. Bu pokemon parlak paraları çok sever. \n" +
            "\nType (Tip) : Normal (Normal)\n" +
            "\nWeaknesses (Zayıflık) (Zayıflıkları): Fighting (Savaşmak)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Persian\n","  Persian’ın altı tane kalın bıyığı ona sert bir görünüm verir.  has six bold whiskers that give it a look of toughness. Bu bıyıklar pokemonun çevresinde olanları anlamak için hava hareketlerini algılar. Bıyıklarından tutulduğunda uysallaşır. \n" +
            "\nType (Tip) : Normal (Normal)\n" +
            "\nWeaknesses (Zayıflık) : Fighting (Savaşmak)\n","  Psyduck gizemli bir güç kullanır. Sadece uyuyanlar tarafından görülen beyin dalgaları üretir. Bu, bilim adamları arasında tartışmalara yol açan bir keşiftir.  \n" +
            "\nType (Tip): Water (Su)\n" +
            "\nWeaknesses (Zayıflık) : Electric (Elektrik), Grass (Çimen)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Golduck\n","  Ön ve arka ayakları perdeli ve palet gibidir. Bu sayede çok hızlı yüzer. \n" +
            "\nType (Tip): Water (Su)\n" +
            "\nWeaknesses (Zayıflık) : Electric (Elektrik), Grass (Çimen)\n","  Titremesi ve burnundan şiddetle nefes alması sinirlenme göstergesidir. Çok hızlı sinirlendiği için öfkesinden kaçmak imkansızdır. \n" +
            "\nType (Tip) : Fighting (Savaşmak)\n" +
            "\nWeaknesses (Zayıflık) : Flying (Uçan), Psychic (Psişik), Fairy (Peri)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Primeape\n","  Primeape sinirlendiğinde kan dolaşımı hızlanır, kasları güçlenir ama daha az zeki bir hale gelir.\n" +
            "\nType (Tip) : Fighting (Savaşmak)\n" +
            "\nWeaknesses (Zayıflık) : Flying (Uçan), Psychic (Psişik), Fairy (Peri)\n","  Growlithe’ın koku duyusu çok gelişmiştir. Kokladığı hiçbir şeyin kokusunu unutmaz. Bu gücünü canlıların duygularını anlamak için kullanır.  \n" +
            "\nType (Tip) : Fire (Ateş)\n" +
            "\nWeaknesses (Zayıflık) : Ground (Toprak), Rock (Kaya), Water (Su)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Arcanine\n","   Arcanine’in çok yüksek bir hızı vardır. Bir gün ve gecede 6,200 mil koşabilecek kapasitesi vardır. İçinde yanan şiddetli ateş güç kaynağıdır.  \n" +
            "Legendary Pokemon (Efsanevi Pokemon)\n" +
            "\nType (Tip) : Fire (Ateş)\n" +
            "\nWeaknesses (Zayıflık) : Ground (Toprak), Rock (Kaya), Water (Su)\n","  Poliwag çok ince bir deriye sahiptir. Kıvrılmış bağırsaklarını dışarıdan görmek mümkündür. Derisi inceliğine rağmen çok esnektir. Sivri dikenler bile yüzeyinden sekebilir. \n" +
            "\nType (Tip) : Water (Su)\n" +
            "\nWeaknesses (Zayıflık) (Zayıflıkları): Electric (Elektrik), Grass (Çimen)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Poliwhirl\n","  Vücudunun yüzeyi sümüksü bir sıvıyla her zaman ıslak be kaygandır. Bu yapısı sayesinde savaşta düşmanın elinden kolayca kurtulabilir.  \n" +
            "\nType (Tip) : Water (Su)\n" +
            "\nWeaknesses (Zayıflık) (Zayıflıkları): Electric (Elektrik), Grass (Çimen)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Poliwrath\n","  Poliwrath’ın gelişmiş kasları hiçbir zaman yorulmaz. O kadar güçlü ve yorulmazdır ki okyanusta düz ve ters olarak zorluk çekmeden yüzebilir.  \n" +
            "\nType (Tip) : Water (Su), Fighting (Savaşmak)\n" +
            "\nWeaknesses (Zayıflık) : Electric (Elektrik), Flying (Uçan), Grass (Çimen), Psychic (Psişik), Fairy (Peri)\n","   Abra günde on sekiz saat uyur, ancak uykusunda düşmanlarının varlığınu sezebilir. Böyle durumlarda güvenli bir yere ışınlanır. \n" +
            "\nType (Tip) : Psychic (Psişik)\n" +
            "\nWeaknesses (Zayıflık) : Bug (Böcek), Dark (Karanlık), Ghost (Hayalet)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Kadabra\n","  Kadabra baş ağrısına yol açan bir alfa dalgası yayar. Yalnızca güçlü bir ruhu olan eğitmenler bu pokemonu eğitebilir.\n" +
            "\nType (Tip) : Psychic (Psişik)\n" +
            "\nWeaknesses (Zayıflık) : Bug (Böcek), Dark (Karanlık), Ghost (Hayalet)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Alakazam\n","  Alakazam'ın beyni sürekli büyür ve boynuyla taşıyamayacağı kadar büyük bir kafası olur. Kafasını havada tutmak için psikokinetik güçlerini kullanır. \n" +
            "\nType (Tip) : Psychic (Psişik)\n" +
            "\nWeaknesses (Zayıflık) : Bug (Böcek), Dark (Karanlık), Ghost (Hayalet)\n","  Machop'un kasları özeldir. Ne kadar çalışırlarsa çalışsınlar hasar almazlar. \n" +
            "\nType (Tip) : Fighting (Savaşmak)\n" +
            "\nWeaknesses (Zayıflık) : Flying (Uçan), Psychic (Psişik), Fairy (Peri)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Machoke\n","   Machoke'un kasları çelik kadar serttir. Aşırı güçlü bir pokemondur.  \n" +
            "\nType (Tip) : Fighting (Savaşmak)\n" +
            "\nWeaknesses (Zayıflık) : Flying (Uçan), Psychic (Psişik), Fairy (Peri)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Machamp\n","   Machamp kendisine hamle yapan her şeyi savurabilir, ama el becerisi gerektiren işleri yapmaya çalıştığında elleri karışır. Machamp düşünmeden harekete geçer. \n" +
            "\nType (Tip) : Fighting (Savaşmak)\n" +
            "\nWeaknesses (Zayıflık) : Flying (Uçan), Psychic (Psişik), Fairy (Peri)\n","   Bellsprout'un ince ve esnek vücudu karşılaştığı saldırı ne kadar güçlü olursa olsun kaçmasını sağlar. Demiri bile eritebilecek bir tükürüğü vardır. \n" +
            "\nType (Tip) : Grass (Çimen), Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) : Fire (Ateş), Flying (Uçan), İce (Buz), Psychic (Psişik)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Weepinbell\n","  Weepinbell’in arkasında büyük bir kanca vardır. Geceleri bir ağaç dalına takılır ve uyur. Hareket ederse düşüp yerde uyanabilir. \n" +
            "\nType (Tip) : Grass (Çimen), Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) : Fire (Ateş), Flying (Uçan), İce (Buz), Psychic (Psişik)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Victreebel\n","   Victreebel’ın başından çıkan uzun bir asma vardır. Bu asma avını yakalayacak bir hayvan gibi dalgalanmıştır. Beklenmedik bir av yaklaştığında bu pokemon onu bütün olarak yutar.  \n" +
            "\nType (Tip) : Grass (Çimen), Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) : Fire (Ateş), Flying (Uçan), İce (Buz), Psychic (Psişik)\n","  Deniz anası şeklindeki Tentacool'un vücudu büyük oranda sudan oluşur. Denizdan çıkarılırsa vücudu kurur. Eğer susuz kalırsa suyun içine geri koyulmalıdır. \n" +
            "\nType (Tip) : Water (Su), Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) : Electric (Elektrik), Ground (Toprak), Psychic (Psişik)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Tentacruel\n","   Kafasında kırmızı ve büyük küreler vardır. Bu küreler şiddetle ultrasonik bir şekilde patlamadan önce parlamaya başlar. Bu pokemonun patlaması şiddetli dalgalara yol açar.  \n" +
            "\nType (Tip) : Water (Su), Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) : Electric (Elektrik), Ground (Toprak), Psychic (Psişik)\n","   Bu pokemon ne kadar yaşarsa köşeleri o kadar körelir ve yuvarlak bir şekil alır. Kalbi her zaman sert ve taş gibidir. \n" +
            "\nType (Tip) : Rock (Kaya), Ground (Toprak)\n" +
            "\nWeaknesses (Zayıflık) : Grass (Çimen), Water (Su), Fighting (Savaşmak), Ground (Toprak), Ice (Buz), Steel (Çelik)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Graveler\n","   Graveler kayaları yiyerek beslenir. Yosun kaplı kayaları yemekten hoşlanır.  \n" +
            "\nType (Tip) : Rock (Kaya), Ground (Toprak)\n" +
            "\nWeaknesses (Zayıflık) : Grass (Çimen), Water (Su), Fighting (Savaşmak), Ground (Toprak), Ice (Buz), Steel (Çelik)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Golem\n","  Golem dağlarda yaşar. Büyük bir deprem olduğunda bu pokemon yuvarlanarak dağın eteklerine iner.  \n" +
            "\nType (Tip) : Rock (Kaya), Ground (Toprak)\n" +
            "\nWeaknesses (Zayıflık) : Grass (Çimen), Water (Su), Fighting (Savaşmak), Ground (Toprak), Ice (Buz), Steel (Çelik)\n","  Ponyta doğduğunda çok güçsüzdür. Bu pokemon ailesinin yanında düşe kalka güçlenir.\n" +
            "\nType (Tip) : Fire (Ateş)\n" +
            "\nWeaknesses (Zayıflık) : Ground (Toprak), Rock (Kaya), Water (Su)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Rapidash\n","  Rapidash vadi ve ovalarda koşarken görülebilir. Bu pokemon sinirlendiğinde ateşi parlar ve saatte 240 kilometre hızla koşar. \n" +
            "\nType (Tip) : Fire (Ateş)\n" +
            "\nWeaknesses (Zayıflık) : Ground (Toprak), Rock (Kaya), Water (Su)\n","  Slowpoke nehit kenarlarında kuyruğunu suya batırarak avını yakalar. Bu pokemon genellikle ne yaptığını unutur ve suyun kenarında boş boş gezinir.  \n" +
            "\nType (Tip) : Water (Su), Psychic (Psişik)\n" +
            "\nWeaknesses (Zayıflık) : Bug (Böcek), Dark (Karanlık), Electric (Elektrik), Ghost (Hayalet), Grass (Çimen)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Slowbro\n","   Slowbro'nun kuyruğuna Shellder pokemonu ısırmış bir şekilde takılıdır. Bu yüzden bu pokemon kuyruğunu balık tutmak için kullanamaz. Bu pokemon isteksizce yüzer ve avlanır. \n" +
            "\nType (Tip) : Water (Su), Psychic (Psişik)\n" +
            "\nWeaknesses (Zayıflık) : Bug (Böcek), Dark (Karanlık), Electric (Elektrik), Ghost (Hayalet), Grass (Çimen)\n","  Magnemite elektrikten beslenmek için kendini güç hatlarına bağlar. \n" +
            "\nType (Tip) : Electric (Elektrik), Steel (Çelik)\n" +
            "\nWeaknesses (Zayıflık) : Ground (Toprak), Fire (Ateş), Fighting (Savaşmak)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Magneton\n", "   Magneton mekanik araçlara ölümcül etki bırakabilecek şiddette bir manyetik güç yayar.  \n" +
            "\nType (Tip) : Electric (Elektrik), Steel (Çelik)\n" +
            "\nWeaknesses (Zayıflık) : Ground (Toprak), Fire (Ateş), Fighting (Savaşmak)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Magnezone\n","  Farfetch'd her zaman bir bitki sapı ile birlikte görülür. İyi saplar ve kötü saplar vardır ve bu pokemon düşmanlarıyla saplarla savaşır. \n" +
            "\nType (Tip) : Normal (Normal), Flying (Uçan)\n" +
            "\nWeaknesses (Zayıflık) : Elektric (Elektrik), Ice (Buz), Rock (Kaya)\n","  Doduo'nun iki kafası hiçbir zaman aynı anda uyumaz. Bu iki kafa birbirleri uyurken düşmanlara karşı nöbet tutarlar.  \n" +
            "\nType (Tip) : Normal (Normal), Flying (Uçan)\n" +
            "\nWeaknesses (Zayıflık) : Elektric (Elektrik), Ice (Buz), Rock (Kaya)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Dodrio\n","  Eğer Dodrio’nun üç kafası farklı yönlere bakıyorsa bu tetikte olduğunu gösterir. Bu durumda yaklaşırsanız sizi gagalayabilir. \n" +
            "\nType (Tip) : Normal (Normal), Flying (Uçan)\n" +
            "\nWeaknesses (Zayıflık) : Elektric (Elektrik), Ice (Buz), Rock (Kaya)\n","  Seel bir fok balığıdır. Soğuk denizde buz tabakalarının altında avlanır. Havaya ihtiyacı olduğunda başının sivri kısmıyla buzda bir delik açar.  \n" +
            "\nType (Tip) : Water (Su)\n" +
            "\nWeaknesses (Zayıflık) : Elektric (Elektrik), Grass (Çimen)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Dewgong\n","   Dewgong buzun üzerinde uyuklamayı sever.\n" +
            "\nType (Tip) : Water (Su), Ice (Buz)\n" +
            "\nWeaknesses (Zayıflık) : Elektric (Elektrik), Fighting (Savaşmak), Grass (Çimen), Rock (Kaya)\n","  Grimer'un çamurlu ve lastiksi vücudu ne kadar küçük olursa olsun her yerde geçmesini sağlar. Kanalizasyon borularına girip atık su içer.  \n" +
            "\nType (Tip) : Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) : Ground (Toprak), Psychic (Psişik)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Muk\n","   Vücudundan pis kokan bir koku sızdırır, sıvıları durgun ve kokuşmuş bir hale getirebilir.\n" +
            "\nType (Tip) : Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) : Ground (Toprak), Psychic (Psişik)\n","  Geceleri geniş dilini kullanarak denizin kumunda kendine yuva yapar ve içinde uyur. Uyurken kabuğu kapanır ama dili dışarda kalır.\n" +
            "\nType (Tip) : Water (Su)\n" +
            "\nWeaknesses (Zayıflık) : Electric (Elektrik), Grass (Çimen)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Colyster\n", "  Cloyster denizde suyu yutup arkasından fışkırtarak yüzebilir. Aynı şekilde kabuğundan dikenler fırlatabilir.  \n" +
            "\nType (Tip) : Water (Su), Ice (Buz)\n" +
            "\nWeaknesses (Zayıflık) : Electric (Elektrik), Fighting (Savaş), Grass (Çimen), Rock (Kaya)\n","   Gastly çoğunlukla gaz maddelerden oluşur. Şiddetli bir rüzgarla karşılaştığında vücudu bozulur. Gastly gruplar halinde evlerin saçaklarının altına saklanarak rüzgardan korunur. \n" +
            "\nType (Tip) : Ghost (Hayalet), Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) : Dark (Karanlık), Ghost (Hayalet), Psychic (Psişik)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Haunter\n", "  Haunter oldukça tehlikelidir. Eğer karanlıkta size işaret verirse yaklaşmamalısınız, çünkü sizi yalayarak yaşamınızı elinizden alacaktır.  \n" +
            "\nType (Tip) : Ghost (Hayalet), Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) : Dark (Karanlık), Ghost (Hayalet), Psychic (Psişik)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Gengar\n", "  Karanlık gecelerde Genger gölgenizmiş gibi yaparak ani ve rahatsız edici bir şekilde sizi alt edebilir.\n" +
            "\nType (Tip) : Ghost (Hayalet), Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflık) : Dark (Karanlık), Ghost (Hayalet), Psychic (Psişik)\n","  Onix’in beyninde bir mıknatıs vardır. Bu mıknatıs Onix tünel açarken yönünü şaşırmaması için bir pusula işlevi görür. Yaşlandıkça bu pusula büyür ve yuvarlaklaşır.  \n" +
            "\nType (Tip) : Rock (Kaya), Ground (Toprak)\n" +
            "\nWeaknesses (Zayıflık) : Grass (Çimen), Water (Su), Fighting (Savaş), Ground (Toprak), Ice (Buz), Steel (Çelik)\n","  Bu pokemon burun deliklerinizden rüyanızı yemeye çalışabilir. \n" +
            "\nType (Tip) : Psychic (Psişik)\n" +
            "\nWeaknesses (Zayıflık) : Bug (Böcek), Dark (Karanlık), Ghost (Hayalet)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Hypno\n", "    Hypno elinde bir pendulum (sarkaç) tutar. Bu pendulum’un hareketi ve parıltısı düşmanı hipnoz etmesini sağlar. Bu pokemon av ararken pendulumu parlatır. \n" +
            "\nType (Tip) : Psychic (Psişik)\n" +
            "\nWeaknesses (Zayıflık) : Bug (Böcek), Dark (Karanlık), Ghost (Hayalet)\n","  Krabby sahillerde, kuma açılmış deliklerdeki yuvasında yaşar. Bu pokemonlar yemek ve alan için birbirleriyle tartışabilirler. \n" +
            "\nType (Tip) : Water (Su)\n" +
            "\nWeaknesses (Zayıflık) : Electric (Elektrik), Grass (Çimen)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Kingler\n", "   Kingler’ın aşırı büyük bir kıskacı vardır. Bu kıskacı havada sallayarak iletişim kurar ama kıskacın ağırlığından dolayı hızlı yorulur.  \n" +
            "\nType (Tip) : Water (Su)\n" +
            "\nWeaknesses (Zayıflık) : Electric (Elektrik), Grass (Çimen)\n","   Voltorb ilk olarak Poke Ball (Poke Topu) üreten bir şirkette görülmüştür. Bununla pokemonun Poke Ball’a benzerliği arasındaki bağlantı hala bir gizemdir. \n" +
            "\nType (Tip) : Electric (Elektrik)\n" +
            "\nWeaknesses (Zayıflık) : Ground (Toprak)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Electrode \n", "    Electrode atmosferdeki elektrikten beslenir. Yıldırım çaktığı zaman bu pokemon fazla elektrik yemekten patlayabilir.  \n" +
            "\nType (Tip) : Electric (Elektrik)\n" +
            "\nWeaknesses (Zayıflık) : Ground (Toprak)\n", "    Bu pokemon bir örme küme oluşturan altı yumurtadan oluşur. Bu altı yumurta birbirini çeker ve etrafta dönerler. Eğer yumurtalarda çatlaklar görülüyorsa Exeggcute evrimleşiyor demektir.  \n" +
            "\nType (Tip) : Grass (Çimen), Psychic (Psişik)\n" +
            "\nWeaknesses (Zayıflık) : Bug (Böcek), Dark (Karanlık), Fire (Ateş), Flying (Uçmak), Ghost (Hayalet), Ice (Buz), Poison (Zehir)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Exeggutor\n", "    Exeggutor aslında tropikal alanlardan gelmiştir. Güneş ışığına maruz kaldığında kafaları büyür. Kafaları koptuğunda gruplaşarak Exeggcute oluşturdukları söylenir. \n" +
            "\nType (Tip) : Grass (Çimen), Psychic (Psişik)\n" +
            "\nWeaknesses (Zayıflık) : Bug (Böcek), Dark (Karanlık), Fire (Ateş), Flying (Uçmak), Ghost (Hayalet), Ice (Buz), Poison (Zehir)\n", "   Cubone bir daha asla göremeyeceği annesini özler. Dolunayda annesinin benzerini görünce ağlar. Kafasına taktığı kafatasındaki lekeler akıttığı gözyaşlarından meydana gelmiştir.\n" +
            "\nType (Tip) : Ground (Toprak)\n" +
            "\nWeaknesses (Zayıflık) : Grass (Çimen), Ice (Buz), Water (Su)\n" +
            "\nEvolution (Evrimleşmiş Hali) : Marowak \n", "    Marowak Cubone’un evrimleşerek üzüntüsünü atlatmış ve güçlenmiş halidir. Bu pokemonun güçlenmiş ve öfkelenmiş ruhu kolay zedelenemez. \n" +
            "\nType (Tip) : Ground (Toprak)\n" +
            "\nWeaknesses (Zayıflık) : Grass (Çimen), Ice (Buz), Water (Su)\n","Bacakları istediği gibi kasılır ve esner. Bu özellikleriyle düşmanlarına sert darbeler uygular. Savaşlardan sonra yorulmuş kaslarını dinlendirir. \n" +
            "\nType (Tip): Fighting (Savaşan)\n" +
            "\nWeaknesses (Zayıflıklar): Flying (Uçmak), Psychic (Psişik), Fairy (Peri)\n" +
            "\nEvolution (Evrimleşmiş Hali): Hitmonchan\n","Hitmonchan’ın yılmayan bir ruhu vardır ve zorluklara karşı mücadele etmeyi asla bırakmaz. \n" +
            "\nType (Tip): Fighting (Savaşan)\n" +
            "\nWeaknesses (Zayıflıklar): Flying (Uçmak), Psychic (Psişik), Fairy (Peri)\n","Yeni bir şey gördüğünde onu yalar. Bunun sebebi etrafındakileri dokusu ve tadından hatırlamasıdır. Ekşi şeylerden rahatsız olur. \n" +
            "\nType (Tip): Normal (Normal)\n" +
            "\nWeaknesses (Zayıflıklar): Fighting (Savaşmak)\n","Koffing heyecanlandığında vücudundaki gazların toksikliği artar ve onları her yanından dışarı salar. Yuvarlak bedeni fazla şişerek patlayabilir. \n" +
            "\nType (Tip): Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflıklar): Psychic (Psişik)\n" +
            "\nEvolution (Evrimleşmiş Hali): Weezing\n","Weezing mutfak çöplerinin, atıkların yaydığı kokuya bayılır. Pis evleri kendi yuvası olarak kullanır ve geceleri çöpleri karıştırır.\n" +
            "\nType (Tip): Poison (Zehir)\n" +
            "\nWeaknesses (Zayıflıklar): Psychic (Psişik)\n","Rhyhorn düz bir çizgide koşarak önüne çıkan her şeyi ezer. Önüne çıkan beton bile olsa hasar almaz. Sonraki gün çarpışmalarından biraz acı hissedebilir. \n" +
            "\nType (Tip): Ground (Toprak), Rock (Kaya)\n" +
            "\nWeaknesses (Zayıflıklar): Grass (Çimen), Water (Su), Fighting (Savaşmak), Ground (Toprak), Ice (Buz), Steel (Çelik)\n" +
            "\nEvolution (Evrimleşmiş Hali): Rhydon\n","Rhydon'un boynuzu her şeyi parçalayabilir. Kuyruğunun bir hamlesi her şeyi devirebilir. \n" +
            "\nType (Tip): Ground (Toprak), Rock (Kaya)\n" +
            "\nWeaknesses (Zayıflıklar): Grass (Çimen), Water (Su), Fighting (Savaşmak), Ground (Toprak), Ice (Buz), Steel (Çelik)\n","Chansey günlük olarak besin değeri mükemmel olan yumurtalar bırakır. Bu yumurtalar inanılmaz lezzetlidir.\n" +
            "\nType (Tip): Normal (Normal)\n" +
            "\nWeaknesses (Zayıflıklar): Fighting (Savaşmak)\n","Tangela'nın uzantıları kolayca koparılabilir. Bunların kopması acı vermez ve kaçması kolaylaşır. Kaybettiği uzantılarının yenisi sonraki gün çıkar.  \n" +
            "\nType (Tip): Grass (Çimen)\n" +
            "\nWeaknesses (Zayıflıklar): Bug (Böcek), Fire (Ateş), Flying (Uçmak), Ice (Buz), Poison (Zehir)\n","Kangaskan yavrusunu yalnız bırakmaz, yakın çevresinden ayrılmaz. Eğer yavruya yaklaşan olursa şiddetle saldırır.\n" +
            "\nType (Tip): Normal (Normal)\n" +
            "\nWeaknesses (Zayıflıklar): Fighting (Savaşmak)\n","Horsea kayalardaki küçük böcek ve yosunları yer. Eğer okyanusun akıntısı hızlanırsa kuyruğuyla kayaya tutunarak sürüklenmekten korunur.  \n" +
            "\nType (Tip): Water (Su)\n" +
            "\nWeaknesses (Zayıflıklar): Electic (Elektrik), Grass (Çimen)\n" +
            "\nEvolution (Evrimleşmiş Hali): Seadra\n","Bu pokemon mercan dallarının arasına kıvrıldıktan sonra uyur. Mercan toplamak isteyenleri çarpar. \n" +
            "\nType (Tip): Water (Su)\n" +
            "\nWeaknesses (Zayıflıklar): Electic (Elektrik), Grass (Çimen)\n","Goldeen çok güzel bir pokemondur ama boynuzuyla sizi çarpabilir. \n" +
            "\nType (Tip): Water (Su)\n" +
            "\nWeaknesses (Zayıflıklar): Electic (Elektrik), Grass (Çimen)\n" +
            "\nEvolution (Evrimleşmiş Hali): Seaking\n","Bu pokemonlar sonbaharda dere yataklarında dans ederek dişilere kur yaparlar. Bu sezonda vücutlarının renkleri en güzel hallerini alır.\n" +
            "\nType (Tip): Water (Su)\n" +
            "\nWeaknesses (Zayıflıklar): Electic (Elektrik), Grass (Çimen)\n","Staryu'nun ortasındaki bölge “core (öz)” denilen, kırmızı ve parlak bir organdır.  \n" +
            "\nType (Tip): Water (Su)\n" +
            "\nWeaknesses (Zayıflıklar): Electic (Elektrik), Grass (Çimen)\n" +
            "\nEvolution (Evrimleşmiş Hali): Starmie\n","Starmie'nin ortası/core’u yedi farklı renkte parlar. Parıltılı doğası sebebiyle bu pokemona “gem of the sea (denizin mücevheri)” takma adı verilmiştir.  \n" +
            "\nType (Tip): Water (Su), Psychic (Psişik)\n" +
            "\nWeaknesses (Zayıflıklar): Bug (Böcek), Dark (Karanlık), Electic (Elektrik), Ghost (Hayalet), Grass (Çimen)\n","Mr. Mime bir pandomim ustasıdır. Jestleri ve mimikleri izleyicileri görünmez bir şeyin geçekten var olduğuna ikna edebilir. İkna oldukları zaman görünmez şey gerçekmiş gibi var olur.  \n" +
            "\nType (Tip): Psychic (Psişik), Fairy (Peri)\n" +
            "\nWeaknesses (Zayıflıklar): Ghost (Hayalet), Steel (Çelik), Poison (Zehir)\n","Scyther görülemeyecek kadar hızlıdır. Bu hızı kollarındaki ikili tırpanların etkililiğini arttırır. Bu tırpanlar çok kesicidir. \n" +
            "\nType (Tip): Bug (Böcek), Flying (Uçan)\n" +
            "\nWeaknesses (Zayıflıklar): Rock (Kaya), Electric (Elektrik), Fire (Ateş), Flying (Uçmak), Ice (Buz)\n","Jynx ritmik hareketlerle kalçalarını sallayarak, dans eder gibi yürür. Harekerlerini görenler düşünmeden kalçalarını sallamaya başlarlar.\n" +
            "\nType (Tip): Ice (Buz), Psychic (Psişik)\n" +
            "\nWeaknesses (Zayıflıklar): Bug (Böcek), Dark (Karanlık), Fire (Ateş), Ghost (Hayalet), Rock (Kaya), Steel (Çelik)\n","Bir şimşek çaktığı zamanlarda bu pokemonun çeteleri yıldırım düşebilecek yükseklikleri ölçmek için yarışırlar. Bazı kasabalar Electabuzz’ı elektrik direği olarak kullanır. \n" +
            "\nType (Tip): Electric (Elektrik)\n" +
            "\nWeaknesses (Zayıflıklar): Ground (Toprak)\n","Magmar savaşta bütün vücudundan alevler fışkırtarak düşmanını korkutur. Bu pokemonun ateşli patlamaları çevresini tutuşturucak sıcaklık dalgaları yayar. \n" +
            "\nType (Tip): Fire (Ateş)\n" +
            "\nWeaknesses (Zayıflıklar): Ground (Toprak), Rock (Kaya), Water (Su)\n","Pinsir şaşırtıcı derecede güçlüdür. Kendinin iki katı ağırlığındaki düşmanını boynuzlarıyla kolayca kaldırabilir. Pinsir’in hareketleri soğuk ortamlarda halsizleşir.  \n" +
            "\nType (Tip): Bug (Böcek)\n" +
            "\nWeaknesses (Zayıflıklar): Fire (Ateş), Flying (Uçmak), Rock (Kaya)\n","Bu pokemon etrafa sataşmadan duramaz. Eğer savaşacağı bir düşman yoksa kalın ağaçlara saldırıp onları devirerek enerjisini atar.  \n" +
            "\nType (Tip): Normal (Normal)\n" +
            "\nWeaknesses (Zayıflıklar): Fighting (Savaşmak)\n","Magikarp yalnızca suya düşmek ve su sıçratmaya yarayan işlevsiz bir pokemondur.  \n" +
            "\nType (Tip): Water (Su)\n" +
            "\nWeaknesses (Zayıflıklar): Electric (Elektrik), Grass (Çimen)\n" +
            "\nEvolution (Evrimleşmiş Hali): Gyarados\n","Magikarp Gyarados’a dönüştüğünde beyin hücreleri yapısal bir değişime uğrar. Bu değişimin bu pokemonun vahşi doğası gereği olduğu söylenir. \n" +
            "\nType (Tip): Water (Su), Flying (Uçan)\n" +
            "\nWeaknesses (Zayıflıklar): Electric (Elektrik), Rock (Kaya)\n","Lapras’ın nesli tükenmek üzeredir. Bu pokemon şarkı söyleyerek kendi türünden kalan az sayıdaki pokemonları arar. \n" +
            "\nType (Tip): Water (Su), Ice (Buz)\n" +
            "\nWeaknesses (Zayıflıklar): Electric (Elektrik), Fighting (Savaşmak), Grass (Çimen), Rock (Kaya)\n","Ditto kendi hücre yapısını çekil değiştirmek üzere değiştirir. Kendini dönüştürmek istediği şeye hafızasından ulaştığı için detaylarda yanlışlık yapar.  \n" +
            "\nType (Tip): Normal (Normal)\n" +
            "\nWeaknesses (Zayıflıklar): Fighting (Savaşmak)\n","Eevee’ın istikrarsız genetik makyajı yaşadığı çevreye göre mutasyona uğrar. Bazı taşlardan yayılan radyasyon bu pokemonun evrimleşmesine yol açar.\n" +
            "\nType (Tip): Normal (Normal)\n" +
            "\nWeaknesses (Zayıflıklar): Fighting (Savaşmak)\n" +
            "\nEvolution (Evrimleşmiş Hali): Vaporeon, Jolteon, Flareon","Vaporeon birkaç mutasyona uğraması sonucu sualtında yaşamasını sağlayacak solungaç ve yüzgeçlere sahip olmuştur. Bu pokemon özgürce suyu kontrol edebilir. \n" +
            "\nType (Tip): Water (Su)\n" +
            "\nWeaknesses (Zayıflıklar): Electric (Elektrik), Grass (Çimen)\n","Jolteon'un hücreleri düşük dozda enerji üretir. Bu güç kürkünün statik elektriğiyle artar ve pokemonun yıldırım düşürebilmesine yol açar. Kürkü elekrik yüklü iğnelerden oluşmuştur.  \n" +
            "\nType (Tip): Electric (Elektrik)\n" +
            "\nWeaknesses (Zayıflıklar): Ground (Toprak)\n","Flareon'un pofuduk kürkünün işlevi ısıyı dışarı vermektir. Bu sayede vücudu aşırı ısınmaz. Bu pokemonun vucüdu 1650 dereceye (fahrenheit) kadar çıkabilir.  \n" +
            "\nType (Tip): Fire (Ateş)\n" +
            "\nWeaknesses (Zayıflıklar): Ground (Toprak), Rock (Kaya), Water (Su)\n"
    };
    public yazi(){


    }

    public String getBilgi(int i){
        return bilgi[i];
    }


}
