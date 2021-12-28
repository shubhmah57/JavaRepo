package com.serverless.app.audioconversion.service;

public interface PollyService {

    public String synthesizeSpeech(String voice, String text, String requestId);

}
