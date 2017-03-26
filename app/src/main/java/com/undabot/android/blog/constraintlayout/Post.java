package com.undabot.android.blog.constraintlayout;

import android.support.annotation.NonNull;

final class Post {
    private final String name;
    private final String time;
    private final String title;
    private final String description;
    private final String comments;
    private final String imageUrl;
    private final String profileImageUrl;
    private boolean commentsAvailable;
    private boolean favored;

    Post(@NonNull String name,
         @NonNull String time,
         @NonNull String title,
         @NonNull String description,
         @NonNull String comments,
         @NonNull String imageUrl,
         @NonNull String profileImageUrl,
         boolean commentsAvailable) {
        this.name = name;
        this.time = time;
        this.title = title;
        this.description = description;
        this.comments = comments;
        this.imageUrl = imageUrl;
        this.profileImageUrl = profileImageUrl;
        this.commentsAvailable = commentsAvailable;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getComments() {
        return comments;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public boolean isCommentsAvailable() {
        return commentsAvailable;
    }

    public void setFavored(boolean favored) {
        this.favored = favored;
    }
}
