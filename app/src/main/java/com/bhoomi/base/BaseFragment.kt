package com.bhoomi.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewbinding.ViewBinding


abstract class BaseFragment<T : ViewBinding>(private val bindingInflater: (layoutInflater: LayoutInflater) -> T) :
    Fragment() {


    private lateinit var _binding: T
   /* lateinit var progressBar: ProgressBarHandler
    private lateinit var sharePref: SharePref
    lateinit var user:Data*/

    protected val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = bindingInflater.invoke(inflater)
       /* progressBar = ProgressBarHandler(requireContext())
        sharePref= SharePref(requireContext())
        user = SharePref(requireContext()).getUserDetails()*/
        initView()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
        setObserver()
    }


    open fun initView() {}
    open fun setObserver() {}
    fun openFragment(fragment: Fragment) {
       /* parentFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment_activity_main, fragment).commit()
*/
    }

  /*  fun onBackPressed() {
        requireActivity().onBackPressedDispatcher.addCallback(this) {
            openFragment(HomeFragment())
        }
    }*/



     fun logout(){
         //sharePref.logout()

     }
    fun openLoginActivity(activity: FragmentActivity?)
    {
      /*  val intent=Intent(activity,LoginActivity::class.java)
        requireActivity().startActivity(intent)
        activity?.finishAffinity()*/
    }
}
