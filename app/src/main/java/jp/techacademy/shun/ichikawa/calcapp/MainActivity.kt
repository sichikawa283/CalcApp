package jp.techacademy.shun.ichikawa.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusButton.setOnClickListener(this)
        minusButton.setOnClickListener(this)
        multiplyButton.setOnClickListener(this)
        divisionButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            if (v.id == R.id.plusButton) {
                plusButton.setOnClickListener {
                    val value1 = editText1.text.toString().toDouble()
                    val value2 = editText2.text.toString().toDouble()
                    val result = value1 + value2
                    val intent = Intent(this, SecondActivity::class.java)
                    intent.putExtra("RESULT", result)
                    startActivity(intent)
                }
            } else if (v.id == R.id.minusButton) {
                // 引き算
                minusButton.setOnClickListener {
                    val value1 = editText1.text.toString().toDouble()
                    val value2 = editText2.text.toString().toDouble()
                    val result = value1 - value2
                    val intent = Intent(this, SecondActivity::class.java)
                    intent.putExtra("RESULT", result)
                    startActivity(intent)
                }
            } else if (v.id == R.id.multiplyButton) {
                multiplyButton.setOnClickListener {
                    val value1 = editText1.text.toString().toDouble()
                    val value2 = editText2.text.toString().toDouble()
                    val result = value1 * value2
                    val intent = Intent(this, SecondActivity::class.java)
                    intent.putExtra("RESULT", result)
                    startActivity(intent)
                }
            } else {
                // 割り算
                divisionButton.setOnClickListener {
                    val value1 = editText1.text.toString().toDouble()
                    val value2 = editText2.text.toString().toDouble()
                    val result = value1 / value2
                    val intent = Intent(this, SecondActivity::class.java)
                    intent.putExtra("RESULT", result)
                    startActivity(intent)
                }
            }
        }
    }
}