package com.app.fetchretrovit.movie.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.fetchretrovit.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_details_movie.*


class DetailsMovieFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageMovie = arguments?.getString("imageURL")
        val synopsisMovie = arguments?.getString("synopsis")
        val durationMovie = arguments?.getString("duration")
        synopsisMoviesDetails.text = "Duration : ${durationMovie.toString()}\n\n${synopsisMovie.toString()}"
        Picasso.get().load(imageMovie).into(imageMoviesDetails)
    }
}