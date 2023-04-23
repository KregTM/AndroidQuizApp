package com.kreg.quizapp.result

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kreg.quizapp.R
import com.kreg.quizapp.helpers.DataManager
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ResultFragment: Fragment() {

    @Inject
    lateinit var storage: DataManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return  inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val testResult = view.findViewById<TextView>(R.id.score_text)
        testResult.text = getString(R.string.result_text, storage.test.score)
        val buttonRestart = view.findViewById<Button>(R.id.restart_button)
        buttonRestart.setOnClickListener {
            storage.test.score = 0
            findNavController().popBackStack(R.id.loginFragment, false)
        }
    }
}