package com.mm.aspectannotation;

public class UsageTrackedImpl implements UsageTracked {
    int count;

    @Override
    public void incrementTrackedCount() {
        count++;
        System.out.println("count:"+count);
    }
}
