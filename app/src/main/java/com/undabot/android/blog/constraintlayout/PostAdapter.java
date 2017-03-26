package com.undabot.android.blog.constraintlayout;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

final class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostHolder> {

    private final Context context;
    private final int layoutResId;
    private List<Post> posts;

    PostAdapter(Context context, @NonNull List<Post> posts, @LayoutRes int layoutResId) {
        this.context = context;
        this.posts = posts;
        this.layoutResId = layoutResId;
    }

    @Override
    public PostAdapter.PostHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PostHolder(LayoutInflater.from(context).inflate(layoutResId, parent, false));
    }

    @Override
    public void onBindViewHolder(PostAdapter.PostHolder holder, int position) {
        holder.bindTo(posts.get(position));
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    class PostHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.image) ImageView image;
        @BindView(R.id.profile_image) ImageView profileImage;
        @BindView(R.id.user_name) TextView name;
        @BindView(R.id.time) TextView time;
        @BindView(R.id.title) TextView title;
        @BindView(R.id.description) TextView description;
        @BindView(R.id.comments) TextView comments;
        @BindView(R.id.comments_label) TextView commentsLabel;
        @BindView(R.id.btn_comment) Button btnComment;

        PostHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        void bindTo(Post post) {
            Picasso.with(context).load(post.getImageUrl()).into(image);
            Picasso.with(context).load(post.getProfileImageUrl()).into(profileImage);
            name.setText(post.getName());
            time.setText(post.getTime());

            if (!post.getTitle().isEmpty()) {
                title.setText(post.getTitle());
                title.setVisibility(View.VISIBLE);
            } else {
                title.setVisibility(View.GONE);
            }

            if (!post.getDescription().isEmpty()) {
                description.setText(post.getDescription());
                description.setVisibility(View.VISIBLE);
            } else {
                description.setVisibility(View.GONE);
            }

            if (post.isCommentsAvailable() && !post.getComments().isEmpty()) {
                comments.setText(post.getComments());
                comments.setVisibility(View.VISIBLE);
                commentsLabel.setVisibility(View.VISIBLE);
                btnComment.setVisibility(View.VISIBLE);
            } else {
                comments.setVisibility(View.GONE);
                commentsLabel.setVisibility(View.GONE);
                btnComment.setVisibility(View.GONE);
            }
        }

        @OnClick({R.id.hide, R.id.btn_comment, R.id.share})
        void onButtonPressed(Button button) {
            Toast.makeText(context, "On button pressed: " + button.getText(), Toast.LENGTH_SHORT).show();
        }

        @OnClick(R.id.action_button)
        void onFavouritePressed() {
            Toast.makeText(context, "On favourite pressed!", Toast.LENGTH_SHORT).show();
        }
    }
}
