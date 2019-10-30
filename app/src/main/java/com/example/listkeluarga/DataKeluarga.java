package com.example.listkeluarga;

import java.util.ArrayList;

public class DataKeluarga {
    private static String[] namaKeluarga = {"H. Rohaidi", "Rohaini Puspita", "Muhamad Roni Premadana", "Naila Salsabila", "Rahmadita Kholila"};
    private static String[] status = {"Bapak", "Ibu", "Kakak Laki-Laki", "Adik Perempuan", "Adik Perempuan"};
    private static int[] fotokeluarga = {R.drawable.bapak, R.drawable.ibu, R.drawable.kakak, R.drawable.adik1, R.drawable.adik2};

    static ArrayList<Keluarga> getListData() {
        ArrayList<Keluarga> list = new ArrayList<>();
        for (int position = 0; position < namaKeluarga.length; position++) {
            Keluarga keluarga = new Keluarga();
            keluarga.setNama(namaKeluarga[position]);
            keluarga.setStatus(status[position]);
            keluarga.setFoto(fotokeluarga[position]);
            list.add(keluarga);
        }
        return list;
    }
}
