package rostyslav.kachur.leaderboard.data

data class User(
    val name: String,
    val username: String,
    val score: Int,
    val image: String,
    val isRatingGrew: Boolean
)