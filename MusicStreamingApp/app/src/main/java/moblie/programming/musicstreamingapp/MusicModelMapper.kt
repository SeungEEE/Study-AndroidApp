package moblie.programming.musicstreamingapp

import moblie.programming.musicstreamingapp.service.MusicDto
import moblie.programming.musicstreamingapp.service.MusicEntity

fun MusicEntity.mapper(id: Long): MusicModel =
    MusicModel(
        id = id,
        streamUrl = streamUrl,
        coverUrl = coverUrl,
        track = track,
        artist = artist
    )

fun MusicDto.mapper(): PlayerModel {
    return PlayerModel(
        playMusicList = this.musics.mapIndexed { index, musicEntity ->
            musicEntity.mapper(index.toLong())
        })
}