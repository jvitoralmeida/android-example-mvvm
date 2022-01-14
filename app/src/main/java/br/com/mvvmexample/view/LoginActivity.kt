package br.com.mvvmexample.view

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import br.com.mvvmexample.R
import br.com.mvvmexample.databinding.LoginActivityBinding
import br.com.mvvmexample.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityMainBinding: LoginActivityBinding = DataBindingUtil.setContentView(this, R.layout.login_activity)
        activityMainBinding.setViewModel(LoginViewModel())
        activityMainBinding.executePendingBindings()
    }


    companion object {
        @BindingAdapter("toastMessage")
        @JvmStatic
        fun runMe(view: View, message: String?) {
            if (message != null) Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show()
        }
    }
}