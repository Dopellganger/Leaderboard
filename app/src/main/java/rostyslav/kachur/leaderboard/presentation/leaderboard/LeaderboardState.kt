package kachur.rostyslav.leaderboard.presentation.leaderboard

import androidx.annotation.StringRes
import rostyslav.kachur.leaderboard.R
import rostyslav.kachur.leaderboard.presentation.leaderboard.UserUI

data class LeaderboardState(
    var users: List<UserUI> = listOf(),
    var tabType: TabType = TabType.REGION,
    var inProgress: Boolean = false
)

enum class TabType(
    @StringRes
    val stringRes: Int
) {
    REGION(R.string.region), NATIONAL(R.string.national), GLOBAL(R.string.global)
}
