package moblie.programming.musicstreamingapp.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {

    @GET("/v3/220e6209-4289-4a67-8202-c8b26788c1a9")
    fun listMusics() : Call<MusicDto>
}