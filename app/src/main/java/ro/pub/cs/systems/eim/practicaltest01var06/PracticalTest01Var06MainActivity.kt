package ro.pub.cs.systems.eim.practicaltest01var06

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import kotlin.random.Random

class PracticalTest01Var06MainActivity : ComponentActivity() {

    private lateinit var number1EditText: EditText
    private lateinit var number2EditText: EditText
    private lateinit var number3EditText: EditText
    
    private lateinit var number1CheckBox: CheckBox
    private lateinit var number2CheckBox: CheckBox
    private lateinit var number3CheckBox: CheckBox
    
    private lateinit var playButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practical_test01_var06_main)

        number1EditText = findViewById(R.id.edit_text_1)
        number2EditText = findViewById(R.id.edit_text_2)
        number3EditText = findViewById(R.id.edit_text_3)
        
        number1CheckBox = findViewById(R.id.check_box_1)
        number2CheckBox = findViewById(R.id.check_box_2)
        number3CheckBox = findViewById(R.id.check_box_3)
        
        playButton = findViewById(R.id.button_play)

        playButton.setOnClickListener {
            if (!number1CheckBox.isChecked) {
                number1EditText.setText(generateRandomValue())
            }
            if (!number2CheckBox.isChecked) {
                number2EditText.setText(generateRandomValue())
            }
            if (!number3CheckBox.isChecked) {
                number3EditText.setText(generateRandomValue())
            }

            val text1 = number1EditText.text.toString()
            val text2 = number2EditText.text.toString()
            val text3 = number3EditText.text.toString()

            Toast.makeText(this, "$text1, $text2, $text3", Toast.LENGTH_SHORT).show()
        }
    }

    private fun generateRandomValue(): String {
        val options = listOf("1", "2", "3", "*")
        return options[Random.nextInt(options.size)]
    }
}

