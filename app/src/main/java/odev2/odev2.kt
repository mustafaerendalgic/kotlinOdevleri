package odev2

fun dereceToFahrenheit(celsius: Double): Double {
    return celsius * 1.8 + 32
}

fun dikdortgenCevresi(kisaKenar: Int, uzunKenar: Int): Int {
    return 2 * (kisaKenar + uzunKenar)
}

fun faktoriyelHesapla(sayi: Int): Int {
    var sonuc = 1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}

fun aHarfiSayisi(kelime: String): Int {
    var sayi: Int = 0
    for (harf in kelime.lowercase()){
        if(harf == 'a')
            sayi += 1
    }
    return sayi
}

fun icAciToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

fun maasHesapla(gunSayisi: Int): Int {
    val toplamSaat = gunSayisi * 8
    return if (toplamSaat <= 160) {
        toplamSaat * 10
    } else {
        (160 * 10) + ((toplamSaat - 160) * 20)
    }
}

fun kotaUcreti(kotaGb: Int): Int {
    return if (kotaGb <= 50) {
        100
    } else {
        100 + (kotaGb - 50) * 4
    }
}

