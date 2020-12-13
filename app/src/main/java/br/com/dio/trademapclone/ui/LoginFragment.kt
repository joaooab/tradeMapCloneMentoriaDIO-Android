package br.com.dio.trademapclone.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import br.com.dio.trademapclone.MainActivity
import br.com.dio.trademapclone.R
import kotlinx.android.synthetic.main.activity_main.*

class LoginFragment : Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as MainActivity).toolbar.visibility = View.GONE
    }

}