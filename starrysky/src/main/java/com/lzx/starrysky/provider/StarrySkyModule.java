package com.lzx.starrysky.provider;

import android.content.Context;
import android.support.annotation.NonNull;

import com.lzx.starrysky.StarrySkyBuilder;
import com.lzx.starrysky.registry.StarrySkyRegistry;

public abstract class StarrySkyModule {

    public void applyOptions(@NonNull Context context, @NonNull StarrySkyBuilder builder) {
        // Default empty impl.
    }

    public void applyMediaValid(@NonNull Context context, StarrySkyRegistry registry) {

    }
}