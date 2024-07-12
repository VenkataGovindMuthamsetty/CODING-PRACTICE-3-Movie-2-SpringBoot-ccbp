package com.example.movie.model;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.movie.model.Movie;

public class MovieRowMapper implements RowMapper<Movie> {

    public Movie mapRow(ResultSet rs, int rowNUm) throws SQLException{
        return new Movie(rs.getInt("movieId"),
                rs.getString("movieName"),
                rs.getString("leadActor"));
    }
}
