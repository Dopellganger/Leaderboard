package rostyslav.kachur.leaderboard.data

import kachur.rostyslav.leaderboard.presentation.leaderboard.TabType
import javax.inject.Inject

class LeaderboardDataStore @Inject constructor() {

    fun loadLeaderboard(tabType: TabType): List<User> {
        return when (tabType) {
            TabType.REGION -> {
                listOf(
                    User(
                        "John Doe",
                        "johndoe",
                        1400,
                        "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png",
                        true
                    ),
                    User(
                        "Sarah Smith",
                        "janesmith",
                        1352,
                        "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png",
                        false
                    ),
                    User(
                        "Mike Johnson",
                        "mikejohnson",
                        1258,
                        "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png",
                        true
                    ),
                    User(
                        "Mike Davis",
                        "sarahdavis",
                        1203,
                        "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png",
                        false
                    ),
                    User(
                        "Jane Smith",
                        "janesmith",
                        1120,
                        "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png",
                        false
                    ),
                    User(
                        "Mike Johnson",
                        "mikejohnson",
                        1050,
                        "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png",
                        true
                    ),
                    User(
                        "Petr Davis",
                        "sarahdavis",
                        996,
                        "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png",
                        false
                    ),
                    User(
                        "Jane Smith",
                        "janesmith",
                        958,
                        "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png",
                        false
                    ),
                    User(
                        "Bob Johnson",
                        "mikejohnson",
                        928,
                        "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png",
                        true
                    ),
                    User(
                        "Sarah Davis",
                        "sarahdavis",
                        905,
                        "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png",
                        false
                    ),
                    User(
                        "Jane Smith",
                        "janesmith",
                        730,
                        "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png",
                        false
                    ),
                    User(
                        "Ros Johnson",
                        "mikejohnson",
                        628,
                        "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png",
                        true
                    ),
                    User(
                        "Sarah Davis",
                        "sarahdavis",
                        605,
                        "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png",
                        false
                    ),
                    User(
                        "Jane Smith",
                        "janesmith",
                        530,
                        "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png",
                        false
                    ),
                    User(
                        "Mike Johnson",
                        "mikejohnson",
                        528,
                        "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png",
                        true
                    ),
                    User(
                        "Sarah Davis",
                        "sarahdavis",
                        505,
                        "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png",
                        false
                    ),
                    User(
                        "Jane Smith",
                        "janesmith",
                        430,
                        "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png",
                        false
                    ),
                    User(
                        "Mike Johnson",
                        "mikejohnson",
                        428,
                        "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png",
                        true
                    ),
                    User(
                        "Sarah Davis",
                        "sarahdavis",
                        205,
                        "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png",
                        false
                    ),
                    User(
                        "Chris Brown",
                        "chrisbrown",
                        196,
                        "https://media.sproutsocial.com/uploads/2017/02/10x-featured-social-media-image-size.png",
                        true
                    )
                )
            }

            TabType.NATIONAL -> {
                listOf(
                    User(
                        "John Doe",
                        "johndoe",
                        1400,
                        "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80",
                        true
                    ),
                    User(
                        "Sarah Smith",
                        "janesmith",
                        1352,
                        "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80",
                        false
                    ),
                    User(
                        "Mike Johnson",
                        "mikejohnson",
                        1258,
                        "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80",
                        true
                    ),
                    User(
                        "Mike Davis",
                        "sarahdavis",
                        1203,
                        "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80",
                        false
                    ),
                    User(
                        "Jane Smith",
                        "janesmith",
                        1120,
                        "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80",
                        false
                    ),
                    User(
                        "Mike Johnson",
                        "mikejohnson",
                        1050,
                        "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80",
                        true
                    ),
                    User(
                        "Petr Davis",
                        "sarahdavis",
                        996,
                        "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80",
                        false
                    ),
                    User(
                        "Jane Smith",
                        "janesmith",
                        958,
                        "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80",
                        false
                    ),
                    User(
                        "Bob Johnson",
                        "mikejohnson",
                        928,
                        "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80",
                        true
                    ),
                    User(
                        "Sarah Davis",
                        "sarahdavis",
                        905,
                        "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80",
                        false
                    ),
                    User(
                        "Jane Smith",
                        "janesmith",
                        730,
                        "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80",
                        false
                    ),
                    User(
                        "Ros Johnson",
                        "mikejohnson",
                        628,
                        "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80",
                        true
                    ),
                    User(
                        "Sarah Davis",
                        "sarahdavis",
                        605,
                        "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80",
                        false
                    ),
                    User(
                        "Jane Smith",
                        "janesmith",
                        530,
                        "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80",
                        false
                    ),
                    User(
                        "Mike Johnson",
                        "mikejohnson",
                        528,
                        "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80",
                        true
                    ),
                    User(
                        "Sarah Davis",
                        "sarahdavis",
                        505,
                        "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80",
                        false
                    ),
                    User(
                        "Jane Smith",
                        "janesmith",
                        430,
                        "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80",
                        false
                    ),
                    User(
                        "Mike Johnson",
                        "mikejohnson",
                        428,
                        "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80",
                        true
                    ),
                    User(
                        "Sarah Davis",
                        "sarahdavis",
                        205,
                        "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80",
                        false
                    ),
                    User(
                        "Chris Brown",
                        "chrisbrown",
                        196,
                        "https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80",
                        true
                    )
                )
            }

            else -> listOf(
                User(
                    "John Doe",
                    "johndoe",
                    1400,
                    "https://img.freepik.com/premium-photo/image-colorful-galaxy-sky-generative-ai_791316-9864.jpg?w=2000",
                    true
                ),
                User(
                    "Sarah Smith",
                    "janesmith",
                    1352,
                    "https://img.freepik.com/premium-photo/image-colorful-galaxy-sky-generative-ai_791316-9864.jpg?w=2000",
                    false
                ),
                User(
                    "Mike Johnson",
                    "mikejohnson",
                    1258,
                    "https://img.freepik.com/premium-photo/image-colorful-galaxy-sky-generative-ai_791316-9864.jpg?w=2000",
                    true
                ),
                User(
                    "Mike Davis",
                    "sarahdavis",
                    1203,
                    "https://img.freepik.com/premium-photo/image-colorful-galaxy-sky-generative-ai_791316-9864.jpg?w=2000",
                    false
                ),
                User(
                    "Jane Smith",
                    "janesmith",
                    1120,
                    "https://img.freepik.com/premium-photo/image-colorful-galaxy-sky-generative-ai_791316-9864.jpg?w=2000",
                    false
                ),
                User(
                    "Mike Johnson",
                    "mikejohnson",
                    1050,
                    "https://img.freepik.com/premium-photo/image-colorful-galaxy-sky-generative-ai_791316-9864.jpg?w=2000",
                    true
                ),
                User(
                    "Petr Davis",
                    "sarahdavis",
                    996,
                    "https://img.freepik.com/premium-photo/image-colorful-galaxy-sky-generative-ai_791316-9864.jpg?w=2000",
                    false
                ),
                User(
                    "Jane Smith",
                    "janesmith",
                    958,
                    "https://img.freepik.com/premium-photo/image-colorful-galaxy-sky-generative-ai_791316-9864.jpg?w=2000",
                    false
                ),
                User(
                    "Bob Johnson",
                    "mikejohnson",
                    928,
                    "https://img.freepik.com/premium-photo/image-colorful-galaxy-sky-generative-ai_791316-9864.jpg?w=2000",
                    true
                ),
                User(
                    "Sarah Davis",
                    "sarahdavis",
                    905,
                    "https://img.freepik.com/premium-photo/image-colorful-galaxy-sky-generative-ai_791316-9864.jpg?w=2000",
                    false
                ),
                User(
                    "Jane Smith",
                    "janesmith",
                    730,
                    "https://img.freepik.com/premium-photo/image-colorful-galaxy-sky-generative-ai_791316-9864.jpg?w=2000",
                    false
                ),
                User(
                    "Ros Johnson",
                    "mikejohnson",
                    628,
                    "https://img.freepik.com/premium-photo/image-colorful-galaxy-sky-generative-ai_791316-9864.jpg?w=2000",
                    true
                ),
                User(
                    "Sarah Davis",
                    "sarahdavis",
                    605,
                    "https://img.freepik.com/premium-photo/image-colorful-galaxy-sky-generative-ai_791316-9864.jpg?w=2000",
                    false
                ),
                User(
                    "Jane Smith",
                    "janesmith",
                    530,
                    "https://img.freepik.com/premium-photo/image-colorful-galaxy-sky-generative-ai_791316-9864.jpg?w=2000",
                    false
                ),
                User(
                    "Mike Johnson",
                    "mikejohnson",
                    528,
                    "https://img.freepik.com/premium-photo/image-colorful-galaxy-sky-generative-ai_791316-9864.jpg?w=2000",
                    true
                ),
                User(
                    "Sarah Davis",
                    "sarahdavis",
                    505,
                    "https://img.freepik.com/premium-photo/image-colorful-galaxy-sky-generative-ai_791316-9864.jpg?w=2000",
                    false
                ),
                User(
                    "Jane Smith",
                    "janesmith",
                    430,
                    "https://img.freepik.com/premium-photo/image-colorful-galaxy-sky-generative-ai_791316-9864.jpg?w=2000",
                    false
                ),
                User(
                    "Mike Johnson",
                    "mikejohnson",
                    428,
                    "https://img.freepik.com/premium-photo/image-colorful-galaxy-sky-generative-ai_791316-9864.jpg?w=2000",
                    true
                ),
                User(
                    "Sarah Davis",
                    "sarahdavis",
                    205,
                    "https://img.freepik.com/premium-photo/image-colorful-galaxy-sky-generative-ai_791316-9864.jpg?w=2000",
                    false
                ),
                User(
                    "Chris Brown",
                    "chrisbrown",
                    196,
                    "https://img.freepik.com/premium-photo/image-colorful-galaxy-sky-generative-ai_791316-9864.jpg?w=2000",
                    true
                )
            )
        }
    }
}
