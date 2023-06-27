package com.atifqamar.customtoast

import android.content.Context
import android.view.Gravity
import android.widget.Toast

class AtifToast {

    fun showToast(context: Context , message : String ){
        val toast = Toast.makeText(context, message, Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }

}