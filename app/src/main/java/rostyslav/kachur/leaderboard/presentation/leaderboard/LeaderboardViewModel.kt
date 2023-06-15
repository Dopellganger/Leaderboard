package rostyslav.kachur.leaderboard.presentation.leaderboard

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kachur.rostyslav.leaderboard.presentation.leaderboard.LeaderboardState
import kachur.rostyslav.leaderboard.presentation.leaderboard.TabType
import rostyslav.kachur.leaderboard.data.LeaderboardDataStore
import rostyslav.kachur.leaderboard.presentation.toUserUI
import javax.inject.Inject

@HiltViewModel
class LeaderboardViewModel @Inject constructor(
    private val leaderboardDataStore: LeaderboardDataStore
): ViewModel() {
    private val _viewState = mutableStateOf(LeaderboardState())
    val viewState: LeaderboardState get() = _viewState.value

    init {
        loadData()
    }

    fun changeTab(newTabType: TabType) {
        reduce {
            tabType = newTabType
        }
        loadData()
    }

    private fun loadData() {
        reduce { inProgress = true }
        reduce {
            users = leaderboardDataStore.loadLeaderboard(tabType).map { it.toUserUI() }
        }
        reduce { inProgress = false }
    }

    private fun reduce(block: LeaderboardState.() -> Unit) {
        val copy = viewState.copy()
        copy.block()
        _viewState.value = copy
    }
}
