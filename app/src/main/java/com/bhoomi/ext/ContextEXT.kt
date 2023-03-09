package com.bhoomi.ext

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.bhoomi.LoginActivity
import com.bhoomi.R
import com.google.android.material.bottomsheet.BottomSheetDialog


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
fun Context.addbottomSheet(con: Activity)
{
    val btnsheet = con.layoutInflater.inflate(R.layout.fragment_bottom_sheet, null)
   val  bottomSheetDialog= BottomSheetDialog(this)
    bottomSheetDialog.setContentView(btnsheet)
    bottomSheetDialog.show()

}