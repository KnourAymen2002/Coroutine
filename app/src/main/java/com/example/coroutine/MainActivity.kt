package com.example.coroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilName : TextInputLayout
    lateinit var tilEmail : TextInputLayout
    lateinit var etName : EditText
    lateinit var etMobile : EditText
    lateinit var etEmail : EditText
    lateinit var etPassword : EditText
    lateinit var btnClear : MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilName = findViewById(R.id.til_name)
        tilEmail = findViewById(R.id.til_email)
        etName = findViewById(R.id.et_name)
        etMobile = findViewById(R.id.et_Mobile)
        etEmail = findViewById(R.id.et_Email)
        etPassword = findViewById(R.id.et_password)
        btnClear = findViewById(R.id.bt_clear)


    }
}