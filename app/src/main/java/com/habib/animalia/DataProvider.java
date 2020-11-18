package com.habib.animalia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.habib.animalia.model.Hewan;
import com.habib.animalia.model.Kucing;
import com.habib.animalia.model.Anjing;
import com.habib.animalia.model.Burung;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> iniDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora","Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> iniDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Burung> iniDataBurung(Context ctx) {
        List<Burung> burungs = new ArrayList<>();
        burungs.add(new Burung("Jalak Bali","Indonesia",
                "Warna dasar tubuh putih, memiliki ujung ekor dan sayap berarna hitam. Unik, bulu bagian kepalanya akan beridiri seperti jambul ketika berkicau", R.drawable.bird_jalakbali));
        burungs.add(new Burung("Kiwi","Selandia Baru",
                "Salah satu burung yang tidak bisa terbang, berukuran seperti ayam biasa", R.drawable.bird_kiwi));
        burungs.add(new Burung("Punglor Merah","Benua Asia (Myanmar, India, Indonesia)",
                "Si burung menarik dengan suara kicauan yang merdu.", R.drawable.bird_punglor));
        burungs.add(new Burung("Toucan","Amerika tengah",
                "Burung dengan ciri khas paruhnya yang panjang, pemakan tumbuhan dan daging (Omnivora) namun selalu makanan favorit berupa buah-buahan", R.drawable.bird_toucan));
        burungs.add(new Burung("Jalak Thailand","Thailand",
                "Warna dasar coklat, bulu dada dana kepala berwarna putih. Ukuran cukup besar yaitu 20-25 cm. Burung pemakan jangkrik, pisang, dan pepaya", R.drawable.bird_jalakthai));
        burungs.add(new Burung("Gould Amadin","Australia Utara",
                "Burung yang sangat cantik dengan warna bagian tubuh yang berbeda-beda", R.drawable.bird_amadin));
        return burungs;
    }

    private static void iniAllHewans(Context ctx) {
        hewans.addAll(iniDataKucing(ctx));
        hewans.addAll(iniDataAnjing(ctx));
        hewans.addAll(iniDataBurung(ctx));
    }

    public static List<Hewan> getAllHewans(Context ctx) {
        if (hewans.size() == 0) {
            iniAllHewans(ctx);
        }
        return hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            iniAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }
}
