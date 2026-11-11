package ro.pub.cs.systems.eim.practicaltest01var06

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.activity.ComponentActivity

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
    }
}

