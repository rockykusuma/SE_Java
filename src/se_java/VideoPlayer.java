/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se_java;


/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/


import java.awt.BorderLayout;
import java.awt.Component;
import java.io.IOException;
import java.net.URL;
import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.NoPlayerException;
import javax.media.Player;

import javax.swing.JPanel;

/**
* This class constructs a media player that can play back videos. It takes in
* one string specifying the file, and the class which is in the same package
* for a "getResource()" call. The video player also takes in an InputHandler
* so that it will exit along with the rest of the program, as a System.exit()
* called in the main class does not close the media source and it must be done
* manually
*
* @author Isaac
* @param fileName - A String which is the file name of the video to be played
* @param whichClass - A class which is in the same package as the video
* (typically the calling class) so that the getResource() call points to the
* correct location
* @see SystemSpecs
*/
public class VideoPlayer extends JPanel {

private Player mediaPlayer;
private long startTime;
private boolean isPlaying;

/**
* Instantiate the VideoPlayer, taking in file name and calling class.
* Calling class is used as reference for video location within JAR, so
* videos being played should be placed in the same package as calling
* class, or have fileName include package in name
*
* @param fileName Name of video file to be played
* @param whichClass Calling class, used as reference
*/

public VideoPlayer(String fileName, VideoPlayer whichClass) {
// Use lightweight components for Swing compatibility
isPlaying = false;
Manager.setHint(Manager.LIGHTWEIGHT_RENDERER, true);
startTime = 0;
try {
mediaPlayer = Manager.createRealizedPlayer(whichClass.getResource(fileName));
Component video = mediaPlayer.getVisualComponent();
video.setSize(100, 100);
video.setVisible(true);

setLayout(new BorderLayout());
setSize(100, 100);
add(video, BorderLayout.CENTER);
} catch (IOException | NoPlayerException | CannotRealizeException e) {
System.out.println(e);
}
}

/**
* Returns whether or not the clip is still playing
* @return Return the boolean, isPlaying
*/
public boolean isPlaying() {
return isPlaying;
}

/**
* Returns the length of the clip in nanoseconds.
* @return Return a long, storing the length of the clip
*/
public long getDuration() {
return mediaPlayer.getDuration().getNanoseconds();
}

/**
* Starts the clip and sets startTime to the current system-time. Also sets
* isPlaying based upon the time of the clip vs the time at which it started
* Once the clip's play length has exceeded it's duration, it will
* automatically stop.
*/
public void play() {
if (startTime == 0) {
startTime = System.nanoTime();
mediaPlayer.start();
}
if (System.nanoTime() - startTime <= getDuration()) {
isPlaying = true;
setVisible(true);
} else {
stop();
}
}

/**
* Stops the media clip and sets isPlaying to false, so that calling class
* knows when to resume other operations
*/
public void stop() {
isPlaying = false;
mediaPlayer.close();
}
public static  void main(String a[]){
    VideoPlayer VideoPlayer1;
    VideoPlayer player=new VideoPlayer("file:///D:/SE_DATABASE/Videos/Java.mp4", VideoPlayer1);
}

    private URL getResource(String fileName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
 

