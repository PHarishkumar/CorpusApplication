package com.corpus.ui.fragment

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.corpus.R
import com.corpus.databinding.FragmentAboutBinding
import com.corpus.databinding.FragmentHomeBinding
import com.corpus.ui.activity.LoginActivity
import com.corpus.utils.MyPreference


class AboutFragment : Fragment() {
    private lateinit var fragmentAboutBinding: FragmentAboutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentAboutBinding = DataBindingUtil.inflate<FragmentAboutBinding>(
            inflater,
            R.layout.fragment_about,
            container,
            false
        )

        fragmentAboutBinding.txtLogout.setOnClickListener {
            val builder = AlertDialog.Builder(this.requireContext())
            builder.setMessage("Are you sure you want to Delete?")
                .setCancelable(false)
                .setPositiveButton("Yes") { dialog, id ->

                    val prefs = MyPreference.getInstance(this.requireContext())
                    prefs.clear()
                    val intent = Intent(this.requireContext(), LoginActivity::class.java)
                    intent.addFlags(
                        Intent.FLAG_ACTIVITY_CLEAR_TOP or
                                Intent.FLAG_ACTIVITY_CLEAR_TASK or
                                Intent.FLAG_ACTIVITY_NEW_TASK
                    )
                    startActivity(intent)

                }
                .setNegativeButton("No") { dialog, id ->
                    // Dismiss the dialog
                    dialog.dismiss()
                }
            val alert = builder.create()
            alert.show()
        }

        return fragmentAboutBinding.root
    }


}