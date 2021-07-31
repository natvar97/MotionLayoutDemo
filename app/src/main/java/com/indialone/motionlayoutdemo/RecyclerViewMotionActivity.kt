package com.indialone.motionlayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.indialone.motionlayoutdemo.databinding.ActivityMainBinding
import com.indialone.motionlayoutdemo.databinding.ActivityRecyclerViewMotionBinding
import com.indialone.motionlayoutdemo.model.Movie
import com.indialone.motionlayoutdemo.model.MovieItemAdapter

class RecyclerViewMotionActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityRecyclerViewMotionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityRecyclerViewMotionBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.rvMain.layoutManager = LinearLayoutManager(this)
        mBinding.rvMain.adapter = MovieItemAdapter(getMoviesList())


    }

    private fun getMoviesList(): ArrayList<Movie> {

        val list = ArrayList<Movie>()
        list.add(
            Movie(
                "Sherlock Holmes TV Series",
                "9.6/10",
                "Sir Arthur Canon Doyle",
                R.drawable.sherlock_series
            )
        )
        list.add(
            Movie(
                "Sherlock Holmes TV Series",
                "9.6/10",
                "Sir Arthur Canon Doyle",
                R.drawable.sherlock_series
            )
        )
        list.add(
            Movie(
                "Sherlock Holmes TV Series",
                "9.6/10",
                "Sir Arthur Canon Doyle",
                R.drawable.sherlock_series
            )
        )
        list.add(
            Movie(
                "Sherlock Holmes TV Series",
                "9.6/10",
                "Sir Arthur Canon Doyle",
                R.drawable.sherlock_series
            )
        )
        list.add(
            Movie(
                "Sherlock Holmes TV Series",
                "9.6/10",
                "Sir Arthur Canon Doyle",
                R.drawable.sherlock_series
            )
        )
        list.add(
            Movie(
                "Sherlock Holmes TV Series",
                "9.6/10",
                "Sir Arthur Canon Doyle",
                R.drawable.sherlock_series
            )
        )
        list.add(
            Movie(
                "Sherlock Holmes TV Series",
                "9.6/10",
                "Sir Arthur Canon Doyle",
                R.drawable.sherlock_series
            )
        )
        list.add(
            Movie(
                "Sherlock Holmes TV Series",
                "9.6/10",
                "Sir Arthur Canon Doyle",
                R.drawable.sherlock_series
            )
        )
        list.add(
            Movie(
                "Sherlock Holmes TV Series",
                "9.6/10",
                "Sir Arthur Canon Doyle",
                R.drawable.sherlock_series
            )
        )
        list.add(
            Movie(
                "Sherlock Holmes TV Series",
                "9.6/10",
                "Sir Arthur Canon Doyle",
                R.drawable.sherlock_series
            )
        )


        return list
    }


}