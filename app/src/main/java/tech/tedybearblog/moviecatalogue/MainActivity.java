package tech.tedybearblog.moviecatalogue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMovies;
    private ArrayList<Movie> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMovies = findViewById(R.id.rv_movies);
        rvMovies.setHasFixedSize(true);

        list.addAll(MovieData.getListData());
        showRecycleList();

    }

    private void showRecycleList() {
        rvMovies.setLayoutManager(new LinearLayoutManager(this));
        ListMovieAdapter listMovieAdapter = new ListMovieAdapter(list);
        rvMovies.setAdapter(listMovieAdapter);

        listMovieAdapter.setOnItemClickCallBack(new ListMovieAdapter.OnItemClickCallBack() {

            @Override
            public void onItemClicked(Movie data) {
                showSelectedMovie(data);
            }
        });
    }

    private void showSelectedMovie(Movie movie) {
        Toast.makeText(this, "detail to : " + movie.getName(), Toast.LENGTH_SHORT).show();

        Movie mMovie = new Movie();
        mMovie.setName(movie.getName());
        mMovie.setFrom(movie.getFrom());
        mMovie.setContent(movie.getContent());
        mMovie.setPhoto(movie.getPhoto());
        mMovie.setPoster(movie.getPoster());
        mMovie.setLanguage(movie.getLanguage());
        mMovie.setRuntime(movie.getRuntime());
        mMovie.setBudget(movie.getBudget());
        mMovie.setRevenue(movie.getRevenue());

        Intent intentDetailMovie = new Intent(MainActivity.this, DetailMovieActivity.class);
        intentDetailMovie.putExtra(DetailMovieActivity.EXTRA_DETAIL, mMovie);
        startActivity(intentDetailMovie);

    }
}