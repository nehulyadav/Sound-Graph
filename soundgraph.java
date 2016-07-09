import javax.sound.sampled.AudioInputStream;

public class Soundgraph {

	String fileName = "C:\Users\yadavn4\Desktop/sound"
	File file = new File(fileName);
	AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);

	int frameLength = (int) audioInputStream.getFrameLength();
	int frameSize = (int) audioInputStream.getFormat().getFrameSize();

	byte[] bytes = new byte[frameSize * frameLength];

	int result = 0;try

	{
		result = audioInputStream.read(bytes);
	} catch(

	Exception e)

	{
		e.printStackTrace();
	}

}
