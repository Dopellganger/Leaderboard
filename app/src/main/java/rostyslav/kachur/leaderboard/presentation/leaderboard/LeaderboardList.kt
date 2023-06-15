package rostyslav.kachur.leaderboard.presentation.leaderboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import coil.compose.AsyncImage
import rostyslav.kachur.leaderboard.R
import rostyslav.kachur.leaderboard.presentation.ui.theme.DeepSaffron
import rostyslav.kachur.leaderboard.presentation.ui.theme.Default
import rostyslav.kachur.leaderboard.presentation.ui.theme.DividerColor
import rostyslav.kachur.leaderboard.presentation.ui.theme.GainsBoro
import rostyslav.kachur.leaderboard.presentation.ui.theme.LightGreyDark
import rostyslav.kachur.leaderboard.presentation.ui.theme.Malachite
import rostyslav.kachur.leaderboard.presentation.ui.theme.RobinEggBlue


@Composable
fun LeaderboardList(users: List<UserUI>) {
    val topThree = users.subList(0, 3)
    val others = users.subList(3, users.size)
    LazyColumn(
        modifier = Modifier.fillMaxWidth()
    ) {
        item {
            TopThreeUserView(topThree)
        }
        item {
            Spacer(modifier = Modifier.size(26.dp))
        }
        if (users.size > 3) {
            itemsIndexed(others) { index, user ->
                LeaderboardItemRow(user, index == 0, index == others.lastIndex)
            }
        }
    }
}

@Composable
fun LeaderboardItemRow(user: UserUI, isFirst: Boolean, isLast: Boolean) {
    val grewIcon = remember(user) {
        if (user.isRatingGrew) R.drawable.ic_rating_grew else R.drawable.ic_rating_fall
    }
    val modifier = if (isFirst) {
        Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
            .background(GainsBoro)
            .padding(
                start = 25.dp,
                end = 24.dp,
                top = 23.dp
            )
    } else {
        Modifier
            .fillMaxWidth()
            .background(GainsBoro)
            .padding(
                start = 25.dp,
                end = 24.dp,
                top = 23.dp
            )
    }
    Column(
        modifier = modifier,
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                AsyncImage(
                    modifier = Modifier
                        .size(50.dp)
                        .clip(RoundedCornerShape(45.dp)),
                    contentScale = ContentScale.Crop,
                    model = user.image,
                    contentDescription = null
                )
                Spacer(modifier = Modifier.size(21.dp))
                Column {
                    Text(
                        text = user.name,
                        style = TextStyle(
                            fontSize = 14.sp,
                            lineHeight = 17.sp,
                            fontWeight = FontWeight.W500,
                            color = Default
                        )
                    )
                    Text(
                        text = user.username,
                        style = TextStyle(
                            fontSize = 12.sp,
                            lineHeight = 15.sp,
                            fontWeight = FontWeight.W300,
                            color = Default
                        )
                    )
                }
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = user.score.toString(),
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 17.sp,
                        fontWeight = FontWeight.W700,
                        color = Default
                    )
                )
                Spacer(modifier = Modifier.size(6.dp))
                Image(
                    painter = painterResource(id = grewIcon),
                    contentDescription = null
                )
            }
        }
        Spacer(modifier = Modifier.size(14.dp))
        if (!isLast) {
            Divider(color = DividerColor)
        }
    }
}

@Composable
private fun TopThreeUserView(topThreeList: List<UserUI>) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp)
    ) {
        if (topThreeList.size > 1) {
            SecondThirdPlace(
                Modifier.weight(1f),
                topThreeList[1],
                RobinEggBlue,
                RoundedCornerShape(topStart = 12.dp, bottomStart = 12.dp)
            )
        }
        if (topThreeList.isNotEmpty()) {
            FirstPlace(Modifier.weight(1f), topThreeList[0])
        }
        if (topThreeList.size > 2) {
            SecondThirdPlace(
                Modifier.weight(1f),
                topThreeList[2],
                Malachite,
                RoundedCornerShape(topEnd = 12.dp, bottomEnd = 12.dp)
            )
        }
    }
}

@Composable
private fun FirstPlace(modifier: Modifier, user: UserUI) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier.offset(y = 18.dp),
            painter = painterResource(id = R.drawable.ic_crown),
            contentDescription = null
        )
        CircleImageWithBorder(size = 82.dp, borderColor = DeepSaffron, image = user.image)
        Column(
            modifier = Modifier
                .width(122.dp)
                .height(159.dp)
                .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                .background(LightGreyDark),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = Modifier.size(21.dp))
            Text(
                text = user.name,
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 16.94.sp,
                    fontWeight = FontWeight.W500,
                    color = Default
                )
            )
            Text(
                text = user.score.toString(),
                style = TextStyle(
                    fontSize = 15.sp,
                    lineHeight = 18.15.sp,
                    fontWeight = FontWeight.W700,
                    color = DeepSaffron
                )
            )
            Spacer(modifier = Modifier.size(9.dp))
            Text(
                text = user.username,
                style = TextStyle(
                    fontSize = 11.sp,
                    lineHeight = 13.31.sp,
                    fontWeight = FontWeight.W300,
                    color = Default
                )
            )
        }
    }
}

@Composable
private fun SecondThirdPlace(
    modifier: Modifier,
    user: UserUI,
    color: Color,
    roundedCornerShape: RoundedCornerShape
) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(87.dp))
        CircleImageWithBorder(size = 68.dp, borderColor = color, image = user.image)
        Column(
            modifier = Modifier
                .width(122.dp)
                .height(113.dp)
                .clip(roundedCornerShape)
                .background(GainsBoro),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.size(21.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = user.name,
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 16.94.sp,
                        fontWeight = FontWeight.W500,
                        color = Default
                    )
                )
                Text(
                    text = user.score.toString(),
                    style = TextStyle(
                        fontSize = 15.sp,
                        lineHeight = 18.15.sp,
                        fontWeight = FontWeight.W700,
                        color = color
                    )
                )
                Spacer(modifier = Modifier.size(9.dp))
                Text(
                    text = user.username,
                    style = TextStyle(
                        fontSize = 11.sp,
                        lineHeight = 13.31.sp,
                        fontWeight = FontWeight.W300,
                        color = Default
                    )
                )
            }
        }
    }
}

@Composable
private fun CircleImageWithBorder(size: Dp, borderColor: Color, image: String) {
    Box(
        modifier = Modifier
            .offset(y = size / 4)
            .zIndex(2f)
            .size(size)
            .clip(RoundedCornerShape(45.dp))
            .background(borderColor)
    ) {
        AsyncImage(
            modifier = Modifier
                .size(size - 8.dp)
                .clip(RoundedCornerShape(45.dp))
                .align(Alignment.Center),
            contentScale = ContentScale.Crop,
            model = image,
            contentDescription = null
        )
    }
}
