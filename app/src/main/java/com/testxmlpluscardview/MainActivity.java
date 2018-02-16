package com.testxmlpluscardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.testxmlpluscardview.internet.RestService;
import com.testxmlpluscardview.internet.get.Response;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private Disposable disposable;
    private RestService restService;
    private RecyclerView recyclerView;
    private ResponseAdapter responseAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("qweqw", "start? mainActivity");

        recyclerView = findViewById(R.id.recyclerView);

        restService = RestService.getInstanse();
        Log.e("1", "after getInstanse");

        disposable = restService.getRestApi().getResponse()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableObserver<Response>() {
                    @Override
                    public void onNext(Response response) {
                        responseAdapter = new ResponseAdapter();
                        Log.e("1", "onNext");
                        responseAdapter.setMessageList(response.getResponseMessagesList());
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("1", "onError");

                    }

                    @Override
                    public void onComplete() {
                        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                        recyclerView.setAdapter(responseAdapter);
                    }
                });
    }
}
