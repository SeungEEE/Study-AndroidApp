package moblie.programming.musicstreamingapp

import androidx.lifecycle.ViewModelLazy
import com.google.common.math.LongMath

data class MusicModel (
    val id:Long,
    val track: String,
    val streamUrl: String,
    val artist: String,
    val coverUrl: String,
    val isPlaying: Boolean = false
)



