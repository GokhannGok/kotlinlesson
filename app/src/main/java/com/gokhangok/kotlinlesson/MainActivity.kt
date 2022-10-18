package com.gokhangok.kotlinlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("selam chat")
        println(5*10)

        //Değişkenler
        //Integer

        println("-------------Int-----------------")

        var a = 5
        var b = 10
        println(a*b)

        var yas =50
        println(yas / 5 * 8)

        yas = 60
        println(yas / 5 * 8)

        val x = 5
        val y = 20
        println(x + y)

        //camelCase
        //snake_case
        val yasSonucu = yas * x
        println(yasSonucu)


        println("-------------String----------------")

        val benimString = "Benim Yeni Metnim"
        println(benimString.length)
        val isim = "Gökhan"
        val soyisim="Gök"

        val tamisim = isim + " " + soyisim
        println(tamisim)

        val yeniBirString : String

        yeniBirString="10"
        val baskaBirString = "20"
        println(yeniBirString + "" + baskaBirString)

        println("-------------Boolean---------------")

        var benimBoolean = true
        benimBoolean = false

        // <   -- küçüktür
        // >   -- büyüktür
        // == --- eşittir
        // !=   -- eşit değildir
        //<=    --- küçük eşittir
        //>=    --- büyük eşittir
        // &&   -- ve
        // ||   -- veya

        println(3<5)
        println(4!=4)


        println("-------------Veri Dönüştürmek---------------")

        val benimInt = 10
        val benimLongaCevrilenInt = benimInt.toLong()
        println(benimLongaCevrilenInt)
        var kullaniciGirdisi = "50"
        val kullaniciInt = kullaniciGirdisi.toInt()
        println(kullaniciInt / 2)

        //Koleksiyonlar
        //Array-Dizi
        println("-------------Diziler---------------")
        val stringOrnegi = "Miray"
        val benimDizim = arrayOf(stringOrnegi,"Gökhan","Gök","Doğancan","Bayazıt")
        //index

        println(benimDizim[0])
        println(benimDizim.get(1))
        benimDizim[2] = "Mahmut"
        println(benimDizim.get(2))

        benimDizim.set(3,"Süleyman")
        println(benimDizim[3])

        val karisikDizi = arrayOf("Gökhan", 24,16.5,true,false)
        println(karisikDizi[3])

        //ArrayList - Listeler
        println("-------------ArrayList---------------")

        val isimListesi = arrayListOf("Gökhan","Doğancan","Miray")
        println(isimListesi[0])
        println(isimListesi.get(1))
        isimListesi.add("Mehmet")
        isimListesi.add("Atlas")
        isimListesi.add("4")
        println(isimListesi.get(5))

        val karisikArrayList = arrayListOf<Any>()

        karisikArrayList.add("Asus")
        karisikArrayList.add(5)
        karisikArrayList.add(16.5)
        println(karisikArrayList[2])

        val intArrayList = ArrayList<Int>()
        intArrayList.add(5)
        intArrayList.add(20)
        println(intArrayList.get(1))

        //Set
        println("-------------Set---------------")

        val ornekDizi = arrayOf(7,8,9,10,7,4,4,4,10)
        println("index 2: ${ornekDizi[2]}")
        println(ornekDizi.size)

        val benimSet = setOf<Int>(7,8,9,9,9,8,10)

        println(benimSet.size)
        //For Each

        benimSet.forEach {
            println(it)
        }

        val digerSet = HashSet<String>()
        digerSet.add("Gökhan")
        digerSet.add("Gökhan")
        digerSet.add("Gökhan")
        digerSet.add("Gökhan")
        digerSet.add("Yaz")
        digerSet.forEach{
            println(it)
        }

        //Map
        println("-------------Map---------------")
        //Anahtar Kelime - Değer (Key-Value Pairing)

        val yemekDizisi = arrayOf("Elma","Et","Tavuk")
        val kaloriDizisi = arrayOf(100,300,200)
        println("${yemekDizisi[0]}'nın kalorisi: ${kaloriDizisi[0]}")
        val yemekKaloriMap = hashMapOf<String,Int>()
        yemekKaloriMap.put("Elma",100)
        yemekKaloriMap.put("Et",300)
       yemekKaloriMap.put("Tavuk",200)
        println(yemekKaloriMap.get("Et"))

        val benimMapim = HashMap<String, String>()
        benimMapim.put("Örnek,","Değer")

        val yeniMap = hashMapOf<String,Int>("Atıl" to 40, "Örnek" to 50)
        println(yeniMap.get("Örnek"))



    }
}