package com.example.android.kotlintrivia

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.android.kotlintrivia.databinding.FragmentGameOverBinding

/**
 * A simple [Fragment] subclass.
 *
 */
class GameOverFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding : FragmentGameOverBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_game_over, container, false)

        binding.tryAgainButton.setOnClickListener {view : View ->
            view.findNavController().navigate(GameOverFragmentDirections.actionGameOverFragment2ToGameFragment())
        }
        // Inflate the layout for this fragment
        return binding.root
    }
}
