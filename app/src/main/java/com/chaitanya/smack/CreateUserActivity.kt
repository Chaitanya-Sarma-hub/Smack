package com.chaitanya.smack

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlin.random.Random

class CreateUserActivity : AppCompatActivity() {

    private var userAvatar = "profileDefault"
    private var avatarColor = "[0.5, 0.5, 0.5, 1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
    }

    fun generateUserAvatar(view: View) {
        val color = Random.nextInt(2)
        val avatar = Random.nextInt(28)

        userAvatar = if(color == 0) {
            "light$avatar"
        } else {
            "dark$avatar"
        }
        val resourceId = resources.getIdentifier(userAvatar, "drawable", packageName)
        findViewById<ImageView>(R.id.createAvatarImageView).setImageResource(resourceId)
    }

    fun generateColorClicked(view: View) {
        val r = Random.nextInt(255)
        val g = Random.nextInt(255)
        val b = Random.nextInt(255)
        findViewById<ImageView>(R.id.createAvatarImageView).setBackgroundColor(Color.rgb(r,g,b))
        val savedR = r.toDouble()/255
        val savedG = r.toDouble()/255
        val savedB = r.toDouble()/255

        avatarColor = "[$savedR, $savedG, $savedB, 1]"
    }

    fun createUserClicked(view: View) {

    }

}