package com.thedeveloperworldisyours.mathexamples

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [FibonacciFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [FibonacciFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FibonacciFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fibonacci_fragment, container, false)
    }

    companion object {

        fun newInstance(): FibonacciFragment {
            return FibonacciFragment()
        }

    }
}// Required empty public constructor
