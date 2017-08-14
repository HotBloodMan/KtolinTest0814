package com.example.a1.ktolintest0814

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

/**
 * Created by 1 on 2017/8/14.
 */

class  SecondActivity : Activity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second);
        btn.setOnClickListener(this);
    }

    override fun onClick(p0: View?) {
        Toast.makeText(baseContext,"Ktolin Start....",Toast.LENGTH_SHORT).show()
    }


}