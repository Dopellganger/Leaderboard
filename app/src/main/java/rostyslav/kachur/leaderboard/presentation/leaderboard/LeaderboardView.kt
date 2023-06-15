package rostyslav.kachur.leaderboard.presentation.leaderboard

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import kachur.rostyslav.leaderboard.presentation.leaderboard.LeaderboardState
import kachur.rostyslav.leaderboard.presentation.leaderboard.TabType
import rostyslav.kachur.leaderboard.R
import rostyslav.kachur.leaderboard.presentation.ui.LoadingProgressIndicator
import rostyslav.kachur.leaderboard.presentation.ui.theme.CornflowerBlue
import rostyslav.kachur.leaderboard.presentation.ui.theme.Default
import rostyslav.kachur.leaderboard.presentation.ui.theme.LightGrey

@Composable
fun LeaderboardView(viewModel: LeaderboardViewModel = hiltViewModel()) {
    val state = viewModel.viewState
    LeaderboardViewContent(
        state = state,
        onTabCLick = remember {
            {
                viewModel.changeTab(it)
            }
        }
    )
}

@Composable
private fun LeaderboardViewContent(
    state: LeaderboardState,
    onTabCLick: (TabType) -> Unit
) {
    LoadingProgressIndicator(state.inProgress)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 14.dp,
                        bottom = 21.dp
                    ),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(id = R.string.leaderboard),
                    style = TextStyle(
                        fontSize = 20.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight.W600,
                        color = Default
                    )
                )
            }
            TabView(tabType = state.tabType, onTabCLick = onTabCLick)
        }
        LeaderboardList(state.users)
    }
}

@Composable
private fun TabView(onTabCLick: (TabType) -> Unit, tabType: TabType) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 29.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(LightGrey)
            .padding(horizontal = 24.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TabViewItem(selectedType = tabType, tabType = TabType.REGION, onTabCLick = onTabCLick)
        TabViewItem(selectedType = tabType, tabType = TabType.NATIONAL, onTabCLick = onTabCLick)
        TabViewItem(selectedType = tabType, tabType = TabType.GLOBAL, onTabCLick = onTabCLick)
    }
}

@Composable
fun TabViewItem(
    selectedType: TabType,
    tabType: TabType,
    onTabCLick: (TabType) -> Unit
) {
    Column(
        modifier = Modifier.clickable { onTabCLick.invoke(tabType) }
    ) {
        Spacer(modifier = Modifier.size(16.dp))
        Text(
            text = stringResource(id = tabType.stringRes),
            style = TextStyle(
                fontSize = 15.sp,
                lineHeight = 18.sp,
                fontWeight = FontWeight.W500,
                color = Default
            )
        )
        Spacer(modifier = Modifier.size(16.dp))
        if (selectedType == tabType) {
            Box(
                Modifier
                    .width(45.dp)
                    .height(3.dp)
                    .background(CornflowerBlue)
                    .clip(RoundedCornerShape(10.dp))
            )
            Spacer(modifier = Modifier.size(2.dp))
        }
    }
}

@Preview
@Composable
fun LeaderboardViewPreview() {
    LeaderboardView()
}
