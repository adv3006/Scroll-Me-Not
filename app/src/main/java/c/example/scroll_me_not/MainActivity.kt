package c.example.scroll_me_not

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addComment(view: View) {
        // Sending error msg
        val comment = Toast.makeText(this,
                "Add comments functionality isn't implemented!",
                Toast.LENGTH_SHORT)
        // re-align the msg
        val msg = comment.view.findViewById<TextView>(android.R.id.message)
        msg.gravity = Gravity.CENTER or Gravity.BOTTOM
        comment.show()
    }
}
