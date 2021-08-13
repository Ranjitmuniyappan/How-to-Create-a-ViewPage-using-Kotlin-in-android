package com.rsa.viewpagertest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.rsa.viewpagertest.R


class FragmentOne : Fragment() {

    lateinit var name_tv:TextView
    lateinit var name:String


    companion object{

        @JvmStatic
        fun newInstanceOne(bundle: Bundle): FragmentOne {
            val fragment = FragmentOne()
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if(arguments?.get("name") != null)
        {
            name = arguments?.get("name") as String
        }
        return inflater.inflate(R.layout.fragment_one, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        name_tv = view.findViewById(R.id.name_tv)
        name_tv.text = name
    }

}