package org.evavdb1.mediaplayer;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("VLC")) {
            advancedMusicPlayer = new VLCPlayer();
        } else if (audioType.equalsIgnoreCase("MP4")) {
            advancedMusicPlayer =  new MP4Player();
        }
    }


    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("VLC")) {
            advancedMusicPlayer.playVLC(fileName);
        } else if (audioType.equalsIgnoreCase("MP4")) {
            advancedMusicPlayer.playMP4(fileName);
        } else  {
            System.out.println("Invalid media."+audioType+ "-format not supported.");
        }
    }
}
