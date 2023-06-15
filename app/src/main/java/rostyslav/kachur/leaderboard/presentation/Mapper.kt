package rostyslav.kachur.leaderboard.presentation

import rostyslav.kachur.leaderboard.data.User
import rostyslav.kachur.leaderboard.presentation.leaderboard.UserUI

fun User.toUserUI(): UserUI {
    return UserUI(
        name = this.name,
        username = this.username,
        score = this.score,
        isRatingGrew = this.isRatingGrew,
        image = this.image
    )
}

