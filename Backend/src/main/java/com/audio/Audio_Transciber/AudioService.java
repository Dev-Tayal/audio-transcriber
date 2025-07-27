package com.audio.Audio_Transciber;

import org.springframework.ai.audio.transcription.AudioTranscriptionPrompt;
import org.springframework.ai.audio.transcription.AudioTranscriptionResponse;
import org.springframework.ai.openai.OpenAiAudioTranscriptionModel;
import org.springframework.ai.openai.OpenAiAudioTranscriptionOptions;
import org.springframework.ai.openai.api.OpenAiAudioApi;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Service;

@Service
public class AudioService {

    private final OpenAiAudioTranscriptionModel openAiAudioTranscriptionModel;

    public AudioService(OpenAiAudioTranscriptionModel openAiAudioTranscriptionModel){
        this.openAiAudioTranscriptionModel =  openAiAudioTranscriptionModel;
    }

    public String transcribe(FileSystemResource audioFile){
        OpenAiAudioTranscriptionOptions transcriptionOptions= OpenAiAudioTranscriptionOptions.builder()
                                .responseFormat(OpenAiAudioApi.TranscriptResponseFormat.TEXT)
                                .temperature(0.4f)
                                .language("en")
                                .build();

        AudioTranscriptionPrompt transcriptionRequest=  new AudioTranscriptionPrompt(audioFile,transcriptionOptions);
        AudioTranscriptionResponse response= openAiAudioTranscriptionModel.call(transcriptionRequest);

        return response.getResult().getOutput();
    }

}
