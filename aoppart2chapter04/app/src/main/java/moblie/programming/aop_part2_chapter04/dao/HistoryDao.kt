package moblie.programming.aop_part2_chapter04.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import moblie.programming.aop_part2_chapter04.model.History

@Dao
interface HistoryDao {

    @Query("SELECT * FROM history")
    fun getAll(): List<History>

    @Insert
    fun insertHistory(history: History)

    @Query("DELETE FROM history")
    fun deleteAll()
}