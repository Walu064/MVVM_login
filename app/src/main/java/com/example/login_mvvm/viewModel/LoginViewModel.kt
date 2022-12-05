package com.example.login_mvvm.viewModel

import android.text.Editable
import android.text.TextWatcher
import androidx.lifecycle.ViewModel
import com.example.login_mvvm.`interface`.LoginResultCallBacks
import com.example.login_mvvm.model.User

class LoginViewModel (private val listener:LoginResultCallBacks) : ViewModel() {

    private var user : User = User("", "")

    val emailTextWatcher : TextWatcher
        get() = object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                TODO("Not yet implemented")
            }

            override fun afterTextChanged(p0: Editable?) {
                user.setEmail(p0.toString())
            }
        }

    val passwordTextWatcher : TextWatcher
        get() = object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                TODO("Not yet implemented")
            }

            override fun afterTextChanged(p0: Editable?) {
                user.setPassword(p0.toString())
            }
        }
}