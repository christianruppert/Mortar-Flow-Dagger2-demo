package com.lukaspili.mortardemo.rest;

import com.lukaspili.mortardemo.model.Post;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * @author Lukasz Piliszczuk <lukasz.pili@gmail.com>
 */
public interface Service {

    @GET("/posts")
    void getPosts(Callback<List<Post>> callback);
}
