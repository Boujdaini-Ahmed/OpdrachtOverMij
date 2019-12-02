package be.brussel.boujdainiahmed.overmij

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.view.inputmethod.InputMethodManager
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.voeg_button).setOnClickListener {
            addNickname(it)
        }
    }

    private fun addNickname(view: View) {
        val editText = findViewById<EditText>(R.id.Vakken)
        val presentatie = findViewById<TextView>(R.id.presentatie)
        val message = editText.text.toString() + System.getProperty("line.separator")


        if(message.trim().isNotEmpty()) {
            presentatie.append(message)
            editText.text.clear()
        }


       // presentatie.text = editText.text
       // editText.visibility = View.GONE
       // view.visibility = View.GONE
       // presentatie.visibility = View.VISIBLE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
