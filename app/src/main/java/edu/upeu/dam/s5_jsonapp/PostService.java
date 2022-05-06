package edu.upeu.dam.s5_jsonapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostService {

    String API_ROUTE="/posts";

    @GET(API_ROUTE)
    Call<List<Post>> getPost();


}
