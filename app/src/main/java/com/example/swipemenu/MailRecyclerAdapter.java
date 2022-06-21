package com.example.swipemenu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MailRecyclerAdapter extends RecyclerView.Adapter<MailRecyclerAdapter.MailViewHolder> {

    private List<Mail> mails;


    public MailRecyclerAdapter(List<Mail> mails) {
        this.mails = mails;
    }

    @NonNull
    @Override
    public MailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Create a new view, which defines the UI of the list item
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mail, parent, false);
        return new MailViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MailViewHolder holder, int position) {
        holder.onBind(mails.get(position));
    }

    @Override
    public int getItemCount() {
        return mails.size();
    }

    public static class MailViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView = itemView.findViewById(R.id.imageView);
        private TextView textViewSender = itemView.findViewById(R.id.textView1);
        private TextView textViewSubject = itemView.findViewById(R.id.textView2);
        private TextView textViewMessageBody = itemView.findViewById(R.id.textView3);
        private TextView textViewReceiveTime = itemView.findViewById(R.id.textView4);


        public MailViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void onBind(Mail mail) {

            textViewSender.setText(mail.getSender());

            textViewSubject.setText(mail.getSubject());

            textViewMessageBody.setText(mail.getMessageBody());

            textViewReceiveTime.setText(mail.getReceiveTime());

            Glide.with(itemView).load(mail.getSenderAvatarUrl()).into(imageView);
        }
    }
}
