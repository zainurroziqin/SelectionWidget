package com.example.selectionwidget;

import java.util.ArrayList;

public class DataAdapter {
    private static String[] namaMakanan = {
            "Bika Ambon",
            "Rendang",
            "Mie Bangka",
            "Pempek",
            "Kerak Telor",
            "Serabi",
            "Tempe Mendoan",
            "Gudeg",
            "Rujak Cingur"
    };

    private static String[] makananDetails = {
            "Ketika berkunjung ke Provinsi Nanggroe Aceh Darussalam akan terasa kurang lengkap jika tidak mencicipi masakan kuliner makanan khas Daerah Aceh. Salah satu menu kuliner asli daerah Aceh adalah mie Aceh. Makanan ini juga termasuk kuliner yang begitu disukai masyarakat Indonesia.",
            "Salah satu masakan kuliner asli dari daerah Indonesia adalah bika ambon. Bika ambon merupakan makanan khas dari daerah Medan, Sumatra Utara. Bentuk kuliner berupa kue ini dibuat dari campuran gula, telur dan santan. Biasanya, makanan bika ambon memiliki aroma yang wangi.",
            "Makanan khas Daerah di Indonesia berikutnya yaitu rendang Padang. Sesuai dengan namanya, rendang Padang berasal dari Provinsi Sumatra Barat. Bahan dasar untuk membuat masakan ini pun sangat mudah untuk didapatkan. Seseorang yang ingin membuat hidangan rendang hanya perlu bahan utama berupa daging dan santan kelapa.",
            "Jika anda penggemar mie, maka biasa mencoba masakan kuliner dari daerah Bangka. Masakan kuliner asli dari Bangka ini bernama Mie Bangka. Sesuai dengan namanya, masakan itu terbuat dari bahan dasar berupa mie. Bahan dasar berupa mie tersebut dicampurkan dengan kuah yang diberi bumbu khusus. Alhasil rasa mie pun akan semakin lezat.",
            "Pempek dan tekwan merupakan makanan khas dari Daerah Palembang Sumatra Selatan, makanan ini begitu populer di Indonesia. Masakan yang terbuat dari sagu dan ikan ini memiliki rasa yang lezat dan gurih. Rasa lezat dalam sebuah hidangan empek – empek asli Palembang membuat setiap orang yang mencobanya menjadi ketagihan.",
            "Kerak telur menjadi suatu masakan yang merupakan perpaduan dari masakan khas Portugis. Kerak telor adalah makanan khas daerah jakarta asli betawi. Jenis hidangan ini menjadi makanan khas Betawi Jakarta. Kuliner bernama kerak telur akan mudah dijumpai saat acara pekan raya di Jakarta. Bahkan tidak jarang kuliner kerak telur dijadikan simbol dalam kegiatan tersebut.",
            "Serabi memang menjadi jajanan yang sudah dari dulu memiliki cita rasa yang lezat dan bikin nagih dilidah. Ada banyak serabi yang ada di indonesia namun serabi jawa baratlah yang memiliki rasa begitu khas dan banyak varian.",
            "Jawa tengah memang menjadi salah satu pulau yang didominasi makanan dengan rasa manis dan pedas, tak heran mendoan menjadi salah satu makanan yang paling diminati sebagian kalangan, karena memiliki rasa yang enak dan bisa diolah dengan berbagai hidangan apapun. Mau disayur bisa mau dibuat lauk juga bisa. Di sandingkan dengan nasi liwet yang berasal dari kota solo pasti rasanya semakin nikmat apalagi di tambah dengan lalapan + sambel.",
            "Apabila mendengar kata gudeg pasti pikiran akan langsung tertuju pada Provinsi Yogyakarta. Memang benar, gudeg menjadi kuliner andalan dari daerah istimewa ini. Karena saking populernya, Yogyakarta dikenal sebagai kota gudeg. Pada dasarnya, kuliner gudeg terbuat dari olahan sayur nangka.",
            "Salah satu menu favorite yang ada di jawa timur. Selain rujak cingur jawa timur juga terkenal dengan menu makanan khas daerah rawon, soto lamongan, lontong kupang dan masih banyak lainnya. Rujak cingur sendiri memiliki rasa yang bikin lidah nagih karena rasa manis dan gurih."
    };

    public static int[] makananImages = {
            R.drawable.bika_ambon,
            R.drawable.rendang,
            R.drawable.mie_bangka,
            R.drawable.pempek,
            R.drawable.kerak_telor,
            R.drawable.serabi,
            R.drawable.tempe_mendoan,
            R.drawable.gudeg,
            R.drawable.rujak_cingur
    };

    static ArrayList<Adapter> getListData() {
        ArrayList<Adapter> list = new ArrayList<>();
        for (int position = 0; position < namaMakanan.length; position++) {
            Adapter makanan = new Adapter();
            makanan.setName(namaMakanan[position]);
            makanan.setDetail(makananDetails[position]);
            makanan.setPhoto(makananImages[position]);
            list.add(makanan);
        }
        return list;
    }
}
