package com.bhoomi.ext

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.Toast


fun Context.printTost(massage:String)
{
    Toast.makeText(this,massage, Toast.LENGTH_LONG).show()
}
fun Context.startActivity(activity: Activity){
    val intent= Intent(this,activity::class.java)
    startActivity(intent)
}
fun Context.logout()
{
    //val sharePref= SharePref(this)
    //if(sharePref.logout()) printTost("logut")
    //startActivity(LoginActivity())
}
fun Context.openFragment(){

}