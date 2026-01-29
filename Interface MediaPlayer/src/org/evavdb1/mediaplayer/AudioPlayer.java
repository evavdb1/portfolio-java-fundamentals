package org.evavdb1.mediaplayer;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    public AudioPlayer() {
        this.mediaAdapter = mediaAdapter;
    }

    public MediaAdapter getMediaAdapter() {        return mediaAdapter;    }
    public void setMediaAdapter(MediaAdapter mediaAdapter) {        this.mediaAdapter = mediaAdapter;    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("MP3")) {
            System.out.println("Playing MP3 file. Name: "+fileName);
        } else  {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        }
    }
