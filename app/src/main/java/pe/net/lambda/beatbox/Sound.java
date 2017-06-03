package pe.net.lambda.beatbox;

/**
 * Created by Gary on 3/06/2017.
 */

public class Sound {

    private String mAssetPath;
    private String mName;
    private Integer mSoundId;

    public Sound(String assetPath){
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav","");
    }


    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }


    public Integer getSoundId() {
        return mSoundId;
    }

    public void setSoundId(Integer soundId) {
        mSoundId = soundId;
    }
}
