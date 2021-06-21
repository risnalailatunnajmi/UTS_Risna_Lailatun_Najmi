package com.example.uts_risna_lailatun_najmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

        companion object{
                val INTENT_PARCELABLE = "OBJECT_INTENT"
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nabiList = listOf<Nabi>(
                Nabi(
                        R.drawable.ic_account_circle,
                        "Adam AS",
                        "Nabi Adam merupakan manusia pertama yang diciptakan Allah SWT sekaligus menjadi nabi pertama." +
                                " Nabi Adam adalah khalifah pertama di dunia." +
                                " Nabi Adam memiliki tinggi 60 hasta." +
                                " Nabi Adam dikaruniai keturunan kembar berpasang-pasang."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "IdrisAS",
                        "Nabi Idris adalah cucu buyut Nabi Adam. " +
                                "Beliau sempat bertemu dengan Nabi Adam selama 308 tahun. " +
                                "Nabi Idris merupakan orang yang pertama kali memakai pakaian berjahit. " +
                                "Pada zaman Nabi Adam, orang-orang mengenakan  bulu dan kulit binatang sebagai bahan pakaian mereka."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Nuh AS",
                        "Nabi Nuh adalah salah satu Nabi yang masuk dalam golongan Ulul Azmi, artinya memiliki ketegaran. " +
                                "Selama berdakwah, Nabi Nuh menerima banyak tantangan dan penolakan. " +
                                "Dakwah tauhid Nabi Nuh banyak ditentang oleh kaumnya. " +
                                "Kemaksiatan dan kesyirikan terus merajalela. " +
                                "Tak ada yang mengindahkan nesehatnya, termasuk anak dan istrinya menentang ajaran beliau juga membenci suaminya Nabi Nuh dan menganggapnya gila. " +
                                "Ketika kaumnya tetap bertindak dzalim, Allah pun menurunkan azab  banjir besar yang menimpa mereka semua."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Hud AS",
                        "Nabi Hud diutus Allah bagi kaum ‘Ad, kaum pertama penyembah patung setelah azab banjir besar pada zaman Nabi Nuh. " +
                                "Kaum ‘Ad sama seperti kaum sebelumnya senang melakukan kemaksiatan dan menghamburkan harta dengan sia-sia serta membenci dan mencemooh Nabi Hud. " +
                                "Saat berdakwah, Nabi Hud justru menerima banyak rasa iri dan dengki dari kaum ‘Ad. Nabi Hud AS mampu menurunkan hujan atas izin Allah, kala itu kaum ‘Ad dilanda kekeringan hingga tanaman mati dan tak ada sumber air. " +
                                "Selamat dari badai petir yang dahsyat."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Shaleh AS",
                        "Nabi Saleh hidup di tengah kaum Tsamud. Mereka adalah kaum yang banyak diberi kenikmatan oleh Allah.  Kaum tsamud dikenal sebagai ahli bangunan yang tekun dan terampil  dalam membuat rumah.Sekitar kurun waktu 200 tahun, Allah pun mengutus Nabi Shaleh ke kaum Tsamud yang masih merupakan keturunan dari kaum ‘Ad."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Ibrahim AS",
                        "Nabi Ibrahim merupakan salah satu Nabi yang kisahnya banyak diceritakan dalam Al-Qur’an. Mulai dari bagaimana Nabi Ibrahim menemukan Tuhan, melawan kedzaliman Raja Namrud, hingga kisahnya dengan kedua anaknya yakni Ismail dan Ishaq."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Luth AS",
                        "Nabi Luth merupakan keponakan dari Nabi Ibrahim. " +
                                "Dia diutus Allah untuk berdakwah kepada kaum Sodom, kaum yang rusak dan terkenal dengan perilaku seks sesama jenis. " +
                                "Dakwah Nabi Luth pun ditentang oleh mereka. Suatu sore, Nabi Luth kedatangan tiga orang tamu, mereka merupakan utusan Allah dan menjamunya sebaik munkin. " +
                                "Suatu ketika, kaum Sodom mengusir Nabi Luth,  sesaat setelahnya Allah memberikan azab kepada mereka semua dengan mengutus malaikat itu datang dengan menghantamkan batu-batu kepada mereka. " +
                                "Allah membinasakan mereka dengan bencana gempa bumi dan angin kencang."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Ismail AS",
                        "Nabi Ismail merupakan anak Nabi Ibrahim dan istrinya Hajar. " +
                                "Salah satu mukjizat Nabi Ismail pun masih bisa kita lihat hingga sekarang, yakni air zamzam. " +
                                "Nabi Ismail juga sempat menerima perintah Allah untuk disembelih oleh ayahnya sendiri. " +
                                "Namun ketika Nabi Ibrahim menghunuskan benda tajam untuk menyembelihnya, Allah menggantikan Nabi Ismail dengan seekor kambing. " +
                                "Peristiwa itulah yang pada akhirnya menjadi awal mula qurban pada Hari Raya Idul Adha. " +
                                "Dari keturunan Nabi Ismail kelak Nabi Muhammad lahir sebagai Nabi terakhir."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Ishaq AS",
                        "Nabi Ishaq merupakan anak dari Nabi Ibrahim dengan Sarah. " +
                                "Dia lahir 14 tahun setelah Nabi Ismail ketika ibunya sudah sepuh berusia 99 tahun. " +
                                "Pemberian nama Ishaq diberikan langsung oleh Allah. " +
                                "Dia juga selalu mengikuti ayahnya dalam berdakwah. " +
                                "Dalam Alquran disebutkan bahwa Nabi Ishaq adalah hamba yang memiliki ilmu, akhlak, dan perbuatan yang baik. " +
                                "Dari keturunannya lahir Nabi-Nabi yang berasal dari Bani Israil."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Ya'qub AS",
                        "Nabi Yakub merupakan anak Nabi Ishaq. " +
                                "Dalam beberapa riwayat, Nabi Yaqub digambarkan sebagai sosok yang memiliki karakter yang kuat dan keimanan yang luar biasa. " +
                                "Nabi Yaqub memiliki dua belas orang anak laki-laki yang tampan. Allah sebutkan mereka dengan sebutan Asbath. " +
                                "Bahkan sebelum Nabi Yaqub wafat dan terbaring lemah pun, dia berwasiat kepada para putra untuk tetap menjalankan perintah Allah."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Yusuf AS",
                        "Nabi Yusuf merupakan anak Nabi Yaqub. Dia pernah mendapat mimpi di mana bulan, matahari, dan bintang bersujud padanya. " +
                                "Sejak itulah, Nabi Yakub mengetahui bahwa putranya akan menjadi orang besar."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Ayub AS",
                        "Nabi Ayyub adalah seorang Nabi yang memiliki banyak harta, keturunan, dan berakhlak mulia. " +
                                "Meski begitu, Nabi Ayub tak pernah sombong dan terus berbuat baik. " +
                                "Allah pun menguji Nabi Ayub dengan cobaan yang berat. Dia harus kehilangan hartanya, anak-anaknya, dan menderita penyakit kulit. " +
                                "Namun dalam kondisi tersebut Nabi Ayyub tetap bersabar dan berserah diri pada Allah."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Syu'aib AS",
                        "Nabi Syuaib diutus Allah pada kaum Madyan, kaum yang suka menipu dan membangkang. " +
                                "Kaum penyembah pohon Ek yang besar dan rimbun. " +
                                "Selain itu mereka, senang sekali merampas harta musafir tak pernah ramah kepada sesama."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Musa AS",
                        "Nabi Musa merupakan Nabi yang memerangi Raja Firaun yang tamak. " +
                                "Dia mempimpin Bani Israil agar menyembah Allah. " +
                                "Nabi Musa pernah memohon pada Allah untuk menghidupkan orang yang telah meninggal untuk mengungkap kasus pembunuhan. " +
                                "Mampu menghidupkan orang mati. Memiliki tongkat yang bisa berubah menjadi ular. " +
                                "Mampu membelah laut Merah."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Harun AS",
                        "Kisah Nabi Harun sering dikaitkan dengan kisah Nabi Musa. Nabi Harun merupakan seorang Nabi yang dikaruniai kemampuan bahasa yang sangat baik.\n" +
                                "\n" +
                                "Nabi Harun juga berjuang untuk memberantas berhala yang dipimpin oleh Samiri, tukang sihir dari kerajaan milik Firaun."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Dzulkilfi AS",
                        "Nabi Dzulkifli merupakan Nabi yang tinggal Irak. " +
                                "Tak banyak kisah yang menceritakan Nabi Dzulkifli, namun dia dikenal tetap tegar mengajarkan untuk menyembah Allah meski sempat mendapat siksaan, dirantai, hingga dipenjara."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Daud AS",
                        "Nabi Daud merupakan keturunan Nabi Ibrahim ke-12. " +
                                "Nabi Daud menjadi raja setelah terbunuhnya raja Thalut. " +
                                "Saat Nabi Daud membaca kitab Zabur, suaranya mampu membuat orang sakit menjadi sembuh, membuat air dan angin menjadi tenang, hingga bukit-bukit turut memuji Allah."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Sulaiman AS",
                        "Nabi Sulaiman adalah salah satu Nabi yang terkenal sebagai raja yang kaya dan memiliki kekuasaan yang besar. " +
                                "Memiliki kekayaan yang berlimpah. " +
                                "Bahkan dalam suatu riwayat dikisahkan bahwa istana Nabi Sulaiman sangat luas dan bertabur batu mulia. " +
                                "Dapat berbicara dengan binatang. Mampu menundukkan angin. " +
                                "Memiliki bala tentara dari kalangan manusia, jin, dan hewan. Mengalirkan tembaga dari perut bumi."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Ilyas AS",
                        "Masih di kalangan Bani Israel, Nabi Ilyas menghadapi kaum yang gemar menyembah berhala bernama Ba’al. " +
                                "Meski telah menerima dakwah dari Nabi Ilyas, namun mereka tetap ingkar hingga Allah pun menurunkan azab berupa kekeringan yang panjang."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Ilyasa AS",
                        "Nabi Ilyasa adalah anak angkat dari Nabi Ilyas. " +
                                "Nabi Ilyasa diberikan tugas untuk melanjutkan dakwah dari sang ayah untuk Bani Israil. " +
                                "Salah satu mukjizat Nabi Ilyasa adalah menghidupkan orang mati atas izin Allah."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Yunus AS",
                        "Nabi Yunus adalah Nabi yang diutus untuk menyadarkan kaum Assyira penyembah berhala di kota Niniwe. Ketika menaiki kapal bersama pengikutnya, awan hitam dan badai besar terjadi. Para penumpang kapal pun mengorbankan Nabi Yunus dan menenggelamkannya ke laut.\n" +
                                "\n" +
                                "Meski sempat ditelan paus, Allah tetap menyelamatkan Nabi Yunus. Hal inilah yang menjadi salah satu mukjizat Nabi Yunus."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Dzakariya AS",
                        "Nabi Dzakaria merupakan keturunan Nabi Daud dan Nabi Sulaiman. " +
                                "Tak banyak kisah mengenai Nabi Dzakaria, namun menurut beberapa riwayat, Nabi Dzakaria juga memiliki sikap yang rendah hari dan selalu bersyukur kepada Allah. " +
                                "Seperti Nabi Ibrahim, Nabi Dzakaria juga mendapat keturunan saat usianya yang tak lagi muda."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Yahya AS",
                        "Nabi Yahya adalah putra dari Nabi Dzakaria, dia disebut sebagai salah satu orang yang benar terhormat dan suci. Allah menganugerahi Nabi Yahya dengan kemampuan untuk mengetahui syariat.\n" +
                                "\n" +
                                "Nabi Yahya merupakan seorang yang sangat rajin dan gemar membaca. Sejak kecil, Nabi Yahya sudah bisa memutuskan perkara dan mencari jalan keluar untuk segala persoalan."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Isa AS",
                        "Nabi Isa adalah Nabi yang tak memiliki ayah dan lahir dari seorang wanita suci bernama Maryam. " +
                                "Karena lahir tanpa ayah, Maryam dituduh telah melakukan zina. Namun atas izin Allah, Nabi Isa yang masih bayi pun mampu melindungi ibunya dengan berbicara bahwa beliau adalah hamba Allah yang akan menjadi Nabi dan dianugerahi kitab Injil. " +
                                "Nabi Mmusa AS dapat enghidupkan burung dari tanah liat. Menghidupkan orang yang sudah mati. " +
                                "Menyembuhkan orang buta dan penyakit sopak. Menurunkan hidangan dari langit. Dianugerahi kitab Injil."
                ),
                Nabi(
                        R.drawable.ic_account_circle,
                        "Muhammad SAW",
                        "Nabi Muhammad merupakan Nabi terakhir sekaligus penutup. " +
                                "Tak ada lagi Nabi lain setelah Nabi Muhammad wafat. Ketika kelahiran Nabi Muhammad, banyak peristiwa besar terjadi seperti runtuhnya berhala dekat Kabah dan padamnya Api yang disembah oleh kaum Majusi. " +
                                "Muhammad SAW  mendapakan mukjizat terbesar adalah Al-Quran sebagai kitab suci umat Islam. Ia Mampu membelah bulan. " +
                                "Mengalirkan air dari jemari tangannya. Mampu menurunkan hujan. Di atasnya selalu dinaungi awan. Melakukan perjalanan ke Sidratul Muntaha saat Isra Miraj, dan masih banyak lagi."
                )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_nabi)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MyAdapter(this,nabiList){
                val intent = Intent(this,DetailActivity::class.java)
                intent.putExtra(INTENT_PARCELABLE,it)
                startActivity(intent)
        }
    }
}