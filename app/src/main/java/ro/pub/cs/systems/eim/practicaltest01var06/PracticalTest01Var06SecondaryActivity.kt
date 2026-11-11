package ro.pub.cs.systems.eim.practicaltest01var06

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class PracticalTest01Var06SecondaryActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_practical_test01_var06_secondary)
        val resultTextView = findViewById<TextView>(R.id.text_view_result)
        val okButton = findViewById<Button>(R.id.button_ok)

        val t1 = intent.getStringExtra("text1") ?: ""
        val t2 = intent.getStringExtra("text2") ?: ""
        val t3 = intent.getStringExtra("text3") ?: ""
        val checks = intent.getIntExtra("checks", 0)

        val values = listOf(t1,t2,t3)
        val nonAsterisks = values.filter { it != "*" }
        val isWinning = nonAsterisks.distinct().size <= 1

        if (isWinning) {
            val score = when (checks) {
                0 -> 100
                1 -> 50
                2 -> 10
                else -> 0
            }
            resultTextView.text = "Gained $score"

            val intentToReturn = android.content.Intent()
            intentToReturn.putExtra("score", score)
            setResult(android.app.Activity.RESULT_OK, intentToReturn)
        } else {
            resultTextView.text = ""
            setResult(android.app.Activity.RESULT_CANCELED)
        }

        okButton.setOnClickListener {
            finish()
        }
    }
}
