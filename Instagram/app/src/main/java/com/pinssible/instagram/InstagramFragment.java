package com.pinssible.instagram;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class InstagramFragment extends android.support.v4.app.Fragment {
    private InstagramViewAdapter instagramViewAdapter;
    private RecyclerView rvInstagrams;
    private ArrayList<InstagramListBean> arrayListInstagrams;
    private SwipeRefreshLayout pullDownRefresh;

    private boolean isLoading = false;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_instagram, container, false);
        initModle();
        initView(view);
        initController();
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (!pullDownRefresh.isRefreshing()) {
            pullDownRefresh.setProgressViewOffset(false, -100, 100);
            pullDownRefresh.setRefreshing(true);
            refreshNew();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    protected void initModle() {
        arrayListInstagrams = new ArrayList<>();
        instagramViewAdapter = new InstagramViewAdapter(arrayListInstagrams, getActivity());
    }

    protected void initView(View rootView) {
        rvInstagrams = (RecyclerView)rootView.findViewById(R.id.rv_mainlist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        rvInstagrams.setLayoutManager(layoutManager);
        pullDownRefresh = (SwipeRefreshLayout)rootView.findViewById(R.id.srl_main);
    }

    protected void initController() {
        rvInstagrams.setAdapter(instagramViewAdapter);
        rvInstagrams.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (!isLoading
                        && instagramViewAdapter.getItemCount() - 3 <= (((LinearLayoutManager) rvInstagrams.getLayoutManager())
                        .findLastVisibleItemPosition())) {
                    loadMore();
                }
            }
        });
        pullDownRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshNew();
            }
        });
    }



    private void loadMore() {
        if (!isLoading) {
            isLoading = true;
            instagramViewAdapter.notifyDataSetChanged();
            getFeed();
            //load
            isLoading = false;
        }
    }

    private void refreshNew() {
        if (!isLoading) {
            isLoading = true;
            getFeed();
            //load
            isLoading = false;
        }
    }

    private void getFeed() {
        for (int i=0;i<3;i++) {
            ArrayList<String> comments = new ArrayList<String>();
            InstagramListBean oneFeed = new InstagramListBean("user"+i, "1周", "pictureUrl", i, "commentName1", "commentName2", "comment1", "comment2");
            arrayListInstagrams.add(oneFeed);
        }
        instagramViewAdapter.notifyDataSetChanged();
        if (pullDownRefresh.isRefreshing()) {
            rvInstagrams.scrollToPosition(0);
        }
    }

}
