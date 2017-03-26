package com.undabot.android.blog.constraintlayout;

import java.util.ArrayList;
import java.util.List;

final class PostFactory {

    static List<Post> createPosts() {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("John K. Weber", "few moments ago", "Some really amazing view", "This is some very beautiful view captured ind the wild wilderness. It was captured last night",
                "It's beautiful indeed!", "https://placehold.it/500/1686AD/FFF?text=Lovely+view", "https://placehold.it/200/234D6E/FFF?text=J", true));

        posts.add(new Post("Unknown name", "just now", "Developer landscape", "This is some very beautiful developer landscape",
                     "It's beautiful indeed!", "https://placehold.it/500/78B6EF/FFF?text=Developer+landscape", "https://placehold.it/200/234D6E/FFF?text=J", true));

        posts.add(new Post("Marsh Mallow", "last week", "", "", "", "https://placehold.it/500/1686AD?text=Developer+landscape", "https://placehold.it/200/1686AD/FFF?text=M", true));

        posts.add(new Post("Undabot Developer", "last month", "", "",
              "Very nice!\nI like it!!!", "https://placehold.it/500/347689/FFF?text=Developer+landscape", "https://placehold.it/200/1686AD/FFF?text=U", true));

        posts.add(new Post("Peter Hendricks", "yesterday", "", "With description and without title. It also has some comments",
              "It's beautiful indeed!", "https://placehold.it/500/237643/FFF?text=Developer+landscape", "https://placehold.it/200/333333/FFF?text=P", true));

        posts.add(new Post("Mateo Junior", "5 min ago", "Developer landscape", "This is some very beautiful developer landscape",
              "It's beautiful indeed!", "https://placehold.it/500/347744/FFF?text=Developer+landscape", "https://placehold.it/200/444444/FFF?text=M", true));

        posts.add(new Post("Daniel Spot", "1 hour aho", "Developer landscape", "Lucky shot taken last year. I have totally forgotten about it. Luckily it wasn't deleted.",
              "I really like how this looks. Can you share some more information about the shot?",
              "https://placehold.it/500/223355/FFF?text=Developer+landscape", "https://placehold.it/200/555555/FFF?text=D", true));

        posts.add(new Post("Peter M. Timber", "5 hours ago", "Nothing special", "",
              "", "https://placehold.it/500/335577/FFF?text=Developer+landscape", "https://placehold.it/200/567687/FFF?text=P", false));

        return posts;
    }
}
