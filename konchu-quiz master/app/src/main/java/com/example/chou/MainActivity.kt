package com.example.chou

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random
import com.example.chou.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    private var i = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //idの取得
        var imagePoke: ImageView = findViewById(R.id.imageViewPoke)
        var btnPoke: Button = findViewById(R.id.btnPoke)

        binding.btnPoke.setOnClickListener(this)
        binding.btnans1.setOnClickListener(this)
        binding.btnans2.setOnClickListener(this)
        binding.btnans3.setOnClickListener(this)

        //正解数のカウント
        val anscount: TextView = findViewById(R.id.anscount)
        anscount.text = "連続１０問正解めざしてがんばれ！"

    }

    override fun onClick(v: View?) {
        //idの取得
        var imagePoke: ImageView = findViewById(R.id.imageViewPoke)
        var btnPoke: Button = findViewById(R.id.btnPoke)
        var tvPoke: TextView = findViewById(R.id.tvPoke)
        var btnans1: Button = findViewById(R.id.btnans1)
        var btnans2: Button = findViewById(R.id.btnans2)
        var btnans3: Button = findViewById(R.id.btnans3)
        var btnclear: Button = findViewById(R.id.btnclear)
        val anscount: TextView = findViewById(R.id.anscount)

        //ボタンクリック時の動作
        binding.btnPoke.setOnClickListener {
            if (i == 9) {

                anscount.text = "連続" + (i) + "問　正解です。"
                btnans1.isEnabled = true
                btnans2.isEnabled = true
                btnans3.isEnabled = true

                val intent = Intent(application, ResultActivity::class.java)
                startActivity(intent)

                //初期化コード　アプリを最初の状態に戻す。
                recreate()

            } else {
                i++
                anscount.text = "連続" + (i) + "問　正解です。"
                tvPoke.text = ("つぎの問題")
                btnPoke.isEnabled = false
                btnans1.isEnabled = true
                btnans2.isEnabled = true
                btnans3.isEnabled = true

                //問題数
                val n = Random.nextInt(24)
                //問題　secondquizに正解を入力する。表示はランダム
                if (n == 0) {
                    imagePoke.setImageResource(R.drawable.himejya)
                    tvPoke.text = ("これは簡単です")
                    var quiz0 = pokemonquiz("クロヒカゲ", "ヒメウラナミジャノメ", "ジャノメチョウ")
                    //quiz0.removeAt(Random)
                    //２問目
                } else if (n == 1) {
                    imagePoke.setImageResource(R.drawable.asagi)
                    tvPoke.text = ("アゲハ蝶の問題です")
                    var quiz1 = pokemonquiz("マダラチョウ", "アサギマダラ", "ギフチョウ")

                    //３問目
                } else if (n == 2) {
                    imagePoke.setImageResource(R.drawable.oomurasaki)
                    tvPoke.text = ("つぎの問題")
                    var quiz2 = pokemonquiz("アオムラサキ", "オオムラサキ", "ムラサキアゲハ")
                    //４問目
                } else if (n == 3) {
                    imagePoke.setImageResource(R.drawable.miyamakarasu)
                    tvPoke.text = ("つぎの問題")
                    var quiz3 = pokemonquiz("クロアゲハ", "ミヤマカラスアゲハ", "カラスアゲハ")
                    // 5
                } else if (n == 4) {
                    imagePoke.setImageResource(R.drawable.morufodaiana)
                    tvPoke.text = ("つぎの問題")
                    var quiz3 = pokemonquiz("モルフォチョウ", "モルフォダイアナ", "オーロラモルフォ")
                    // 6
                } else if (n == 5) {
                    imagePoke.setImageResource(R.drawable.aosuji)
                    tvPoke.text = ("つぎの問題")
                    var quiz3 = pokemonquiz("ミヤマカラスアゲハ", "アオスジアゲハ", "ジャコウアゲハ")
                    // 7
                } else if (n == 6) {
                    imagePoke.setImageResource(R.drawable.jyakou)
                    tvPoke.text = ("つぎの問題")
                    var quiz3 = pokemonquiz("カラスアゲハ", "ジャコウアゲハ", "ミヤマカラスアゲハ")
                    // 8
                } else if (n == 7) {
                    imagePoke.setImageResource(R.drawable.kiageha)
                    tvPoke.text = ("つぎの問題")
                    var quiz3 = pokemonquiz("ゴマダラチョウ", "キアゲハ", "オオムラサキ")
                    // 9
                } else if (n == 8) {
                    imagePoke.setImageResource(R.drawable.chadoku)
                    tvPoke.text = ("きもちわるい　がぞうです。")
                    var quiz3 = pokemonquiz("アオイラガの幼虫", "チャドクガの幼虫", "スズメガの幼虫")
                    // 10
                } else if (n == 9) {
                    imagePoke.setImageResource(R.drawable.oosukasi)
                    tvPoke.text = ("ガのもんだいです。")
                    var quiz3 = pokemonquiz("スズメガ", "オオスカシバ", "セスジスズメ")
                    // 11
                } else if (n == 10) {
                    imagePoke.setImageResource(R.drawable.himeasagi)
                    tvPoke.text = ("つぎの問題")
                    var quiz3 = pokemonquiz("ヒメギフチョウ", "ヒメアサギマダラ", "コヒョウモン")
                    //12
                } else if (n == 11) {
                    imagePoke.setImageResource(R.drawable.tumaguro)
                    tvPoke.text = ("つぎの問題")
                    var quiz3 = pokemonquiz("コヒョウモン", "ツマグロヒョウモン", "オオゴマダラ")
                    //13
                } else if (n == 12) {
                    imagePoke.setImageResource(R.drawable.oogoadara)
                    tvPoke.text = ("つぎの問題")
                    var quiz3 = pokemonquiz("キアゲハ", "オオゴマダラ", "ルリタテハ")
                    //14
                } else if (n == 13) {
                    imagePoke.setImageResource(R.drawable.oogomadarachou)
                    tvPoke.text = ("つぎの問題")
                    var quiz3 = pokemonquiz("キアゲハ", "オオゴマダラ", "ルリタテハ")
                    //15
                } else if (n == 14) {
                    imagePoke.setImageResource(R.drawable.ruritateha)
                    tvPoke.text = ("つぎの問題")
                    var quiz3 = pokemonquiz("カラスアゲハ", "ルリタテハ", "オオゴマダラ")
                    //16
                } else if (n == 15) {
                    imagePoke.setImageResource(R.drawable.ruritatehayouchuu)
                    tvPoke.text = ("つぎの問題")
                    var quiz3 = pokemonquiz("カラスアゲハ", "ルリタテハ", "オオゴマダラ")
                    //17
                } else if (n == 16) {
                    imagePoke.setImageResource(R.drawable.toribane)
                    tvPoke.text = ("つぎの問題")
                    var quiz3 = pokemonquiz("グリーンアゲハ", "トリバネアゲハ", "モルフォチョウ")
                    //18
                } else if (n == 17) {
                    imagePoke.setImageResource(R.drawable.morufho)
                    tvPoke.text = ("とてもきれいなちょうちょです")
                    var quiz3 = pokemonquiz("チャドクガ", "モルフォチョウ", "トリバネアゲハ")
                    //19
                } else if (n == 18) {
                    imagePoke.setImageResource(R.drawable.atras)
                    tvPoke.text = ("世界最大のガです。")
                    var quiz3 = pokemonquiz("ゴライアス", "ヨナグニサン", "トリバネ")
                    //20
                } else if (n == 19) {
                    imagePoke.setImageResource(R.drawable.kusunoki)
                    tvPoke.text = ("つぎの問題")
                    var quiz3 = pokemonquiz("タテハチョウ", "クスノキアゲハ", "イラガ")
                    //21
                } else if (n == 20) {
                    imagePoke.setImageResource(R.drawable.kujyaku)
                    tvPoke.text = ("つぎの問題")
                    var quiz3 = pokemonquiz("アカボシチョウ", "クジャクチョウ", "ヘビチョウ")
                    //22
                } else if (n == 21) {
                    imagePoke.setImageResource(R.drawable.kusunokiagehachou)
                    tvPoke.text = ("つぎの問題")
                    var quiz3 = pokemonquiz("アオジャコウアゲハ", "クスノキアゲハ", "ミヤマカラスアゲハ")
                    //23
                } else if (n == 22) {
                    imagePoke.setImageResource(R.drawable.aosujiageha)
                    tvPoke.text = ("幼虫の問題")
                    var quiz3 = pokemonquiz("モンシロチョウ", "アオスジアゲハ", "アゲハチョウ")
                    //24
                } else if (n == 23) {
                    imagePoke.setImageResource(R.drawable.crowdi)
                    tvPoke.text = ("ブラジルに生息している")
                    var quiz3 = pokemonquiz("レッドモルフォ", "クラウディーナミイロタテハ", "ブルータテハ")
                }

                binding.btnclear.setOnClickListener {
                    recreate()
                }
            }
        }
        }
        private fun pokemonquiz(firstquiz: String, secondquiz: String, thirdquiz: String) {
            /*pokemonquiz(var firstquiz: String,var secondquiz: String,var thirdquiz: String)
        var　を入れていたが、エラー表示されたため、削除　起動するようになった。
        下記、コードメソッドにて処理
         */
            //上記リストををシャッフルしてbtn(ボタンに表示させる)
            val list = listOf(0, 1, 2)
            val num = list.shuffled()

            var imagePoke: ImageView = findViewById(R.id.imageViewPoke)
            var btnPoke: Button = findViewById(R.id.btnPoke)
            var tvPoke: TextView = findViewById(R.id.tvPoke)
            var btnans1: Button = findViewById(R.id.btnans1)
            var btnans2: Button = findViewById(R.id.btnans2)
            var btnans3: Button = findViewById(R.id.btnans3)

            val lizardon = arrayOf(firstquiz, secondquiz, thirdquiz)

            btnans1.text = lizardon[num[0]]
            btnans2.text = lizardon[num[1]]
            btnans3.text = lizardon[num[2]]

            //btnを押した時の判定　3択問題　２番目に正解を入力する。
            binding.btnans1.setOnClickListener {
                if (btnans1.text == lizardon[1]) {
                    tvPoke.text = getString(R.string.answer)

//ボタン無効のメソッド
                    noans()
                } else {
                    tvPoke.text = getString(R.string.boo)
                    noans2()
                }
            }
            binding.btnans2.setOnClickListener {
                if (btnans2.text == lizardon[1]) {
                    tvPoke.text = getString(R.string.answer)
                    noans()
                } else {
                    tvPoke.text = getString(R.string.boo)
                    noans2()
                }
            }
            binding.btnans3.setOnClickListener {
                if (btnans3.text == lizardon[1]) {
                    tvPoke.text = getString(R.string.answer)
                    noans()
                } else {
                    tvPoke.text = getString(R.string.boo)
                    noans2()
                }
            }

        }

        //正解時　ボタンを無効化するメソッド
        private fun noans() {
            var btnans1: Button = findViewById(R.id.btnans1)
            var btnans2: Button = findViewById(R.id.btnans2)
            var btnans3: Button = findViewById(R.id.btnans3)
            var btnPoke: Button = findViewById(R.id.btnPoke)
            btnans1.isEnabled = false
            btnans2.isEnabled = false
            btnans3.isEnabled = false
            btnPoke.isEnabled = true

        }

        //不正解時にボタンを無効化
        private fun noans2() {
            var btnans1: Button = findViewById(R.id.btnans1)
            var btnans2: Button = findViewById(R.id.btnans2)
            var btnans3: Button = findViewById(R.id.btnans3)
            var btnPoke: Button = findViewById(R.id.btnPoke)
            btnans1.isEnabled = false
            btnans2.isEnabled = false
            btnans3.isEnabled = false
            btnPoke.isEnabled = false

        }


}

