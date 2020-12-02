package com.teamelysium.acupointver2;

import android.graphics.SurfaceTexture;
import android.util.Log;

import com.google.mediapipe.components.ExternalTextureConverter;
import com.google.mediapipe.components.TextureFrameConsumer;
import com.google.mediapipe.framework.AppTextureFrame;

import java.util.Iterator;

import javax.microedition.khronos.egl.EGLContext;

public class ExternalTextureConverterV2 extends ExternalTextureConverter {
    public ExternalTextureConverterV2(EGLContext parentContext) {
        super(parentContext);
    }

    @Override
    protected RenderThread makeRenderThread(EGLContext parentContext, int numBuffers) {
        return super.makeRenderThread(parentContext, numBuffers);
    }

    private void updateOutputFrameV2(AppTextureFrame outputFrame) {

    }

}
