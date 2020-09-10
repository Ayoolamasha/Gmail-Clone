package com.gmailclone.Network;

import java.util.List;

import com.gmailclone.Model.Message;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("inbox.json")
    Call<List<Message>> getInbox();
}
